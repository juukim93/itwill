<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내 기기 판매</title>
<link rel="stylesheet" type="text/css" href="../css/reset.css"/>
<link rel="stylesheet" type="text/css" href="../css/layout.css"/>
<link id="pagestyle" href="../css/board.css" rel="stylesheet" />
<script src="../js/jquery.js"></script>
<script language="JavaScript" type="text/javascript"></script>

   <script>
           // 창 사이즈에 따라 움직이는 제이쿼리문
           $(document).ready(function(){ 
               $('selector').css('width', $(window).width()); 
               $('selector').css('height', $(window).height()); 
               $(window).resize(function() { 
                   $('selector').css('width', $(window).width()); 
                   $('selector').css('height', $(window).height()); 
               }); 
           });
           

           $(function() {
               let currentBtn = null; // 현재 선택된 메뉴 아이콘 저장 변수
               let currentBox = null; // 현재 선택된 Box 저장 변수
               let currentSpan = null; // 현재 선택된 span 태그 저장 변수

               // 페이지 로드 시 HOME 버튼을 클릭한 상태로 초기화
               const homeButton = $('.mn_btn:eq(2)');
               setButtonStyle(homeButton);

               // 클릭 가능한 모든 메뉴 아이콘에 대한 이벤트 처리
               $('.mn_btn').click(function() {
                   if (currentBtn !== null && !$(this).is(currentBtn)) {
                       resetButtonStyle(currentBtn);
                   }
                   setButtonStyle($(this));
               });

               // 스타일 초기화 함수
               function resetButtonStyle($btn) {
                   $btn.closest('.mn_box').css('box-shadow', 'none');
                   $btn.find('.mn_icon').css('background-color', '#fff');
                   $btn.find('.mn_icon img').css('filter', '');
                   $btn.find('.clickable-span').css('color', '#A0AEC0');
               }

               // 스타일 설정 함수
               function setButtonStyle($btn) {
                   $btn.closest('.mn_box').css('box-shadow', 'rgba(0, 0, 0, 0.05) 14px 14px 14px');
                   $btn.find('.mn_icon').css('background-color', '#3182ce');
                   $btn.find('.mn_icon img').css('filter', 'invert(100%) sepia(0%) saturate(0%) hue-rotate(93deg) brightness(103%) contrast(103%)');
                   $btn.find('.clickable-span').css('color', '#000');
                   currentBtn = $btn;
               }
           });
     </script>
