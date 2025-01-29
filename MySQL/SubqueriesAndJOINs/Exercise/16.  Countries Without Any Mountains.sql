SELECT COUNT(countries.country_name)-(SELECT COUNT(DISTINCT mountains_countries.country_code) 

FROM countries 
JOIN mountains_countries ON countries.country_code = mountains_countries.country_code) AS 'country_count'  FROM countries;