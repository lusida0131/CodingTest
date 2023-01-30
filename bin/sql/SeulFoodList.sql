select a.REST_ID, a.REST_NAME, a.FOOD_TYPE, a.FAVORITES, a.ADDRESS, b.SCORE
from REST_INFO a, (
    select REST_ID, round(avg(REVIEW_SCORE), 2) as SCORE
    from REST_REVIEW
    group by REST_ID ) b
where a.REST_ID = b.REST_ID
and a.ADDRESS like '서울%'
order by SCORE desc, a.FAVORITES desc