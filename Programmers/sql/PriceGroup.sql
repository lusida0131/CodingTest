select substr(price, 1, 1) * 10000  as PRICE_GROUP,
count(*) as PRODUCTS
from PRODUCT
group by substr(price, 1, 1)
order by substr(price, 1, 1)