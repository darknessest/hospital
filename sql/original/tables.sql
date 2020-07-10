
drop table if exists orders;
drop table if exists doctor;
drop table if exists room;
drop table if exists user;
drop table if exists hospital;
drop table if exists admin;

# admin table
drop table if exists admin;

create table admin(
	a_id BIGINT(11) unsigned PRIMARY KEY AUTO_INCREMENT,
	a_account VARCHAR(40) UNIQUE NOT NULL,
	a_password VARCHAR(40) NOT NULL
);


# hospital table
drop table if exists hospital;

create table hospital(
	h_id BIGINT(11) unsigned PRIMARY KEY AUTO_INCREMENT,
	h_account VARCHAR(40) UNIQUE NOT NULL,
	h_password VARCHAR(40) NOT NULL,
	h_name VARCHAR(255)
);


# user table
drop table if exists user;

create table user(
	u_id BIGINT(11) unsigned PRIMARY KEY AUTO_INCREMENT,
	u_account VARCHAR(40) UNIQUE NOT NULL,
	u_password VARCHAR(40) NOT NULL,
	u_name VARCHAR(255),
	u_age tinyint unsigned,		# TODO: change to birthday(DATETIME)
	u_sex tinyint(1) unsigned,	# 0:male, 1:female, 2:other
	u_phone VARCHAR(40)
);


# room table
drop table if exists room;

create table room(
	r_id BIGINT(11) unsigned PRIMARY KEY AUTO_INCREMENT, # not necessarily unique
	r_address VARCHAR(255),
	r_desc VARCHAR(255),
	r_max tinyint unsigned,	# TODO: check type. tinyint [0, 255]
	r_num tinyint unsigned, # TODO: check type. tinyint [0, 255]
	r_hid BIGINT(11)
);


# doctor table
drop table if exists doctor;

create table doctor(
	d_id BIGINT(11) unsigned PRIMARY KEY AUTO_INCREMENT,
	d_name VARCHAR(40) NOT NULL,
	d_type VARCHAR(40),
	d_desc VARCHAR(255),
	d_phone VARCHAR(40),
	d_rid BIGINT(11) unsigned,
	d_hid BIGINT(11) unsigned
);


# orders table
drop table if exists orders;

create table orders(
	o_id BIGINT(11) unsigned PRIMARY KEY AUTO_INCREMENT,
	o_did BIGINT(11) unsigned,
	o_hid BIGINT(11) unsigned,
	o_userid BIGINT(11) unsigned,
	o_raddress VARCHAR(255),	# can reference
	o_status tinyint unsigned,
	o_date datetime(2),
	o_price decimal(10,2)
);
