-- 코드를 입력하세요
SELECT ANIMAL_ID, NAME
from (select (b.DATETIME - a.DATETIME) as time, b.NAME, b.ANIMAL_ID
        from ANIMAL_INS a, ANIMAL_OUTS b
    where a.ANIMAL_ID = b.ANIMAL_ID
     order by time desc)
where ROWNUM <= 2