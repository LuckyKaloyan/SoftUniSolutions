SELECT DISTINCT employees.employee_id, first_name FROM employees 
JOIN employees_projects WHERE NOT employees_projects.employee_id = employees.employee_id 
ORDER BY employee_id DESC LIMIT 3;