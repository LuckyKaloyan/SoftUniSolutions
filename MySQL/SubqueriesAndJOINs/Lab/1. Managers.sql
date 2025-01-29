SELECT employees.employee_id,CONCAT(employees.first_name,' ',employees.last_name) AS 'full_name',departments.department_id,departments.name  AS 'department_name'
FROM departments 
JOIN employees ON employees.employee_id = departments.manager_id ORDER BY employees.employee_id ASC LIMIT 5;