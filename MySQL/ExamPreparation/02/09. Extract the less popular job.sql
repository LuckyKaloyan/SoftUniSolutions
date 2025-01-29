SELECT job_during_journey AS 'job_name' FROM travel_cards 
JOIN journeys ON journeys.id = journey_id 
WHERE journeys.id = (
SELECT journeys.id FROM journeys GROUP BY journeys.id ORDER BY MAX(journey_end-journey_start) DESC LIMIT 1
)
GROUP BY job_during_journey 
ORDER BY COUNT(job_during_journey) ASC LIMIT 1 
;