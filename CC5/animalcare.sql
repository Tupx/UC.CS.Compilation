-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 15, 2020 at 07:56 AM
-- Server version: 10.4.8-MariaDB
-- PHP Version: 7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `animalcare`
--

-- --------------------------------------------------------

--
-- Table structure for table `adopters`
--

CREATE TABLE `adopters` (
  `adopter_id` int(20) NOT NULL,
  `record_id` int(20) NOT NULL,
  `name` varchar(20) NOT NULL,
  `contact_number` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `adopters`
--

INSERT INTO `adopters` (`adopter_id`, `record_id`, `name`, `contact_number`, `address`) VALUES
(121299, 11111111, 'Jack E. Bagbaga', '09090909091', 'Tan St., Baguio');

-- --------------------------------------------------------

--
-- Table structure for table `adoption_records`
--

CREATE TABLE `adoption_records` (
  `adopter_id` int(20) NOT NULL,
  `record_id` int(11) NOT NULL,
  `animal_id` int(11) NOT NULL,
  `employee_id` int(11) NOT NULL,
  `date` date NOT NULL,
  `time` time NOT NULL,
  `amout_due` date NOT NULL,
  `special_occasion` varchar(30) NOT NULL,
  `comments` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `animals`
--

CREATE TABLE `animals` (
  `animal_id` int(20) NOT NULL,
  `cage_id` int(20) NOT NULL,
  `name` varchar(30) NOT NULL,
  `species` varchar(20) NOT NULL,
  `sex` varchar(10) NOT NULL,
  `age` int(3) NOT NULL,
  `color` varchar(10) NOT NULL,
  `breed` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `animals`
--

INSERT INTO `animals` (`animal_id`, `cage_id`, `name`, `species`, `sex`, `age`, `color`, `breed`) VALUES
(200001, 192371, 'BroBro', 'dog', 'male', 10, 'Brown', ''),
(200002, 192372, 'Jaba', 'bird', 'female', 10, 'Gray', 'Jap'),
(200003, 192376, 'JamJam', 'cat', 'female', 19, 'White', 'Askal'),
(200004, 192375, 'JunJun', 'Dog', 'male', 21, 'black', 'askal'),
(200005, 192373, 'Agulish', 'cat', 'female', 10, 'Yellow', ''),
(200006, 192374, 'Voli Jun', 'lizard', 'female', 29, 'Green', '');

-- --------------------------------------------------------

--
-- Table structure for table `cages`
--

CREATE TABLE `cages` (
  `cage_id` int(20) NOT NULL,
  `section_id` int(20) NOT NULL,
  `capacity` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cages`
--

INSERT INTO `cages` (`cage_id`, `section_id`, `capacity`) VALUES
(192371, 120941, 3),
(192372, 120941, 5),
(192373, 120943, 10),
(192374, 120943, 5),
(192375, 120943, 3),
(192376, 120943, 5);

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `employee_id` int(20) NOT NULL,
  `shelter_id` int(20) NOT NULL,
  `name` varchar(50) NOT NULL,
  `age` varchar(2) NOT NULL,
  `position` varchar(20) NOT NULL,
  `address` varchar(50) NOT NULL,
  `contact_number` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `entry_records`
--

CREATE TABLE `entry_records` (
  `record_id` int(20) NOT NULL,
  `animal_id` int(20) NOT NULL,
  `employee_id` int(20) NOT NULL,
  `time` time NOT NULL,
  `special_occasion` varchar(30) NOT NULL,
  `comments` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `medical_records`
--

CREATE TABLE `medical_records` (
  `record_id` int(20) NOT NULL,
  `animal_id` int(20) NOT NULL,
  `employee_id` int(20) NOT NULL,
  `neuter_status` varchar(50) NOT NULL,
  `vaccinations` varchar(50) NOT NULL,
  `other_health_concerns` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `records`
--

CREATE TABLE `records` (
  `record_id` int(20) NOT NULL,
  `animal_id` int(20) NOT NULL,
  `emloyee_id` int(20) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `sections`
--

CREATE TABLE `sections` (
  `section_id` int(20) NOT NULL,
  `section_name` varchar(30) NOT NULL,
  `total_cages` int(3) NOT NULL,
  `section_description` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `sections`
--

INSERT INTO `sections` (`section_id`, `section_name`, `total_cages`, `section_description`) VALUES
(120941, 'birds', 30, ''),
(120942, 'reptiles', 30, ''),
(120943, 'mammals', 60, ''),
(120944, 'amphibians', 30, ''),
(120945, 'Unknown', 5, '');

-- --------------------------------------------------------

--
-- Table structure for table `shelters`
--

CREATE TABLE `shelters` (
  `shelter_id` int(20) NOT NULL,
  `name` varchar(30) NOT NULL,
  `location` varchar(40) NOT NULL,
  `description` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `shelters`
--

INSERT INTO `shelters` (`shelter_id`, `name`, `location`, `description`) VALUES
(10000, 'Shelter Mo', 'Quezon Hill , Baguio', ''),
(10001, 'Sheltering with You', 'Engineer\'s Hill, Baguio', '');

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE `transactions` (
  `transaction_id` int(20) NOT NULL,
  `record_id` int(50) NOT NULL,
  `payment_mode` varchar(10) NOT NULL,
  `amount` int(7) NOT NULL,
  `account_number` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `adopters`
--
ALTER TABLE `adopters`
  ADD PRIMARY KEY (`adopter_id`),
  ADD KEY `record_id` (`record_id`);

--
-- Indexes for table `adoption_records`
--
ALTER TABLE `adoption_records`
  ADD PRIMARY KEY (`adopter_id`),
  ADD KEY `record_id` (`record_id`),
  ADD KEY `animal_id` (`animal_id`),
  ADD KEY `employee_id` (`employee_id`);

--
-- Indexes for table `animals`
--
ALTER TABLE `animals`
  ADD PRIMARY KEY (`animal_id`),
  ADD UNIQUE KEY `cage_id` (`cage_id`);

--
-- Indexes for table `cages`
--
ALTER TABLE `cages`
  ADD PRIMARY KEY (`cage_id`),
  ADD KEY `section_id` (`section_id`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`employee_id`),
  ADD KEY `shelter_id` (`shelter_id`);

--
-- Indexes for table `entry_records`
--
ALTER TABLE `entry_records`
  ADD KEY `record_id` (`record_id`),
  ADD KEY `animal_id` (`animal_id`),
  ADD KEY `employee_id` (`employee_id`);

--
-- Indexes for table `medical_records`
--
ALTER TABLE `medical_records`
  ADD KEY `record_id` (`record_id`),
  ADD KEY `animal_id` (`animal_id`),
  ADD KEY `employee_id` (`employee_id`);

--
-- Indexes for table `records`
--
ALTER TABLE `records`
  ADD PRIMARY KEY (`record_id`),
  ADD KEY `animal_id` (`animal_id`),
  ADD KEY `emloyee_id` (`emloyee_id`);

--
-- Indexes for table `sections`
--
ALTER TABLE `sections`
  ADD PRIMARY KEY (`section_id`);

--
-- Indexes for table `shelters`
--
ALTER TABLE `shelters`
  ADD PRIMARY KEY (`shelter_id`);

--
-- Indexes for table `transactions`
--
ALTER TABLE `transactions`
  ADD PRIMARY KEY (`transaction_id`),
  ADD KEY `record_id` (`record_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `adoption_records`
--
ALTER TABLE `adoption_records`
  ADD CONSTRAINT `adoption_records_ibfk_1` FOREIGN KEY (`record_id`) REFERENCES `records` (`record_id`),
  ADD CONSTRAINT `adoption_records_ibfk_2` FOREIGN KEY (`animal_id`) REFERENCES `animals` (`animal_id`),
  ADD CONSTRAINT `adoption_records_ibfk_3` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`employee_id`);

--
-- Constraints for table `animals`
--
ALTER TABLE `animals`
  ADD CONSTRAINT `animals_ibfk_1` FOREIGN KEY (`cage_id`) REFERENCES `cages` (`cage_id`);

--
-- Constraints for table `cages`
--
ALTER TABLE `cages`
  ADD CONSTRAINT `cages_ibfk_1` FOREIGN KEY (`section_id`) REFERENCES `sections` (`section_id`);

--
-- Constraints for table `employees`
--
ALTER TABLE `employees`
  ADD CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`shelter_id`) REFERENCES `shelters` (`shelter_id`);

--
-- Constraints for table `entry_records`
--
ALTER TABLE `entry_records`
  ADD CONSTRAINT `entry_records_ibfk_1` FOREIGN KEY (`record_id`) REFERENCES `records` (`record_id`),
  ADD CONSTRAINT `entry_records_ibfk_2` FOREIGN KEY (`animal_id`) REFERENCES `animals` (`animal_id`),
  ADD CONSTRAINT `entry_records_ibfk_3` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`employee_id`);

--
-- Constraints for table `medical_records`
--
ALTER TABLE `medical_records`
  ADD CONSTRAINT `medical_records_ibfk_1` FOREIGN KEY (`record_id`) REFERENCES `records` (`record_id`),
  ADD CONSTRAINT `medical_records_ibfk_2` FOREIGN KEY (`animal_id`) REFERENCES `animals` (`animal_id`),
  ADD CONSTRAINT `medical_records_ibfk_3` FOREIGN KEY (`employee_id`) REFERENCES `employees` (`employee_id`);

--
-- Constraints for table `records`
--
ALTER TABLE `records`
  ADD CONSTRAINT `records_ibfk_1` FOREIGN KEY (`animal_id`) REFERENCES `animals` (`animal_id`),
  ADD CONSTRAINT `records_ibfk_2` FOREIGN KEY (`emloyee_id`) REFERENCES `employees` (`employee_id`);

--
-- Constraints for table `transactions`
--
ALTER TABLE `transactions`
  ADD CONSTRAINT `transactions_ibfk_1` FOREIGN KEY (`record_id`) REFERENCES `records` (`record_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
