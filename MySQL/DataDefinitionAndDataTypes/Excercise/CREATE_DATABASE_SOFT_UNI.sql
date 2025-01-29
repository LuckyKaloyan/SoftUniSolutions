CREATE DATABASE soft_uni;
USE soft_uni;

CREATE TABLE towns(
id INT UNIQUE PRIMARY KEY NOT NULL,
name VARCHAR(50) NOT NULL);

CREATE TABLE addresses(
id INT UNIQUE PRIMARY KEY NOT NULL,
address_text VARCHAR(150) NOT NULL,
town_id INT
);

ALTER TABLE addresses
ADD CONSTRAINT fk_adresses
FOREIGN KEY (town_id) REFERENCES
towns(id);


CREATE TABLE departments(
id INT UNIQUE PRIMARY KEY NOT NULL,
name VARCHAR(50) NOT NULL
);

CREATE TABLE employees(
id INT UNIQUE PRIMARY KEY NOT NULL,
firt_name VARCHAR(50) NOT NULL,
middle_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
job_title VARCHAR(50) NOT NULL,
department_id INT NOT NULL,
hire_date DATE,
salary DECIMAL(7,2),
address_id INT NOT NULL
);

ALTER TABLE employees
ADD CONSTRAINT fk_department
FOREIGN KEY (department_id) REFERENCES
departments(id);

ALTER TABLE employees
ADD CONSTRAINT fk_address
FOREIGN KEY (address_id) REFERENCES
addresses(id);
