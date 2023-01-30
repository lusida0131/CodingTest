-- 코드를 입력하세요
SELECT BOOK_ID, to_char(PUBLISHED_DATE, 'yyyy-mm-dd')
from BOOK
where to_char(PUBLISHED_DATE, 'yyyymmdd') like '2021%'
and CATEGORY in '인문'
order by PUBLISHED_DATE asc