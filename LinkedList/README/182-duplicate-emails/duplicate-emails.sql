# Write your MySQL query statement below
SELECT Email FROm Person 
GROUP BY EMAIL
HAVING COUNT(Email) > 1;