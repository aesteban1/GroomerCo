#drop existing database
drop database if exists ProjectGroomer;

#create and use database
create database ProjectGroomer;
use ProjectGroomer;

#create all tables

#table Business
create table Business(
bId int primary key,
bName varchar(255),
bAddress varchar(255),
year int,
bPhone varchar(255),
bEmail varchar(255)
);

#table Groomer
create table Groomer(
gId int not null  auto_increment,
gName varchar(255),
gPhone varchar(255),
gEmail varchar(255),
salary int,
bId int,
primary key(gId),
foreign key(bId) references Business(bId)
);

#table Service
create table Service(
serviceID int primary key,
serviceName varchar(255),
cost int
);

#table Customer
create table Customer(
cId int not null auto_increment,
cName varchar(255),
cPhone varchar(255),
cEmail varchar(255),
primary key(cId)
);

#table Pet
create table Pet(
pId int  not null auto_increment,
pName varchar(255),
pAnimal varchar(20),
breed varchar(20),
custId int,
primary key(pId),
foreign key(custId) references Customer(cId)
);

#table Cat
create table Cat(
pId int,
breed varchar(50),
foreign key(pId) references Pet(pId)
);

#table Dog
create table Dog(
pId int,
breed varchar(50),
foreign key(pId) references Pet(pId)
);

#animalTypes
create table Animal(
aID int auto_increment,
aBreed varchar(255),
primary key(aId)
);

#table Sale
create table Sale(
sId int not null auto_increment,
sName varchar(255),
sSold int,
cId int,
pId int,
primary key(sId),
foreign key(cId) references Customer(cId),
foreign key(pId) references Pet(pId)
);

#table ServiceSale
create table ServiceSale(
svcId int,
saleId int,
foreign key(svcId) references Service(serviceId),
foreign key(saleId) references Sale(sId)
);

#Insert data for Business
INSERT INTO BUSINESS
VALUES (1, 'Company 1', 'Address 1', 2001, '111-111-1111', 'a@a.com'),
       (2, 'Company 2', 'Address 2', 2002, '222-222-2222', 'b@b.com'),
       (3, 'Company 3', 'Address 3', 2003, '333-333-3333', 'c@c.com'),
       (4, 'Company 4', 'Address 4', 2004, '444-444-4444', 'd@d.com'),
       (5, 'Company 5', 'Address 5', 2005, '555-555-5555', 'e@e.com');
select * from business;

#Insert data for Groomer
INSERT INTO Groomer
VALUES 
	(1, 'Alan Myers', '937-402-3890', 'amyers@email.com', 3000, 1),
	(2, 'Jillian Heather', '343-208-2008', 'jheather@email.com', 2500, 2),
	(3, 'Michael Rogers', '2034-23-9850', 'mrogers@email.com', 2800, 3),
	(4, 'Hannah Meadows', '461-564-1313', 'mhannah@email.com', 2700, 2),
	(5, 'David Stone', '494-616-4664', 'dstone@email.com', 2900, 4);
select * from groomer;

#Insert data for Service
insert into Service
(serviceId, serviceName, cost)
values
	(1, 'Bath&Brushing', 30),
	(2, 'Haircut', 40),
	(3, 'Flea Bath', 20),
	(4, 'Nail Trimming', 10),
	(5, 'De-Shedding', 20),
	(6, 'Full Grooming', 65);
select * from service;

insert into Groomer(gName, gPhone, gEmail, Salary, bId)
values('Aldo Caniz', 7134977759, 'aec080@shsu.edu', 100000, 1);
select* from Groomer;

insert into Animal(aBreed)
values('Dog'),
	  ('Cat'),
      ('Bird'),
      ('Whale'),
      ('Dinosaur');
select * from Animal;