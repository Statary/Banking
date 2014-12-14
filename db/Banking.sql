-- phpMyAdmin SQL Dump
-- version 4.1.12
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 12, 2014 at 04:59 AM
-- Server version: 5.7.4-m14
-- PHP Version: 5.4.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `Banking`
--

-- --------------------------------------------------------

--
-- Table structure for table `ACCOUNT`
--

CREATE TABLE IF NOT EXISTS `ACCOUNT` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `FIO` varchar(255) NOT NULL,
  `DOC` varchar(255) NOT NULL,
  `BALANCE` int(11) unsigned DEFAULT '0',
  PRIMARY KEY (`ID`),
  UNIQUE KEY `DOC` (`DOC`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=183 ;

--
-- Dumping data for table `ACCOUNT`
--

INSERT INTO `ACCOUNT` (`ID`, `FIO`, `DOC`, `BALANCE`) VALUES
(1, 'Ivanov ivan', 'asdddcz', 2000),
(2, 'petrov petr', 'doc cccccccc', 2000),
(45, 'sidor', 'cxzaaxya', 32000),
(48, 'sidor', 'doc zcazcyyy', 1000),
(51, 'sidor', 'doc xzbcyyby', 2000),
(60, 'sidor', 'doc axcxczzz', 0),
(65, 'sidor', 'doc xzabzyab', 2000),
(66, 'sidor', 'doc czcbbcyz', 0),
(70, 'sidor', 'doc ccayxxbb', 3000),
(71, 'sidor', 'doc yybzbbzx', 2000),
(74, 'sidor', 'doc axcyyzza', 0),
(75, 'sidor', 'doc caybyybx', 1000),
(76, 'sidor', 'doc bbzycycx', 4000),
(78, 'sidor', 'doc ybbbyayb', 0),
(80, 'sidor', 'doc zyyaxxaa', 5000),
(81, 'sidor', 'doc zbbzcbab', 1000),
(83, 'sidor', 'doc bbyyzbbx', 2000),
(84, 'sidor', 'doc baaxxcbc', 2000),
(85, 'sidor', 'doc xyzbxzyx', 1000),
(86, 'sidor', 'doc ybzbxxyz', 0),
(87, 'sidor', 'doc zxaacbax', 1000),
(88, 'sidor', 'doc zczzybcb', 0),
(89, 'sidor', 'doc xaaxcyya', 1000),
(90, 'sidor', 'doc ccyxxbyb', 0),
(91, 'sidor', 'doc ycbxzyzc', 0),
(153, 'sidor', 'doc yaabzbcx', 0),
(154, 'sidor', 'doc ayxcxyza', 0),
(155, 'sidor', 'doc cbcbcbab', 0),
(156, 'sidor', 'doc czccyybz', 0),
(157, 'sidor', 'doc yzaybcax', 0),
(158, 'sidor', 'doc caacaxca', 0),
(159, 'sidor', 'doc cyaacxzb', 0),
(160, 'sidor', 'doc zbazybca', 0),
(161, 'sidor', 'doc ybyybxzx', 0),
(162, 'sidor', 'doc yaxazbza', 0),
(163, 'sidor', 'doc zaxyycbc', 0),
(164, 'sidor', 'doc xxazxyby', 0),
(165, 'sidor', 'doc xbaxxzxz', 0),
(166, 'sidor', 'doc ccccbybc', 0),
(167, 'sidor', 'doc xcccxabb', 0),
(168, 'sidor', 'doc bzyybzzc', 0),
(169, 'sidor', 'doc zbczxcxz', 0),
(170, 'sidor', 'doc xxbcyyyy', 0),
(171, 'sidor', 'doc abcbzzyz', 0),
(172, 'sidor', 'doc yyzcxcxa', 0),
(173, 'sidor', 'doc zbcbyaxc', 0),
(174, 'sidor', 'doc cbxaazxz', 0),
(175, 'sidor', 'doc bacyyxzc', 0),
(176, 'sidor', 'doc azyyabax', 0),
(177, 'sidor', 'doc cyczxbax', 0),
(178, 'sidor', 'doc bbxxyzyz', 0),
(179, 'sidor', 'doc zcbzycbx', 0),
(180, 'sidor', 'doc byzcyxxy', 0),
(181, 'sidor', 'doc ycybxxzx', 0),
(182, 'sidor', 'doc zzxaczcy', 0);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
