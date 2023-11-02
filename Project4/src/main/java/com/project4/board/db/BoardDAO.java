package com.project4.board.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {
	// 공통 변수 선언
		private Connection con = null;
		private PreparedStatement pstmt = null;
		private ResultSet rs = null;
		private String sql = "";

		// 공통) 디비 연결하기(CP)
		private Connection getCon() throws Exception {

			Context initCTX = new InitialContext();
			DataSource ds = (DataSource) initCTX.lookup("java:comp/env/jdbc/mvc");
			con = ds.getConnection();

			System.out.println(" DAO : 디비연결 성공!! ");
			System.out.println(" DAO : " + con);
			return con;
		}

		// 공통) 디비 자원해제
		public void CloseDB() {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		// 글쓰기 메서드 - insertBoard(BoardDTO)
		

		
		// 글쓰기 메서드 - insertBoard(BoardDTO)

		// 글 개수 계산 메서드 - getBoardCount()
		public int getBoardCount(String search) {
			int result = 0;

			try {
				// 1. 드라이버 로드
				// 2. 디비 연결
				con = getCon();

				// 3. sql 작성(select) & pstmt 객체
				sql = "select count(*) from board where board_subject like ?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "%"+search+"%");

				// 4. sql 실행
				rs = pstmt.executeQuery();
				// 5. 데이터 처리 - 개수를 저장
				if (rs.next()) {
					result = rs.getInt(1);
					// result = rs.getInt("count(*)");
				}
				System.out.println(" DAO : 개수 " + result + "개");

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				CloseDB();
			}

			return result;
		}
		public int getBoardCount() {
			int result = 0;

			try {
				// 1. 드라이버 로드
				// 2. 디비 연결
				con = getCon();

				// 3. sql 작성(select) & pstmt 객체
				sql = "select count(*) from board";
				pstmt = con.prepareStatement(sql);
				

				// 4. sql 실행
				rs = pstmt.executeQuery();
				// 5. 데이터 처리 - 개수를 저장
				if (rs.next()) {
					result = rs.getInt(1);
					// result = rs.getInt("count(*)");
				}
				System.out.println(" DAO : 개수 " + result + "개");

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				CloseDB();
			}

			return result;
		}
		// 글 개수 계산 메서드 - getBoardCount()

		// 글 정보 목록을 가져오는 메서드 - getBoardList(int startRow,int pageSize)
		public ArrayList getBoardList(int startRow, int pageSize) {
			// 글정보를 저장하는 배열
			ArrayList Announcement = new ArrayList();
			try {
				// 디비연결정보
				// 1. 드라이버 로드
				// 2. 디비 연결
				con = getCon();
				// 3. SQL 작성(select) & pstmt 객체
				// sql = "select * from itwill_board order by bno desc limit ?,?";
				sql = "select * from board order by re_ref desc,re_seq asc limit ?,?";
				pstmt = con.prepareStatement(sql);
				// ????
				pstmt.setInt(1, startRow - 1); // 시작행번호-1
				pstmt.setInt(2, pageSize); // 개수
				// 4. SQL 실행
				rs = pstmt.executeQuery();
				// 5. 데이터 처리
				// 글정보 전부 가져오기
				// BoardBean 객체 여러개 => ArrayList 저장
				while (rs.next()) {
					// 글 하나의 정보 => BoardBean저장
					BoardDTO bb = new BoardDTO();

					bb.setBoard_bno(rs.getInt("board_bno"));
					bb.setBoard_subject(rs.getString("board_subject"));
					bb.setBoard_content(rs.getString("board_content"));
					bb.setBoard_file(rs.getString("board_file"));
					bb.setBoard_image(rs.getString("board_image"));
					bb.setBoard_regdate(rs.getDate("board_regdate"));
					bb.setBoard_update(rs.getDate("board_update"));
					bb.setBoard_readcount(rs.getInt("board_readcount"));
					bb.setBoard_rating(rs.getFloat("board_rating"));
					bb.setBoard_rec(rs.getInt("board_rec"));
					bb.setBoard_re_ref_check(rs.getBoolean("board_re_ref_check"));
					bb.setRe_ref(rs.getInt("re_ref"));
					bb.setRe_lev(rs.getInt("re_lev"));
					bb.setRe_seq(rs.getInt("re_seq"));
					bb.setBoard_category(rs.getString("board_category"));
					bb.setId(rs.getString("id"));

					// 글 하나의 정보를 배열의 한칸에 저장
					Announcement.add(bb);

				} // while

				System.out.println(" DAO : 게시판 글 목록 조회성공! ");
				System.out.println(" DAO : " + Announcement.size());

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				CloseDB();
			}

			return Announcement;
		}
		
		
		public void insertBoard(BoardDTO dto) {
			int board_bno = 0;
			
			try {
				con = getCon();
				sql = "select max(board_bno) from board";
				pstmt = con.prepareStatement(sql);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					board_bno = rs.getInt(1)+1;
					
				}
				
				sql="insert into board(board_bno,id,board_subject,board_content,board_readcount,re_ref,re_lev,re_seq,board_regdate,board_file,board_image)"
						+ "values(?,?,?,?,?,?,?,?,now(),?,?)";
				pstmt = con.prepareStatement(sql);
				
				pstmt.setInt(1, board_bno);
				pstmt.setString(2, dto.getId());
				pstmt.setString(3, dto.getBoard_subject());
				pstmt.setString(4, dto.getBoard_content());
				pstmt.setInt(5, 0);
				pstmt.setInt(6, board_bno); // 그룹번호는 글번호와 동일(일반글)
				pstmt.setInt(7, 0); // re_lev 0
				pstmt.setInt(8, 0); // re_seq 0
				pstmt.setString(9, dto.getBoard_file());
				pstmt.setString(10, dto.getBoard_image());
				
				pstmt.executeUpdate();
				
			} catch (Exception e) {			
				e.printStackTrace();
			}finally {
				CloseDB();
			}
		}
		
		public void updateReadcount(int board_bno) {
			try {
				con = getCon();
				sql = "update board set board_readcount = board_readcount+1 where board_bno=?";
				pstmt = con.prepareStatement(sql);
				pstmt.setInt(1, board_bno);
				pstmt.executeUpdate();
		
			} catch (Exception e) {			
				e.printStackTrace();
			}finally {
				CloseDB();
			}
		}
		
		public BoardDTO getBoard(int board_bno) {
			BoardDTO dto = null;
			
			try {
				con =getCon();
				sql="select*from board where board_bno=?";
				pstmt=con.prepareStatement(sql);
				pstmt.setInt(1, board_bno);
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					dto = new BoardDTO();
					
					dto.setBoard_bno(rs.getInt("board_bno"));
					dto.setBoard_subject(rs.getString("board_subject"));
					dto.setBoard_content(rs.getString("board_content"));
					dto.setBoard_file(rs.getString("board_file"));
					dto.setBoard_image(rs.getString("board_image"));
					dto.setBoard_regdate(rs.getDate("board_regdate"));
					dto.setBoard_update(rs.getDate("board_update"));
					dto.setBoard_readcount(rs.getInt("board_readcount"));
					dto.setBoard_rating(rs.getFloat("board_rating"));
					dto.setBoard_rec(rs.getInt("board_rec"));
					dto.setBoard_re_ref_check(rs.getBoolean("board_re_ref_check"));
					dto.setRe_ref(rs.getInt("re_ref"));
					dto.setRe_lev(rs.getInt("re_lev"));
					dto.setRe_seq(rs.getInt("re_seq"));
					dto.setBoard_category(rs.getString("board_category"));
					dto.setId(rs.getString("id"));
					
					
				}
				
			} catch (Exception e) {			
				e.printStackTrace();
			}finally {
				CloseDB();
			}
			
			return dto;
		}
		
		public int updateBoard(BoardDTO bt) {
			int result = -1; // -1  0   1
			
			try {
				// 1.2. 디비연결
				con=getCon();
				
				sql = "select id from board where board_bno = ?";
				pstmt = con.prepareStatement(sql);
				
				pstmt.setInt(1, bt.getBoard_bno());
				
				rs = pstmt.executeQuery();
				
				if(rs.next()) {
					// 게시판 글있음
					if(bt.getId().equals("admin")) {
				
						
						sql = "update board set subject=?,content=? where bno=?";
						pstmt = con.prepareStatement(sql);
						
						//???						
						pstmt.setString(1, bt.getBoard_subject());
						pstmt.setString(2, bt.getBoard_content());
						pstmt.setInt(3, bt.getBoard_bno());
						
						
						result = pstmt.executeUpdate();
						//=> SQL구문(insert,update,delete)이 몇줄 영향을 미치는가를 정수형태로 리턴
						System.out.println(" DAO : 게시판 글 수정 완료! ");
						System.out.println(" DAO : result : "+result);
						
						// 수정완료값 저장
						//result = 1;
						
					}else {
						//  게시판 글있음 - 비밀번호 다름 0
						result = 0;
					}
					
				}else {
					// 게시판 글없음  -1
					result = -1;
				}
				
				System.out.println(" DAO : 글 수정처리 완료 "+result);
			
			} catch (Exception e) {
				e.printStackTrace();
			}
			return result;
		}
		
		public ArrayList getBoardList(int startRow,int pageSize,String search) {
			ArrayList Announcement = new ArrayList();
			
			try {
				con = getCon();
				sql = "select * from board "
						+ "where board_subject like ? "
						+ "order by re_ref desc,re_seq asc "
						+ "limit ?,?";
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, "%"+search+"%");
				pstmt.setInt(2, startRow -1);
				pstmt.setInt(3, pageSize);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					// 글 하나의 정보 => BoardBean저장
					BoardDTO bb = new BoardDTO();

					bb.setBoard_bno(rs.getInt("board_bno"));
					bb.setBoard_subject(rs.getString("board_subject"));
					bb.setBoard_content(rs.getString("board_content"));
					bb.setBoard_file(rs.getString("board_file"));
					bb.setBoard_image(rs.getString("board_image"));
					bb.setBoard_regdate(rs.getDate("board_regdate"));
					bb.setBoard_update(rs.getDate("board_update"));
					bb.setBoard_readcount(rs.getInt("board_readcount"));
					bb.setBoard_rating(rs.getFloat("board_rating"));
					bb.setBoard_rec(rs.getInt("board_rec"));
					bb.setBoard_re_ref_check(rs.getBoolean("board_re_ref_check"));
					bb.setRe_ref(rs.getInt("re_ref"));
					bb.setRe_lev(rs.getInt("re_lev"));
					bb.setRe_seq(rs.getInt("re_seq"));
					bb.setBoard_category(rs.getString("board_category"));
					bb.setId(rs.getString("id"));

					// 글 하나의 정보를 배열의 한칸에 저장
					Announcement.add(bb);
			}
				} catch (Exception e) {				
				e.printStackTrace();
			}finally {
				CloseDB();
			}
			
			return Announcement;
		}
}