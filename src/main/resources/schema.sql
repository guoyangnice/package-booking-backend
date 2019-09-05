create table package(
	id number(255) primary key,
	packageNumber number(255) not null,
	recipient varchar(255) not null,
	phoneNumber number(255) not null,
	weight number(255),
	status number(255) not null,
	bookedTime date
);









