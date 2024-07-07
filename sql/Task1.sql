use placement_class;

create table products(
prod_id int primary key,
name varchar(50),
quantity int,
price decimal(10,2)
);

CREATE TABLE customers (
    customer_id INT,
    prod_id INT,
    sales_date DATE,
    quantity INT,
    total DECIMAL(10, 2),
    status VARCHAR(20)
);

INSERT INTO products (prod_id, name, quantity, price) VALUES
(1, 'Product A', 100, 10.50),
(2, 'Product B', 200, 20.00),
(3, 'Product C', 150, 15.75),
(4, 'Product D', 250, 5.50),
(5, 'Product E', 300, 7.25);


INSERT INTO customers (customer_id, prod_id, sales_date, quantity, total, status) VALUES
(1, 1, '2024-06-01', 2, 21.00, 'Completed'),
(1, 3, '2024-06-02', 1, 15.75, 'Pending'),
(2, 2, '2024-06-03', 3, 60.00, 'Completed'),
(3, 4, '2024-06-04', 4, 22.00, 'Completed'),
(4, 5, '2024-06-05', 5, 36.25, 'Shipped'),
(2, 1, '2024-06-06', 2, 21.00, 'Completed');


select ct.customer_id,ct.prod_id,pt.name,ct.quantity,ct.total,ct.status from products pt,customers ct where pt.prod_id=ct.prod_id and sales_date='2024-06-01';

select * from products;

select * from customers;