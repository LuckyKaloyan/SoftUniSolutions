SELECT countries.country_name,MAX(peaks.elevation),MAX(rivers.length) FROM countries 
JOIN mountains_countries ON countries.country_code = mountains_countries.country_code 
JOIN peaks ON mountains_countries.mountain_id = peaks.mountain_id
JOIN countries_rivers ON countries.country_code = countries_rivers.country_code
JOIN rivers ON rivers.id = countries_rivers.river_id

GROUP BY country_name
ORDER BY MAX(peaks.elevation) DESC,MAX(rivers.length) DESC LIMIT 5;