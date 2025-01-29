DROP PROCEDURE usp_get_towns_starting_with;
DELIMITER $$
CREATE PROCEDURE usp_get_towns_starting_with(input VARCHAR(50))
BEGIN
SELECT name AS 'town_name' FROM towns WHERE name LIKE CONCAT(input,'%') ORDER BY name ASC;
END $$
DELIMITER ;

CALL usp_get_towns_starting_with('B');