DELIMITER $$
CREATE FUNCTION ufn_count_employees_by_town(town_name VARCHAR(50))
RETURNS INT
DETERMINISTIC
BEGIN
RETURN (SELECT count(employee_id) FROM employees 
JOIN addresses ON employees.address_id = addresses.address_id 
JOIN towns ON addresses.town_id = towns.town_id WHERE towns.name = town_name);
END $$
DELIMITER ;

SELECT ufn_count_employees_by_town('Sofia');