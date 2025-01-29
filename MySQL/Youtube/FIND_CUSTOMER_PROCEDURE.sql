DELIMITER $$
CREATE PROCEDURE find_customer(IN id INT)
BEGIN
SELECT * FROM customers
WHERE customer_id = id;
END $$
DELIMITER ;