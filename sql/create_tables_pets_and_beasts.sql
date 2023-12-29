CREATE TABLE Dog (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name CHAR(30),
    commands TEXT,
    birthDate DATE
);


CREATE TABLE IF NOT EXISTS Cat LIKE Dog;
CREATE TABLE IF NOT EXISTS Hamster LIKE Dog;
CREATE TABLE IF NOT EXISTS Horse LIKE Dog;
CREATE TABLE IF NOT EXISTS Camel LIKE Dog;
CREATE TABLE IF NOT EXISTS Donkey LIKE Dog;