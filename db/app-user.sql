-- MySQL 8.4 disables mysql_native_password by default,
-- so the user is created with the default caching_sha2_password
CREATE USER IF NOT EXISTS 'movie'@'%' IDENTIFIED BY 'Movie@1';
GRANT ALL ON moviedb.* TO 'movie'@'%';
FLUSH PRIVILEGES;