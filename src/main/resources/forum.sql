# Host: localhost  (Version 5.7.27-log)
# Date: 2019-11-23 00:10:52
# Generator: MySQL-Front 6.1  (Build 1.26)


#
# Structure for table "admin"
#

CREATE TABLE `admin` (
  `admin_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `admin_login_name` varchar(255) DEFAULT NULL,
  `admin_login_password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`admin_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

#
# Data for table "article"
#


#
# Structure for table "article_type"
#

CREATE TABLE `article_type` (
  `type_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type_create_time` datetime DEFAULT NULL,
  `type_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`type_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

#
# Data for table "article_type"
#


#
# Structure for table "attention"
#

CREATE TABLE `attention` (
  `att_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `att_author_id` bigint(20) DEFAULT NULL,
  `att_user_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`att_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

#
# Data for table "comment"
#


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
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

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
  `user_img` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `user_phone` varchar(255) DEFAULT NULL,
  `user_sex` varchar(255) DEFAULT NULL,
  `user_show` varchar(255) DEFAULT NULL,
  `user_status` tinyint(4) DEFAULT NULL,
  `user_time` datetime DEFAULT NULL,
  `user_fans` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

#
# Data for table "user"
#

INSERT INTO `user` VALUES (1,'xzx',25,'asdas','sada','asd','asda','asda','asd',1,'2019-11-14 18:38:23',1);
