-- 코드를 입력하세요
SELECT to_char(DATETIME, 'HH24') as HOUR, count(to_char(DATETIME, 'HH24')) as COUNT
from ANIMAL_OUTS
where to_char(DATETIME, 'HH24mi') >= '0900' and to_char(DATETIME, 'HH24mi') <= '1959'
group by to_char(DATETIME, 'HH24')
order by HOUR asc