use mcu;

show tables;

select * from employee;

alter table employee drop column salary;

alter table employee drop column department;

ALTER TABLE employee 
ADD COLUMN email VARCHAR(100) UNIQUE;

UPDATE employee SET email = 'arun.kumar@example.com' WHERE first_name = 'Arun' AND last_name = 'Kumar';
UPDATE employee SET email = 'priya.lakshmi@example.com' WHERE first_name = 'Priya' AND last_name = 'Lakshmi';
UPDATE employee SET email = 'raj.sekar@example.com' WHERE first_name = 'Raj' AND last_name = 'Sekar';
UPDATE employee SET email = 'sneha.ravi@example.com' WHERE first_name = 'Sneha' AND last_name = 'Ravi';
UPDATE employee SET email = 'vikram.rajan@example.com' WHERE first_name = 'Vikram' AND last_name = 'Rajan';
UPDATE employee SET email = 'anita.natarajan@example.com' WHERE first_name = 'Anita' AND last_name = 'Natarajan';
UPDATE employee SET email = 'arjun.meenakshi@example.com' WHERE first_name = 'Arjun' AND last_name = 'Meenakshi';
UPDATE employee SET email = 'kavita.balaji@example.com' WHERE first_name = 'Kavita' AND last_name = 'Balaji';
UPDATE employee SET email = 'manoj.krishnan@example.com' WHERE first_name = 'Manoj' AND last_name = 'Krishnan';
UPDATE employee SET email = 'pooja.subramani@example.com' WHERE first_name = 'Pooja' AND last_name = 'Subramani';


ALTER TABLE employee 
ADD COLUMN name VARCHAR(101);

UPDATE employee 
SET name = CONCAT(first_name, ' ', last_name);

alter table employee
drop column first_name,
drop column last_name;

select * from employee where name like '_a%'; -- used to get the sepecified letters rows;

describe employee;
show tables;
create table Attendence(
employee_id int,
name varchar(101),
position varchar(100),
date DATE NOT NULL,
status VARCHAR(50),
in_time TIME,
out_time TIME,
PRIMARY KEY (employee_id, date),
foreign key(employee_id) references employee(employee_id)
);

INSERT INTO Attendence (employee_id, name, position, date, status, in_time, out_time) VALUES
(1, 'Arun Kumar', 'Professor', '2024-06-01', 'Present', '09:00:00', '17:00:00'),
(2, 'Priya Lakshmi', 'Associate Professor', '2024-06-01', 'Absent', NULL, NULL),
(3, 'Raj Sekar', 'Lecturer', '2024-06-01', 'Leave', NULL, NULL),
(4, 'Sneha Ravi', 'Assistant Professor', '2024-06-01', 'Present', '09:30:00', '17:30:00'),
(5, 'Vikram Rajan', 'Professor', '2024-06-01', 'Absent', NULL, NULL),
(1, 'Arun Kumar', 'Professor', '2024-06-02', 'Present', '09:00:00', '17:00:00'),
(2, 'Priya Lakshmi', 'Associate Professor', '2024-06-02', 'Present', '08:45:00', '16:45:00'),
(3, 'Raj Sekar', 'Lecturer', '2024-06-02', 'Present', '10:00:00', '18:00:00'),
(4, 'Sneha Ravi', 'Assistant Professor', '2024-06-02', 'Absent', NULL, NULL),
(5, 'Vikram Rajan', 'Professor', '2024-06-02', 'Present', '09:15:00', '17:15:00');


desc Attendence;

select * from attendence;


select * from employee;
