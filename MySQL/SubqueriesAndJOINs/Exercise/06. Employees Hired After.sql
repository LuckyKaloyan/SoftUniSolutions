SELECT first_name, last_name, hire_date,name FROM employees 
JOIN departments ON employees.department_id = departments.department_id 
WHERE name IN  ('Finance','Sales') 
ORDER BY hire_date ASC;