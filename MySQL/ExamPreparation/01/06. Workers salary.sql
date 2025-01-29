SELECT workers.id,first_name,last_name,preserves.name,country_code FROM workers 
JOIN countries_preserves ON workers.preserve_id = countries_preserves.preserve_id 
JOIN countries ON countries.id = countries_preserves.country_id 
JOIN preserves ON countries_preserves.preserve_id = preserves.id WHERE salary>5000 AND age<50 ORDER BY country_code ASC;