/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-11-01 01:27:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.center;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class center_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>A/S 센터</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/reset.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/layout.css\"/>\r\n");
      out.write("<link id=\"pagestyle\" href=\"../css/board.css\" rel=\"stylesheet\" />\r\n");
      out.write(" <script type=\"text/javascript\" src=\"https://oapi.map.naver.com/openapi/v3/maps.js?ncpClientId=<!-- f8p8fgvkm7 -->\"></script>\r\n");
      out.write("<script src=\"../js/jquery.js\"></script>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\"></script>\r\n");
      out.write("<script src=\"//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("\r\n");
      out.write(" 		<script>\r\n");
      out.write(" 		\r\n");
      out.write("            // 창 사이즈에 따라 움직이는 제이쿼리문\r\n");
      out.write("            $(document).ready(function(){ \r\n");
      out.write("                $('selector').css('width', $(window).width()); \r\n");
      out.write("                $('selector').css('height', $(window).height()); \r\n");
      out.write("                $(window).resize(function() { \r\n");
      out.write("                    $('selector').css('width', $(window).width()); \r\n");
      out.write("                    $('selector').css('height', $(window).height()); \r\n");
      out.write("                }); \r\n");
      out.write("            });\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("            $(function() {\r\n");
      out.write("                let currentBtn = null; // 현재 선택된 메뉴 아이콘 저장 변수\r\n");
      out.write("                let currentBox = null; // 현재 선택된 Box 저장 변수\r\n");
      out.write("                let currentSpan = null; // 현재 선택된 span 태그 저장 변수\r\n");
      out.write("\r\n");
      out.write("                // 페이지 로드 시 HOME 버튼을 클릭한 상태로 초기화\r\n");
      out.write("                const homeButton = $('.mn_btn:eq(3)');\r\n");
      out.write("                setButtonStyle(homeButton);\r\n");
      out.write("\r\n");
      out.write("                // 클릭 가능한 모든 메뉴 아이콘에 대한 이벤트 처리\r\n");
      out.write("                $('.mn_btn').click(function() {\r\n");
      out.write("                    if (currentBtn !== null && !$(this).is(currentBtn)) {\r\n");
      out.write("                        resetButtonStyle(currentBtn);\r\n");
      out.write("                    }\r\n");
      out.write("                    setButtonStyle($(this));\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                // 스타일 초기화 함수\r\n");
      out.write("                function resetButtonStyle($btn) {\r\n");
      out.write("                    $btn.closest('.mn_box').css('box-shadow', 'none');\r\n");
      out.write("                    $btn.find('.mn_icon').css('background-color', '#fff');\r\n");
      out.write("                    $btn.find('.mn_icon img').css('filter', '');\r\n");
      out.write("                    $btn.find('.clickable-span').css('color', '#A0AEC0');\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("                // 스타일 설정 함수\r\n");
      out.write("                function setButtonStyle($btn) {\r\n");
      out.write("                    $btn.closest('.mn_box').css('box-shadow', 'rgba(0, 0, 0, 0.05) 14px 14px 14px');\r\n");
      out.write("                    $btn.find('.mn_icon').css('background-color', '#3182ce');\r\n");
      out.write("                    $btn.find('.mn_icon img').css('filter', 'invert(100%) sepia(0%) saturate(0%) hue-rotate(93deg) brightness(103%) contrast(103%)');\r\n");
      out.write("                    $btn.find('.clickable-span').css('color', '#000');\r\n");
      out.write("                    currentBtn = $btn;\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("       </script>\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	 <!-- 전체 창 -->\r\n");
      out.write("    <div id=\"wrap\">\r\n");
      out.write("        <!-- 뒷배경 -->\r\n");
      out.write("        <div class=\"bg\"></div>\r\n");
      out.write("        <!-- 메뉴 -->\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            <!-- 로고 -->\r\n");
      out.write("            <div class=\"logo\">\r\n");
      out.write("                <a href=\"../main.ma\"><img src=\"../icon/logo.png\"></a>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- 메인메뉴 -->\r\n");
      out.write("            <div class=\"main_mn\">\r\n");
      out.write("                <!-- 홈버튼 -->\r\n");
      out.write("                <div class=\"mn_box\">\r\n");
      out.write("                    <a href=\"../main.ma\" class=\"mn_btn\">\r\n");
      out.write("                            <div class=\"mn_icon\">\r\n");
      out.write("                                <img src=\"../icon/home.png\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span class=\"clickable-span\">HOME</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- 중고매입버튼 -->\r\n");
      out.write("                <div class=\"mn_box\">\r\n");
      out.write("                    <a href=\"../product/orderList.jsp\" class=\"mn_btn\">\r\n");
      out.write("                            <div class=\"mn_icon\">\r\n");
      out.write("                                <img src=\"../icon/중고매입.png\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span class=\"clickable-span\">내 기기 구매/대여</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- 중고판매버튼 -->\r\n");
      out.write("                <div class=\"mn_box\">\r\n");
      out.write("                    <a href=\"../product/saleList.jsp\" class=\"mn_btn\">\r\n");
      out.write("                            <div class=\"mn_icon\">\r\n");
      out.write("                                <img src=\"../icon/중고판매.png\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span class=\"clickable-span\">내 기기 판매</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- 기기대여버튼 -->\r\n");
      out.write("                <div class=\"mn_box\">\r\n");
      out.write("                    <a href=\"center.jsp\" class=\"mn_btn\">\r\n");
      out.write("                            <div class=\"mn_icon\">\r\n");
      out.write("                                <img src=\"../icon/기기대여.png\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span class=\"clickable-span\">A/S 센터</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- 포토후기버튼 -->\r\n");
      out.write("                <div class=\"mn_box\">\r\n");
      out.write("                    <a href=\"../board/Review.jsp\" class=\"mn_btn\">\r\n");
      out.write("                            <div class=\"mn_icon\">\r\n");
      out.write("                                <img src=\"../icon/포토후기.png\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span class=\"clickable-span\">포토후기</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("                <!-- 고객센터 부분 -->\r\n");
      out.write("                <div class=\"mn_center\">\r\n");
      out.write("                <h2>고객센터</h2>\r\n");
      out.write("                \r\n");
      out.write("                <!-- 공지사항 부분 -->\r\n");
      out.write("                <div class=\"mn_box\">\r\n");
      out.write("                    <a href=\"../board/Announcement.jsp\" class=\"mn_btn\">\r\n");
      out.write("                            <div class=\"mn_icon\">\r\n");
      out.write("                                <img src=\"../icon/공지사항.png\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span class=\"clickable-span\">공지사항</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Q&A 부분 -->\r\n");
      out.write("                <div class=\"mn_box\">\r\n");
      out.write("                    <a href=\"../board/Q&A.jsp\" class=\"mn_btn\">\r\n");
      out.write("                            <div class=\"mn_icon\">\r\n");
      out.write("                                <img src=\"../icon/Q&A.png\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span class=\"clickable-span\">Q&A</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- 운영정책 부분 -->\r\n");
      out.write("                <div class=\"mn_box\">\r\n");
      out.write("                    <a href=\"../board/OperatingPolicy.jsp\" class=\"mn_btn\">\r\n");
      out.write("                            <div class=\"mn_icon\">\r\n");
      out.write("                                <img src=\"../icon/운영정책.png\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span class=\"clickable-span\">운영정책</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("            <!-- 메뉴 하단부분 -->\r\n");
      out.write("            <div class=\"footer\">\r\n");
      out.write("                <h1>SHOP GUIDE</h1>\r\n");
      out.write("                <h1>050-7871-2220</h1>\r\n");
      out.write("                <p>근무시간</p>\r\n");
      out.write("                <p>오전 10:00 ~ 오후19:00</p>\r\n");
      out.write("                <o>주말 및 공휴일 휴무</o>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 마이페이지 -->\r\n");
      out.write("        <div class=\"mypage\">\r\n");
      out.write("            <a href=\"../member/myPage.jsp\">\r\n");
      out.write("                    <span class=\"mypage_bt_icon\"><img src=\"../icon/마이페이지.png\"></span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 로그인 -->\r\n");
      out.write("        <div class=\"login\">\r\n");
      out.write("            <a href=\"../member/loginForm.jsp\">\r\n");
      out.write("                    <p class=\"login_bt_text\">로그인</p>\r\n");
      out.write("            </a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- 검색창 -->\r\n");
      out.write("        <div class=\"search\">\r\n");
      out.write("                <form action=\"\">\r\n");
      out.write("                    <input type=\"text\" name=\"search\" size=\"15\" placeholder=\"  검색\" \r\n");
      out.write("                    style=\"border: none;width: 150px; height: 30px; font-size: 17px; float: left; border-radius: 10px 0 0 10px\">\r\n");
      out.write("                    <input type=\"submit\" value=\"\" class=\"btn_submit\">\r\n");
      out.write("                </form>>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- 메인페이지 -->\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"card mb-4\">\r\n");
      out.write("				<div class=\"card-header pb-0\">\r\n");
      out.write("			              <h6>A/S 센터</h6>\r\n");
      out.write("	            </div>\r\n");
      out.write("	        </div>\r\n");
      out.write("				<div id=\"map\"></div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"center-write\">\r\n");
      out.write("				<div class=\"center-title\">\r\n");
      out.write("	              <h6>수리 신청서</h6>\r\n");
      out.write("	            </div>\r\n");
      out.write("	            <form>\r\n");
      out.write("		            <div class=\"center-detail\">\r\n");
      out.write("							기종 : <input id=\"input1\" type=\"text\" name=\"model\" placeholder=\"기종을 작성하세요\">\r\n");
      out.write("		            </div>\r\n");
      out.write("		            <div class=\"center-detail\">\r\n");
      out.write("							휴대폰 번호 : <input id=\"input1\" type=\"text\" name=\"phoneNum\" placeholder=\"휴대폰 번호를 작성하세요 ex)010-1234-5678\">\r\n");
      out.write("		            </div>\r\n");
      out.write("		            <div class=\"center-detail\">\r\n");
      out.write("							신청자 : <input id=\"input1\" type=\"text\" name=\"name\" placeholder=\"신청자 이름을 작성하세요\">\r\n");
      out.write("		            </div>\r\n");
      out.write("		            <div class=\"center-detail\">\r\n");
      out.write("							비밀번호 : <input id=\"input1\" type=\"text\" name=\"pw\" placeholder=\"비밀번호를 생성하세요\">\r\n");
      out.write("		            </div>\r\n");
      out.write("		            <div class=\"center-detail\">\r\n");
      out.write("							수리요청사항 : <input id=\"input2\" type=\"text\" name=\"request\" placeholder=\"수리요청사항을 작성하세요\">\r\n");
      out.write("		            </div>\r\n");
      out.write("		            <div class=\"center-detail\" >\r\n");
      out.write("		            		주소 :\r\n");
      out.write("							<div style=\"float: right;\">          \r\n");
      out.write("							<input type=\"text\" id=\"sample6_postcode\" name=\"zip_code\" placeholder=\"우편번호\">\r\n");
      out.write("							<input type=\"button\" id=\"sample6_button\" onclick=\"sample6_execDaumPostcode()\" value=\"우편번호 찾기\" style=\"outline: none;\"><br>\r\n");
      out.write("							<input type=\"text\" id=\"sample6_address\" name=\"address\" placeholder=\"주소\"><br>\r\n");
      out.write("							<input type=\"text\" id=\"sample6_detailAddress\" name=\"address_detail\" placeholder=\"상세주소\">\r\n");
      out.write("							<input type=\"text\" id=\"sample6_extraAddress\" name=\"refrence\" placeholder=\"참고항목\">\r\n");
      out.write("							</div>\r\n");
      out.write("		            </div>\r\n");
      out.write("		            \r\n");
      out.write("		            <input type=\"submit\" id=\"center-app\" value=\"신청하기\">\r\n");
      out.write("		            \r\n");
      out.write("	            </form>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("	    </div>\r\n");
      out.write("	    <script>\r\n");
      out.write("	    // 네이버 지도 API 스크립트 로드 완료 후 실행\r\n");
      out.write("	     var map = new naver.maps.Map('map', {\r\n");
      out.write("            center: new naver.maps.LatLng(35.1584043, 129.0620349), // 부산 아이티윌 좌표\r\n");
      out.write("            zoom: 15\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        var marker = new naver.maps.Marker({\r\n");
      out.write("            position: new naver.maps.LatLng(35.1584043, 129.0620349),\r\n");
      out.write("            map: map\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("	     </script>\r\n");
      out.write("	     \r\n");
      out.write("	     <script>\r\n");
      out.write("		    function sample6_execDaumPostcode() {\r\n");
      out.write("		        new daum.Postcode({\r\n");
      out.write("		            oncomplete: function(data) {\r\n");
      out.write("		                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.\r\n");
      out.write("		\r\n");
      out.write("		                // 각 주소의 노출 규칙에 따라 주소를 조합한다.\r\n");
      out.write("		                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.\r\n");
      out.write("		                var addr = ''; // 주소 변수\r\n");
      out.write("		                var extraAddr = ''; // 참고항목 변수\r\n");
      out.write("		\r\n");
      out.write("		                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.\r\n");
      out.write("		                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우\r\n");
      out.write("		                    addr = data.roadAddress;\r\n");
      out.write("		                } else { // 사용자가 지번 주소를 선택했을 경우(J)\r\n");
      out.write("		                    addr = data.jibunAddress;\r\n");
      out.write("		                }\r\n");
      out.write("		\r\n");
      out.write("		                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.\r\n");
      out.write("		                if(data.userSelectedType === 'R'){\r\n");
      out.write("		                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)\r\n");
      out.write("		                    // 법정동의 경우 마지막 문자가 \"동/로/가\"로 끝난다.\r\n");
      out.write("		                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){\r\n");
      out.write("		                        extraAddr += data.bname;\r\n");
      out.write("		                    }\r\n");
      out.write("		                    // 건물명이 있고, 공동주택일 경우 추가한다.\r\n");
      out.write("		                    if(data.buildingName !== '' && data.apartment === 'Y'){\r\n");
      out.write("		                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);\r\n");
      out.write("		                    }\r\n");
      out.write("		                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.\r\n");
      out.write("		                    if(extraAddr !== ''){\r\n");
      out.write("		                        extraAddr = ' (' + extraAddr + ')';\r\n");
      out.write("		                    }\r\n");
      out.write("		                    // 조합된 참고항목을 해당 필드에 넣는다.\r\n");
      out.write("		                    document.getElementById(\"sample6_extraAddress\").value = extraAddr;\r\n");
      out.write("		                \r\n");
      out.write("		                } else {\r\n");
      out.write("		                    document.getElementById(\"sample6_extraAddress\").value = '';\r\n");
      out.write("		                }\r\n");
      out.write("		\r\n");
      out.write("		                // 우편번호와 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("		                document.getElementById('sample6_postcode').value = data.zonecode;\r\n");
      out.write("		                document.getElementById(\"sample6_address\").value = addr;\r\n");
      out.write("		                // 커서를 상세주소 필드로 이동한다.\r\n");
      out.write("		                document.getElementById(\"sample6_detailAddress\").focus();\r\n");
      out.write("		            }\r\n");
      out.write("		        }).open();\r\n");
      out.write("		    }\r\n");
      out.write("		</script>\r\n");
      out.write(" \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
