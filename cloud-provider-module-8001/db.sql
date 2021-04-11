DROP DATABASE IF EXISTS cloudDB01;
CREATE DATABASE cloudDB01 CHARACTER SET UTF8;
USE cloudDB01;
CREATE TABLE sys_module
(
  dbid BIGINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
  moduleid varchar(20),
  modulename VARCHAR(60),
  dbsource   VARCHAR(60)
);

INSERT INTO sys_module(moduleid,modulename,dbsource) VALUES('0201','债券投资',DATABASE());
INSERT INTO sys_module(moduleid,modulename,dbsource) VALUES('0301','存放同业',DATABASE());
INSERT INTO sys_module(moduleid,modulename,dbsource) VALUES('0401','同业拆借',DATABASE());
INSERT INTO sys_module(moduleid,modulename,dbsource) VALUES('0501','银行理财',DATABASE());
INSERT INTO sys_module(moduleid,modulename,dbsource) VALUES('0601','货币基金',DATABASE());

SELECT * FROM sys_module;




