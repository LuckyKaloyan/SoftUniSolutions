SELECT towns.town_id,towns.name AS 'town_name',addresses.address_text 
FROM towns JOIN addresses ON towns.town_id = addresses.town_id 
WHERE towns.town_id IN (9,15,32) ORDER BY towns.town_id,addresses.address_id;