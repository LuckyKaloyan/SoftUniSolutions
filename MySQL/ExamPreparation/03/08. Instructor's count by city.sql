SELECT cities.name, COUNT(instructors_driving_schools.instructor_id) FROM cities 
JOIN driving_schools ON cities.id = driving_schools.city_id
JOIN instructors_driving_schools ON instructors_driving_schools.driving_school_id = driving_schools.id
GROUP BY cities.name HAVING COUNT(instructors_driving_schools.instructor_id)>0
ORDER BY COUNT(instructors_driving_schools.instructor_id) DESC;