-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 05/09/2022 às 15:50
-- Versão do servidor: 8.0.21
-- Versão do PHP: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `gaabsagencia`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `clientes`
--

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE IF NOT EXISTS `clientes` (
  `id_cliente` smallint NOT NULL AUTO_INCREMENT,
  `nome_cliente` varchar(70) NOT NULL,
  `cpf` varchar(14) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `idade` int DEFAULT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Despejando dados para a tabela `clientes`
--

INSERT INTO `clientes` (`id_cliente`, `nome_cliente`, `cpf`, `email`, `idade`) VALUES
(1, 'Isabel Pereira', '126.860.926-96', 'contatobelsouza@gmail.com', 22),
(2, ''Isabel Pereira', '126.860.926-96', 'contatobelsouza@gmail.com', 22);

-- --------------------------------------------------------

--
-- Estrutura para tabela `viagem`
--

DROP TABLE IF EXISTS `viagem`;
CREATE TABLE IF NOT EXISTS `viagem` (
  `id_viagem` smallint NOT NULL AUTO_INCREMENT,
  `dataIda` varchar(10) NOT NULL,
  `dataVolta` varchar(10) NOT NULL,
  `origem` varchar(20) NOT NULL,
  `destino` varchar(20) NOT NULL,
  `pagamento` int DEFAULT NULL,
  PRIMARY KEY (`id_viagem`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Despejando dados para a tabela `viagem`
--

INSERT INTO `viagem` (`id_viagem`, `dataIda`, `dataVolta`, `origem`, `destino`, `pagamento`) VALUES
(1, '06/09/2022', '18/09/2022', 'Peru', 'Belo Horizonte', 2);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
