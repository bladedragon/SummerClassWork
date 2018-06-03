/*
Navicat MySQL Data Transfer

Source Server         : redrocktest
Source Server Version : 50719
Source Host           : localhost:3306
Source Database       : tulin

Target Server Type    : MYSQL
Target Server Version : 50719
File Encoding         : 65001

Date: 2018-06-03 14:11:40
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `robotchat`
-- ----------------------------
DROP TABLE IF EXISTS `robotchat`;
CREATE TABLE `robotchat` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) NOT NULL,
  `date` datetime NOT NULL,
  `context` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=147 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of robotchat
-- ----------------------------
