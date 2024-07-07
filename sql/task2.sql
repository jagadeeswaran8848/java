create database task2;
use task2;

CREATE TABLE cust (
    custid INT PRIMARY KEY,
    name VARCHAR(100),
    location VARCHAR(100),
    email VARCHAR(100)
);

CREATE TABLE orders (
    orderid INT PRIMARY KEY,
    custid INT,
    prod_name VARCHAR(100),
    quantity INT,
    total DECIMAL(10, 2),
    FOREIGN KEY (custid) REFERENCES cust(custid)
);

INSERT INTO cust (custid, name, location, email) VALUES
(1, 'abc', 'Chennai', 'abc@example.com'),
(2, 'def', 'erode', 'def@example.com'),
(3, 'ghi', 'pune', 'ghi@example.com');


INSERT INTO orders (orderid, custid, prod_name, quantity, total) VALUES
(101, 1, 'Laptop', 1, 1200.00),
(102, 1, 'Mouse', 2, 40.00),
(103, 1, 'Keyboard', 1, 80.00),
(104, 2, 'Laptop', 1, 750.00),
(105, 2, 'Mouse', 1, 25.00),
(106, 2, 'Keyboard', 1, 100.00),
(107, 3, 'Laptop', 1, 300.00),
(108, 3, 'Mouse', 1, 20.00),
(109, 3, 'Keyboard', 1, 30.00);



select * from orders;

select * from cust;


select ct.custid,ct.name,pt.prod_name,pt.quantity,pt.total from cust ct, orders pt where ct.custid=pt.custid and ct.custid=1;

select ct.custid,ct.name,pt.prod_name,pt.quantity,pt.total from cust ct, orders pt where ct.custid=pt.custid and pt.prod_name="Laptop";

select pt.prod_name,sum(pt.quantity)as tot_sal,sum(pt.total)as tot_sal_pri from cust ct, orders pt where ct.custid=pt.custid and pt.prod_name="Laptop" group by pt.prod_name;

-- select ct.name,ct.custid,ct.location,ct.email , pt.prod_name,pt.quantity,pt.total from cust ct,orders pt where ct.custid=pt.custid and pt.prod_name='Laptop' group by ct.custid;

select * from cust;
select * from orders;


create table sample(
	id INT PRIMARY KEY,
    name VARCHAR(100)
);
insert into sample values
(1,'s1'),
(2,'s2'),
(3,'s3'),
(4,'s4'),
(5,'s5');