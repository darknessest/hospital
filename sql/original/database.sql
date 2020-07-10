# creating a new database
drop database if exists hospital_system; 
create database hospital_system;

# creating an admin with all privileges on the database
# admin : zZpx@cpg3PTjeDv
CREATE USER 'h_admin'@'localhost' IDENTIFIED BY 'zZpx@cpg3PTjeDv';

GRANT ALL PRIVILEGES ON hospital_system.* TO 'h_admin'@'localhost';

# applying
FLUSH PRIVILEGES;