SELECT planets.name AS 'planet_name', spaceports.name AS 'spaceport_name' FROM planets 
JOIN spaceports ON planets.id = spaceports.planet_id 
JOIN journeys ON spaceports.id = destination_spaceport_id WHERE purpose = 'Educational';