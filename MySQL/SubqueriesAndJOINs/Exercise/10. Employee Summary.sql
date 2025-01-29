SELECT e.employee_id, CONCAT(e.first_name, ' ', e.last_name) AS 'employee_name', CONCAT(e2.first_name, ' ', e2.last_name) AS 'manager_name', departments.name 
FROM employees e 
JOIN employees e2 ON e.manager_id = e2.employee_id
JOIN departments ON e.department_id = departments.department_id
ORDER BY e.employee_id LIMIT 5;