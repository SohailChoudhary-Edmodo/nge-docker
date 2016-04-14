#!/usr/bin/env bash

set -m
set -e

mysqld_safe &

sleep 10

mysql -u root -e "CREATE DATABASE IF NOT EXISTS your_db"
mysql -u root -e "GRANT ALL ON your_db.* to 'your_user'@'%' IDENTIFIED BY 'your_password'"
mysql -u root -e "FLUSH PRIVILEGES"

fg