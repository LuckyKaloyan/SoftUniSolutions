CREATE TABLE teachers (
teacher_id INT AUTO_INCREMENT UNIQUE PRIMARY KEY NOT NULL,
name VARCHAR(100) NOT NULL,
manager_id INT,
CONSTRAINT fk_manager_id FOREIGN KEY (manager_id) REFERENCES teachers(teacher_id)
);

ALTER TABLE teachers
AUTO_INCREMENT = 101;

INSERT INTO teachers(name) 
VALUES
('John'),
('Maya'),
('Silvia'),
('Ted'),
('Mark'),
('Greta');

UPDATE teachers SET manager_id = 106 WHERE teacher_id IN(102,103);
UPDATE teachers SET manager_id = 101 WHERE teacher_id IN(105,106);
UPDATE teachers SET manager_id = 105 WHERE teacher_id = 104;