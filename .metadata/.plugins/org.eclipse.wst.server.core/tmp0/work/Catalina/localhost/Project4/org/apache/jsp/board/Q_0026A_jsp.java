/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.78
 * Generated at: 2023-10-31 07:29:49 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Q_0026A_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>Q&A</title>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/reset.css\"/>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/layout.css\"/>\r\n");
      out.write("<link id=\"pagestyle\" href=\"../css/board.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script src=\"../js/jquery.js\"></script>\r\n");
      out.write("<script language=\"JavaScript\" type=\"text/javascript\"></script>\r\n");
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
      out.write("                const homeButton = $('.mn_btn:eq(6)');\r\n");
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
      out.write("                    <a href=\"../center/center.jsp\" class=\"mn_btn\">\r\n");
      out.write("                            <div class=\"mn_icon\">\r\n");
      out.write("                                <img src=\"../icon/기기대여.png\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span class=\"clickable-span\">A/S 센터</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- 포토후기버튼 -->\r\n");
      out.write("                <div class=\"mn_box\">\r\n");
      out.write("                    <a href=\"Review.jsp\" class=\"mn_btn\">\r\n");
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
      out.write("                    <a href=\"Announcement.jsp\" class=\"mn_btn\">\r\n");
      out.write("                            <div class=\"mn_icon\">\r\n");
      out.write("                                <img src=\"../icon/공지사항.png\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span class=\"clickable-span\">공지사항</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- Q&A 부분 -->\r\n");
      out.write("                <div class=\"mn_box\">\r\n");
      out.write("                    <a href=\"Q&A.jsp\" class=\"mn_btn\">\r\n");
      out.write("                            <div class=\"mn_icon\">\r\n");
      out.write("                                <img src=\"../icon/Q&A.png\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <span class=\"clickable-span\">Q&A</span>\r\n");
      out.write("                    </a>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- 운영정책 부분 -->\r\n");
      out.write("                <div class=\"mn_box\">\r\n");
      out.write("                    <a href=\"OperatingPolicy.jsp\" class=\"mn_btn\">\r\n");
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
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- 메인페이지 -->\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("		 	Q&A       \r\n");
      out.write("	    </div>\r\n");
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
