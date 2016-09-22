#### 关于BootPress
##### 1. 涉及到的技术
SpringBoot 1.4.0.RELEASE
Maven
Mysql
JPA 
JDK
Bootstrap
Thymeleaf
jquery


#### 项目启动

Git仓库：
https://github.com/coderdaily/bootpress.git

项目包含两套配置环境
使用<code>mvn clean package -Pdev</code>或<code>mvn clean package -Pprod</code>进行打包，默认为dev的配置文件。


#### 表结构

1. bp_user-用户表

```
CREATE TABLE `bp_user` (
  `sid` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(128) NOT NULL COMMENT '用户名',
  `password` varchar(128) DEFAULT NULL,
  `email` varchar(64) DEFAULT NULL,
  `gender` bit(1) DEFAULT NULL,
  `qq` varchar(16) DEFAULT NULL,
  `wechat` varchar(32) DEFAULT NULL,
  `weibo` varchar(64) DEFAULT NULL,
  `created_time` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`sid`,`username`),
  UNIQUE KEY `username` (`username`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


```
2. bp_content-博客表
```
CREATE TABLE `bp_content` (
  `sid` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `text` longtext,
  `user_sid` bigint(20) unsigned DEFAULT NULL,
  `status` varchar(32) DEFAULT NULL,
  `vote_up` int(11) unsigned DEFAULT '0',
  `vote_down` int(11) unsigned DEFAULT '0',
  `comment_status` varchar(32) DEFAULT NULL,
  `comment_count` int(11) unsigned DEFAULT '0',
  `view_count` int(11) unsigned DEFAULT '0',
  `created_time` datetime DEFAULT NULL,
  `modified_time` datetime DEFAULT NULL,
  `flag` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


```
3. bp_commont-评论表
```
CREATE TABLE `bp_commont` (
  `sid` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `parent_sid` bigint(20) unsigned DEFAULT NULL,
  `content_sid` bigint(20) unsigned DEFAULT NULL,
  `user_sid` bigint(20) unsigned DEFAULT NULL,
  `content` longtext,
  `created` datetime DEFAULT NULL,
  `status` varchar(32) DEFAULT NULL,
  `vote_up` int(11) unsigned DEFAULT '0',
  `vote_down` int(11) unsigned DEFAULT '0',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


```