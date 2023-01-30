-- 코드를 입력하세요
SELECT NAME, count(NAME) as COUNT
from ANIMAL_INS
group by name
having count(NAME) >= 2
order by NAME