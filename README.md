# 주문 관리 API 프로젝트
주문 등록 및 조회, 상태 변경이 가능한 프로그램입니다.

## 개발 환경

* IntelliJ IDEA 2022.3.2 (Community Edition)
* Java 17
* Gradle 7.6.1
* Spring Boot 3.1.2
* Mysql 8.1

## 기술 세부 스택

Spring Boot

* Spring Boot Actuator
* Spring Web
* Spring Data JPA
* Rest Repositories
* Rest Repositories HAL Explorer
* H2 Database
* MySQL Driver
* Lombok
* Spring Boot DevTools
* Spring Configuration Processor


## DB설정
MYSQL의 설정은 아래와 같이 설정합니다. 

    url: jdbc:mysql://localhost:3306/order_mgr
    username: ordersys
    password: qwer12#$
    * data.sql에 약간의 테스트 데이터가 포함되어 있습니다.

## Reference

* 유즈케이스 다이어그램: https://drive.google.com/file/d/1gp1Uqo4IazPMyKFHzF0MlBqmEWFe2PCw/view?usp=drive_link
* 도메인(DB) 설계 문서 : https://drive.google.com/file/d/1cZJp_Ctm9-dpF6UHY7JkIWSUEx_67CLT/view?usp=drive_link
* API Endpoint 구글 시트: https://docs.google.com/spreadsheets/d/1K72mPUz5yBjV-pnRMgPnJP-6lVNzGuXmZdRsm_lZKXU/edit#gid=0
* 기획서(요구사항) 구글 시트: https://docs.google.com/spreadsheets/d/1RoFgzZBfYQ7kGmfwTXykR_igS4DISlFOv5IV0xDfUT8/edit#gid=0
* 깃헙 레파지토리 : https://github.com/JeongHyeon-Yoon/order-mgr-project
* 깃헙 프로젝트 관리 페이지 : https://github.com/users/JeongHyeon-Yoon/projects/5
