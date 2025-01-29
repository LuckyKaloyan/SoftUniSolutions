SELECT name,manufacturer FROM spaceships 
JOIN journeys ON spaceships.id = journeys.spaceship_id
JOIN travel_cards ON journeys.id = travel_cards.journey_id
JOIN colonists ON travel_cards.colonist_id = colonists.id
WHERE colonists.birth_date>'1989-01-01' AND travel_cards.job_during_journey = 'Pilot' ORDER BY name ASC;