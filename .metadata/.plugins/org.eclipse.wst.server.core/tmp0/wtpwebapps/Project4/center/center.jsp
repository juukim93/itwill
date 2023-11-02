<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>A/S 센터</title>
<link rel="stylesheet" type="text/css" href="../css/reset.css"/>
<link rel="stylesheet" type="text/css" href="../css/layout.css"/>
<link id="pagestyle" href="../css/board.css" rel="stylesheet" />
 <script type="text/javascript" src="https://oapi.map.naver.com/openapi/v3/maps.js?ncpClientId=<!-- f8p8fgvkm7 -->"></script>
<script src="../js/jquery.js"></script>
<script language="JavaScript" type="text/javascript"></script>
<script src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>

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
                const homeButton = $('.mn_btn:eq(3)');
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
                    <a href="../product/orderList.jsp" class="mn_btn">
                            <div class="mn_icon">
                                <img src="../icon/중고매입.png">
                            </div>
                            <span class="clickable-span">내 기기 구매/대여</span>
                    </a>
                </div>
                <!-- 중고판매버튼 -->
                <div class="mn_box">
                    <a href="../product/saleList.jsp" class="mn_btn">
                            <div class="mn_icon">
                                <img src="../icon/중고판매.png">
                            </div>
                            <span class="clickable-span">내 기기 판매</span>
                    </a>
                </div>
                <!-- 기기대여버튼 -->
                <div class="mn_box">
                    <a href="center.jsp" class="mn_btn">
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
                </form>>
        </div>

        <!-- 메인페이지 -->
		<div class="row">
			<div class="card mb-4">
				<div class="card-header pb-0">
			              <h6>A/S 센터</h6>
	            </div>
	        </div>
				<div id="map"></div>
			
			<div class="center-write">
				<div class="center-title">
	              <h6>수리 신청서</h6>
	            </div>
	            <form>
		            <div class="center-detail">
							기종 : <input id="input1" type="text" name="model" placeholder="기종을 작성하세요">
		            </div>
		            <div class="center-detail">
							휴대폰 번호 : <input id="input1" type="text" name="phoneNum" placeholder="휴대폰 번호를 작성하세요 ex)010-1234-5678">
		            </div>
		            <div class="center-detail">
							신청자 : <input id="input1" type="text" name="name" placeholder="신청자 이름을 작성하세요">
		            </div>
		            <div class="center-detail">
							비밀번호 : <input id="input1" type="text" name="pw" placeholder="비밀번호를 생성하세요">
		            </div>
		            <div class="center-detail">
							수리요청사항 : <input id="input2" type="text" name="request" placeholder="수리요청사항을 작성하세요">
		            </div>
		            <div class="center-detail" >
		            		주소 :
							<div style="float: right;">          
							<input type="text" id="sample6_postcode" name="zip_code" placeholder="우편번호">
							<input type="button" id="sample6_button" onclick="sample6_execDaumPostcode()" value="우편번호 찾기" style="outline: none;"><br>
							<input type="text" id="sample6_address" name="address" placeholder="주소"><br>
							<input type="text" id="sample6_detailAddress" name="address_detail" placeholder="상세주소">
							<input type="text" id="sample6_extraAddress" name="refrence" placeholder="참고항목">
							</div>
		            </div>
		            
		            <input type="submit" id="center-app" value="신청하기">
		            
	            </form>
			</div>
			
	    </div>
	    <script>
	    // 네이버 지도 API 스크립트 로드 완료 후 실행
	     var map = new naver.maps.Map('map', {
            center: new naver.maps.LatLng(35.1584043, 129.0620349), // 부산 아이티윌 좌표
            zoom: 15
        });

        var marker = new naver.maps.Marker({
            position: new naver.maps.LatLng(35.1584043, 129.0620349),
            map: map
        });

	     </script>
	     
	     <script>
		    function sample6_execDaumPostcode() {
		        new daum.Postcode({
		            oncomplete: function(data) {
		                // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
		
		                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
		                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
		                var addr = ''; // 주소 변수
		                var extraAddr = ''; // 참고항목 변수
		
		                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
		                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
		                    addr = data.roadAddress;
		                } else { // 사용자가 지번 주소를 선택했을 경우(J)
		                    addr = data.jibunAddress;
		                }
		
		                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
		                if(data.userSelectedType === 'R'){
		                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
		                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
		                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
		                        extraAddr += data.bname;
		                    }
		                    // 건물명이 있고, 공동주택일 경우 추가한다.
		                    if(data.buildingName !== '' && data.apartment === 'Y'){
		                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
		                    }
		                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
		                    if(extraAddr !== ''){
		                        extraAddr = ' (' + extraAddr + ')';
		                    }
		                    // 조합된 참고항목을 해당 필드에 넣는다.
		                    document.getElementById("sample6_extraAddress").value = extraAddr;
		                
		                } else {
		                    document.getElementById("sample6_extraAddress").value = '';
		                }
		
		                // 우편번호와 주소 정보를 해당 필드에 넣는다.
		                document.getElementById('sample6_postcode').value = data.zonecode;
		                document.getElementById("sample6_address").value = addr;
		                // 커서를 상세주소 필드로 이동한다.
		                document.getElementById("sample6_detailAddress").focus();
		            }
		        }).open();
		    }
		</script>
 
</body>
</html>