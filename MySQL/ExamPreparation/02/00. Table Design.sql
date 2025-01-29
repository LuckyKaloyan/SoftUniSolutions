CREATE DATABASE space_travel;
USE space_travel;

CREATE TABLE planets ( 
id INT(11) AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(30) NOT NULL);

CREATE TABLE spaceports (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50) NOT NULL,
planet_id INT,
FOREIGN KEY (planet_id) REFERENCES planets(id));

CREATE TABLE spaceships (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50) NOT NULL,
manufacturer VARCHAR(30) NOT NULL,
light_speed_rate INT DEFAULT 0
);

CREATE TABLE colonists(
id INT AUTO_INCREMENT PRIMARY KEY,
birth_date DATE NOT NULL,
first_name VARCHAR(20) NOT NULL,
last_name VARCHAR(20) NOT NULL,
ucn CHAR(10) NOT NULL UNIQUE
);

CREATE TABLE journeys (
id INT AUTO_INCREMENT PRIMARY KEY,
journey_start DATETIME NOT NULL,
journey_end DATETIME NOT NULL,
purpose ENUM('Medical', 'Technical', 'Educational', 'Military') NOT NULL,
destination_spaceport_id INT,
FOREIGN KEY (destination_spaceport_id) REFERENCES spaceports(id),
spaceship_id INT,
FOREIGN KEY (spaceship_id) REFERENCES spaceships(id));

CREATE TABLE travel_cards(
id INT AUTO_INCREMENT PRIMARY KEY,
card_number CHAR(10) NOT NULL UNIQUE,
job_during_journey ENUM('Pilot','Engineer','Trooper','Cleaner','Cook') NOT NULL,
colonist_id INT,
FOREIGN KEY (colonist_id) REFERENCES colonists(id),
journey_id INT,
FOREIGN KEY (journey_id) REFERENCES journeys(id)
);