-- 코드를 입력하세요
select a.ANIMAL_ID, a.NAME, nvl2(b.SEX_UPON_INTAKE, 'O', 'X') as "중성화"
from ANIMAL_INS a,
(SELECT ANIMAL_ID, SEX_UPON_INTAKE
from ANIMAL_INS
where SEX_UPON_INTAKE like 'Neutered%' or SEX_UPON_INTAKE like 'Spayed%') b
where a.ANIMAL_ID = b.ANIMAL_ID(+)
order by ANIMAL_ID asc