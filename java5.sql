--drop table citizen;
--drop table city;
--drop table country;

create table country
(
	id serial primary key,
	countryName CHARACTER VARYING(30),
	code integer,
	discription character varying(30),
	UNIQUE (countryName)
);

create table city
(
	id serial primary key,
	cityName CHARACTER VARYING(30),
	code integer,
	discription character varying(30),
	country_id int not null,
	constraint FK_COUNTRY foreign key (country_id) references country (id),
	UNIQUE (cityName, country_id)
);

create table citizen
(
	id serial primary key,
	firstName character varying(30),
	lastName character varying(30),
	birth_day date not null,
	city_id int not null,
	constraint FK_CITY foreign key (city_id) references city (id)
);

create table point
(
	id serial primary key,
	x int not null,
	y int not null
);

insert into POINT ( x, y) values ( -4, -4);
insert into POINT (x, y) values ( -5, -5);
insert into POINT (x, y) values ( -6, -6);

insert into country (code, countryName, discription) values (22, 'Estonia', 'Baltic Country');
insert into country (code, countryName, discription) values (33, 'Finland', 'Nordic Country');
insert into country (code, countryName, discription) values (44, 'Malaisa', 'Asia');
insert into city (code, cityName, discription, country_id) values (777, 'Tallinn', 'ewtrewqr',
 (select id from country where countryName = 'Estonia'));
insert into city (code, cityName, discription, country_id) values (33, 'Helsinki', 'asdfsafd',
(select id from country where countryName = 'Finland'));
insert into city (code, cityName, discription, country_id) values (44, 'Kuala-Lumpur', 'afdsaf',
 (select id from country where countryName = 'Malaisa')
);
insert into citizen (firstName, lastName, birth_day, city_id) values (
'Priit', 'Jurgenson', '1990-09-09', (select id from city where cityName = 'Tallinn'));
insert into citizen (firstName, lastName, birth_day, city_id) values (
'Huma', 'Lainen', '1980-05-02', (select id from city where cityName = 'Helsinki'));
insert into citizen (firstName, lastName, birth_day, city_id) values (
'Ko', 'Chang', '1970-11-01', (select id from city where cityName = 'Kuala-Lumpur'));
insert into citizen (firstName, lastName, birth_day, city_id) values (
'Kim', 'Chi', '1970-11-01', (select id from city where cityName = 'Kuala-Lumpur'));

select * from country;
select * from city;
select * from citizen;

select *
from city ci
join citizen cz on cz.city_id = ci.id
where cz.firstName = 'Kim';

select co.countryName
from country co
join city ct
on ct.country_id = co.id
where ct.cityName = 'Helsinki';
