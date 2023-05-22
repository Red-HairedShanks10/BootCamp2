CREATE TABLE contacts (
contact_id Bigserial constraint contact_id primary key,
last_name varchar(50) NOT NULL,
first_name varchar(50) NOT Null,
gender char(1) NOT NULL,
phone varchar(10) UNIQUE NOT NULL,
email varchar(50) Unique NOT NULL,
zip_code_id BIGINT References zip_codes(zip_code_id)ON DELETE CASCADE, 
status_id BIGINT References status(status_id)ON DELETE CASCADE, 
profession_id BIGINT references professions(profession_id)ON DELETE CASCADE,
seeking1 varchar(30)NOT NULL,
seeking2 varchar(30)NOT NULL,
seeking3 varchar(30)NOT NULL,
interest1 varchar(30)NOT NULL,
interest2 varchar(30)NOT NULL,
interest3 varchar(30)NOT NULL
);

Select * FROM contacts;
---------------------
DROP Table contacts;

Insert INTO contacts
(
 last_name,
first_name ,
gender,
phone,
email,
zip_code_id,
status_id,
profession_id ,
seeking1,
seeking2,
seeking3,
interest1,
interest2,
interest3   
	)
--adding values
Values
    ('Tom','Smith','F','0780615009','tom@gmail.com',1,1,1,'single male','same profession','over 50','hiking','reading','biking'),
    ('Gugu','Ndaba','F','0780615012','gugu@gmail.com',2,2,2,'single male','employed','under 25','hiking','cooking','running'),
    ('Jo','Nala','M','0780615078','jo@gmail.com',1,1,3,'single female','same profession','over 50','hiking','diving','biking'),
    ('Mary','Smith','F','0610615009','mary@gmail.com',2,2,4,'single male','student','under 50','studying','reading','cycling'),
    ('Kyle','Koo','M','0710615009','kyle@gmail.com',1,2,1,'single female','same profession','over 50','art','reading','cycling'),
    ('Sizwe','Nchabe','M','0840615099','sizwe@gmail.com',3,1,3,'single female','same profession','under 25','hiking','reading','biking'),
    ('Liz','Sun','F','0830777009','liz@gmail.com',3,1,2,'single male','retired','over 50','walkimg','reading','cooking');

Select * FROM contacts; 





--*****creating table for zip codes in contact table
Create Table zip_codes
(
   zip_code_id bigserial Constraint zip_code_id_key Primary Key,
	zip_code varchar(11)NOT NULL,
    city varchar(30)NOT NULL,	
    state_name varchar(50)NOT NULL,
    state_abbr varchar(2)NOT NULL

)

Insert INTO zip_codes 
(
	zip_code,
    city,	
    state_name,
    state_abbr
)
Values 
('36013-36191','Mongomery','Alabama','AL'),
('99703-99781','Fairbanks','Alaska','AK'),
('85641-85705','Tucson','Arizona','AR');
;
Select * FROM zip_codes;
-----------------------
DROP Table zip_codes;
-----------------------

--***Joining zip_codes and contact tables
Select * 
FROM contacts cont
Join zip_codes zip
On cont.zip_code_id = zip.zip_code_id;

---------------------

----***Creating professions table
Create table professions
(
 profession_id bigserial Primary key,
 profession varchar(30)NOT NULL
	
);

INSERT INTO professions(
  profession
)
-------
Values

('doctor'),
('teacher'),
('software developer'),
('student');
-------
Select * FROM professions;

-----****JOINING professions table with contact table
Select cont.last_name, cont.first_name, cont.gender, cont.status, prof.profession_id,prof.profession
FROM contacts cont
Join professions prof
On cont.profession_id = prof.profession_id;

-------

----***Creating status table
Create Table status
(
  status_id bigserial Primary key,
	re_status varchar(30)NOT NULL
	
);

-----------
Insert INTO status 
(
 re_status
)
Values
 ('single'),
('divorced');
-----------
Select * FROM status;
--------

----*****JOINING status table with contact table
Select cont.last_name, cont.first_name, cont.gender, sts.status_id, sts.re_status
From contacts cont
Join status sts
ON cont.status_id = sts.status_id;
















