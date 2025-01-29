USE soft_uni;
DELIMITER $$
CREATE PROCEDURE usp_get_employees_from_town(town_name VARCHAR(50))
BEGIN
SELECT first_name,last_name FROM employees
 JOIN addresses ON employees.address_id = addresses.address_id 
JOIN towns ON towns.town_id = addresses.town_id 
WHERE towns.name = town_name
ORDER BY first_name,last_name;
END$$
DELIMITER ;

CALL usp_get_employees_from_town('Sofia');