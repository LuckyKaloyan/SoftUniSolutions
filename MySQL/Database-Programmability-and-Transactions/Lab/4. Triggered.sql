DROP TABLE deleted_employees;

CREATE TABLE deleted_employees(
employee_id INT UNIQUE PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50),
last_name VARCHAR(50),
middle_name VARCHAR(50),
job_title VARCHAR(50) NOT NULL,
department_id INT NOT NULL,
salary DECIMAL (19,4) 
);
ALTER TABLE deleted_employees AUTO_INCREMENT = 1;

DROP TRIGGER deleted_employees;
DELIMITER $$
CREATE TRIGGER deleted_employees
BEFORE DELETE ON employees
FOR EACH ROW
BEGIN
INSERT INTO deleted_employees(first_name,last_name,middle_name,job_title,department_id,salary) 
VALUES( OLD.first_name, OLD.last_name, OLD.middle_name, OLD.job_title, OLD.department_id, OLD.salary);
END$$
DELIMITER ;