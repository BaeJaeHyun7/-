create table student(
					 id number(38,0) constraint student_id_cs primary key
					 ,name varchar2(20) not null
					 ,kor number(3,0) default 0
					 ,eng number(3,0) default 0
					 ,mat number(3,0) default 0
					);
					
create sequence student_seq;