CREATE TABLE passports(
passport_id INT UNIQUE PRIMARY KEY AUTO_INCREMENT NOT NULL,
passport_number VARCHAR(8) UNIQUE NOT NULL
);
ALTER TABLE passports AUTO_INCREMENT = 101;

CREATE TABLE  people(
person_id INT AUTO_INCREMENT UNIQUE PRIMARY KEY NOT NULL,
first_name VARCHAR(40) NOT NULL,
salary DECIMAL(10,2) NOT NULL,
passport_id INT UNIQUE NOT NULL,
CONSTRAINT fk_passport_id FOREIGN KEY (passport_id) REFERENCES passports(passport_id)
);

INSERT INTO passports(passport_number) VALUES
('N34FG21B'),
('K65LO4R7'),
('ZE657QP2');

INSERT INTO people(first_name,salary,passport_id) VALUES
('Roberto',43300.00,102),
('Tom',56100.00,103),
('Yana',60200.00,101);