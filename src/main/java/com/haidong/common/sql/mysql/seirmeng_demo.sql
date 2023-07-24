/*
 Navicat Premium Data Transfer

 Source Server         : MySQL8.0
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : seirmeng_demo

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 24/07/2023 10:59:15
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `id` int(11) NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `num` int(11) NOT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, '衬衫', 10);
INSERT INTO `goods` VALUES (2, '羊毛衫', 20);
INSERT INTO `goods` VALUES (3, '雪纺衫', 50);
INSERT INTO `goods` VALUES (4, '裤子', 30);
INSERT INTO `goods` VALUES (5, '高跟鞋', 23);
INSERT INTO `goods` VALUES (6, '袜子', 60);

SET FOREIGN_KEY_CHECKS = 1;
