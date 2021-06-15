-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 15 Jun 2021 pada 16.34
-- Versi server: 10.4.17-MariaDB
-- Versi PHP: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_dutacoding`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_pendaftaran`
--

CREATE TABLE `tbl_pendaftaran` (
  `id` int(5) DEFAULT NULL,
  `no` int(5) DEFAULT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `jk` varchar(15) DEFAULT NULL,
  `tempattinggal` varchar(30) DEFAULT NULL,
  `usia` int(3) DEFAULT NULL,
  `alasan` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data untuk tabel `tbl_pendaftaran`
--

INSERT INTO `tbl_pendaftaran` (`id`, `no`, `nama`, `jk`, `tempattinggal`, `usia`, `alasan`) VALUES
(NULL, 1000001, 'Sri', 'P', 'JL.Mangga', 25, 'Ingin mengembangkan bakat dan minat'),
(NULL, 1000002, 'Handi', 'L', 'JL.Singa', 27, 'Ingin menambah relasi'),
(4, 1000007, 'Sinta', 'P', 'JL.Sidomukti', 26, 'Ingin'),
(5, 1000010, 'Bertin', 'P', 'JL.Tlogosari', 29, 'Ingin menambah pengalaman');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
