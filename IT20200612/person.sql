--���� ���� ���̺�
create table person (
	num   number   primary key,
	name  varchar2(20) not null,
	age   number(3)
);

--���� ���� ���̺��� �Ϸù�ȣ�� ����� ������
create sequence person_seq;

insert into
		person(
		 		num
		 		,name
		 		,age
		
		)values(
				person_seq.nextval
				,����ڰ� �Է��� �̸�
				,����ڰ� �Է��� ����		
				);
		