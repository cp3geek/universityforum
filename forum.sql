# Host: localhost  (Version 5.7.27-log)
# Date: 2022-03-14 13:02:44
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "admin"
#

CREATE TABLE `admin` (
  `admin_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `admin_login_name` varchar(255) DEFAULT NULL,
  `admin_login_password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

#
# Data for table "admin"
#

INSERT INTO `admin` VALUES (1,'admin','123456');

#
# Structure for table "article"
#

CREATE TABLE `article` (
  `art_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `art_com_num` int(11) DEFAULT NULL,
  `art_comment_id` bigint(20) DEFAULT NULL,
  `art_content` varchar(255) DEFAULT NULL,
  `art_cre_time` datetime DEFAULT NULL,
  `art_hot_num` int(11) DEFAULT NULL,
  `art_like_num` int(11) DEFAULT NULL,
  `art_title` varchar(255) DEFAULT NULL,
  `art_type_id` bigint(20) DEFAULT NULL,
  `art_user_id` bigint(20) DEFAULT NULL,
  `art_view` int(11) DEFAULT NULL,
  PRIMARY KEY (`art_id`)
) ENGINE=MyISAM AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;

#
# Data for table "article"
#

INSERT INTO `article` VALUES (1,10,1,'今天保罗带领雷霆完成逆转','2019-06-05 20:40:48',1,1,'雷霆连续两场完成20分逆转什么水平',1,1,12),(2,1,2,'sdffgdbgbfghfgf','2019-12-05 20:41:43',2,3,'国足何时能崛起？',2,2,1),(3,13,4,'dfsfsfsfsfsdf','2019-12-09 14:00:00',3,2,'足球发展史',2,3,2),(4,3,3,'cvcvcvxc','2019-06-05 22:22:22',4,2,'我今天太惨了',3,6,3),(5,2,5,'mnmmmmmm','2019-12-10 11:22:33',5,1,'一个普通人需要多大努力才能考上985',3,1,4),(6,9,5,'9成新，换电脑了，低价出，可当面交易','2019-12-09 14:32:58',2,1,'低价出二手笔记本，需要得进',4,1,3),(7,4,1,'出售啊实打实基督教啥的监控和','2019-12-11 16:05:50',3,2,'你最想穿越回那场比赛',2,3,5),(8,5,1,'ccccsxxcfffrdssd','2019-12-11 21:28:08',3,3,'健身大佬带带萌新',5,7,7),(9,6,3,'vdfgdfgdfg','2019-12-11 21:28:56',5,4,'马上考研了，今年341万考生',6,3,8),(10,3,5,'xcdsffge试点范围方式','2019-12-13 09:07:29',4,5,'楼主什么水平，打爆小区老大爷',1,2,3),(11,2,2,'收到v小城市的方式度过','2019-12-13 09:08:04',6,6,'恕我直言，300元以下得耳机都是垃圾',4,2,4),(12,3,3,'士大夫石帆胜丰人','2019-12-13 09:08:54',7,7,'你是因为什么喜欢上篮球得',1,3,4),(13,4,3,'出现sets人','2019-12-13 09:09:14',3,1,'这身材什么水平',5,2,5),(14,5,2,'sdsdfaarcd','2019-12-13 09:19:26',10,10,'2021考研该如何准备，有学姐学长能指导吗',6,2,6),(15,1,1,'xcvdgtrsg','2019-12-13 09:20:13',3,3,'学习好累啊，怎么调整',6,1,4),(16,3,3,'dbdgdgh','2019-12-13 09:20:36',3,2,'怎么备考英语6级',6,6,3),(17,5,4,'期末考试考试','2019-12-23 19:58:46',2,1,'马上期末考试了',6,1,4),(18,NULL,NULL,'如题','2020-01-14 13:59:22',NULL,NULL,'测试发帖',5,3,NULL),(19,NULL,NULL,'如题','2020-01-14 14:01:13',NULL,NULL,'测试跳转',3,3,NULL),(20,NULL,NULL,'啊实打实的','2020-04-06 21:49:50',NULL,NULL,'测试',5,1,NULL),(21,NULL,NULL,'asdasdasdasfds','2020-04-07 19:42:53',NULL,NULL,'asdhkasda',1,1,NULL),(22,NULL,NULL,'手动阀手动阀士大夫胜多负少','2020-04-07 21:01:14',NULL,NULL,'但是士大夫士大夫',1,1,NULL),(23,NULL,NULL,'hhhhhhhh','2020-04-08 15:14:48',NULL,NULL,'unhhh',1,1,NULL),(24,NULL,NULL,'asjashdjahdkjashjdksada','2020-05-29 11:53:45',NULL,NULL,'dakjhdjkadjkha',2,1,NULL),(25,NULL,NULL,'sss','2020-06-03 16:53:56',NULL,NULL,'第二课堂',6,1,NULL);

#
# Structure for table "article_type"
#

CREATE TABLE `article_type` (
  `type_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type_create_time` datetime DEFAULT NULL,
  `type_name` varchar(255) DEFAULT NULL,
  `type_desc` varchar(255) DEFAULT NULL,
  `article_num` int(11) DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

#
# Data for table "article_type"
#

INSERT INTO `article_type` VALUES (1,'2019-12-10 17:05:56','篮球','篮球专区，分享篮球',3),(2,'2019-12-10 17:06:51','足球','可谈论足球比赛',3),(3,'2019-12-10 17:07:12','步行街','分享生活趣事',2),(4,'2019-12-10 17:07:23','跳蚤市场','校园二手商品交易市场',2),(5,'2019-12-10 17:07:50','健身区','健身大佬聚集地',2),(6,'2019-12-10 17:09:52','学习专区','分享学习资料',4);

#
# Structure for table "attention"
#

CREATE TABLE `attention` (
  `att_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `att_author_id` bigint(20) DEFAULT NULL,
  `att_user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`att_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "attention"
#


#
# Structure for table "collect"
#

CREATE TABLE `collect` (
  `col_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `col_art_id` bigint(20) DEFAULT NULL,
  `col_user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`col_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "collect"
#


#
# Structure for table "comment"
#

CREATE TABLE `comment` (
  `com_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `com_art_id` bigint(20) DEFAULT NULL,
  `com_content` varchar(255) DEFAULT NULL,
  `com_time` datetime DEFAULT NULL,
  `com_user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`com_id`)
) ENGINE=MyISAM AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

#
# Data for table "comment"
#

INSERT INTO `comment` VALUES (1,6,'图呢？','2020-01-02 09:04:24',2),(2,6,'配置怎么样，上参数看看','2020-01-02 09:05:50',3),(3,6,'在那个位置，加扣聊聊+55221522211','2020-01-02 09:06:31',4),(4,4,'sdfsdfsdfsdf','2020-01-02 11:00:55',5),(5,6,'配置参数给出来啊，跑分多少','2020-01-02 11:02:23',6),(6,6,'测试一下','2020-01-02 12:00:25',7),(7,6,'卖掉没有？','2020-01-14 10:56:49',3),(8,6,'我要','2020-01-14 10:57:23',3),(9,6,'测试测试','2020-01-14 11:08:03',3),(10,6,'ssss','2020-04-06 21:49:15',1),(11,20,'x\'x\'x\'xxxxx','2020-04-06 21:49:58',1),(12,4,'xxx','2020-04-06 21:50:41',1),(13,4,'ss','2020-04-06 22:07:28',1),(14,10,'测试','2020-04-07 08:59:11',1),(15,4,'hhhhh','2020-04-07 19:42:09',1),(16,4,'sdfsdfsdfs','2020-04-07 20:59:50',1),(17,4,'zzzzzz','2020-04-07 21:16:42',1),(18,14,'2222','2020-04-07 21:24:38',1),(19,14,'测试测试','2020-04-07 21:24:45',1),(20,14,'sdfsdfs','2020-04-07 21:24:50',1),(21,14,'gfcvxcv','2020-04-07 21:24:54',1),(22,14,'sdfsdf','2020-04-07 21:24:57',1),(23,12,'xczxc','2020-04-07 21:25:06',1),(24,12,'科比','2020-04-07 21:25:15',1),(25,12,'11111','2020-04-07 21:25:29',1),(26,14,'111','2020-04-08 14:44:51',1),(27,14,'jkxhskasdsa','2020-04-08 15:14:19',1),(28,14,'dddddd','2020-05-29 11:53:33',1),(29,14,'sjhjkhdasjk','2020-06-03 16:53:25',1);

#
# Structure for table "comment_multi"
#

CREATE TABLE `comment_multi` (
  `com_multi_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `com_id` bigint(20) DEFAULT NULL,
  `com_multi_content` varchar(255) DEFAULT NULL,
  `com_multi_time` datetime DEFAULT NULL,
  `com_multi_user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`com_multi_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

#
# Data for table "comment_multi"
#


#
# Structure for table "user"
#

CREATE TABLE `user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_blog` varchar(255) DEFAULT NULL,
  `user_concern` int(11) DEFAULT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  `user_fans` int(11) DEFAULT NULL,
  `user_img` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  `user_phone` varchar(255) DEFAULT NULL,
  `user_sex` varchar(255) DEFAULT NULL,
  `user_show` varchar(255) DEFAULT NULL,
  `user_status` tinyint(4) DEFAULT NULL,
  `user_time` datetime DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'dfdfs',300,'792716300@qq.com',400,'user1.jpg','cp3','123456','19923827900','男','不经巨大的困难，不会有伟大的事业',0,'2019-12-11 00:00:00'),(2,'zcxzcxz',600,'1142078212@qq.com',100,'user2.jpg','cy','123456','18375633702','女','改变你的想法，你就改变了自己的世界',0,'2019-12-11 19:39:14'),(3,'zcxzcz',200,'1240749816@qq.com',300,'user3.jpg','young','123456','13212452523','男','不要等待，时机永远不会恰到好处',0,'2019-12-11 19:40:37'),(4,'sdadasd',345,'12345678999@qq.com',542,'user4.jpg','boy','123456','2132543555','男','生命如同寓言，其价值不在与长短，而在与内容',0,'2019-12-19 20:43:41'),(5,'fhfgh',122,'15255252255@qq.com',1232,'user5.jpg','himan','123456','123342324','女','生命不可能有两次，但许多人连一次也不善于度过',0,'2019-12-19 20:44:43'),(6,'myself',100,'114275625@qq.com',220,'default.jpg','阿斯顿','123456','18375633702','男','talk is cheap,show me the code',0,'2019-12-25 20:34:16'),(7,'myself',222,'787618380@qq.com',654,'default.jpg','老胡','123456','18723551130','男','what hell man',0,'2019-12-25 20:36:51'),(8,'myself',333,'1240761130@QQ.COM',85,'default.jpg','FUCKER','123456','14892325478','男','go',0,'2019-12-25 20:39:16'),(9,'myself',222,'787618380@qq.com',123,'default.jpg','测试人员','123456','19923827900','男','测试一下',0,'2019-12-25 20:41:24'),(10,'myself',321,'77556633@qq.com',521,'default.jpg','测试人员2','123456','17236589411','女','测试时间',0,'2019-12-25 20:47:04'),(11,'myself',456,'792700@qq.com',345,'default.jpg','chris','$2a$10$eOTjsvux5x/k6NnGiV8B.ucddVHIco0xQyJygThSNc1/NfCkaaZyy','19923287251','男','测试一下',0,'2019-12-31 09:12:50'),(12,'myself',220,'12452352322@qq.com',NULL,'default.jpg','测试人员3','$2a$10$Ld4xkDTxv6hNmYNeyFPJbeb10kXv9Tu22C8FkLAXM8ya9kfZIxZr6','14522358852','男','测试测试测试测试',0,'2020-01-14 15:52:50');
