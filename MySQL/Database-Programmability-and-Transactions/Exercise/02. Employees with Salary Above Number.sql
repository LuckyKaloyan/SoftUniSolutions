
DELIMITER $$
CREATE PROCEDURE usp_get_employees_salary_above(input DECIMAL(19,4))
BEGIN
SELECT first_name, last_name FROM employees WHERE salary>=input ORDER BY first_name,last_name,employee_id ASC;
END $$
DELIMITER ;

CALL usp_get_employees_salary_above(45000);