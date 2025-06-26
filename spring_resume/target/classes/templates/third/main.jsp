<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
/* 메인 컨텐츠 영역 */
.main-container {
	max-width: 1200px;
	margin: 0 auto;
	padding: 40px 20px;
	min-height: calc(100vh - 120px);
}

.hero-section {
	text-align: center;
	padding: 60px 0;
	background: linear-gradient(135deg, #f8f9fa 0%, #e9ecef 100%);
	border-radius: 12px;
	margin-bottom: 40px;
}

.hero-title {
	font-size: 36px;
	font-weight: 700;
	color: #212529;
	margin-bottom: 16px;
}

.hero-subtitle {
	font-size: 18px;
	color: #6c757d;
	margin-bottom: 32px;
}

.hero-search {
	max-width: 500px;
	margin: 0 auto;
	position: relative;
}

.hero-search-box {
	width: 100%;
	height: 56px;
	padding: 0 60px 0 24px;
	border: 2px solid #00d084;
	border-radius: 28px;
	font-size: 16px;
	outline: none;
	background: #fff;
}

.hero-search-button {
	position: absolute;
	right: 8px;
	top: 8px;
	width: 40px;
	height: 40px;
	background: #00d084;
	border: none;
	border-radius: 20px;
	color: #fff;
	font-size: 18px;
	cursor: pointer;
	transition: background 0.2s;
}

.hero-search-button:hover {
	background: #00b370;
}

.content-grid {
	display: grid;
	grid-template-columns: repeat(auto-fit, minmax(300px, 1fr));
	gap: 24px;
	margin-top: 40px;
}

.content-card {
	background: #fff;
	border: 1px solid #e9ecef;
	border-radius: 12px;
	padding: 24px;
	transition: all 0.2s;
}

.content-card:hover {
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
}

.card-title {
	font-size: 20px;
	font-weight: 600;
	color: #212529;
	margin-bottom: 12px;
}

.card-description {
	color: #6c757d;
	line-height: 1.6;
}

@media ( max-width : 768px) {
	.hero-title {
		font-size: 28px;
	}
	.content-grid {
		grid-template-columns: 1fr;
	}
}
</style>
</head>
<body>
<div class="main-container">
	<!-- 히어로 섹션 -->
	<section class="hero-section">
		<h1 class="hero-title">개발자 커리어의 시작</h1>
		<p class="hero-subtitle">전국 최고의 IT 기업들이 당신을 기다리고 있습니다</p>
		<div class="hero-search">
			<input type="text" class="hero-search-box"
				placeholder="어떤 포지션을 찾고 계신가요?" />
			<button class="hero-search-button">🔍</button>
		</div>
	</section>

	<!-- 컨텐츠 카드 -->
	<div class="content-grid">
		<div class="content-card">
			<h3 class="card-title">신입 개발자 채용</h3>
			<p class="card-description">경험이 없어도 괜찮습니다. 성장 가능성과 열정을 중시하는 기업들을
				만나보세요.</p>
		</div>
		<div class="content-card">
			<h3 class="card-title">경력직 스카우트</h3>
			<p class="card-description">당신의 경력과 실력을 인정받을 수 있는 더 좋은 기회를
				찾아드립니다.</p>
		</div>
		<div class="content-card">
			<h3 class="card-title">원격근무 가능</h3>
			<p class="card-description">집에서도, 어디서든 일할 수 있는 유연한 근무환경을 제공하는
				회사들입니다.</p>
		</div>
	</div>
</div>
</body>
</html>