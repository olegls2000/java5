/*drop table citizen;
drop table city;
drop table country;*/

create table country
(
	id serial primary key,
	name CHARACTER VARYING(30),
	code integer,
	discription character varying(30),
	UNIQUE (name)
);

create table city
(
	id serial primary key,
	name CHARACTER VARYING(30),
	code integer,
	discription character varying(30),
	country_id int not null,
	constraint FK_COUNTRY foreign key (country_id) references country (id),
	UNIQUE (name, country_id)
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

insert into country (code, name, discription) values (22, 'Estonia', 'Baltic Country');
insert into country (code, name, discription) values (33, 'Finland', 'Nordic Country');
insert into country (code, name, discription) values (44, 'Malaisa', 'Asia');
insert into city (code, name, discription, country_id) values (777, 'Tallinn', 'ewtrewqr',
 (select id from country where name = 'Estonia'));
insert into city (code, name, discription, country_id) values (33, 'Helsinki', 'asdfsafd',
(select id from country where name = 'Finland'));
insert into city (code, name, discription, country_id) values (44, 'Kuala-Lumpur', 'afdsaf',
 (select id from country where name = 'Malaisa')
);
insert into citizen (firstName, lastName, birth_day, city_id) values (
'Priit', 'Jurgenson', '1990-09-09', (select id from city where name = 'Tallinn'));
insert into citizen (firstName, lastName, birth_day, city_id) values (
'Huma', 'Lainen', '1980-05-02', (select id from city where name = 'Helsinki'));
insert into citizen (firstName, lastName, birth_day, city_id) values (
'Ko', 'Chang', '1970-11-01', (select id from city where name = 'Kuala-Lumpur'));
insert into citizen (firstName, lastName, birth_day, city_id) values (
'Kim', 'Chi', '1970-11-01', (select id from city where name = 'Kuala-Lumpur'));

select * from country;
select * from city;
select * from citizen;

select ci.name
from city ci
join citizen cz on cz.city_id = ci.id
where cz.firsTname = 'Kim'
;

select
--co.name
*
from country co
join city ct
on ct.country_id = co.id
--where ct.name = 'Helsinki'
;


-- print out Country name where located Helsiki
