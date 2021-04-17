SELECT * FROM works.jusorok;

insert into works.jusorok values ('홍길동',25,'1999-5-10',default,'부산','학생');
insert into works.jusorok values ('이기자',25,'1999-5-10',default,'부산','학생');
insert into works.jusorok values ('김말숙',30,'1970-12-11','여자','인천','회사원');
insert into works.jusorok values ('김말자',33,'1988-10-28','여자','서울','공무원');
insert into works.jusorok values ('김승리',29,'1969-05-13','남자','제주','학생');
insert into works.jusorok values ('이기수',28,'1990-02-22','남자','강원','군인');
insert into works.jusorok values ('홍길남',23,'2000-11-11','남자','청주','의사');
insert into works.jusorok values ('강감찬',34,'1990-12-20','남자','청주','학생');
insert into works.jusorok values ('이순신',55,'1940-12-19','남자','강원','회사원');
insert into works.jusorok values ('홍수진',22,'1940-12-19','남자','강원','회사원');

--  이곳은 주석입니다.

/* delete from works.jusorok; */

select * from works.jusorok;

-- 남자만 보여주시오.
select * from works.jusorok where gender='남자';

-- 나이가 30살 이상만 보여주시오.
select * from works.jusorok where age >= 30;

-- 서울 지역만 보여주시오
select * from works.jusorok where address = '서울';

-- 남자이면서 30살 이상인 사람을 보여주시오?
select * from works.jusorok where gender='남자' and age >= 30;

-- jusorok테이블의 '이름/나이/주소'필드를 '오늘도/29/서울'을 추가하시오.
insert into works.jusorok (name,age,address) values ('오늘도',29,'서울');

-- 성별이 '여자'중에서 content가 '학생'인 자료를 보여주시오.
select * from works.jusorok where gender='여자' and content='회사원';

-- 필드명 'content'필드를 'job'으로 변경하시오.
alter table works.jusorok change content job varchar(15);
-- alter table works.jusorok modify job varchar(15) after content;

-- jusorok테이블에 pay필드(int)를 '추가'하시오.
alter table works.jusorok add column pay int;

-- 'jusorok'테이블을 'juso'테이블명으로 변경하시오.
alter table works.jusorok rename juso;

-- 'jusorok'테이블에 'mbc'필드를 추가(varchar(50) not null)
alter table works.jusorok add mbc varchar(50) not null;

-- 'jusorok'테이블에 'mbc'필드를 삭제하시오.
alter table works.jusorok drop column mbc;

-- 데이터베이스에 저장된 모든 테이블을 보여주시오.
show tables;

-- jusorok테이블의 구조를 보여주시오
desc works.jusorok;

select * from works.jusorok;

-- 자료의 수정 : update 테이블명 set 필드명=수정할내용..... where 조건절....;

-- '홍길동'의 나이를 33살로 수정하시오.
update works.jusorok set age=33 where name='홍길동';

-- '홍길동'자료만 검색하시오.
select * from works.jusorok where name='홍길동';

-- 모든 자료들의 나이를 1살씩 더해주시오.
update works.jusorok set age = age + 1;

-- 모든 자료의 기본 pay필드를 1000000 으로 변경하시오.
update works.jusorok set pay = 1000000;

-- '여자'자료에 대하여 pay를 200000원 추가 지급하시오.

update works.jusorok set pay = 200000 where gender='여자';

-- '제주'와 '부산' 거주자는 pay를 100000 추가 지급하시오.

update jusorok set pay = pay+100000 where address = '제주' or '부산';

-- '서울'지역 거주자를 보여주시오?
select * from works.jusorok where address = '서울';

-- '서울'지역 거주자중에서 남자를 삭제하시오?
delete from works.jusorok where address='서울' and gender='남자';

select * from works.jusorok;

-- 모든 자료를 이름순으로 정렬하여 출력하시오
select * from works.jusorok order by name;

-- 모든 자료를 나이 내림차순으로 정렬하여 출력하시오
select * from works.jusorok order by age desc;

-- 성별순으로 내림차순 정렬하되, 같은성별은 나이 오름차순 정렬하시오.
select * from jusorok order by gender desc;
select * from jusorok order by gender desc, age;

-- 나이가 30~30까지(포함)인 자료를 모두 보여주시오.alter
select * from jusorok where age>=30 and age<=40;
-- between ~ and : 지정된 범위의 자료를 처리(앞뒤숫자 포함).
select * from jusorok where age between 30 and 40;

-- '회사원'과 '학생' 자료를 보여주시오.
select * from jusorok where job = '회사원' or job = '학생';

-- in() : 포함 연산자
select * from jusorok where job in('회사원','학생');

-- % : 포함연산자(복수개 와일드카드)
-- job필드에 '사원'으로 끝나는 단어를 모두 보여주시오.
select * from jusorok where job like '%사원';

-- '김'씨성을 가진 모든 사람을 보여주시오.
select * from jusorok where name like '김%';

-- 이름중에서 '말'이라는 글자가 들어가있으면 모두 보여주시오.
select * from jusorok where name like '%말%';

-- 이름중에서 '수'이라는 글자가 들어있으면 모두 보여주시오.
select * from jusorok where name like '%수%';

-- like _  : 포함연산자(단수개 와일드카드)
-- 이름중에서 2번째글자가 '수'인 사람들을 보여주시오.
select * from jusorok where name like '_수%';


-- 한계치를 적용 : limit
-- 주소록의 자료를 5건만 보여주시오.
select *from jusorok limit 5;

-- 주소록의 자료를 3번째 자료부터 5건만 보여주시오.
select * from jusorok limit 2,5;



select* from jusorok;

