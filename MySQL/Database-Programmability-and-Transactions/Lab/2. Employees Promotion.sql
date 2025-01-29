DROP PROCEDURE usp_raise_salaries;
DELIMITER $$
CREATE PROCEDURE usp_raise_salaries(department_name VARCHAR(50))
BEGIN
UPDATE employees JOIN departments ON employees.department_id = departments.department_id  SET salary = salary * 1.05 WHERE department_name = name;
END $$
DELIMITER ;
CALL usp_raise_salaries('Sales');
SELECT employee_id, salary, name FROM employees JOIN departments ON employees.department_id = departments.department_id;