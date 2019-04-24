/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.21-log : Database - dubbo-commodity
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`dubbo-commodity` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `dubbo-commodity`;

/*Table structure for table `commodity` */

DROP TABLE IF EXISTS `commodity`;

CREATE TABLE `commodity` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键Id',
  `name` varchar(20) NOT NULL COMMENT '商品名称',
  `price` decimal(8,2) NOT NULL DEFAULT '0.00' COMMENT '单价',
  `ct_id` bigint(20) unsigned NOT NULL COMMENT '类型Id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `ct_id` (`ct_id`),
  CONSTRAINT `commodity_ibfk_1` FOREIGN KEY (`ct_id`) REFERENCES `commodity_type` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8 COMMENT='商品';

/*Data for the table `commodity` */

insert  into `commodity`(`id`,`name`,`price`,`ct_id`,`create_time`,`update_time`) values (1,'加湿器','200.00',1,'2019-03-06 19:28:05','2019-03-06 19:28:05'),(2,'暖风机','120.00',1,'2019-03-06 19:28:05','2019-03-06 19:28:05'),(3,'鼠标','30.00',2,'2019-03-06 19:28:05','2019-03-06 19:28:05'),(4,'键盘','100.00',2,'2019-03-06 19:28:05','2019-03-06 19:28:05'),(5,'iphoneX','6577.00',3,'2019-03-06 19:28:05','2019-03-06 19:28:05'),(6,'小米8','3600.00',3,'2019-03-06 19:28:05','2019-03-06 19:28:05');

/*Table structure for table `commodity_type` */

DROP TABLE IF EXISTS `commodity_type`;

CREATE TABLE `commodity_type` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键Id',
  `name` varchar(20) NOT NULL COMMENT '类型名称',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COMMENT='商品类型';

/*Data for the table `commodity_type` */

insert  into `commodity_type`(`id`,`name`,`create_time`,`update_time`) values (1,'家电','2019-03-06 19:24:13','2019-03-06 19:24:30'),(2,'数码','2019-03-06 19:24:13','2019-03-06 19:24:30'),(3,'手机','2019-03-06 19:24:13','2019-03-06 19:24:30');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
