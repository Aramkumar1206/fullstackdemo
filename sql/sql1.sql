create database Schools;

use schools;

create table student3(id int primary key, name varchar(25),age int);
describe student3;

insert into student3 values (101,'Francis',25),(102,'java Script',25), (104,'Alex',28),(106,'python',28),(107,'Alex',30);

select * from student3;