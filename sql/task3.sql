create table employee(
emp_id varchar(30) primary key,
name varchar(100),
dept varchar(100),
salary int
);

insert into employee values
('emp-1','abc','sales',35000),
('emp-2','efg','production',45000),
('emp-3','hij','sales',35000),
('emp-4','klm','finance',55000);
desc employee;


select * from employee where dept='sales';


explain select * from employee where dept='sales';

create index emp_i on employee(dept);