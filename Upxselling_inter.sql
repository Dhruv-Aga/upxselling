-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Jan 13, 2019 at 09:14 PM
-- Server version: 5.7.24-0ubuntu0.18.04.1
-- PHP Version: 5.6.37-1+ubuntu18.04.1+deb.sury.org+1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Upxselling_inter`
--

-- --------------------------------------------------------

--
-- Table structure for table `user_detail`
--

CREATE TABLE `user_detail` (
  `id` int(11) NOT NULL,
  `Name` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Email` varchar(200) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Dumping data for table `user_detail`
--

INSERT INTO `user_detail` (`id`, `Name`, `Age`, `Email`) VALUES
(1, 'kjnjk', 5, 'jknjk'),
(2, ';l,kl;', 5, 'klmklm'),
(3, 'kjnjk', 5, 'jknjk'),
(4, ';l,kl;', 5, 'klmklm'),
(5, 'kjnjk', 5, 'jknjk'),
(6, ';l,kl;', 5, 'klmklm'),
(7, 'kjnjk', 5, 'jknjk'),
(8, ';l,kl;', 5, 'klmklm'),
(9, 'kjnjk', 5, 'jknjk'),
(10, ';l,kl;', 5, 'klmklm'),
(11, 'Nirav', 29, 'nirav@upxselling.com'),
(12, 'Nirav', 29, 'nirav@upxselling.com'),
(13, 'Nirav', 29, 'nirav@upxselling.com'),
(14, 'Nirav', 29, 'nirav@upxselling.com'),
(15, 'Nirav', 29, 'nirav@upxselling.com'),
(16, 'Nirav', 29, 'nirav@upxselling.com'),
(17, 'Nirav', 29, 'nirav@upxselling.com'),
(18, 'Nirav', 29, 'nirav@upxselling.com'),
(19, 'Nirav', 29, 'nirav@upxselling.com'),
(20, 'Nirav', 29, 'nirav@upxselling.com'),
(21, 'Nirav', 29, 'nirav@upxselling.com'),
(22, 'Nirav', 29, 'nirav@upxselling.com'),
(23, 'Nirav', 29, 'nirav@upxselling.com'),
(24, 'Nirav', 29, 'nirav@upxselling.com'),
(25, 'Nirav', 29, 'nirav@upxselling.com'),
(26, 'Nirav', 29, 'nirav@upxselling.com'),
(27, 'Nirav', 29, 'nirav@upxselling.com'),
(28, 'Nirav', 29, 'nirav@upxselling.com'),
(29, 'Nirav', 29, 'nirav@upxselling.com'),
(30, 'Nirav', 29, 'dhruvaga11@gmail.com'),
(31, 'Nirav', 29, 'dhruvaga11@gmail.com'),
(32, 'Nirav', 29, 'dhruvaga11@gmail.com'),
(33, 'Nirav', 29, 'dhruvaga11@gmail.com'),
(34, 'Nirav', 29, 'dhruvaga11@gmail.com'),
(35, 'Nirav', 29, 'dhruvaga11@gmail.com'),
(36, 'Nirav', 29, 'dhruvaga11@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user_detail`
--
ALTER TABLE `user_detail`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `user_detail`
--
ALTER TABLE `user_detail`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
