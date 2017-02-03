CREATE DATABASE  IF NOT EXISTS `portaldb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `portaldb`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: portaldb
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `products` (
  `product_id` int(11) NOT NULL,
  `name` varchar(100) NOT NULL,
  `description` varchar(500) NOT NULL,
  `price` int(10) unsigned NOT NULL,
  `discount` int(10) unsigned NOT NULL,
  `stock` int(10) unsigned NOT NULL,
  `category` varchar(50) NOT NULL,
  `imageurl` varchar(500) DEFAULT 'http://www.burtonglass.co.uk/content/gallery/not-found_m.jpg',
  PRIMARY KEY (`product_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'Xbox One S 1TB Console','Play over 100 console exclusives and a growing library of Xbox 360 games on the newly designed Xbox One S, the only console with 4K Ultra HD Blu-ray, 4K video streaming and HDR. Stream your favorite films and shows in stunning 4K Ultra HD. Then play blockbusters like Gears of War 4 and Battlefield 1 with friends on Xbox Live, the fastest, most reliable gaming network.',8000,20,265,'Videogames','https://images-na.ssl-images-amazon.com/images/I/71VDmK2hZGL._AC_SL1236_.jpg'),(2,'PlayStation 4 Pro 1TB Console','Dynamic 4K Gaming & 4K Entertainment; PS4 Pro gets you closer to your game. Heighten your experiences. Enrich your adventures. Let the super-charged PS4 Pro lead the way.',7500,10,189,'Videogames','https://images-na.ssl-images-amazon.com/images/I/41GGPRqTZtL.jpg'),(3,'Roku Streaming Stick','The award-winning Roku Streaming Stick delivers powerful streaming - it\'s the only pocket-sized streamer available with a quad-core processor.',100,0,401,'Electronics','https://images-na.ssl-images-amazon.com/images/I/61bDmdbgigL._SL1500_.jpg'),(4,'Samsung Galaxy S7 Edge Unlocked','The Galaxy S7 and S7 edge feature big screens in incredibly slim designs that fit comfortably in the palm of your hand. We\'ve perfected the S7 edge\'s curved screen, so all you need to do is swipe for instant updates. Easy.',620,0,64,'Electronics','https://images-na.ssl-images-amazon.com/images/I/41XZDWyb3dL.jpg');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-02-02 17:54:09
