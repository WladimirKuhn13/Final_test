CREATE TABLE `animal`
(
`id_type_animal` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`type_animal` VARCHAR(50) NOT NULL
);

CREATE TABLE `pets`
(
`id_pets` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`pets_type` VARCHAR(50) NOT NULL,
`id_type_animal` INT,
FOREIGN KEY (id_type_animal) REFERENCES animal(id_type_animal)
);

CREATE TABLE `pack_animals` 
(
`id_pack_animal` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`pack_animals_type` VARCHAR(50) NOT NULL,
`id_type_animal` INT,
FOREIGN KEY (id_type_animal) REFERENCES animal(id_type_animal)
);

CREATE TABLE `cats`
(
`id_cat` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`cat_name` VARCHAR(50) NOT NULL,
`brith_date` DATE NOT NULL,
`location` VARCHAR(100) NOT NULL,
`commands` VARCHAR(300),
`color` VARCHAR(50) NOT NULL,
`weight` INT NOT NULL,
`owner_name` VARCHAR(50) NOT NULL,
`id_pets` INT NOT NULL,
FOREIGN KEY (id_pets) REFERENCES pets(id_pets)
);

CREATE TABLE `dogs`
(
`id_dog` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`dog_name` VARCHAR(50) NOT NULL,
`brith_date` DATE NOT NULL,
`location` VARCHAR(100) NOT NULL,
`commands` VARCHAR(300),
`color` VARCHAR(50) NOT NULL,
`weight` INT NOT NULL,
`owner_name` VARCHAR(50) NOT NULL,
`id_pets` INT NOT NULL,
FOREIGN KEY (id_pets) REFERENCES pets(id_pets)
);

CREATE TABLE `hamsters`
(
`id_hamster` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`hamster_name` VARCHAR(50) NOT NULL,
`brith_date` DATE NOT NULL,
`location` VARCHAR(100) NOT NULL,
`commands` VARCHAR(300),
`color` VARCHAR(50) NOT NULL,
`weight` INT NOT NULL,
`owner_name` VARCHAR(50) NOT NULL,
`id_pets` INT NOT NULL,
FOREIGN KEY (id_pets) REFERENCES pets(id_pets)
);

CREATE TABLE `horses` 
(
`id_horse` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`horse_name` VARCHAR(50) NOT NULL,
`brith_date` DATE NOT NULL,
`location` VARCHAR(100) NOT NULL,
`commands` VARCHAR(300),
`color` VARCHAR(50) NOT NULL,
`weight` INT NOT NULL,
`owner_organization_name` VARCHAR(100) NOT NULL,
`id_pack_animal` INT NOT NULL,
`lifting_capacity` INT NOT NULL,
FOREIGN KEY (id_pack_animal) REFERENCES pack_animals(id_pack_animal)
);

CREATE TABLE `camels` 
(
`id_camel` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`camel_name` VARCHAR(50) NOT NULL,
`brith_date` DATE NOT NULL,
`location` VARCHAR(100) NOT NULL,
`commands` VARCHAR(300),
`color` VARCHAR(50) NOT NULL,
`weight` INT NOT NULL,
`owner_organization_name` VARCHAR(100) NOT NULL,
`id_pack_animal` INT NOT NULL,
`lifting_capacity` INT NOT NULL,
FOREIGN KEY (id_pack_animal) REFERENCES pack_animals(id_pack_animal)
);

CREATE TABLE `donkeys` 
(
`id_donkey` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`donkey_name` VARCHAR(50) NOT NULL,
`brith_date` DATE NOT NULL,
`location` VARCHAR(100) NOT NULL,
`commands` VARCHAR(300),
`color` VARCHAR(50) NOT NULL,
`weight` INT NOT NULL,
`owner_organization_name` VARCHAR(100) NOT NULL,
`id_pack_animal` INT NOT NULL,
`lifting_capacity` INT NOT NULL,
FOREIGN KEY (id_pack_animal) REFERENCES pack_animals(id_pack_animal)
);

INSERT INTO animal (type_animal)
VALUES 
("pets"),
("pack_animals");

INSERT INTO pets (pets_type, id_type_animal)
VALUES
("cats", 1),
("dogs", 1),
("hamsters", 1);

