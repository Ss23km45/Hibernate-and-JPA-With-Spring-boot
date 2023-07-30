INSERT INTO PERSON (ID,NAME, LOCATION, BIRTH_DATE) VALUES (1, 'SATYANARAYANA CH', 'A VEMAVARAM', '1965-aug-26');
INSERT INTO PERSON (ID,NAME, LOCATION, BIRTH_DATE) VALUES (2, 'SATYAVATHI CH', 'A VEMAVARAM', '1975-jan-1');
INSERT INTO PERSON (ID,NAME, LOCATION, BIRTH_DATE) VALUES (3, 'MUKESH CH', 'A VEMAVARAM', '1995-sep-16');
INSERT INTO PERSON (ID,NAME, LOCATION, BIRTH_DATE) VALUES (4, 'KEDAR CH', 'A VEMAVARAM', '1999-aug-12');
INSERT INTO PERSON (ID,NAME, LOCATION, BIRTH_DATE) VALUES (5, 'PERSON CH', 'A VEMAVARAM', '1996-aug-13');
INSERT INTO PERSON (ID,NAME, LOCATION, BIRTH_DATE) VALUES (6, 'PERSON2 CH', 'A VEMAVARAM', '2000-sep-26');

--Course Values inserting
INSERT INTO Course (ID,courseName) VALUES (411, 'Core Java8');
INSERT INTO Course (ID,courseName) VALUES (21, 'Spring Framework');
INSERT INTO Course (ID,courseName) VALUES (31, 'Angular');
INSERT INTO Course (ID,courseName) VALUES (41, 'MySql');
INSERT INTO Course (ID,courseName) VALUES (51, 'Springboot');
INSERT INTO Course (ID,courseName) VALUES (61, 'JPA and Hibernate');

--Passport Values inserting
INSERT INTO Passport (ID,passportNumber) VALUES (11, 'ABHT283624');
INSERT INTO Passport (ID,passportNumber) VALUES (12, 'ABJK290643');
INSERT INTO Passport (ID,passportNumber) VALUES (13, 'ABHT283672');
INSERT INTO Passport (ID,passportNumber) VALUES (14, 'ABHT283693');
INSERT INTO Passport (ID,passportNumber) VALUES (15, 'ABHT283895');
INSERT INTO Passport (ID,passportNumber) VALUES (16, 'ABHT283546');

--Student Values inserting
INSERT INTO Student (ID,studentName,passport_id) VALUES (101, 'SATYANARAYANA CH',11);
INSERT INTO Student (ID,studentName,passport_id) VALUES (202, 'SATYAVATHI CH',12);
INSERT INTO Student (ID,studentName,passport_id) VALUES (303, 'MUKESH CH',13);
INSERT INTO Student (ID,studentName,passport_id) VALUES (404, 'KEDAR CH',14);
INSERT INTO Student (ID,studentName,passport_id) VALUES (505, 'PERSON CH',15);
INSERT INTO Student (ID,studentName,passport_id) VALUES (606, 'PERSON2 CH',16);

--Review Values inserting
INSERT INTO Review (ID,rating,review,course_id) VALUES (111, '5.0','learnt very good stuff from core java8',411);
INSERT INTO Review (ID,rating,review,course_id) VALUES (222, '4.5','learnt very good stuff from spring framework',21);
INSERT INTO Review (ID,rating,review,course_id) VALUES (333, '3.9','learnt very good stuff from angular',31);
INSERT INTO Review (ID,rating,review,course_id) VALUES (444, '4.2','learnt very good stuff from Mysql',41);
INSERT INTO Review (ID,rating,review,course_id) VALUES (555, '4.23','learnt very good stuff from springboot',51);
INSERT INTO Review (ID,rating,review,course_id) VALUES (666, '4.46','learnt very good stuff from JPA and hibernate',61);
