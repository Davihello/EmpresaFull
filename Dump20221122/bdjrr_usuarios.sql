-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: bdjrr
-- ------------------------------------------------------
-- Server version	8.0.31

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `curso` enum('Enfermagem','Informática','Administração') DEFAULT NULL,
  `perfil` enum('Orientador','Aluno','Empresa','Administrador','Secretario') DEFAULT NULL,
  `senha` varchar(50) DEFAULT NULL,
  `Email` varchar(50) DEFAULT NULL,
  `cep` varchar(50) DEFAULT NULL,
  `Bairro` varchar(50) DEFAULT NULL,
  `Unidade_federal` varchar(50) DEFAULT NULL,
  `Pai` varchar(50) DEFAULT NULL,
  `Mae` varchar(50) DEFAULT NULL,
  `cpf` varchar(15) DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `cnpj` varchar(15) DEFAULT NULL,
  `data_nascimento` varchar(15) DEFAULT NULL,
  `Rg` varchar(25) DEFAULT NULL,
  `data_inicio` varchar(20) DEFAULT NULL,
  `data_termino` varchar(20) DEFAULT NULL,
  `qualificacao` varchar(20) DEFAULT NULL,
  `razao` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'Administrador',NULL,'Administrador','1234',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(48,'Davi','Informática','Aluno','1234','davi@gmial.com','25215395','Campos Elisios','Rj','Carlos','Maria','100.102.847-12','26767194',NULL,'20/04/2004','100002',NULL,NULL,NULL,NULL),(49,'Marcelo','Enfermagem','Empresa','1234','Celin@gmail.com','5000','sao tomé','RJ',NULL,NULL,'102.120','214785',NULL,NULL,'6','2000','3000',NULL,'Nvidea'),(50,'Milena','Administração','Orientador','1234','mi@gmail.com','8000','Azevedo ','Sp',NULL,NULL,'1000','63500',NULL,'12/05/2000','9','10/00/0000','05/00/0555','Professora',NULL),(52,'Secretaria',NULL,'Secretario','1234',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(53,'Kin','Enfermagem','Orientador','1234','david@','98468','2562.65','rj',NULL,NULL,'123456','2131354',NULL,'2004','16546','21','20','lindo ',NULL);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-22 21:27:49
