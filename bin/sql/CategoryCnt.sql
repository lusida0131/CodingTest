-- 코드를 입력하세요
SELECT substr(PRODUCT_CODE, 1, 2) as CATEGORY, count(substr(PRODUCT_CODE, 1, 2)) as PRODUCTS
from PRODUCT
group by substr(PRODUCT_CODE, 1, 2)
order by substr(PRODUCT_CODE, 1, 2) asc