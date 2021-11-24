CREATE TABLE country
(
	id SERIAL PRIMARY KEY,
	name CHARACTER VARYING(30),
	code INTEGER,
	discription CHARACTER VARYING(30)
);

CREATE TABLE city
(
	id SERIAL PRIMARY KEY,
	name CHARACTER VARYING(30),
	code INTEGER,
	discription CHARACTER VARYING(30),
	country_id int not null,
	constraint FK_COUNTRY foreign KEY (country_id) REFERENCES country (id)
);

CREATE TABLE citizen
(
	id SERIAL PRIMARY KEY,
	firstName CHARACTER VARYING(30),
	lastName CHARACTER VARYING(30),
	birth_day INTEGER,
	city_id int,
	constraint FK_CITY foreign KEY (city_id) REFERENCES city (id)
);
