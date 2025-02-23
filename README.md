# Picktory

![image](https://github.com/user-attachments/assets/9df49597-0c85-4a32-998f-b517e0859fe2)

# 🌐 Service URL

### 📍 [www.picktory.net](https://www.picktory.net/)

## 💡 Service Introduction

Picktory는 선물의 의미를 유지하면서도 상대방의 선호도를 자연스럽게 알 수 있는 서비스입니다. 선물 고르기의 어려움을 해소하고, 준비 과정에서의 정성과 고민을 함께 전달할 수 있습니다.

### Background
![image](https://github.com/user-attachments/assets/848bc2e9-8723-4f9d-865e-f0103531d461)

많은 사람들이 선물을 준비하는 과정에서 어려움을 느끼고 있습니다. 125명의 설문 응답을 통해, 사람들이 상대방의 선호도를 직접 물어보지 못하는 이유가 '선물의 감성이 사라지고 성의가 없어 보일까봐'라는 것을 발견했습니다.

### Solution
![image](https://github.com/user-attachments/assets/37180c27-5929-4b2c-b12a-169089f06dee)

- 선물 후보들을 함께 공유하며 상대방의 의견을 자연스럽게 수집
- 선물 준비 과정의 고민을 함께 전달하여 정성을 표현
- 선물의 의미를 유지하면서도 효과적인 선물 선택 가능



# Tech Stack

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=for-the-badge&logo=springsecurity&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring_Data_JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![JWT](https://img.shields.io/badge/JWT-black?style=for-the-badge&logo=JSON%20web%20tokens)
![REST API](https://img.shields.io/badge/REST_API-02569B?style=for-the-badge&logo=rest&logoColor=white)
![QueryDSL](https://img.shields.io/badge/QueryDSL-0769AD?style=for-the-badge&logo=query&logoColor=white)
![Jira](https://img.shields.io/badge/Jira-0052CC?style=for-the-badge&logo=jira&logoColor=white)


## 🔍 System Architecture

### Frontend Architecture
![image](https://github.com/user-attachments/assets/f19c2cda-e56a-4862-8cfd-203143cdd2dd)

### Backend Architecture
![image](https://github.com/user-attachments/assets/fe12fcce-9b47-485c-9940-71a0aa1eac62)


## 🌟 개발 이력

<div align="center">

[![Total PR Count](https://img.shields.io/badge/PRs-12+-blue?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend/pulls)
[![Lines of Code](https://img.shields.io/badge/Total_Code-2.5k_lines-brightgreen?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend)

</div>


### 1.1. Swagger 초기 설정 [![PR #3](https://img.shields.io/badge/-%233_Swagger_설정-31A8FF?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend/pull/3)

```gradle
implementation 'org.springdoc:springdoc-openapi-starter-webmvc-ui:2.3.0'
```

**구현 내용**
- ✨ API 문서화를 위한 SwaggerConfig 클래스 생성
- 🛠️ Context path를 `/api/v1`로 설정
- 📝 Swagger UI path: `/swagger-ui.html`
- 📚 API docs path: `/v3/api-docs`

### 1.2. QueryDSL 환경 구성 [![PR #4](https://img.shields.io/badge/-%234_QueryDSL_설정-31A8FF?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend/pull/4)

```gradle
implementation 'com.querydsl:querydsl-jpa:5.0.0:jakarta'
annotationProcessor "com.querydsl:querydsl-apt:5.0.0:jakarta"
```

**구현 내용**
- ⚙️ JPAQueryFactory Bean 등록
- 🔄 Q클래스 자동 생성 설정
- 📝 Entity 변경 시 clean & rebuild 필요

### 1.3. Spring Security 기본 설정 [![PR #5](https://img.shields.io/badge/-%235_Security_설정-31A8FF?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend/pull/5)

**구현 내용**
- 🔐 JWT 인증 필터 구현
- 🛡️ API 엔드포인트별 접근 권한 설정
- 🌐 CORS 설정
  - 프론트엔드 도메인 설정 이후 보안 강화 예정
  - HTTP 메소드: GET, POST, PUT, DELETE, PATCH, OPTIONS

## 2. Authentication

### 2.1. JWT 토큰 관리 시스템 구현 [![PR #7](https://img.shields.io/badge/-%237_JWT_구현-31A8FF?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend/pull/7)

**구현 내용**
- ✅ 토큰 유효성 검증 로직
- 🔄 만료 토큰 재발급 기능

### 2.2. 카카오 OAuth 인증 시스템 구축 [![PR #8](https://img.shields.io/badge/-%238_카카오_로그인-31A8FF?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend/pull/8)

**OAuth 인증 플로우**
1. 🎫 인증 코드로 카카오 액세스 토큰 발급
2. 👤 카카오 사용자 정보 조회
3. 🔑 JWT 토큰 발급

**회원 관리 기능**
- 📝 회원가입/로그인 통합 프로세스
- 👤 내 정보 조회
- 🚪 로그아웃
- ❌ 회원 탈퇴 (카카오 연동 해제 포함)

### 2.3. 카카오 로그인 테스트 환경 구축 [![PR #9](https://img.shields.io/badge/-%239_카카오_테스트-31A8FF?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend/pull/9)

**구현 내용**
- 🧹 DatabaseCleaner 구현
- ✅ JUnit 5 BeforeEachCallback 활용
- 🔒 SecurityContextHolder를 활용한 인증 테스트

## 3. Core Features

### 3.1. 배달부 캐릭터 선택 시스템 [![PR #24](https://img.shields.io/badge/-%2324_캐릭터_선택-31A8FF?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend/pull/24)

**구현 내용**
- 🎨 배달부 캐릭터 설정 API
- 🔗 고유 링크 생성 통합
- 📦 Bundle 상태 관리 개선:
  1. `DRAFT` (초기)
  2. `PUBLISHED` (배달부 설정 & 링크 생성)

### 3.2. 보따리 통합 조회 기능 [![PR #28](https://img.shields.io/badge/-%2328_보따리_조회-31A8FF?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend/pull/28)

**구현 내용**
- 🔍 QueryDSL 기반 데이터 조회
- 🎁 선물, 이미지, 응답 정보 통합 조회
- ✨ Response 엔티티 구현
- 🛠️ QueryDSL 기반 커스텀 구현체

### 3.3. 보따리 답변 시스템 구현 [![PR #35](https://img.shields.io/badge/-%2335_보따리_답변-31A8FF?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend/pull/35)

**구현 내용**
- 🏷️ GiftResponseTag 관리 체계
- 📝 다중 선물 답변 처리
- ✅ 상태 검증:
  - 번들 상태
  - 선물 목록
  - 기존 응답 여부
  - 응답 완료 여부

### 3.4. 보따리 상세 조회 기능 [![PR #44](https://img.shields.io/badge/-%2344_개별_조회-31A8FF?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend/pull/44)

**구현 내용**
- 🎁 개별 선물 상세 정보 조회
- 🖼️ 썸네일 및 이미지 목록 분리
- 🔒 권한 검증 및 예외 처리

### 3.5. 보따리 작성 완료 기능 [![PR #45](https://img.shields.io/badge/-%2345_마저_채우기-31A8FF?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend/pull/45)

**구현 내용**
- 📝 DRAFT 상태 보따리 조회
- ⚡ N+1 문제 해결을 위한 벌크 조회
- 🖼️ 이미지 처리:
  - 썸네일 분리
  - 이미지 목록 매핑

## 4. Enhancements & Fixes

### 4.1. 보따리 디자인 시스템 개선 [![PR #47](https://img.shields.io/badge/-%2347_디자인_타입-31A8FF?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend/pull/47)

**구현 내용**
- 🎨 design_type 필드 추가
- 🖌️ 배달부 SVG 변경을 위한 색상 정보 제공

### 4.2. 이미지 처리 로직 개선 [![PR #56](https://img.shields.io/badge/-%2356_썸네일_로직-31A8FF?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend/pull/56)

**구현 내용**
- 🏞️ 첫 번째 이미지를 썸네일로 사용
- 🔄 이미지 URL 처리 방식 통일
- 📝 API 응답 형식 일관성 확보

### 4.3. 보따리 식별자 시스템 개선 [![PR #57](https://img.shields.io/badge/-%2357_보따리_ID-31A8FF?style=for-the-badge)](https://github.com/dnd-side-project/dnd-12th-5-backend/pull/57)

**구현 내용**
- 🆔 보따리 조회 API 응답에 ID 포함
- 🔄 답변 저장 API 연동 개선


![image](https://github.com/user-attachments/assets/399c254a-db65-4af5-84b8-5a33bab807a2)

## 📝 License

This project is licensed under the terms of the MIT license.
