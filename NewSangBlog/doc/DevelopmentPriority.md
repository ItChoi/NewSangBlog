### 개발 우선순위
1. UML - 클래스 다이어그램 작성
    - 구체적이고 명확하게 말고, 전체적인 흐름부터 작성해보기.
    - 협력의 문맥 안에서 클래스 간의 관계들을 정리하고, 정리하면서 도메인들 구성
    <br/>
    
2. ERD 다이어그램
    - 프로젝트 관련 테이블들 구성하기.
3. 패키지 환경 및 Mybatis 사용 환경 구축


### 현재 작업 중

- 메뉴 쿼리 작성
    - 메뉴 쿼리 1, 2, 3차 한 번에 가져오기
    - ID, PARENT_ID 활용하여 쿼리 작성
    - 

```sql
--ORACLE 쿼리
SELECT
    *
FROM
    MANAGER_MENU
START WITH PARENT_ID IS NULL
CONNECT BY PRIOR ID = PARENT_ID
ORDER SIBLINGS BY ORDERING


SELECT
    B.ID,
    B.PARENT_ID,
    B.MENU_LEVEL,
    B.MENU_CODE,
    B.ORDERING
FROM
    MANAGER_MENU B
WHERE 
    (CASE WHEN B.PARENT_ID IS NULL
        THEN
            B.ID
        ELSE
            B.PARENT_ID
    END) IN (
        SELECT 
            A.ID
        FROM
            MANAGER_MENU A
        WHERE
            A.PARENT_ID IS NULL
    )
ORDER BY B.MENU_CODE, B.MENU_LEVEL
    
```

### TODO LIST
- Enum으로 폰 / 전화 앞자리 효율적으로 사용하기.
- log4j2 설정 알아보기.
- UML - 클래스 다이어그램 작성 중....
- 람다, Optional, (Arrays, Collectors), Exception 정리
- 부트스트랩 적용 


- DateUtil 만들기.
  - dateTime / date / time의 값이 올바로 들어갔는지 검증
    - 값과 구분자들 넘겨주어 확인
      - 패턴 형식은 구분자 없이 숫자 14개(년월일시분초)로 변환 후 확인
      - 구분자
        - 공통으로 사용 - 날짜 입력 시 구분자는 변경 가능 -> - : / 등 여러 가지 데이터가 있을 수 있다.
        - 날짜 데이터를 꺼내올 때, 구분자 확인하는 로직 필요 - 년 월 일 시 분 초를 적재적소에 넣어주는 로직 필요
         
