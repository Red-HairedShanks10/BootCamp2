create database movies;
use movies; 
create table movie ( →4
id int not null auto_increment, →5
title varchar(50), →6
year int, →7
price decimal(8,2), →8
primary key(id) →9
);
insert into movie (title, year, price) →11
values ("It's a Wonderful Life", 1946, 14.95);
insert into movie (title, year, price)
values ("Young Frankenstein", 1974, 16.95);
insert into movie (title, year, price)
values ("Star Wars", 1977, 17.95);
insert into movie (title, year, price)
values ("The Princess Bride", 1987, 16.95);
insert into movie (title, year, price)
values ("Glory", 1989, 14.95);
insert into movie (title, year, price)
values("The Game",1997,14.95);