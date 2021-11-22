create sequence point_seq;

create table POINT (
    id int primary key,
    x int not null,
    y int not null
);

insert into POINT (id, x, y) values (nextval('point_seq'), 4,4);
insert into POINT (id, x, y) values (nextval('point_seq'), 5,5);
insert into POINT (id, x, y) values (nextval('point_seq'), 6,6);

insert into POINT (id, x, y) values (nextval('point_seq'), -4,-4);
insert into POINT (id, x, y) values (nextval('point_seq'), -5,-5);
insert into POINT (id, x, y) values (nextval('point_seq'), -6,-6);
drop table POINT;

drop table TRIANGLE;
create table TRIANGLE (
    id serial primary key,
    a_id int not null,
    b_id int not null,
    c_id int not null,
constraint FK_POINT_A
foreign KEY (a_id)
REFERENCES POINT(id),

constraint FK_POINT_B
foreign KEY (b_id)
REFERENCES POINT(id),

constraint FK_POINT_C
foreign KEY (c_id)
REFERENCES POINT(id)
);

insert into TRIANGLE (a_id, b_id, c_id) values (1, 2, 3);
insert into TRIANGLE (a_id, b_id, c_id) values (4, 5, 6);

select * from POINT;
select * from TRIANGLE;

select tr.id, tr.a_id, pt.* from TRIANGLE tr
join POINT pt on tr.a_id = pt.id
where pt.x < 0 AND pt.y < 0;