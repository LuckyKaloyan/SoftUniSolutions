DROP PROCEDURE udp_increase_salaries_by_country;
DELIMITER $$
CREATE PROCEDURE udp_increase_salaries_by_country ( country_name VARCHAR(30))
BEGIN
UPDATE workers 
JOIN countries_preserves ON workers.preserve_id = countries_preserves.preserve_id 
JOIN countries ON countries_preserves.country_id = countries.id  SET salary = ROUND(salary*1.05,2) WHERE countries.name = country_name;
END $$
DELIMITER ;

CALL udp_increase_salaries_by_country('Germany');
