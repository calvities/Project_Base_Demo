/*
 Navicat Premium Data Transfer

 Source Server         : CL_MySQL5.7
 Source Server Type    : MySQL
 Source Server Version : 50732
 Source Host           : calvities.cn:3306
 Source Schema         : test_new_project

 Target Server Type    : MySQL
 Target Server Version : 50732
 File Encoding         : 65001

 Date: 28/12/2020 13:41:24
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` char(19) NOT NULL COMMENT '主键ID',
  `name` varchar(30) NOT NULL COMMENT '姓名',
  `sex` int(1) NOT NULL COMMENT '性别(0男,1女,2未知)',
  `email` varchar(50) NOT NULL COMMENT '邮件地址',
  `address` varchar(100) DEFAULT NULL COMMENT '住址',
  `is_delete` tinyint(1) NOT NULL DEFAULT '0' COMMENT '逻辑删除 1（true）已删除， 0（false）未删除',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `modify_time` datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of user
-- ----------------------------
BEGIN;
INSERT INTO `user` VALUES ('1', '郑依依', 1, '1234567@qq.com', '老王的隔壁', 0, '2020-12-25 16:09:36', '2020-12-28 13:29:56');
INSERT INTO `user` VALUES ('10', '时十', 1, '1234098@qq.com', '地球村', 0, '2020-12-25 16:18:55', '2020-12-25 16:18:58');
INSERT INTO `user` VALUES ('11', '十一', 1, '7894321@qq.com', '八公山', 0, '2020-12-25 16:19:57', '2020-12-25 16:20:00');
INSERT INTO `user` VALUES ('2', '虎二', 0, '2345678@qq.com', '郑一隔壁', 0, '2020-12-25 16:10:39', '2020-12-25 16:10:44');
INSERT INTO `user` VALUES ('3', '张三', 0, '3456789@qq.com', '流浪的乞丐', 0, '2020-12-25 16:11:56', '2020-12-25 16:11:59');
INSERT INTO `user` VALUES ('4', '李四', 0, '4567890@qq.com', '杏花村', 0, '2020-12-25 16:13:12', '2020-12-25 16:13:14');
INSERT INTO `user` VALUES ('5', '王五', 0, '5678901@qq.com', '荷花地', 0, '2020-12-25 16:14:04', '2020-12-25 16:14:07');
INSERT INTO `user` VALUES ('6', '赵六', 0, '6789012@qq.com', '桃花岛', 0, '2020-12-25 16:14:42', '2020-12-25 16:14:44');
INSERT INTO `user` VALUES ('7', '孙七', 1, '7890123@qq.com', '昆仑山', 0, '2020-12-25 16:15:30', '2020-12-25 16:15:32');
INSERT INTO `user` VALUES ('8', '梅八', 1, '8901234@qq.com', '伤心地', 0, '2020-12-25 16:16:38', '2020-12-25 16:16:41');
INSERT INTO `user` VALUES ('9', '苦九', 0, '9012345@qq.com', '汾酒窖', 0, '2020-12-25 16:17:56', '2020-12-25 16:17:59');
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
