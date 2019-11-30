DROP DATABASE IF EXISTS travelagency;
DROP USER IF EXISTS travelagency_user;

USE mysql;
CREATE DATABASE travelagency DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
CREATE USER 'travelagency_user'@'%' IDENTIFIED BY 'pass';
GRANT ALL ON travelagency.* TO 'travelagency_user'@'%';
FLUSH PRIVILEGES;
