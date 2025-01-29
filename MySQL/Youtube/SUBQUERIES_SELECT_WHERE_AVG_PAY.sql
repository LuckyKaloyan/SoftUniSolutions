SELECT first_name, last_name, hourly_pay, (SELECT AVG(hourly_pay) FROM employees) AS AVG_PAY
 FROM employees
WHERE hourly_pay > (SELECT AVG(hourly_pay) FROM employees);