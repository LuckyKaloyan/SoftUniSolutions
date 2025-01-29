SELECT  country_name,river_name FROM countries 
LEFT JOIN countries_rivers ON countries.country_code = countries_rivers.country_code 
LEFT JOIN rivers ON countries_rivers.river_id = rivers.id 
WHERE continent_code = 'AF'
GROUP BY country_name, river_name 
ORDER BY country_name LIMIT 5;