INSERT INTO pack_animals (pack_animal_type, id_type_animal)
VALUES
("horses", 2),
("camels", 2),
("donkeys", 2);

INSERT INTO cats (cat_name, birth_date, location, commands, color, weight, owner_name, id_pets)
VALUES
("murzik", "2020-03-15", "winter street, home 4, float 11", "voice, sit", "orange", 3, "alex", 1),
("barsik", "2024-06-01", "spring street, home 31, float 6", "down, sit", "black", 4, "petr", 1),
("tom", "2021-04-22", "green street, home 6k2 float 227", "voice, sit, down", "white", 4, "ivan", 1);

INSERT INTO dogs (dog_name, birth_date, location, commands, color, weight, owner_name, id_pets)
VALUES
("tuzik", "2017-09-16", "paskal street, home 9, float 44", "sit, down, voice, give paw, roll", "grey", 8, "andrew", 2),
("bobik", "2020-11-23", "edison street, home 20, float 13", "sit, give paw, roll", "black", 12, "mike", 2),
("rex", "2021-01-08", "peace street, home 2 float 9", "voice, give paw, roll", "white", 19, "conor", 2);

INSERT INTO hamsters (hamster_name, birth_date, location, commands, color, weight, owner_name, id_pets)
VALUES
("homa", "2023-11-22", "new street, home 7, float 65", "roll, run", "grey", 1, "sasha", 3),
("kiki", "2024-01-13", "old street, home 89, float 22", "voice, roll", "black", 1, "misha", 3),
("ram", "2024-04-01", "park street, home 11 float 1", "voice, roll, run", "white", 1, "anna", 3);

INSERT INTO horses (horse_name, birth_date, location, commands, color, weight, owner_organization_name, id_pack_animal, lifting_capacity)
VALUES 
("angel", "2019-09-09", "indastrial street, home 3 frame 4", "stop, forward, lynx", "bay", 420, "ooo tomshorses", 1, 80),
("hamlet", "2021-03-11", "worker street, home 5", "hop, stop, forward", "black", 400, "ooo raichelshorses", 1, 90),
("vikont", "2020-06-20", "river street, home 11 frame 9", "hop, stop, forward, lynx", "white", 410, "ooo rickshorses", 1, 85);

INSERT INTO camels (camel_name, birth_date, location, commands, color, weight, owner_organization_name, id_pack_animal, lifting_capacity)
VALUES 
("daqar", "2010-09-11", "zoological street, home 77 frame 1", "stop, forward", "brown", 560, "ooo moscow zoo", 2, 150),
("zeus", "2007-05-13", "red street, home 34", "stop, forward", "brown", 480, "ooo tver zoo", 2, 200),
("darko", "2013-08-20", "weapon street, home 6 frame 6", "stop, forward", "brown", 520, "ooo tula zoo", 2, 220);

INSERT INTO donkeys (donkey_name, birth_date, location, commands, color, weight, owner_organization_name, id_pack_animal, lifting_capacity)
VALUES 
("buran", "2007-02-20", "lenins street, home 99 frame 2", "reversal, stop, forward", "gray", 230, "ooo donkey shelter", 3, 65),
("brus", "2015-08-13", "black street, home 11", "stop, reversal", "brown", 300, "ooo johnsfarm", 3, 70),
("aston", "2011-04-27", "union street, home 8 frame 6", "forward, reversal", "black", 280, "ooo andrewsfarm", 3, 60);

DROP TABLE camels;

DELETE FROM pack_animals WHERE pack_animals_type ='camels';

ALTER TABLE horses CHANGE horse_name pack_animal_name VARCHAR(50);
ALTER TABLE donkeys CHANGE donkey_name pack_animal_name VARCHAR(50);

CREATE TABLE horses_and_donkeys
(SELECT * FROM horses
UNION SELECT * FROM donkeys
);

CREATE TABLE young_animals
(
`id_animal` INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
`name_animal` VARCHAR(50) NOT NULL,
`birth_date` DATE NOT NULL,
`age_animal` VARCHAR(50) NOT NULL
);

INSERT INTO young_animals (name_animal, birth_date, age_animal)
SELECT cat_name, birth_date,
CONCAT(TIMESTAMPDIFF(YEAR, birth_date, NOW()), " лет ", TIMESTAMPDIFF(MONTH, birth_date, NOW()) % 12, " мес") AS age_animal
FROM cats
WHERE TIMESTAMPDIFF(MONTH< birth_date, NOW()) BETWEEN 12 AND 36;

