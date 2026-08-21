1# Write your MySQL query statement below
2select distinct author_id as id from Views 
3where author_id = viewer_id 
4order by id asc;