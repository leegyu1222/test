create table members_test
(
	userid varchar2(16),
	userpw varchar2(16) not null,
	name varchar2(20) not null,
	mobile varchar2(13) not null,
	email varchar2(30) not null,
	entry_date varchar2(10),
	grade varchar2(1),
	mileage number(6)
)

alter table members_test
add constraint pk_member_userid primary key (userid);

## 초기 데이터
insert into members_test values ('user01', '1234', '이동규', '010-3036-2355', 'lee@naver.com', '2015/10/07', 'A', 0);
commit;