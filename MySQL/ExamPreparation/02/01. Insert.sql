INSERT INTO travel_cards(card_number,job_during_journey,colonist_id,journey_id) SELECT IF(birth_date>'1980-01-01',CONCAT(YEAR(birth_date),DAY(birth_date), SUBSTRING(ucn,1,4)),
CONCAT(YEAR(birth_date),MONTH(birth_date), SUBSTRING(ucn, LENGTH(ucn) - 3, 4))), IF(id%2=0,'Pilot',IF(id%3=0,'Cook','Engineer')),id,SUBSTRING(ucn,1,1) FROM colonists WHERE id BETWEEN 96 AND 100;

SELECT * FROM travel_cards;