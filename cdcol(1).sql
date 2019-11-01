-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Nov 01, 2019 at 10:45 AM
-- Server version: 5.5.39
-- PHP Version: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `cdcol`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE IF NOT EXISTS `booking` (
`bookingId` int(11) NOT NULL,
  `bookingName` varchar(100) COLLATE latin1_general_ci NOT NULL,
  `paymentProofId` int(11) NOT NULL,
  `paymentApproved` int(11) NOT NULL,
  `lawyerId` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=5 ;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`bookingId`, `bookingName`, `paymentProofId`, `paymentApproved`, `lawyerId`) VALUES
(1, 'booking1', 1, 1, 0),
(2, 'booking2', 2, 1, 0),
(3, 'booking3', 3, 1, 0),
(4, 'booking4', 2, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `lawyer`
--

CREATE TABLE IF NOT EXISTS `lawyer` (
`lawyerId` int(11) NOT NULL,
  `lawyerFullName` varchar(50) COLLATE latin1_general_ci NOT NULL,
  `lawyerPhoneNumber` varchar(50) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=6 ;

--
-- Dumping data for table `lawyer`
--

INSERT INTO `lawyer` (`lawyerId`, `lawyerFullName`, `lawyerPhoneNumber`) VALUES
(1, 'ariessandi', '123456'),
(2, 'dharir', '54321'),
(3, 'maya', '976678'),
(4, 'untung', '767676878'),
(5, 'ziyan', '78767676');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
`userID` int(11) NOT NULL,
  `username` varchar(50) COLLATE latin1_general_ci NOT NULL,
  `password` varchar(100) COLLATE latin1_general_ci NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=9 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`userID`, `username`, `password`) VALUES
(1, 'admin', '123'),
(2, 'operator', '321'),
(3, 'staff', '12345'),
(4, 'tester', '54321'),
(5, 'kuda', 'darat'),
(6, 'makan', 'minum'),
(7, 'baru', 'bangun'),
(8, 'kucing', 'bau');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
 ADD PRIMARY KEY (`bookingId`);

--
-- Indexes for table `lawyer`
--
ALTER TABLE `lawyer`
 ADD PRIMARY KEY (`lawyerId`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
 ADD PRIMARY KEY (`userID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
MODIFY `bookingId` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT for table `lawyer`
--
ALTER TABLE `lawyer`
MODIFY `lawyerId` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
MODIFY `userID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
