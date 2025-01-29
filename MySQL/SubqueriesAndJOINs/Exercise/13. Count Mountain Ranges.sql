SELECT country_code, COUNT(mountain_range)  AS 'mountain_range'
FROM mountains_countries
JOIN mountains ON mountains_countries.mountain_id = mountains.id 
WHERE country_code IN ('BG','US',"RU")
GROUP BY country_code
ORDER BY COUNT(mountain_range) DESC;