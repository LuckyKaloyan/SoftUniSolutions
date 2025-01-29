DELIMITER $$
CREATE PROCEDURE find_customer2( IN f_name VARCHAR(30),
								IN l_name VARCHAR(30))
BEGIN
SELECT * FROM customers
WHERE f_name = first_name AND l_name = last_name;
END $$
DELIMITER ;

CALL find_customer2("Antonek","Antonekov");