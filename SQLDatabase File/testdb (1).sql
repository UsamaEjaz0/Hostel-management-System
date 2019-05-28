-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 28, 2019 at 07:35 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.1.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `testdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `caretaker`
--

CREATE TABLE `caretaker` (
  `Name` varchar(100) NOT NULL,
  `phoneno` int(20) NOT NULL,
  `address` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `salary` int(20) NOT NULL,
  `Nationalid` int(50) NOT NULL,
  `permanentaddress` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `caretaker`
--

INSERT INTO `caretaker` (`Name`, `phoneno`, `address`, `gender`, `salary`, `Nationalid`, `permanentaddress`) VALUES
('sad', 67, '', 'Male', 33, 1, ''),
('lol', 12, 'jTextField2', 'Female', 121, 122, 'dfgvd'),
('Hahahajj', 123, 'jTextField2', 'Male', 121, 231, 'dfgvd'),
('sad', 67, 'sdfsd', 'Male', 33, 1113, 'dfsf'),
('lol', 12, 'jTextField2', 'Female', 121, 2311, 'dfgvd'),
('Hahaha', 12, 'jTextField2', 'Male', 121, 23113, 'dfgvd');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `sno` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`sno`, `username`, `password`) VALUES
(0, 'usama', 12345),
(1, 'Ali', 123),
(2, 'Idrees', 54321);

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `ID` int(30) NOT NULL DEFAULT '1',
  `Fname` varchar(50) NOT NULL,
  `Lname` varchar(50) NOT NULL,
  `gender` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `Room` varchar(10) NOT NULL,
  `phone` varchar(30) NOT NULL,
  `age` int(30) NOT NULL,
  `Fee` varchar(30) NOT NULL DEFAULT 'unpaid',
  `mess` varchar(111) NOT NULL DEFAULT 'unpaid'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` (`ID`, `Fname`, `Lname`, `gender`, `Address`, `Room`, `phone`, `age`, `Fee`, `mess`) VALUES
(10, 'Alien', 'Ejaz', 'Female', 'Milky way', '790', '000000', 11, 'Paid', 'unpaid'),
(12, 'human', 'Ejaz', 'Female', 'Earth', '105', '032200200', 99, 'paid', 'unpaid'),
(32, 'Ali ', 'Pyara', 'Female', 'dfsdfsf', '90', '43443', 77, 'Unpaid', 'unpaid'),
(40, 'M', 'Bilal', 'Female', 'Seecs', '105', '2079', 19, 'Unpaid', 'paid'),
(86, 'Mubasher', 'Ahmed', 'Male', '1210 ,earth', '105', '99', 99, 'Unpaid', 'lun'),
(234, 'A', 'h', 'Male', 'j', '122', '222222', 12, 'Paid', 'unpaid');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `caretaker`
--
ALTER TABLE `caretaker`
  ADD PRIMARY KEY (`Nationalid`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`sno`);

--
-- Indexes for table `students`
--
ALTER TABLE `students`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
