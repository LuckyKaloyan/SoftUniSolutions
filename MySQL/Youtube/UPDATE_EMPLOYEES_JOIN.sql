UPDATE employees e1
JOIN employees e2 ON e1.reports_to_id = e2.employee_id
SET e1.reports_to_name = CONCAT(e2.first_name, ' ', e2.last_name);