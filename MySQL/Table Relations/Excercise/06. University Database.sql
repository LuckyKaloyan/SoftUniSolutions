CREATE DATABASE university;
USE university;

CREATE TABLE majors(
major_id INT(11) UNIQUE AUTO_INCREMENT PRIMARY KEY NOT NULL,
name VARCHAR(50)
);

CREATE TABLE students(
student_id INT(11) UNIQUE AUTO_INCREMENT PRIMARY KEY NOT NULL,
student_number VARCHAR(12) UNIQUE,
student_name VARCHAR(50),
major_id INT(11),
CONSTRAINT fk_major_id FOREIGN KEY (major_id) REFERENCES majors(major_id)
);

CREATE TABLE payments(
payment_id INT(11) UNIQUE AUTO_INCREMENT PRIMARY KEY NOT NULL,
payment_date DATE,
payment_amount DECIMAL(8,2) NOT NULL,
student_id INT(11) NOT NULL,
CONSTRAINT fk_student_id FOREIGN KEY (student_id) REFERENCES students(student_id)
);

CREATE TABLE subjects(
subject_id INT(11) AUTO_INCREMENT UNIQUE PRIMARY KEY NOT NULL,
subject_name VARCHAR(50)
);

CREATE TABLE agenda(
student_id INT(11) NOT NULL,
subject_id INT(11) NOT NULL,
PRIMARY KEY(student_id,subject_id),
CONSTRAINT fk_student_id_agenda FOREIGN KEY (student_id) REFERENCES students(student_id),
CONSTRAINT fk_subject_id FOREIGN KEY (subject_id) REFERENCES subjects(subject_id)
)