create table person (
	num		number		primary key,		--�Ϸù�ȣ
	name	varchar2(20) not null,			--�̸�
	age		number(3)						--����
);

create sequence person_seq;

insert into person(
					num
					,name
					,age
				)values(
						person_seq.nextval
				        ,name
				        ,age
						);