create table person (
	num		number		primary key,		--일련번호
	name	varchar2(20) not null,			--이름
	age		number(3)						--나이
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