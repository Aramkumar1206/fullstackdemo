create database school;

use school;

create table students (id int primary key,name varchar(20),dept varchar(25),salary int);

describe students;

insert into students values (110,'Jiohn','Diev',2300),(102,'aohn','aev',3300),(103,'rohn','rev',4300),(104,'tohn','tev',5000),(105,'hohn','hev',5300),
(106,'htohn','vev',6300),(107,'kohn','kev',7300),(108,'pohn','kev',8300),(109,'raohn','vcev',9300);

select * from students;

select count(*)  totalstudents from students;

select avg(salary) AvgSalary from students where dept='aev';

select sum(salary) SumSalary from students where dept='dev';

-- string operation 
-- to upper case 

select name ,ucase(name) NmaeInUpperCase,dept,salary from students;
select name ,lcase(name) NmaeLowerCase,dept,salary from students;

-- concatenation

select name,concat('Mr.',name) NewName,dept,salary from students;

select name,concat('Mrs.',name)  from students where name='hohn';

-- to substring the name from left and right :

select name,left(name,3) , dept,salary from students;
select name,right(name,2) , dept,salary from students;

-- to find date and time:

select now();
select date (now());
select curdate();
select date_format(curdate(),"%d/%m/%y") newDate;
select date_format(curdate(),"%D/%M/%Y") newDate;

-- to add or substract the date;

select date_add(curdate(),interval 20 month);
select date_sub(curdate(),interval 4 year);
