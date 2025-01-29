SELECT CONCAT(first_name," ",last_name) AS 'full_name', DATEDIFF("2024-01-01", start_date) 
FROM workers 
ORDER BY DATEDIFF(CURDATE(), start_date) DESC LIMIT 10;