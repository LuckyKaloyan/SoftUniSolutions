DROP PROCEDURE usp_get_employees_by_salary_level ;
DELIMITER $$
CREATE PROCEDURE usp_get_employees_by_salary_level (IN salary_level VARCHAR(7))
BEGIN
    SELECT first_name, last_name 
    FROM employees
    WHERE 
        (salary_level = 'low' AND salary < 30000) OR
        (salary_level = 'average' AND salary >= 30000 AND salary <= 50000) OR
        (salary_level = 'high' AND salary > 50000)
	ORDER BY first_name DESC, last_name DESC;
END$$
DELIMITER ;

CALL usp_get_employees_by_salary_level('high');