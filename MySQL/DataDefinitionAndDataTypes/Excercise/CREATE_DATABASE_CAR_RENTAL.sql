CREATE DATABASE car_rental;
USE car_rental;

CREATE TABLE categories(
id INT NOT NULL UNIQUE PRIMARY KEY,
category VARCHAR(100) NOT NULL,
daily_rate DECIMAL(10,2) NOT NULL,
weekly_rate DECIMAL(10,2) NOT NULL,
monthly_rate DECIMAL(10,2) NOT NULL,
weekend_rate DECIMAL(10,2) NOT NULL
);

CREATE TABLE cars(
id INT NOT NULL UNIQUE PRIMARY KEY,
plate_number VARCHAR(20) NOT NULL UNIQUE,
make VARCHAR(100) NOT NULL,
model VARCHAR(100) NOT NULL,
car_year DATE NOT NULL,
category_id INT NOT NULL,
doors VARCHAR(100) NOT NULL,
picture TEXT,
car_condition VARCHAR(100) NOT NULL,
available BOOLEAN 
);

CREATE TABLE employees(
id INT NOT NULL UNIQUE PRIMARY KEY,
first_name VARCHAR(100) NOT NULL,
last_name VARCHAR(100) NOT NULL,
title VARCHAR(100) NOT NULL,
notes TEXT
);

CREATE TABLE customers(
id INT NOT NULL UNIQUE PRIMARY KEY,
driver_licence_number INT UNIQUE,
full_name VARCHAR(300) NOT NULL,
address VARCHAR(300) NOT NULL,
city VARCHAR(100) NOT NULL,
zip_code INT NOT NULL,
notes TEXT
);

CREATE TABLE rental_orders(
id INT NOT NULL UNIQUE PRIMARY KEY,
employee_id INT NOT NULL,
customer_id INT NOT NULL,
car_id INT NOT NULL,
car_condition VARCHAR(100) NOT NULL,
tank_level DECIMAL(5,2),
kilometrage_start DECIMAL(11,2) NOT NULL,
kilometrage_end DECIMAL(11,2) NOT NULL,
total_kilometrage DECIMAL(8,2) NOT NULL,
start_date DATE NOT NULL,
end_date DATE NOT NULL,
total_days INT NOT NULL,
rate_applied DECIMAL (5,2),
tax_rate DECIMAL (8,2),
order_status BOOLEAN,
notes TEXT);

INSERT INTO categories (id, category, daily_rate, weekly_rate, monthly_rate, weekend_rate) VALUES
(1, 'Economy', 29.99, 179.99, 699.99, 49.99),
(2, 'SUV', 49.99, 299.99, 1199.99, 79.99),
(3, 'Luxury', 89.99, 539.99, 1999.99, 129.99);

INSERT INTO cars (id, plate_number, make, model, car_year, category_id, doors, picture, car_condition, available) VALUES
(1, 'ABC1234', 'Toyota', 'Corolla', '2022-01-01', 1, '4-door', 'path/to/picture1.jpg', 'New', TRUE),
(2, 'XYZ5678', 'Ford', 'Escape', '2021-06-15', 2, '4-door', 'path/to/picture2.jpg', 'Good', TRUE),
(3, 'LMN9012', 'BMW', 'X5', '2020-11-23', 3, '4-door', 'path/to/picture3.jpg', 'Excellent', FALSE);

INSERT INTO employees (id, first_name, last_name, title, notes) VALUES
(1, 'John', 'Doe', 'Manager', 'Handles all rental operations.'),
(2, 'Jane', 'Smith', 'Sales Representative', 'Focuses on customer service and sales.'),
(3, 'Mike', 'Johnson', 'Mechanic', 'Responsible for car maintenance and repairs.');

INSERT INTO customers (id, driver_licence_number, full_name, address, city, zip_code, notes) VALUES
(1, 123456789, 'Alice Johnson', '123 Elm St', 'Springfield', 62701, 'Frequent renter.'),
(2, 987654321, 'Bob Smith', '456 Oak Ave', 'Shelbyville', 62565, 'Occasional renter.'),
(3, 555666777, 'Carol Davis', '789 Pine Rd', 'Capital City', 62704, 'New customer.');

INSERT INTO rental_orders (id, employee_id, customer_id, car_id, car_condition, tank_level, kilometrage_start, kilometrage_end, total_kilometrage, start_date, end_date, total_days, rate_applied, tax_rate, order_status, notes) VALUES
(1, 1, 1, 1, 'New', 100.00, 12000.00, 12150.00, 150.00, '2024-09-01', '2024-09-07', 6, 29.99, 0.07, TRUE, 'No issues reported.'),
(2, 2, 2, 2, 'Good', 80.00, 25000.00, 25250.00, 250.00, '2024-09-05', '2024-09-12', 7, 49.99, 0.07, TRUE, 'Minor scratches on bumper.'),
(3, 3, 3, 3, 'Excellent', 90.00, 50000.00, 50500.00, 500.00, '2024-09-10', '2024-09-15', 5, 89.99, 0.07, FALSE, 'Returned late.');

