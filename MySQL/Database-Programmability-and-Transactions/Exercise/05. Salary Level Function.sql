USE soft_uni;
DELIMITER $$
CREATE FUNCTION ufn_get_salary_level (salary DECIMAL(19,4) )
RETURNS TEXT
DETERMINISTIC
BEGIN
RETURN   IF(salary > 50000, 'High', 
              IF(salary >= 30000, 'Average', 'Low'));
END$$
DELIMITER ;
