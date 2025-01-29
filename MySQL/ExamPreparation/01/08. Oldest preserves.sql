SELECT preserves.name, country_code, YEAR(established_on) AS 'founded_in' FROM preserves 
JOIN countries_preserves ON preserves.id = countries_preserves.preserve_id 
JOIN countries ON countries_preserves.country_id = countries.id WHERE MONTH(established_on)=5 ORDER BY established_on LIMIT 5 ;