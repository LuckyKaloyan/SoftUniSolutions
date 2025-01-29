UPDATE employees SET salary = salary+5000   WHERE salary > 30000 AND department_id = 1;
DELETE FROM employees WHERE manager_id = 42 AND salary > 30000 ;
SELECT department_id,AVG(salary)  AS 'avg_salary'  FROM employees WHERE salary > 30000  GROUP BY department_id ORDER BY department_id ASC;