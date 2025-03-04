# Java Board (Spring Boot + JSP)

Java Board는 Spring Boot와 JSP를 사용하여 구현된 기본적인 게시판 기능을 제공하는 웹 애플리케이션입니다.   
이 프로젝트는 게시글 목록 보기, 작성, 수정, 삭제와 같은 기본적인 게시판 기능을 제공합니다.

## 기능

- 게시글 목록 보기
- 게시글 작성, 수정, 삭제
- 게시글 상세 보기
- 게시글 검색 기능

## 기술 스택

- **Java 11**: 프로그래밍 언어
- **Spring Boot**: Java 웹 프레임워크
- **JSP**: Java 서버 페이지 (뷰 템플릿)
- **Spring Data JPA**: 데이터베이스 연동
- **MySQL**: 데이터베이스 관리 시스템
- **Gradle**: 의존성 관리 및 빌드 도구
- **Tomcat**: 웹 서버 (내장 톰캣 사용)

## 설치 방법

### 1. 클론

먼저 이 레포지토리를 클론합니다:

```bash
git clone https://github.com/devkhun/java_board.git
```

### 2. 데이터베이스 설정
MySQL에서 아래와 같이 데이터베이스를 설정합니다.
```sql
CREATE DATABASE java_board;
USE java_board;

-- 게시글 테이블 생성
CREATE TABLE posts (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    content TEXT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

### 3. 환경 설정
`src/main/resources/application.properties` 파일에서 데이터베이스 연결 설정을 합니다.
```properties
# MySQL 데이터베이스 설정
spring.datasource.url=jdbc:mysql://localhost:3306/java_board?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=your_password

# JPA 설정
spring.jpa.hibernate.ddl-auto=update
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

# JSP 설정
spring.mvc.view.prefix=/WEB-INF/views/
spring.mvc.view.suffix=.jsp
```

### 4. Gradle 설정
프로젝트는 Gradle을 사용하여 의존성 관리 및 빌드합니다.    
build.gradle 파일을 확인하고 필요한 의존성을 추가합니다.
```groovy
plugins {
    id 'org.springframework.boot' version '2.5.4'
    id 'java'
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '11'

repositories {
    mavenCentral()
}

dependencies {
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    implementation 'org.springframework.boot:spring-boot-starter-web'
    implementation 'org.springframework.boot:spring-boot-starter-tomcat'
    implementation 'mysql:mysql-connector-java'
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

tasks.named('test') {
    useJUnitPlatform()
}
```

### 5. 빌드 및 실행
프로젝트를 빌드하고 실행하려면 아래의 Gradle 명령어를 사용합니다.
```bash
# 의존성 다운로드 및 빌드
./gradlew build

# 애플리케이션 실행
./gradlew bootRun
```

### 6. 서버 실행
애플리케이션을 실행한 후,   
웹 브라우저에서 http://localhost:8080에 접속하여 게시판을 확인할 수 있습니다.

## 사용 예시
게시글 작성: 게시판 화면에서 제목과 내용을 입력하여 게시글을 작성할 수 있습니다.   
게시글 수정/삭제: 작성한 게시글을 선택하여 수정하거나 삭제할 수 있습니다.   
게시글 검색: 제목으로 게시글을 검색할 수 있습니다.   
## 기여
이 프로젝트에 기여하고 싶다면, 다음을 따르세요:

레포지토리를 포크(fork) 합니다.   
새로운 브랜치를 만들어 기능을 추가하거나 버그를 수정합니다.   
수정 후 Pull Request(PR) 를 생성합니다.   