DELIMITER $$
CREATE FUNCTION udf_average_lesson_price_by_city (name VARCHAR(40))
RETURNS DECIMAL(19,2)
DETERMINISTIC
BEGIN
RETURN(SELECT AVG(average_lesson_price) FROM driving_schools JOIN cities ON driving_schools.city_id = cities.id WHERE name=cities.name);
END $$
DELIMITER ;

SELECT udf_average_lesson_price_by_city('London')