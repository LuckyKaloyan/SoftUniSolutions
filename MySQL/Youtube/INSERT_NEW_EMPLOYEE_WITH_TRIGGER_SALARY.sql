CREATE TRIGGER before_hourly_pay_insert
BEFORE INSERT ON employees
FOR EACH ROW
SET NEW.salary = NEW.hourly_pay*2080;

INSERT INTO employees (first_name, last_name, hourly_pay)
VALUES ('Petran', 'Petranov', 13);

SELECT * FROM employees;