-- 코드를 입력하세요
SELECT count(*) as "USERS"
from USER_INFO
where AGE <= 29 and AGE >= 20
and to_char(JOINED, 'yyyymmdd') > '20210101' and to_char(JOINED, 'yyyymmdd') < '20220101'