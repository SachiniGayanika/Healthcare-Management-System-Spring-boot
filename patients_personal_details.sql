-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 08, 2023 at 04:55 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `patients_personal_details`
--

-- --------------------------------------------------------

--
-- Table structure for table `patients_tbl`
--

CREATE TABLE `patients_tbl` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `date_of_birth` varchar(50) NOT NULL,
  `age` int(11) NOT NULL,
  `contact_number` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `chronic_diseases` varchar(300) NOT NULL,
  `other_diseases` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `patients_tbl`
--

INSERT INTO `patients_tbl` (`id`, `name`, `date_of_birth`, `age`, `contact_number`, `email`, `chronic_diseases`, `other_diseases`) VALUES
(1, 'samidi', '2000-10-05', 89, '071-3588038', 'darshananuwani@gmail.com', 'saman kumara ', 'namal udugama'),
(2, 'sunil perera', '2000-10-17', 69, '0769060768', 'darshanakamani@gmail.com', 'kamani perera', 'kasun perera');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `patients_tbl`
--
ALTER TABLE `patients_tbl`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `patients_tbl`
--
ALTER TABLE `patients_tbl`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
