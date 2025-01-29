SELECT instructors.first_name,instructors.last_name,COUNT(students.id)AS 'students_count',cities.name  FROM students 
JOIN instructors_students ON students.id=instructors_students.student_id
JOIN instructors ON instructors.id = instructors_students.instructor_id
JOIN instructors_driving_schools ON instructors_driving_schools.instructor_id = instructors.id
JOIN driving_schools ON driving_schools.id = instructors_driving_schools.driving_school_id
JOIN cities ON driving_schools.city_id = cities.id
GROUP BY instructors.id, instructors.first_name, instructors.last_name,cities.name
HAVING COUNT(students.id)>1 ORDER BY instructors.first_name;