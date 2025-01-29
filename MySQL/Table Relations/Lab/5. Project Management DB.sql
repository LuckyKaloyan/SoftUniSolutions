CREATE DATABASE project_management_db;
USE project_management_db;

CREATE TABLE clients(
id INT UNIQUE AUTO_INCREMENT NOT NULL PRIMARY KEY,
client_name VARCHAR(200)
);


CREATE TABLE employees(
id INT UNIQUE AUTO_INCREMENT NOT NULL PRIMARY KEY,
first_name VARCHAR(30) NOT NULL,
last_name VARCHAR(30) NOT NULL,
project_id INT NOT NULL
);

CREATE TABLE projects(
id INT UNIQUE AUTO_INCREMENT NOT NULL PRIMARY KEY,
client_id INT NOT NULL,
project_lead_id INT NOT NULL
);

ALTER TABLE employees
ADD CONSTRAINT fk_project_id FOREIGN KEY (project_id) REFERENCES projects(id);
ALTER TABLE projects
ADD CONSTRAINT fk_project_lead_id FOREIGN KEY (project_lead_id) REFERENCES employees(id),
ADD CONSTRAINT fk_client_id FOREIGN KEY (client_id) REFERENCES clients(id);