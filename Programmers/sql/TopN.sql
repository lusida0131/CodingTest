-- 코드를 입력하세요
SELECT NAME
from (
    select * from ANIMAL_INS
    order by DATETIME asc
)
where ROWNUM <= 1