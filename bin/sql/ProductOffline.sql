-- 코드를 입력하세요
SELECT a.PRODUCT_CODE, sum(a.price * b.sales_amount) as SALES
FROM PRODUCT a, OFFLINE_SALE b 
where a.PRODUCT_ID = b.PRODUCT_ID
group by a.PRODUCT_CODE
order by SALES desc, a.PRODUCT_CODE asc