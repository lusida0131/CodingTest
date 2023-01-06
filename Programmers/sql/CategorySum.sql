-- 코드를 입력하세요
SELECT category, sum(sales) as TOTAL_SALES
from BOOK a, BOOK_SALES b
where a.BOOK_ID = b.BOOK_ID
and to_char(b.SALES_DATE,'yyyymmdd') like '202201%'
group by category
order by category asc