INSERT INTO young_animals (name_animal, birth_date, age_animal)
SELECT dog_name, birth_date,
CONCAT(TIMESTAMPDIFF(YEAR, birth_date, NOW()), " лет ", TIMESTAMPDIFF(MONTH, birth_date, NOW()) % 12, " мес") AS age_animal
FROM dogs
WHERE TIMESTAMPDIFF(MONTH< birth_date, NOW()) BETWEEN 12 AND 36;

INSERT INTO young_animals (name_animal, birth_date, age_animal)
SELECT hamster_name, birth_date,
CONCAT(TIMESTAMPDIFF(YEAR, birth_date, NOW()), " лет ", TIMESTAMPDIFF(MONTH, birth_date, NOW()) % 12, " мес") AS age_animal
FROM hamsters
WHERE TIMESTAMPDIFF(MONTH< birth_date, NOW()) BETWEEN 12 AND 36;

INSERT INTO young_animals (name_animal, birth_date, age_animal)
SELECT pack_animal_name, birth_date,
CONCAT(TIMESTAMPDIFF(YEAR, birth_date, NOW()), " лет ", TIMESTAMPDIFF(MONTH, birth_date, NOW()) % 12, " мес") AS age_animal
FROM horses
WHERE TIMESTAMPDIFF(MONTH< birth_date, NOW()) BETWEEN 12 AND 36;

INSERT INTO young_animals (name_animal, birth_date, age_animal)
SELECT pack_animal_name, birth_date,
CONCAT(TIMESTAMPDIFF(YEAR, birth_date, NOW()), " лет ", TIMESTAMPDIFF(MONTH, birth_date, NOW()) % 12, " мес") AS age_animal
FROM donkeys
WHERE TIMESTAMPDIFF(MONTH< birth_date, NOW()) BETWEEN 12 AND 36;

CREATE TABLE alltables
(
SELECT "cats" AS table_name, id_cat, NULL AS id_dog, NULL AS id_hamster, NULL AS id_horse, NULL AS id_donkey,
cat_name, NULL AS dog_name, NULL AS hamster_name, NULL AS pack_animal_name, birth_date, location, commands, color, weight, owner_name, NULL AS owner_organization_name,
NULL AS lifting_capacity, id_pets, NULL AS id_pack_animal FROM cats
UNION ALL
SELECT "dogs" AS table_name, NULL AS id_cat, id_dog, NULL AS id_hamster, NULL AS id_horse, NULL AS id_donkey,
NULL AS cat_name, dog_name, NULL AS hamster_name, NULL AS pack_animal_name, birth_date, location, commands, color, weight, owner_name, NULL AS owner_organization_name,
NULL AS lifting_capacity, id_pets, NULL AS id_pack_animal FROM dogs
UNION ALL
SELECT "hamsters" AS table_name, NULL AS id_cat, NULL AS id_dog, id_hamster, NULL AS id_horse, NULL AS id_donkey,
NULL AS cat_name, NULL AS dog_name, hamster_name, NULL AS pack_animal_name, birth_date, location, commands, color, weight, owner_name, NULL AS owner_organization_name,
NULL AS lifting_capacity, id_pets, NULL AS id_pack_animal FROM hamsters
UNION ALL
SELECT "horses" AS table_name, NULL AS id_cat, NULL AS id_dog, NULL AS id_hamster, id_horse, NULL AS id_donkey,
NULL AS cat_name, NULL AS dog_name, NULL AS hamster_name,  pack_animal_name, birth_date, location, commands, color, weight, NULL AS owner_name, owner_organization_name,
lifting_capacity, NULL AS id_pets, NULL AS id_pack_animal FROM horses
UNION ALL
SELECT "horses" AS table_name, NULL AS id_cat, NULL AS id_dog, NULL AS id_hamster, NULL AS id_horse, id_donkey,
NULL AS cat_name, NULL AS dog_name, NULL AS hamster_name,  pack_animal_name, birth_date, location, commands, color, weight, NULL AS owner_name, owner_organization_name,
lifting_capacity, NULL AS id_pets, NULL AS id_pack_animal FROM donkeys
);











