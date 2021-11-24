


create table COUNTRY ( 
id serial PRIMARY KEY,
	name1 varchar,
	code int NOT NULL,
	description varchar
);

insert into COUNTRY (name1 , code , description ) values ('ESTONIA' , 372 , 'estonia' );
insert into COUNTRY (name1 , code , description ) values ('LATVIA' , 371 , 'latvia' );
insert into COUNTRY (name1 , code , description ) values ('GERMANY' , 49 , 'germany' );

drop table COUNTRY;

select * from COUNTRY;




create table CITY ( 
id SERIAL PRIMARY KEY,
	city varchar NOT NULL,
	code int NOT NULL,
	country_id int NOT NULL,
	description varchar NOT NULL,
	constraint FK_COUNTRY foreign key (country_id) REFERENCES COUNTRY (id)
);
insert into CITY (city , code , country_id, description ) values ('TALLINN' , 111 , 1, 'gorod1' );
insert into CITY (city , code , country_id, description ) values ('TARTU' , 222 , 1, 'gorod2' );
insert into CITY (city , code , country_id, description ) values ('BERLIN' , 333 , 3, 'gorod3' );

select * from CITY;

drop table CITY;





create table CITIZEN ( 
id SERIAL PRIMARY KEY,
	firstName varchar NOT NULL,
	lastName varchar  NOT NULL,
	birthday date NOT NULL,
	city_id int NOT NULL,
	constraint FK_CITY foreign key (city_id) REFERENCES CITY (id)
);

insert into CITIZEN (firstname , lastname , birthday, city_id ) values ('IVAN' , 'IVANOV' , '1960/01/01', 1 );
insert into CITIZEN ( firstname , lastname , birthday, city_id ) values ('IVAR' , 'TAMM' , '1990/03/03', 2 );
insert into CITIZEN ( firstname , lastname , birthday, city_id ) values ('MARTIN' , 'STAMP' , '1999/05/06', 3 );

select * from CITIZEN;

select * from COUNTRY cr join CITY ct join CITIZEN cz  ;

drop table CITIZEN;

