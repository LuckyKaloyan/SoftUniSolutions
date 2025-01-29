SELECT planets.name,COUNT(journeys.id) FROM planets 
JOIN spaceports ON spaceports.planet_id=planets.id
JOIN journeys ON spaceports.id = destination_spaceport_id GROUP BY planets.id
ORDER BY COUNT(journeys.id) DESC;