use student;

DELETE FROM student WHERE name = 'John Doe';

insert into student value("Jagadeeswaran",20,"110 Sanarpalayam","AI&DS",100);

select * from student;

alter table student add department varchar(30);

update student
set department = "AI&DS";

alter table student add mark int;

update student set mark = 90 where name="bala";
update student set mark = 99 where name="Yokesh";
update student set mark = 100 where name="Jagadeeswaran";

delete from student where name = "Jagagadeeswaran";

select sum(mark) from student;

select * from student where name like "y%";

select * from student where name like "b%";