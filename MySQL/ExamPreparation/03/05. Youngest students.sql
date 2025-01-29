SELECT CONCAT(first_name,' ',last_name) AS 'full_name', age FROM students 
WHERE age = (SELECT age FROM students ORDER BY age ASC LIMIT 1) AND first_name LIKE '%a%' ORDER BY id ASC;