# Write your MySQL query statement below
SELECT 
product_name,
year,
price
FROM Sales AS a
INNER JOIN  Product AS p
ON a.product_id = p.product_id;