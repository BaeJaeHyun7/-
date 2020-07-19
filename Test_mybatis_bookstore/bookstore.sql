--[역량평가_Mybatis_서점]

--도서 정보 테이블
create table book (
	bnum		number	primary key,		--상품 번호
	title		varchar2(50)	not null,	--제목
	author		varchar2(50)	not null,	--저자
	publisher	varchar2(50)	not null,	--출판사
	price		number	default 0,			--가격
	inputdate	date	default sysdate		--정보 등록일
);

--도서 번호에 사용할 시퀀스
create sequence bookseq;



