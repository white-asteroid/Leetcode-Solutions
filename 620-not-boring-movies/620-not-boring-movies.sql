# Write your MySQL query statement below
select * from cinema 
where id % 2 <> 0 && lower(description) <> "boring" 
order by rating DESC;