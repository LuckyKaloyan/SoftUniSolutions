DELIMITER $$
CREATE FUNCTION
udf_average_salary_by_position_name (name VARCHAR(40)) 
RETURNS DECIMAL(50,2)
DETERMINISTIC
BEGIN

RETURN ( SELECT (SELECT SUM(salary) FROM workers JOIN positions ON workers.position_id = positions.id WHERE positions.name = name)/( SELECT COUNT(workers.id) FROM workers JOIN positions ON workers.position_id = positions.id WHERE positions.name = name)
);
END $$

DELIMITER ;

SELECT udf_average_salary_by_position_name('Forester');