CREATE TABLE users
(id INT AUTO_INCREMENT PRIMARY KEY,
username VARCHAR(30) NOT NULL,
password VARCHAR(26) NOT NULL,
profile_picture MEDIUMBLOB,
last_login_time DATETIME,
is_deleted BOOL
);
INSERT INTO users VALUES
(NULL, "Ivan1001","qwerty1234",NULL,"2013-01-10",TRUE),
(NULL, "Mimito0387","asd123asd",NULL,"2012-01-10",FALSE),
(NULL, "Petar1001","slabiManekenki",NULL,"2011-01-10",TRUE),
(NULL, "Oktai1001","debeliBabi",NULL,"2023-01-10",FALSE),
(NULL, "Emine1001","jaba321",NULL,"2022-01-10",TRUE);