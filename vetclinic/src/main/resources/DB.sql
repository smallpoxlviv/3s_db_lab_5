CREATE SCHEMA IF NOT EXISTS s3_db_lab_5 DEFAULT CHARACTER SET utf8 ;
USE s3_db_lab_5;


SET foreign_key_checks = 0;
DROP TABLE IF EXISTS client;
DROP TABLE IF EXISTS diagnosis;
DROP TABLE IF EXISTS doctor;
DROP TABLE IF EXISTS pet;
DROP TABLE IF EXISTS service;
DROP TABLE IF EXISTS schedule;
DROP TABLE IF EXISTS visit;
SET foreign_key_checks = 1;


CREATE TABLE IF NOT EXISTS client (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(45) NOT NULL,
  name VARCHAR(45) NOT NULL,
  last_name VARCHAR(45))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS diagnosis (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  diagnosis VARCHAR(300) NOT NULL,
  treatment MEDIUMTEXT)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS doctor (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(45) NOT NULL,
  name VARCHAR(45) NOT NULL,
  last_name VARCHAR(45),
  year_of_birth INT NOT NULL,
  speciality VARCHAR(45))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS pet (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  animal_species VARCHAR(45) NOT NULL,
  client_id BIGINT NOT NULL,
  name VARCHAR(45),
  weight_kg INT,
  length_cm INT,
  date_of_birth DATE)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS service (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(80) NOT NULL,
  description MEDIUMTEXT,
  price_usd DECIMAL(5,2) NOT NULL)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS schedule (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  doctor_id BIGINT NOT NULL,
  time_start TIME NOT NULL,
  time_end TIME NOT NULL,
  week_day VARCHAR(15) NOT NULL)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS visit (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  date_time DATETIME NOT NULL,
  pet_id BIGINT NOT NULL,
  service_id BIGINT NOT NULL,
  schedule_id BIGINT NOT NULL,
  diagnosis_id BIGINT NOT NULL UNIQUE)
ENGINE = InnoDB;

-- -------------------------------------------------

ALTER TABLE pet
ADD CONSTRAINT fk_pet_client1
FOREIGN KEY (client_id)
REFERENCES client (id);

ALTER TABLE schedule
ADD CONSTRAINT fk_schedule_doctor
FOREIGN KEY (doctor_id)
REFERENCES doctor (id);

ALTER TABLE visit
ADD CONSTRAINT fk_visit_pet1
FOREIGN KEY (pet_id)
REFERENCES pet (id),
ADD CONSTRAINT fk_visit_service1
FOREIGN KEY (service_id)
REFERENCES service (id),
ADD CONSTRAINT fk_visit_shedule1
FOREIGN KEY (schedule_id)
REFERENCES schedule (id),
ADD CONSTRAINT fk_visit_diagnosis1
FOREIGN KEY (diagnosis_id)
REFERENCES diagnosis (id);


INSERT INTO client (id, first_name, name, last_name) VALUES 
(1, 'Vytryk', 'Maxymilian', Null),
(2, 'Vytryk', 'Maxymilian', Null),
(3, 'Vytryk', 'Maxymilian', Null),
(4, 'Vytryk', 'Maxymilian', Null),
(5, 'Vytryk', 'Maxymilian', Null),
(6, 'Vytryk', 'Maxymilian', Null),
(7, 'Vytryk', 'Maxymilian', Null),
(8, 'Vytryk', 'Maxymilian', Null),
(9, 'Vytryk', 'Maxymilian', Null),
(10, 'Vytryk', 'Maxymilian', Null),
(11, 'Vytryk', 'Maxymilian', Null),
(12, 'Vytryk', 'Maxymilian', Null);

INSERT INTO diagnosis (id, diagnosis, treatment) VALUES 
(1, 'hronichne sisyanstvo', Null),
(2, 'hronichne sisyanstvo', Null),
(3, 'hronichne sisyanstvo', Null),
(4, 'hronichne sisyanstvo', Null),
(5, 'hronichne sisyanstvo', Null),
(6, 'hronichne sisyanstvo', Null),
(7, 'hronichne sisyanstvo', Null),
(8, 'hronichne sisyanstvo', Null),
(9, 'hronichne sisyanstvo', Null),
(10, 'hronichne sisyanstvo', Null),
(11, 'hronichne sisyanstvo', Null),
(12, 'hronichne sisyanstvo', Null),
(13, 'hronichne sisyanstvo', Null);

