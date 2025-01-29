DROP FUNCTION udf_count_colonists_by_destination_planet;
DELIMITER $$
CREATE FUNCTION udf_count_colonists_by_destination_planet (planet_name VARCHAR (30))
RETURNS INT
DETERMINISTIC
BEGIN
DECLARE result INT;
SELECT  COUNT(travel_cards.id) AS 'count' INTO result FROM travel_cards 
JOIN colonists ON colonists.id = travel_cards.colonist_id
JOIN journeys ON journeys.id = travel_cards.journey_id
JOIN spaceports ON journeys.destination_spaceport_id = spaceports.id
JOIN planets ON spaceports.planet_id = planets.id
WHERE planets.name = planet_name
;
RETURN result;
END $$

SELECT udf_count_colonists_by_destination_planet('Otroyphus');