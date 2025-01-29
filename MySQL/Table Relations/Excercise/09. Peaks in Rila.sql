USE geography;
SELECT mountains.mountain_range AS 'mountain_range',peaks.peak_name AS 'peak_name',peaks.elevation AS 'peak_elevation' 
FROM mountains JOIN peaks ON peaks.mountain_id = mountains.id WHERE mountains.mountain_range = 'Rila' ORDER BY peaks.elevation DESC;