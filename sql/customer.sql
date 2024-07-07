create database shop;
use shop;

create table cust_details(customer_id int,cust_name varchar(30), city varchar(50), grade int,salesman_id int);

insert into cust_details values
(3002,"Nick Rimando","New York",100,5001),
(3007,"Brad Davis","New York",200,5001),
(3005,"Graham Zusi","california",200,5002),
(3008,"Jullian Green","London",300,5002),
(3004,"Fabian Johnson","Paris",300,5006),
(3009,"Geoff Cameron","Berlin",100,5003),
(3003,"Jozy Altidor","Moscow",200,5007),
(3001,"Brad Guzan","London",null,5005);

select * from cust_details where grade>100;

UPDATE cust_details SET city = "Rome" WHERE customer_id = 3005;




Alter table cust_details add commission float(3,2);

UPDATE cust_details SET commission = "0.15" WHERE salesman_id = 5001;
UPDATE cust_details SET commission = "0.13" WHERE salesman_id = 5002;
UPDATE cust_details SET commission = "0.11" WHERE salesman_id = 5005;
UPDATE cust_details SET commission = "0.14" WHERE salesman_id = 5006;
UPDATE cust_details SET commission = "0.13" WHERE salesman_id = 5007;
UPDATE cust_details SET commission = "0.12" WHERE salesman_id = 5003;

select * from cust_details;

select * from cust_details where city="Paris" or city="Rome";

select salesman_id,cust_name as name,city,commission from cust_details where city="Paris" or city="Rome";

alter table cust_details change cust_name name varchar(30);


