-- MySQL dump 10.13  Distrib 8.0.19, for osx10.15 (x86_64)
--
-- Host: localhost    Database: hospital_system
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `a_id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `a_account` varchar(40) NOT NULL,
  `a_password` varchar(40) NOT NULL,
  PRIMARY KEY (`a_id`),
  UNIQUE KEY `a_account` (`a_account`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'first_admin','YALunfGcUj2fECv'),(2,'second_admin','YXFKTc2rWAvZHoD'),(3,'third_admin','GyqEo8xzAHmEDWD'),(4,'fourth_admin','PdrAEfKzuLrfA7K'),(5,'fifth_admin','BwNCdJsRDh3dazD');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `doctor` (
  `d_id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `d_name` varchar(40) NOT NULL,
  `d_type` varchar(40) DEFAULT NULL,
  `d_desc` varchar(255) DEFAULT NULL,
  `d_phone` varchar(40) DEFAULT NULL,
  `d_rid` bigint unsigned DEFAULT NULL,
  `d_hid` bigint unsigned DEFAULT NULL,
  PRIMARY KEY (`d_id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `doctor`
--

LOCK TABLES `doctor` WRITE;
/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` VALUES (1,'name','type',NULL,'phone',1,1),(2,'子政','全科',NULL,'17784225821',3,99),(3,'乙','内科',NULL,'19149565603',6,18),(4,'明昊','口腔',NULL,'11608689889',4,93),(5,'品源','外科',NULL,'18021154359',1,13),(6,'泽玉','病理',NULL,'13366089208',4,15),(7,'均峰','全科',NULL,'15757799158',5,31),(8,'昊林','病理',NULL,'10873366851',4,94),(9,'湘','家庭医学',NULL,'16265798575',6,11),(10,'沅泽','精神病',NULL,'12480897734',5,85),(11,'岩','肿瘤',NULL,'10980282391',2,1),(12,'翎','全科',NULL,'11535141222',7,19),(13,'魁','计划生育',NULL,'19137392043',3,8),(14,'菱','全科',NULL,'15869900232',3,34),(15,'彧翰','肿瘤',NULL,'11945016688',1,71),(16,'季','外科',NULL,'18889712162',7,38),(17,'珺','病理',NULL,'11240706966',2,28),(18,'大钊','妇产科',NULL,'13439480846',7,12),(19,'佳泽','家庭医学',NULL,'16243734766',1,13),(20,'云冰','精神病',NULL,'10073777811',6,15),(21,'宏','皮肤病与性病',NULL,'17886468959',6,41),(22,'沁','眼科',NULL,'13932258030',3,94),(23,'沁','眼科',NULL,'18513978967',6,53),(24,'宇春','皮肤病与性病',NULL,'17670103745',5,17),(25,'大申','皮肤病与性病',NULL,'17016703603',7,62),(26,'灵栅','皮肤病与性病',NULL,'18465934307',3,86),(27,'燕军','计划生育',NULL,'15645991000',5,34),(28,'炎铭','口腔',NULL,'14915715598',6,53),(29,'垚','儿科',NULL,'12382892964',5,16),(30,'大维','医学影像',NULL,'13488355530',6,44),(31,'钰炎','精神病',NULL,'17202176050',3,58),(32,'建豪','病理',NULL,'18021090441',5,2),(33,'郗','儿科',NULL,'11944116808',7,60),(34,'梦杰','精神病',NULL,'13532324093',1,5),(35,'佳慧','全科',NULL,'11826516048',5,21),(36,'元青','妇产科',NULL,'17360710009',3,59),(37,'纬灏','眼科',NULL,'17495435103',4,19),(38,'雨秋','口腔',NULL,'14881228454',5,5),(39,'寻墨','病理',NULL,'19612726399',5,53),(40,'剑','内科',NULL,'16802046672',3,12),(41,'桔仪','妇产科',NULL,'11418717600',2,76),(42,'玉云','口腔',NULL,'10978015880',3,92),(43,'靓','内科',NULL,'10594288814',3,49),(44,'晓瑜','耳鼻咽喉科',NULL,'12711629663',7,41),(45,'东炫','计划生育',NULL,'14313345719',6,16),(46,'燃','家庭医学',NULL,'18724109565',2,53),(47,'宗耀','内科',NULL,'13421061673',2,53),(48,'金宝','口腔',NULL,'15303111338',2,32),(49,'首君','肿瘤',NULL,'17451262590',7,7),(50,'军','全科',NULL,'12156149291',2,62),(51,'彦伶','肿瘤',NULL,'19020358339',3,61);
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hospital`
--

DROP TABLE IF EXISTS `hospital`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hospital` (
  `h_id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `h_account` varchar(40) NOT NULL,
  `h_password` varchar(40) NOT NULL,
  `h_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`h_id`),
  UNIQUE KEY `h_account` (`h_account`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hospital`
--

LOCK TABLES `hospital` WRITE;
/*!40000 ALTER TABLE `hospital` DISABLE KEYS */;
INSERT INTO `hospital` VALUES (1,'aa','dyPGbGXDVM3pzRZ','人民医院'),(2,'cc','cqbwyDJMRv4UtYa','协和医院'),(3,'ee','ivQiNbyumG2nPhp','第一医院'),(4,'gg','TUMFZjcsZK3RNvM','附属第一医院'),(5,'jj','ged6uXHaKosAARi','长征医院'),(6,'ll','wWw2UAorQVPzsKB','瑞金医院'),(7,'nn','neTrEuUm8qKfBUB','第二医院'),(8,'pp','PknqrJKQKqpLcr7','齐鲁医院');
/*!40000 ALTER TABLE `hospital` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `orders` (
  `o_id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `o_did` bigint unsigned DEFAULT NULL,
  `o_hid` bigint unsigned DEFAULT NULL,
  `o_userid` bigint unsigned DEFAULT NULL,
  `o_raddress` varchar(255) DEFAULT NULL,
  `o_status` tinyint unsigned DEFAULT NULL,
  `o_date` datetime(2) DEFAULT NULL,
  `o_price` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`o_id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,26,1,97,'附属第一医院 第4层',5,'2019-02-18 13:36:00.00',57.50),(2,22,3,70,'附属第一医院 第4层',4,'2019-08-20 15:14:00.00',3474.86),(3,6,8,72,'第一医院 第2层',3,'2019-09-16 16:09:00.00',3385.80),(4,8,4,50,'附属第一医院 第5层',4,'2019-09-03 15:07:00.00',2159.24),(5,20,2,20,'鲁医院 第3层',3,'2019-03-22 13:41:00.00',2733.57),(6,34,2,97,'鲁医院 第8层',1,'2019-04-10 12:48:00.00',2577.30),(7,31,3,4,'鲁医院 第5层',5,'2019-02-18 14:38:00.00',175.09),(8,12,7,37,'第二医院 第7层',3,'2019-05-08 14:38:00.00',124.18),(9,7,4,6,'协和医院 第1层',4,'2019-01-13 14:44:00.00',450.22),(10,33,6,71,'长征医院 第5层',2,'2019-03-25 08:00:00.00',658.04),(11,27,1,51,'长征医院 第8层',2,'2019-08-25 15:07:00.00',1441.41),(12,31,4,47,'协和医院 第6层',0,'2019-02-09 15:46:00.00',484.27),(13,29,5,12,'附属第一医院 第4层',3,'2019-11-04 17:42:00.00',1920.44),(14,5,1,7,'瑞金医院 第3层',0,'2019-02-21 11:04:00.00',1497.36),(15,47,3,11,'协和医院 第8层',3,'2019-01-22 13:27:00.00',1610.63),(16,50,6,84,'鲁医院 第7层',3,'2019-12-19 13:16:00.00',42.94),(17,16,2,25,'第一医院 第1层',2,'2019-06-05 08:28:00.00',2528.74),(18,39,1,90,'瑞金医院 第6层',1,'2019-01-10 11:19:00.00',1308.56),(19,10,1,7,'第一医院 第4层',2,'2019-01-28 09:18:00.00',1319.08),(20,25,1,71,'附属第一医院 第1层',0,'2019-11-25 12:06:00.00',1419.91),(21,48,3,23,'第一医院 第2层',3,'2019-03-03 15:30:00.00',3839.75),(22,5,7,68,'第一医院 第3层',2,'2019-09-26 17:29:00.00',1948.80),(23,21,1,64,'协和医院 第4层',1,'2019-09-07 14:46:00.00',988.10),(24,20,3,85,'长征医院 第1层',3,'2019-04-07 09:35:00.00',3539.55),(25,41,4,48,'协和医院 第4层',4,'2019-03-23 16:28:00.00',62.23),(26,40,8,51,'长征医院 第8层',0,'2019-04-03 16:10:00.00',366.36),(27,25,4,20,'鲁医院 第4层',2,'2019-10-01 12:23:00.00',22.98),(28,44,3,21,'长征医院 第2层',5,'2019-10-12 16:44:00.00',482.19),(29,33,4,78,'附属第一医院 第3层',1,'2019-06-04 15:32:00.00',809.71),(30,10,4,31,'瑞金医院 第6层',5,'2019-09-13 15:47:00.00',1880.51),(31,5,6,95,'协和医院 第6层',2,'2019-01-30 10:01:00.00',83.84),(32,50,4,31,'瑞金医院 第2层',5,'2019-12-01 09:49:00.00',1159.37),(33,45,7,98,'第一医院 第2层',3,'2019-02-24 09:43:00.00',1382.04),(34,43,7,17,'第一医院 第6层',5,'2019-01-08 09:09:00.00',38.94),(35,16,3,31,'协和医院 第4层',3,'2019-09-21 08:27:00.00',187.88),(36,49,5,65,'协和医院 第7层',0,'2019-12-04 14:02:00.00',26.21),(37,30,3,31,'第一医院 第6层',2,'2019-01-30 16:12:00.00',1192.48),(38,30,7,10,'鲁医院 第5层',1,'2019-07-14 15:42:00.00',1193.02),(39,26,8,81,'附属第一医院 第6层',5,'2019-02-21 08:21:00.00',66.14),(40,38,2,44,'第一医院 第7层',3,'2019-12-29 10:03:00.00',12.55),(41,33,5,56,'瑞金医院 第3层',5,'2019-05-08 08:12:00.00',174.47),(42,23,7,91,'第二医院 第8层',2,'2019-09-16 11:32:00.00',112.83),(43,6,6,42,'协和医院 第4层',0,'2019-04-05 13:19:00.00',92.09),(44,48,2,58,'瑞金医院 第2层',3,'2019-09-21 17:35:00.00',24.31),(45,24,1,61,'协和医院 第2层',3,'2019-01-12 11:02:00.00',617.07),(46,48,7,87,'鲁医院 第6层',0,'2019-08-22 17:32:00.00',177.89),(47,20,4,26,'鲁医院 第4层',4,'2019-05-19 14:41:00.00',603.29),(48,26,8,66,'第一医院 第8层',0,'2019-11-19 16:34:00.00',2440.42),(49,24,8,71,'附属第一医院 第8层',1,'2019-06-12 17:20:00.00',2981.08),(50,39,8,56,'长征医院 第6层',5,'2019-02-11 12:37:00.00',589.17);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room`
--

DROP TABLE IF EXISTS `room`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `room` (
  `r_id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `r_address` varchar(255) DEFAULT NULL,
  `r_desc` varchar(255) DEFAULT NULL,
  `r_max` tinyint unsigned DEFAULT NULL,
  `r_num` tinyint unsigned DEFAULT NULL,
  `r_hid` bigint DEFAULT NULL,
  PRIMARY KEY (`r_id`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room`
--

LOCK TABLES `room` WRITE;
/*!40000 ALTER TABLE `room` DISABLE KEYS */;
INSERT INTO `room` VALUES (1,'第二医院 第8层',NULL,3,2,6),(2,'协和医院 第4层',NULL,3,2,1),(3,'协和医院 第8层',NULL,4,2,1),(4,'瑞金医院 第3层',NULL,4,3,5),(5,'附属第一医院 第5层',NULL,2,1,3),(6,'第二医院 第2层',NULL,2,1,6),(7,'第二医院 第2层',NULL,5,5,6),(8,'附属第一医院 第2层',NULL,4,3,3),(9,'第二医院 第5层',NULL,5,5,6),(10,'协和医院 第8层',NULL,1,1,1),(11,'瑞金医院 第7层',NULL,4,1,5),(12,'第二医院 第8层',NULL,3,1,6),(13,'鲁医院 第7层',NULL,5,1,7),(14,'瑞金医院 第2层',NULL,3,2,5),(15,'附属第一医院 第7层',NULL,4,3,3),(16,'附属第一医院 第8层',NULL,2,2,3),(17,'鲁医院 第1层',NULL,2,1,7),(18,'瑞金医院 第3层',NULL,1,1,5),(19,'附属第一医院 第3层',NULL,3,3,3),(20,'鲁医院 第1层',NULL,2,1,7),(21,'协和医院 第3层',NULL,2,1,1),(22,'第二医院 第3层',NULL,3,2,6),(23,'长征医院 第2层',NULL,4,2,4),(24,'瑞金医院 第5层',NULL,1,1,5),(25,'协和医院 第7层',NULL,5,4,1),(26,'第二医院 第6层',NULL,1,1,6),(27,'附属第一医院 第3层',NULL,1,1,3),(28,'鲁医院 第1层',NULL,1,1,7),(29,'附属第一医院 第6层',NULL,2,2,3),(30,'瑞金医院 第5层',NULL,2,1,5),(31,'长征医院 第6层',NULL,5,4,4),(32,'协和医院 第5层',NULL,1,1,1),(33,'瑞金医院 第6层',NULL,1,1,5),(34,'瑞金医院 第1层',NULL,5,1,5),(35,'长征医院 第5层',NULL,3,2,4),(36,'协和医院 第2层',NULL,3,3,1),(37,'鲁医院 第4层',NULL,2,1,7),(38,'第二医院 第5层',NULL,4,1,6),(39,'协和医院 第6层',NULL,4,2,1),(40,'瑞金医院 第1层',NULL,2,2,5),(41,'协和医院 第4层',NULL,4,3,1),(42,'协和医院 第3层',NULL,1,1,1),(43,'第一医院 第3层',NULL,5,2,2),(44,'协和医院 第3层',NULL,2,2,1),(45,'鲁医院 第4层',NULL,4,4,7),(46,'瑞金医院 第5层',NULL,3,1,5),(47,'第一医院 第5层',NULL,1,1,2),(48,'协和医院 第8层',NULL,3,1,1),(49,'附属第一医院 第6层',NULL,4,4,3),(50,'长征医院 第5层',NULL,2,1,4),(51,'第一医院 第7层',NULL,4,2,2),(52,'瑞金医院 第8层',NULL,1,1,5),(53,'鲁医院 第7层',NULL,5,5,7),(54,'协和医院 第7层',NULL,5,4,1),(55,'鲁医院 第7层',NULL,2,2,7),(56,'协和医院 第6层',NULL,4,1,1),(57,'附属第一医院 第2层',NULL,2,2,3),(58,'瑞金医院 第1层',NULL,5,3,5),(59,'协和医院 第5层',NULL,4,1,1),(60,'协和医院 第8层',NULL,2,2,1),(61,'第二医院 第5层',NULL,4,1,6),(62,'瑞金医院 第8层',NULL,2,1,5),(63,'瑞金医院 第7层',NULL,4,3,5),(64,'长征医院 第7层',NULL,5,4,4),(65,'第一医院 第3层',NULL,1,1,2),(66,'第二医院 第6层',NULL,3,2,6),(67,'协和医院 第1层',NULL,4,2,1),(68,'鲁医院 第1层',NULL,4,4,7),(69,'附属第一医院 第8层',NULL,1,1,3),(70,'瑞金医院 第2层',NULL,4,2,5),(71,'附属第一医院 第3层',NULL,1,1,3),(72,'鲁医院 第2层',NULL,4,4,7),(73,'附属第一医院 第8层',NULL,5,4,3),(74,'瑞金医院 第7层',NULL,2,1,5),(75,'鲁医院 第4层',NULL,4,2,7),(76,'鲁医院 第7层',NULL,5,3,7),(77,'长征医院 第5层',NULL,3,1,4),(78,'第二医院 第8层',NULL,3,3,6),(79,'鲁医院 第8层',NULL,4,4,7),(80,'协和医院 第6层',NULL,2,2,1),(81,'长征医院 第4层',NULL,1,1,4),(82,'鲁医院 第4层',NULL,4,3,7),(83,'瑞金医院 第2层',NULL,1,1,5),(84,'附属第一医院 第6层',NULL,3,2,3),(85,'附属第一医院 第4层',NULL,2,2,3),(86,'鲁医院 第5层',NULL,1,1,7),(87,'瑞金医院 第5层',NULL,4,2,5),(88,'第二医院 第2层',NULL,3,2,6),(89,'瑞金医院 第3层',NULL,3,3,5),(90,'协和医院 第2层',NULL,4,4,1),(91,'协和医院 第1层',NULL,5,1,1),(92,'鲁医院 第2层',NULL,5,1,7),(93,'附属第一医院 第8层',NULL,3,3,3),(94,'附属第一医院 第7层',NULL,2,1,3),(95,'附属第一医院 第3层',NULL,3,3,3),(96,'长征医院 第4层',NULL,1,1,4),(97,'第二医院 第2层',NULL,3,2,6),(98,'长征医院 第3层',NULL,5,2,4),(99,'第二医院 第3层',NULL,3,2,6),(100,'第二医院 第5层',NULL,4,3,6);
/*!40000 ALTER TABLE `room` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `u_id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `u_account` varchar(40) NOT NULL,
  `u_password` varchar(40) NOT NULL,
  `u_name` varchar(255) DEFAULT NULL,
  `u_age` tinyint unsigned DEFAULT NULL,
  `u_sex` tinyint unsigned DEFAULT NULL,
  `u_phone` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`u_id`),
  UNIQUE KEY `u_account` (`u_account`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'mrfosru','pDctclOEgdF','春山',58,0,'18281581694'),(2,'cxxupkykp','oDKJTzYinDL','毓贞',50,0,'18179310251'),(3,'fkiqem','aLZXnUOvcWV','知文',23,0,'11323566217'),(4,'pnvxzxn','IkJoMfWrUfWGqR','德帅',26,0,'12336599369'),(5,'fqahaw','jijTrguCjmxi','东昌',53,1,'12379922224'),(6,'ortodjwtzl','wHIblFtvYLES','晓龙',80,0,'17411551150'),(7,'hfijgfvts','paTSJxSYIpCb','艳玲',73,1,'11443188031'),(8,'mnolwoca','ljnlNmDBqYYZkqAmQ','添月',17,0,'13596680537'),(9,'xjxslnkap','uKaJIuELgUSQJqMn','涓',100,1,'11432720188'),(10,'bbwagywp','lECixrtbOzZpvn','书悦',81,0,'15943299477'),(11,'nihmjfexbn','VHtYEBAIEpsQ','彦伶',46,1,'19989802775'),(12,'cogiynval','dpNCZuXVAbMKO','惠娟',51,1,'10309009153'),(13,'gznafbezz','FeWseVhsPDhTHWPTYw','咏衡',78,1,'13681180059'),(14,'gxcwehnz','JyHjTDOtnLOsooCcxr','一',29,1,'14877162626'),(15,'vunttav','fckLMTmwDHippiIij','柯惠',90,1,'10412005325'),(16,'getrimeaf','ZaRqwVIakzSgz','未松',67,1,'17749076497'),(17,'gwlmnpemm','HHldNfptFV','帝瀚',81,1,'13700272832'),(18,'jefqspu','nKsNqqutCM','微',82,1,'14127662773'),(19,'gvngqndjd','NmvJrELbkDy','步帝',14,0,'11070379147'),(20,'nhfddp','fbSHLsvsSfck','思嘉',74,1,'12503135501'),(21,'kxmtvwz','wjrXosGxbGI','若',43,1,'15240956609'),(22,'bvnmdudpb','PjHCqiVEAhP','海涛',63,0,'12978775661'),(23,'wjqddb','xDzwszKytgWameLB','蔚蓝',24,1,'15355748385'),(24,'cpoqpbe','kOrELuoBhOc','云杉',98,0,'10477255886'),(25,'tbkiapzy','DDzOuEvzsV','燃',79,1,'17661455887'),(26,'ecljxzdiqs','FqPblvXmHvwv','艳双',40,0,'18477837731'),(27,'eeaeutfpwl','mxaDxdMUAcUDIo','秀英',15,1,'17504533295'),(28,'ajemrqe','GSTvdeUxYeIsZCW','轩',67,1,'12406007638'),(29,'gmgtsw','qRKHgSvoZyPE','秀英',72,1,'15480575586'),(30,'xbvztdwjf','ZWqCagRows','姿汛',27,0,'11230234781'),(31,'krgnkyq','sMtBKjioqaHpt','莉姿',51,1,'16749721606'),(32,'dejxhkytp','ggIYnARRNxNyPnw','娜',78,0,'13785336925'),(33,'xxsniyxgdp','jFStoQJZTiTdFSvQsv','兴进',52,0,'12017947589'),(34,'tghxgbysbu','TCGGQPNNvNE','汶妍',21,1,'14546617105'),(35,'oddtmffuy','CEflhLGefPgethbGK','泽钊',51,1,'16740545602'),(36,'ccuwamyi','mwnDUyNlogYhGsgA','沅清',16,1,'17149956064'),(37,'qsdmdvby','TlZapNhzpLrZDvn','霞',80,1,'10511109080'),(38,'qlxagt','EjmqepfhQhQNRMuD','俊达',85,0,'16144415993'),(39,'elwskddlg','WXKiQQJopWnGdFtVaf','大申',100,1,'18560758139'),(40,'ncyqcgk','KgIYGdnkPipItCyxxa','怀玙',32,0,'12103057680'),(41,'zxdvvyb','DKarEWIiTypyg','恒杰',48,0,'18932700695'),(42,'uhhewnt','hSYgXNPFJnlKR','悦月',15,1,'12953129509'),(43,'zpjcacjjpo','rlcqcddwMszZi','洋凯',19,0,'13264651440'),(44,'fylruoilk','OBAxQPRsGKaFQqat','香驿',72,1,'19639421968'),(45,'tpluskaotk','xbwXcMoUtXCFkyEv','金玉',67,0,'11460095844'),(46,'lujzugoyde','hSNWyRQKsTEkdjPYM','婷婷',48,0,'13787370988'),(47,'tugmqtlqst','cTQZDyWXROLd','颖',99,1,'13738610534'),(48,'bcigdivj','CiWGjmuFPIMyOEcJ','炎烯',24,1,'10949143887'),(49,'djarjxibha','gRoVOLtjMglDXvv','霖',71,1,'18072786242'),(50,'mpfphhem','XJmvyxntHn','哲',57,0,'17610751677'),(51,'gmxgnupfx','kAilFlbhITZFFhEf','诗迪',56,1,'17676899647'),(52,'lofcqqncz','uVkvLAtgzK','皓',79,1,'16201575553'),(53,'ngekmcqzrf','hfMFywFKEU','汉滔',95,1,'13099133562'),(54,'ksdmkhsko','zAYqhPZTRsIN','欣蔚',60,1,'17702965152'),(55,'sqbqysh','bpXanaPivvYEdUney','雪清',21,0,'11264100187'),(56,'omxwtc','QprgtTbwQKzx','咏矽',16,0,'14539142172'),(57,'japqob','rBWJbadFCBAw','彧瀚',49,1,'10718469789'),(58,'nbwaxymof','OqYuUwDAfYMJZhg','垚溯',31,1,'16091117497'),(59,'fwdgejqr','xcEsOLPhmoyns','汉',14,1,'18638241963'),(60,'jynynsgpl','KBXyRfEgBsM','嘉诚',66,1,'16986510649'),(61,'umhpobbmuw','IgHSYVMRgvxLIT','翰彧',37,1,'18160908455'),(62,'nighnhuzn','IRBTTMZbRYOUC','沥然',89,0,'10154177645'),(63,'dhypqjhp','jcvYmtnuQFpOlxhv','雨婷',58,0,'18722385703'),(64,'uilooagkvg','ySDjPyoqrpWe','柏钊',65,1,'11675555058'),(65,'giafwo','KLwzCPaklyfuT','丛佳',34,1,'10829115124'),(66,'stfymivuv','xsMRhOkxHMHuZT','新滦',24,0,'12609540657'),(67,'ovymgbg','mjJjmDWfbuE','德华',86,1,'10279948092'),(68,'xwhrumz','pNHvyknyZE','微',34,0,'17430745247'),(69,'yhqylmqq','bwRRYpjuxDW','畅洋',41,0,'15483722745'),(70,'pemxpxjpa','gQbpEfXTYyb','晓菏',69,1,'11260676810'),(71,'eanrkbnwu','yRMkpVJgQiqy','政魁',76,1,'11061778666'),(72,'sssodh','zgNWJOkxjFuvsIg','天舒',79,0,'11131622378'),(73,'mrqelaytwf','MKpzoVBiSuCdQqSqf','宇航',85,1,'13283416601'),(74,'isxdjf','MufilMAvwQbQ','朵',32,0,'13284965187'),(75,'lynukhc','JveZswEkMwqcUJW','晓菏',38,0,'13939637484'),(76,'atgprzw','VVKLkQLCulS','春龙',14,0,'15476274609'),(77,'mkkbgd','fxLVkqCJTGuWEauIo','依依',50,1,'17500897352'),(78,'lzoaqv','aIqqlytSwaizbydiOT','洋凯',71,0,'13502150671'),(79,'zcfnextw','ZqDNuilGBBUNdur','群',35,1,'11643104099'),(80,'mpbpcxt','SGlZEyAoeDXtUDxj','政盛',24,0,'17417874166'),(81,'vyvolx','IbYNTaHghYfRamN','梓渝',50,0,'18212273300'),(82,'blccty','pAOdIwvLyXnrNv','瑗青',18,1,'14330802549'),(83,'wpdgbmdhe','yTqMBSPAuMEMl','文杰',80,0,'12407162687'),(84,'tyehdsmean','VbTdAykXyFzryjnna','柏钊',78,1,'13162127539'),(85,'smfgletsg','bKRSybMzKn','诗迪',43,1,'10720064950'),(86,'wauvwsksre','nXdLrOwoHBdH','瑗清',48,1,'17126214815'),(87,'joacbnukhn','gyTYaSgDdsU','昊轩',44,1,'17234091499'),(88,'bwnzbqzfun','fPIQHUKRaz','怀玙',84,0,'12815963771'),(89,'cwolry','NclAbTaZcKrgmxQ','默涵',67,0,'18221324660'),(90,'qtbesvh','DpAQtRWgMrgcWQrFo','正',24,0,'14099044259'),(91,'azlyhui','vQVmwPmSqzgmYWgkXw','盈巧',16,1,'18556743801'),(92,'kdkfmtppke','rPPAhjFlZh','乾坤',51,0,'15826793317'),(93,'ltvyoi','wllFyhzzrx','诗雨',43,0,'13535408474'),(94,'xxrkwg','kCJsbSOybIslsd','星宇',41,1,'15003159358'),(95,'ehxsxibnbh','SZrRkFjbhO','萧冉',61,0,'19968059016'),(96,'sggwodkxe','BipXBiHsEZpLeFoT','超',84,0,'16052851803'),(97,'zasbqykmi','UPdOlacwglk','剑南',78,1,'11391768022'),(98,'fexsuxhc','nnMzIVqHQenNZudnAc','兴文',75,0,'16723756036'),(99,'glkivux','GuNZFNxyMNQ','睿智',64,1,'17238419349'),(100,'nnfjlodwld','CzugyvGIoXhp','彦岭',18,1,'11906406187');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-09 14:28:59
