drop table citizen;
drop table city;
drop table country;

CREATE TABLE country
(
	id SERIAL PRIMARY KEY,
	name CHARACTER VARYING(30),
	code INTEGER,
	discription CHARACTER VARYING(30),
	UNIQUE (name)
);

CREATE TABLE city
(
	id SERIAL PRIMARY KEY,
	name CHARACTER VARYING(30),
	code INTEGER,
	discription CHARACTER VARYING(30),
	country_id int not null,
	constraint FK_COUNTRY foreign KEY (country_id) REFERENCES country (id),
	UNIQUE (name, country_id)
);

--drop table citizen;
CREATE TABLE citizen
(
	id SERIAL PRIMARY KEY,
	firstName CHARACTER VARYING(30),
	lastName CHARACTER VARYING(30),
	birth_day date not null,
	city_id int,
	constraint FK_CITY foreign KEY (city_id) REFERENCES city (id)

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





insert into country (code, name, discription) values (22, 'Estonia', 'Baltic Country');
insert into country (code, name, discription) values (33, 'Finland', 'Nordic Country');
insert into country (code, name, discription) values (44, 'Malaisa', 'Asia');

insert into city (code, name, discription, country_id) values (777, 'Tallinn', 'Baltic Country',
(select id from country where name = 'Estonia'));
insert into city (code, name, discription, country_id) values (33, 'Helsinki', 'Nordic Country',
(select id from country where name = 'Finland'));
insert into city (code, name, discription, country_id) values (44, 'Kuala-Lumpur', 'Asia2',
(select id from country where name = 'Malaisa')
);

insert into citizen (firstName, lastName, birth_day, city_id) values
('Priit', 'Jurgenson', '1990-09-09', (select id from city where name = 'Tallinn'));

insert into citizen (firstName, lastName, birth_day, city_id) values
('Huma', 'Lainen', '1980-05-02', (select id from city where name = 'Helsinki'));

insert into citizen (firstName, lastName, birth_day, city_id) values
('Ko', 'Chang', '1970-11-01', (select id from city where name = 'Kuala-Lumpur'));

insert into citizen (firstName, lastName, birth_day, city_id) values
('Kim', 'Chi', '1970-12-01', (select id from city where name = 'Helsinki'));
--commit;

select * from citizen;
select * from country;
select * from city;

select *
from city ci
join citizen cz on cz.city_id = ci.id
where cz.firstname = 'Kim'
;

select co.name
from country co
join city ct on ct.country_id = co.id
where ct.name = 'Helsinki'
;

select
*
from country co
join city ct on ct.country_id = co.id
--delete from city where id in (4, 7);
