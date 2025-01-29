DELIMITER $$
CREATE PROCEDURE usp_raise_salary_by_id(id INT)
BEGIN
DECLARE UPDATED INT;
SET UPDATED := (SELECT count(*) FROM employees WHERE employee_id = id);
START TRANSACTION;
UPDATE employees SET salary = salary*1.05 WHERE employee_id = id;
IF UPDATED>0 THEN COMMIT; ELSE ROLLBACK;
END IF;
END $$
DELIMITER ;


