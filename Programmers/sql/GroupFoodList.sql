-- 코드를 입력하세요
SELECT a.MEMBER_NAME, b.REVIEW_TEXT, to_char(b.REVIEW_DATE, 'yyyy-mm-dd') as REVIEW_DATE
from MEMBER_PROFILE a, REST_REVIEW b
where a.member_id = b.member_id
and a.member_id in ( select member_id from REST_REVIEW group by MEMBER_ID
    having count(*) = (select max(count(*)) from REST_REVIEW group by MEMBER_ID))
order by REVIEW_DATE asc, REVIEW_TEXT asc