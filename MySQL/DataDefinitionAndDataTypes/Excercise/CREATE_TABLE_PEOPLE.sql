CREATE TABLE people(
id INT AUTO_INCREMENT UNIQUE,
name VARCHAR(200) NOT NULL,
picture MEDIUMBLOB,
height DECIMAL (5,2),
weight DECIMAL (5,2),
gender ENUM('g', 'f') NOT NULL,
birthdate  DATE NOT NULL,
biography TEXT
);

INSERT INTO people VALUES
(NULL,"Ivan",NULL,175,100,'g',"2000-10-10","Pustinqk"),
(NULL,"Petar",NULL,165,110,'g',"2001-11-11","Pustinqk GOLQM PUSTINQK"),
(NULL,"Gosho",NULL,185,120,'g',"1997-04-10","Pustinqk ama golqm"),
(NULL,"Damqnka",NULL,155,55,'f',"2000-10-10","Pustinqchka"),
(NULL,"Petranka",NULL,185,77,'f',"2001-01-13","Pustinqchka ama golqma");