
CREATE DATABASE IF NOT EXISTS `moviedb`
DEFAULT CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

USE `moviedb`;

DROP TABLE IF EXISTS `movie`;

CREATE TABLE `movie` (
  `id` int NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `director` varchar(255) DEFAULT NULL,
  `genre` varchar(255) DEFAULT NULL,
  `movie_name` varchar(255) DEFAULT NULL,
  `rating` double NOT NULL,
  `release_year` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci;

INSERT INTO `movie` VALUES
(1,'An upcoming action thriller starring Prabhas.','Sandeep Reddy Vanga','Action, Thriller','Spirit',0,2027),
(2,'An upcoming Telugu movie starring Mahesh Babu.','S.S.Rajamouli','Action, Drama','Varanasi',0,2027),
(3,'An upcoming action entertainer starring NTR.','Prashanth Neel','Action, Adventure','Dragon',0,2027),
(4,'An upcoming Telugu action film starring Allu Arjun.','Atlee','Action, Drama','Raaka',0,2027),
(5,'The sequel to Kalki 2898 AD continuing the futuristic epic saga.','Nag Ashwin','Science Fiction, Action','Kalki 2898 AD: Part 2',0,2027),
(6,'The second installment of the Salaar franchise.','Prashanth Neel','Action, Crime, Drama','Salaar: Part 2 – Shouryanga Parvam',0,2027),
(7,'An upcoming period action film starring Prabhas.','Hanu Raghavapudi','Action, War','Fauzi',0,2026),
(52,'An upcoming period action film starring Prabhas.','Hanu Raghavapudi','Action, War','Fauzi',0,2026);

DROP TABLE IF EXISTS `movie_seq`;

CREATE TABLE `movie_seq` (
  `next_val` bigint DEFAULT NULL
) ENGINE=InnoDB
DEFAULT CHARSET=utf8mb4
COLLATE=utf8mb4_unicode_ci;

INSERT INTO `movie_seq` VALUES (151);
