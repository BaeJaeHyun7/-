--개인 정보 테이블
create table person (
	num   number   primary key,
	name  varchar2(20) not null,
	age   number(3)
);

--개인 정보 테이블의 일련번호에 사용할 시퀀스
create sequence person_seq;

insert into
		person(
		 		num
		 		,name
		 		,age
		
		)values(
				person_seq.nextval
				,사용자가 입력한 이름
				,사용자가 입력한 나이		
				);
		