INSERT INTO doctor (id, first_name, name, last_name, year_of_birth, speciality) VALUES 
(1, 'Vytryk', 'Maxymilian', Null, 1980, 'speciality'),
(2, 'Vytryk', 'Maxymilian', Null, 1980, 'speciality'),
(3, 'Vytryk', 'Maxymilian', Null, 1980, 'speciality'),
(4, 'Vytryk', 'Maxymilian', Null, 1980, 'speciality'),
(5, 'Vytryk', 'Maxymilian', Null, 1980, 'speciality'),
(6, 'Vytryk', 'Maxymilian', Null, 1980, 'speciality'),
(7, 'Vytryk', 'Maxymilian', Null, 1980, 'speciality'),
(8, 'Vytryk', 'Maxymilian', Null, 1980, 'speciality'),
(9, 'Vytryk', 'Maxymilian', Null, 1980, 'speciality'),
(10, 'Vytryk', 'Maxymilian', Null, 1980, 'speciality'),
(11, 'Vytryk', 'Maxymilian', Null, 1980, 'speciality'),
(12, 'Vytryk', 'Maxymilian', Null, 1980, 'speciality');

INSERT INTO pet (id, animal_species, client_id) VALUES 
(1, "хом'як", 1),(2, "хом'як", 1),(3, "хом'як", 1),(4, "хом'як", 1),(5, "хом'як", 1),(6, "хом'як", 1),
(7, "хом'як", 1),(8, "хом'як", 1),(9, "хом'як", 1),(10, "хом'як", 1),(11, "хом'як", 1),(12, "хом'як", 1);

INSERT INTO service (id, name, price_usd) VALUES 
(1, 'Vytryk', 10.2),
(2, 'Vytryk', 10.2),
(3, 'Vytryk', 10.2),
(4, 'Vytryk', 10.2),
(5, 'Vytryk', 10.2),
(6, 'Vytryk', 10.2),
(7, 'Vytryk', 10.2),
(8, 'Vytryk', 10.2),
(9, 'Vytryk', 10.2),
(10, 'Vytryk', 10.2),
(11, 'Vytryk', 10.2),
(12, 'Vytryk', 10.2);

INSERT INTO schedule (id, doctor_id, time_start, time_end, week_day) VALUES 
(1, 2, '08:00:00', '16:00:00', 'Monday'),
(2, 2, '08:00:00', '16:00:00', 'Monday'),
(3, 1, '08:00:00', '16:00:00', 'Monday'),
(4, 4, '08:00:00', '16:00:00', 'Monday'),
(5, 1, '08:00:00', '16:00:00', 'Monday'),
(6, 1, '08:00:00', '16:00:00', 'Monday'),
(7, 5, '08:00:00', '16:00:00', 'Monday'),
(8, 1, '08:00:00', '16:00:00', 'Monday'),
(9, 1, '08:00:00', '16:00:00', 'Monday'),
(10, 1, '08:00:00', '16:00:00', 'Monday'),
(11, 5, '08:00:00', '16:00:00', 'Monday'),
(12, 1, '08:00:00', '16:00:00', 'Monday');

INSERT INTO visit (id, date_time, pet_id, service_id, schedule_id, diagnosis_id) VALUES 
(1, '2020-01-01 10:00:00', 2, 1, 1, 1),
(2, '2020-01-01 10:00:00', 2, 1, 1, 2),
(3, '2020-01-01 10:00:00', 2, 1, 1, 3),
(4, '2020-01-01 10:00:00', 2, 1, 1, 4),
(5, '2020-01-01 10:00:00', 2, 1, 1, 5),
(6, '2020-01-01 10:00:00', 2, 1, 1, 6),
(7, '2020-01-01 10:00:00', 2, 1, 1, 7),
(8, '2020-01-01 10:00:00', 2, 1, 1, 8),
(9, '2020-01-01 10:00:00', 2, 1, 1, 9),
(10, '2020-01-01 10:00:00', 2, 1, 1, 10),
(11, '2020-01-01 10:00:00', 2, 1, 1, 11);

