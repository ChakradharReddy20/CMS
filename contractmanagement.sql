create database contractmanagementsystem;
use contractmanagementsystem;

show tables; 
select * from contractor;

insert into contractor values (1, 'admin', 'admin');
select * from types;
insert into types values (1, 'type1'), (2, 'type2'), (3, 'type3');

select * from contracts;

insert into supplier values (1, 'delhi','123456789', 'Rohan','rohansupplier', 1);