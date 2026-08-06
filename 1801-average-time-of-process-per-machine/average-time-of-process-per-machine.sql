# Write your MySQL query statement below
SELECT t.machine_id,
ROUND(AVG(a.timestamp-t.timestamp),3) AS processing_time
FROM Activity AS a
JOIN Activity AS t
ON a.machine_id = t.machine_id
AND t.process_id = a.process_id
AND t.activity_type = 'start'
AND a.activity_type = 'end'
GROUP BY t.machine_id