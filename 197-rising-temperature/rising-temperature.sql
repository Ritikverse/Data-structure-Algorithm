# Write your MySQL query statement below
SELECT t.id
FROM Weather AS t
JOIN Weather AS y
ON DATEDIFF(t.recordDate , y.recordDate) = 1
where t.temperature > y.temperature;