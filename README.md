## 1. API 개발 및 에러 처리

- @Transactional 개선:
Connection is read-only와 같은 에러를 해결하기 위해 트랜잭션 관리를 올바르게 구현하여 데이터 수정이 정상적으로 이루어지도록 합니다.

## 2. JWT 활용

- User 엔티티에 닉네임 추가:
User 테이블에 nickname 컬럼을 추가하고, JWT에서 닉네임을 추출해 프론트엔드에서 표시할 수 있도록 합니다.

## 3. AOP 코드 개선

- AOP 개선:
UserAdminController의 changeUserRole() 메소드가 실행되기 전에 AOP 로깅이 올바르게 동작하도록 수정합니다.

## 4. 컨트롤러 테스트 코드 수정

- 테스트 코드 수정:
할 일 단건 조회 시 예외가 발생하는 테스트를 수정하여 정상적으로 통과할 수 있도록 합니다.

## 5. JPA 검색 기능 추가

- JPQL로 조건부 검색 구현:
weather와 수정일 기간 조건으로 할 일을 검색할 수 있는 기능을 추가합니다.

## 6. JPA Cascade 기능 활용

- 할 일 저장 시 담당자 자동 등록:
할 일을 생성한 유저를 자동으로 담당자로 등록하도록 JPA의 cascade 기능을 활용합니다.

## 7. N+1 문제 해결

- N+1 문제 해결:
CommentController의 getComments() API 호출 시 발생하는 N+1 문제를 해결하여 성능을 최적화합니다.

## 8. QueryDSL 사용

- QueryDSL로 검색 최적화:
JPQL로 작성된 쿼리를 QueryDSL로 변경하고, 성능 문제를 해결합니다.

## 9. Spring Security 적용

-	권한 및 인증 시스템:
기존 필터 및 Argument Resolver를 Spring Security로 변경하고, JWT를 사용한 토큰 기반 인증 방식을 유지하면서 권한 관리 기능을 구현합니다.

## 10. QueryDSL을 사용한 일정 검색 기능 구현

-	일정 검색 API 구현:
제목, 생성일, 담당자 닉네임으로 검색할 수 있는 일정 검색 기능을 QueryDSL을 통해 최적화하여 구현합니다.


# 트러블 슈팅



## 문제 상황






