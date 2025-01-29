DROP PROCEDURE udp_find_school_by_car;
DELIMITER $$
CREATE PROCEDURE udp_find_school_by_car(brand VARCHAR(20))
BEGIN
SELECT name,average_lesson_price FROM cars 
JOIN driving_schools ON cars.id = car_id WHERE brand =cars.brand
ORDER BY average_lesson_price DESC;
END $$
DELIMITER ;
CALL udp_find_school_by_car('Mercedes-Benz');