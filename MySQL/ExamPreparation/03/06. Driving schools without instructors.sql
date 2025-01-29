SELECT driving_schools.id,name,brand FROM driving_schools JOIN cars ON car_id = cars.id WHERE NOT driving_schools.id IN
(SELECT driving_school_id FROM instructors_driving_schools) ORDER BY  brand, driving_schools.id LIMIT 5;