</head>
<body>
	 <!-- 전체 창 -->
    <div id="wrap">
        <!-- 뒷배경 -->
        <div class="bg"></div>
        <!-- 메뉴 -->
        <div class="main">
            <!-- 로고 -->
            <div class="logo">
                <a href="../main.ma"><img src="../icon/logo.png"></a>
            </div>
            <!-- 메인메뉴 -->
            <div class="main_mn">
                <!-- 홈버튼 -->
                <div class="mn_box">
                    <a href="../main.ma" class="mn_btn">
                            <div class="mn_icon">
                                <img src="../icon/home.png">
                            </div>
                            <span class="clickable-span">HOME</span>
                    </a>
                </div>
                <!-- 중고매입버튼 -->
                <div class="mn_box">
                    <a href="orderList.jsp" class="mn_btn">
                            <div class="mn_icon">
                                <img src="../icon/중고매입.png">
                            </div>
                            <span class="clickable-span">내 기기 구매/대여</span>
                    </a>
                </div>
                <!-- 중고판매버튼 -->
                <div class="mn_box">
                    <a href="saleList.jsp" class="mn_btn">
                            <div class="mn_icon">
                                <img src="../icon/중고판매.png">
                            </div>
                            <span class="clickable-span">내 기기 판매</span>
                    </a>
                </div>
                <!-- 기기대여버튼 -->
                <div class="mn_box">
                    <a href="../center/center.jsp" class="mn_btn">
                            <div class="mn_icon">
                                <img src="../icon/기기대여.png">
                            </div>
                            <span class="clickable-span">A/S 센터</span>
                    </a>
                </div>
                <!-- 포토후기버튼 -->
                <div class="mn_box">
                    <a href="../board/Review.jsp" class="mn_btn">
                            <div class="mn_icon">
                                <img src="../icon/포토후기.png">
                            </div>
                            <span class="clickable-span">포토후기</span>
                    </a>
                </div>
                
                <!-- 고객센터 부분 -->
                <div class="mn_center">
                <h2>고객센터</h2>
                
                <!-- 공지사항 부분 -->
                <div class="mn_box">
                    <a href="../board/Announcement.jsp" class="mn_btn">
                            <div class="mn_icon">
                                <img src="../icon/공지사항.png">
                            </div>
                            <span class="clickable-span">공지사항</span>
                    </a>
                </div>
                <!-- Q&A 부분 -->
                <div class="mn_box">
                    <a href="../board/Q&A.jsp" class="mn_btn">
                            <div class="mn_icon">
                                <img src="../icon/Q&A.png">
                            </div>
                            <span class="clickable-span">Q&A</span>
                    </a>
                </div>
                <!-- 운영정책 부분 -->
                <div class="mn_box">
                    <a href="../board/OperatingPolicy.jsp" class="mn_btn">
                            <div class="mn_icon">
                                <img src="../icon/운영정책.png">
                            </div>
                            <span class="clickable-span">운영정책</span>
                    </a>
                </div>
            </div>
        </div>
            <!-- 메뉴 하단부분 -->
            <div class="footer">
                <h1>SHOP GUIDE</h1>
                <h1>050-7871-2220</h1>
                <p>근무시간</p>
                <p>오전 10:00 ~ 오후19:00</p>
                <o>주말 및 공휴일 휴무</o>
            </div>
        </div>
        <!-- 마이페이지 -->
        <div class="mypage">
            <a href="../member/myPage.jsp">
                    <span class="mypage_bt_icon"><img src="../icon/마이페이지.png"></span>
            </a>
        </div>
        <!-- 로그인 -->
        <div class="login">
            <a href="../member/loginForm.jsp">
                    <p class="login_bt_text">로그인</p>
            </a>
        </div>
        <!-- 검색창 -->
        <div class="search">
                <form action="">
                    <input type="text" name="search" size="15" placeholder="  검색" 
                    style="border: none;width: 150px; height: 30px; font-size: 17px; float: left; border-radius: 10px 0 0 10px">
                    <input type="submit" value="" class="btn_submit">
        </div>

        <!-- 메인페이지 -->
		<div class="row">
		        <div>
		          <div class="card mb-4">
		            <div class="card-header pb-0">
		              <h6>내 기기 판매</h6>
		            </div>
		            <div class="card-body px-0 pt-0 pb-2">
		              <div class="table-responsive p-0">
		                <table class="table align-items-center mb-0">
		                  <thead>
		                    <tr>
		                      <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">모델명</th>
		                      <th class="text-uppercase text-secondary text-xxs font-weight-bolder opacity-7 ps-2">등급</th>
		                      <th class="text-center text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">가격</th>
		                      <th class="text-center text-uppercase text-secondary text-xxs font-weight-bolder opacity-7">종류</th>
		                      <th class="text-secondary opacity-7"></th>
		                    </tr>
		                  </thead>
		                  <tbody>
		                    <%
		                    for(int i=0; i<20;i++){
		                    %>
		                    <tr>
		                      <td>
		                        <div class="d-flex px-2 py-1">
		                          <div>
		                            <img src="../img/z폴드5.jpg" class="avatar avatar-sm me-3" alt="user1">
		                          </div>
		                          <div class="d-flex flex-column justify-content-center">
		                            <h6 class="mb-0 text-sm">갤럭시 Z폴드 5</h6>
		                            <p class="text-xs text-secondary mb-0">SM-F946</p>
		                          </div>
		                        </div>
		                      </td>
		                      <td>
		                        <p class="text-xs font-weight-bold mb-0">S등급</p>
		                        <p class="text-xs font-weight-bold mb-0">A등급</p>
		                        <p class="text-xs font-weight-bold mb-0">B등급</p>
		                        <p class="text-xs font-weight-bold mb-0">C등급</p>
		                      </td>
		                      <td class="align-middle text-center text-sm">
		                        <p class="text-xs font-weight-bold mb-0">900,000원</p>
		                        <p class="text-xs font-weight-bold mb-0">800,000원</p>
		                        <p class="text-xs font-weight-bold mb-0">700,000원</p>
		                        <p class="text-xs font-weight-bold mb-0">600,000원</p>
		                      </td>
		                      <td class="align-middle text-center">
		                        <span class="text-secondary text-xs font-weight-bold">스마트폰</span>
		                      </td>
		                      <td class="align-middle">
		                        <a href="saleDetail.jsp" class="text-secondary font-weight-bold text-xs" >
		                          보기
		                        </a>
		                      </td>
		                    </tr>
		                    <%
		                    }
		                    %>
		                  </tbody>
		                </table>
		              </div>
		            </div>
		          </div>
	        </div>
      </div>
</body>
</html>