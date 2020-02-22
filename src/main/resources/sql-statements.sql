create schema db;
Drop table Teacher;
CREATE TABLE Teacher (
	Id int AUTO_INCREMENT,
    firstName varchar(100) NOT NULL,
    lastName varchar(100) NOT NULL,
    age int,
    PRIMARY KEY(Id)
    
);

Delete from Teacher 
where firstName = 'John';

INSERT INTO Teacher (firstName, lastName, age)
Values ('John', 'Doe', 36);
INSERT INTO Teacher (firstName, lastName, age)
Values ('John', 'Doe', 32);
SELECT * FROM Teacher;

SET SQL_SAFE_UPDATES = 0;

Insert into Teacher (id, firstName, lastName, age)
values (900, 'Mary', 'Boo', 67);

Insert into Teacher (id, firstName, lastName, age)
values (901, 'Steve', 'Wallace', 54);

update Teacher 
Set lastName = 'Parker'
where id = 900;
SELECT * FROM Teacher;

update Teacher
set firstName = 'Steven'
where id = 901;

Alter table Teacher drop column age;