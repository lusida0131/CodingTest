-- 코드를 입력하세요
select NAME, DATETIME
from ANIMAL_INS
 where ANIMAL_ID not in (
     SELECT ANIMAL_ID
     from ANIMAL_OUTS 
 ) 
order by DATETIME asc,
DATETIME FETCH FIRST 3 ROWS ONLY