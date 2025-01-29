ALTER TABLE employees
ADD COLUMN salary DECIMAL(10,2) AFTER hourly_pay;
SELECT * FROM employees;