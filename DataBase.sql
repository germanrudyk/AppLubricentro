-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: lubrigoma
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Table structure for table `producto`
--

DROP TABLE IF EXISTS `producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `producto` (
  `id` varchar(255) NOT NULL,
  `codigo` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `stock` int DEFAULT NULL,
  `fecha_notificada` date DEFAULT NULL,
  `notificada` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `producto`
--

LOCK TABLES `producto` WRITE;
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT INTO `producto` VALUES ('1','FAP-2934','Filtro RENAULT',1,'2023-08-21',_binary ''),('1fdc4391-8811-4458-be22-d5282545ae17','FAP-0001','RENAULT Clio 1.8 RSi',1,'2023-08-21',_binary ''),('33fcf169-2f80-49c6-94f0-f6432cff6e72','frt','Lubricante',2,'2023-08-11',_binary ''),('736118e3-aa98-40ea-ad05-96991b060a88','FAP-5000','Cubiertas Renault',1,'2023-08-21',_binary ''),('76123dd0-e4b3-4ec7-8f05-b8d599db0376','56','RENAULT Clio 1.8 RSi',1,'2023-08-11',_binary ''),('7ffdb0a5-f63c-41a8-8ce9-30fbcb6c4cd2','FAP-6000','Lubricante Etios 2008',0,'2023-08-21',_binary ''),('8afc258a-26f0-436c-a9a7-c9a831ec9761','5642','orrin',1,'2023-08-10',_binary ''),('ad6c9b00-f039-49e0-8272-10f88ea021d3','5897','amortiguador',0,'2023-08-11',_binary ''),('bb6b0937-7c15-4aa3-98bb-e50169a77935','78','RENAULT Clio 1.8 RSi',0,'2023-08-11',_binary ''),('c690dda8-9c37-4780-9db2-6c64a85d6a21','FAP-6784','Cubiertas Michelin',2,'2023-08-10',_binary ''),('d48dfd33-e868-4660-8f34-617cc4510c95','WO-630','Filtro Scania',1,'2023-08-11',_binary ''),('d4d07645-82da-40af-a3b7-7e29d48b81e1','FAP-6543','Cubiertas',1,'2023-08-11',_binary ''),('d56fcd27-be09-484e-b395-a02f1fcdeb29','FAP-0002','RENAULT Clio 1.8i 16v-2.0i 16v Williams (redondo)',0,'2023-08-11',_binary ''),('d630aeaf-1de2-42f5-97bf-6b954041e7bf','0','re',1,'2023-08-22',_binary ''),('efca5368-5523-4079-8567-48511657d903','23','Todos',2,'2024-02-05',_binary '\0'),('f58e5180-64a3-4833-a6bd-b4c916eaf70c','4','Cubierta Michelin',0,'2023-08-11',_binary ''),('fe883337-d0e7-49d3-a5d6-f03421da1742','4890','Lubrigoma',0,'2023-08-10',_binary '');
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-02-05  9:58:54
