CREATE TABLE directors(
id INT PRIMARY KEY AUTO_INCREMENT,
director_name VARCHAR(30) NOT NULL,
notes TEXT
);

CREATE TABLE genres(
id INT PRIMARY KEY AUTO_INCREMENT,
genre_name VARCHAR(30) NOT NULL,
notes TEXT
);

CREATE TABLE categories(
id INT PRIMARY KEY AUTO_INCREMENT,
category_name VARCHAR(30)NOT NULL,
notes TEXT
);

CREATE TABLE movies(
id INT PRIMARY KEY AUTO_INCREMENT,
title VARCHAR(150) NOT NULL,
director_id INT NOT NULL,
copyright_year INT,
length DECIMAL (5,2) NOT NULL,
genre_id INT ,
category_id INT,
rating DECIMAL (4,2),
notes TEXT
);

INSERT INTO directors VALUES 
(NULL,"IvanDirektora","GolqmPichBace"),
(NULL,"DraganDirektora","GolqmoAko"),
(NULL,"PetkanDirektora","GolqmPiqchBace"),
(NULL,"OrhanDirektora","PeeMnogo"),
(NULL,"LiliIvanovaDirektora","Vetroveeeeee");

INSERT INTO genres VALUES 
(NULL,"BoiIdrane","Djekichan i Brus li primerno se biqt sys zloba"),
(NULL,"TurskiSerial","Djekichan i Brus li primerno se biqt, obache plachat"),
(NULL,"StrashnoNeshto","Djekichan i Brus li primerno se biqt, obache gi e strah"),
(NULL,"Trilar","Djekichan i Brus li primerno se biqt, obache vikat i se gonqt"),
(NULL,"SmeshnoNeshto","Djekichan i Brus li primerno se biqt, smeqt se i se psuvat");

INSERT INTO categories VALUES 
(NULL,"BoiIdraneKategoriq","Djekichan i Brus li primerno se biqt, kategoriq boi"),
(NULL,"TurskiSerialKategoriq","Djekichan i Brus li primerno se biqt, obache plachat, kategoriq turski serial"),
(NULL,"StrashnoNeshtoKategoriq","Djekichan i Brus li primerno se biqt, obache gi e strahat, kegoriq strashno neshto"),
(NULL,"TrilarKategoriq","Djekichan i Brus li primerno se biqt, obache vikat i se gonqt, kategoriq trilar"),
(NULL,"SmeshnoNeshtoKategoriq","Djekichan i Brus li primerno se biqt, smeqt se i se psuvat, kategoriq smeshno neshto");

INSERT INTO movies VALUES
(NULL,"Ubivai trudno",1,2005,2.2,1,1,8.3,"Djeki Chan i Brus li se biqt na centralna gara, zaradi posledniq film na LiliIvanova dvete linii."),
(NULL,"Cveteto Na Ferhonde",5,2006,2.2,2,2,1.8,"Sled boq  v pyrviq film Djeki Chan i Brus li sa se sdobrili i pravqt rozova torta za Ferhonde, no smetanata pada na zemqta i te plachat."),
(NULL,"Strahat na Shopenhouer", 3, 2007,2.2,3,3,9.9,"Sled kato osyznavat, che nqmat smetana, izpadat v panika, no zapochvat da tyrsqt reshenie na problema, stigat do tainata kniga na edin bobar, zavivasht shokolad v staniol."),
(NULL,"Bulevarda kym gorniq kvartal", 4, 2009,2.2, 4,4, 5.5,"Sled kato uspqvat da zaviqt shokolada v staniol, trygvat kym mahalata, kydeto Ferhondeto pere kilimite, no po pytq zapochvat da se celqt s bonboni v staiol, bqgat i psuvat."),
(NULL,"GenderRevalaishan",5, 2024,2.2,5,5,10.0,"Frehonde se okazva Ferhondak, koito dokato tyrka kilimite si protyrkva orehite, Djeki Chan i Brus li reshavat da go prebiqt, sled tova navryshtane reshavat, che tova e mnogo smeshno i razkazvat na drugite ninji a te se smeqt smeshno haahaha-hah-a-haha-ha.");
