SELECT mountains_countries.country_code, mountains.mountain_range, peaks.peak_name, peaks.elevation FROM mountains_countries 
JOIN mountains ON mountains_countries.mountain_id = mountains.id 
JOIN peaks ON peaks.mountain_id = mountains_countries.mountain_id
WHERE country_code = 'BG' AND elevation>2835 ORDER BY elevation DESC; 