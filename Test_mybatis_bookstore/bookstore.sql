--[������_Mybatis_����]

--���� ���� ���̺�
create table book (
	bnum		number	primary key,		--��ǰ ��ȣ
	title		varchar2(50)	not null,	--����
	author		varchar2(50)	not null,	--����
	publisher	varchar2(50)	not null,	--���ǻ�
	price		number	default 0,			--����
	inputdate	date	default sysdate		--���� �����
);

--���� ��ȣ�� ����� ������
create sequence bookseq;



