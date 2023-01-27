select * from help;
create user personal identified by 123;
grant connect,resource,dba to personal;
------------------------------------------------------------

create table code_skill (
  skill_code number(3),
  skill_name varchar2(20) not null unique,
  primary key(skill_code)
);

create table code_religion (
  religion_code number(3),
  religion_name varchar2(20) not null unique,
  primary key(religion_code)
);

create table code_school (
  school_code number(3),
  school_name varchar2(20) not null unique,
  primary key(school_code)
);

create table developer (
  developer_no number(3),
  developer_name varchar2(14) not null,
  jumin_no char(14) not null unique,
  school_code number(3) not null,
  religion_code number(3) not null,
  graduate_day char(10) not null,
  foreign key(religion_code) references code_religion(religion_code),
  foreign key(school_code) references code_school(school_code),
  primary key(developer_no)
);
create sequence developer_seq start with 1 increment by 1;

create table developer_skill (
  developer_skill_no number(3),
  developer_no number(3) not null,
  skill_code number(3) not null,
  primary key(developer_skill_no),
  foreign key(developer_no) references developer(developer_no),
  foreign key(skill_code) references code_skill(skill_code)
);

insert into code_skill(skill_code,skill_name) values( (select nvl(max(skill_code),0)+1 from code_skill), 'Java' );
insert into code_skill(skill_code,skill_name) values( (select nvl(max(skill_code),0)+1 from code_skill), 'JSP' );
insert into code_skill(skill_code,skill_name) values( (select nvl(max(skill_code),0)+1 from code_skill), 'ASP' );
insert into code_skill(skill_code,skill_name) values( (select nvl(max(skill_code),0)+1 from code_skill), 'PHP' );
insert into code_skill(skill_code,skill_name) values( (select nvl(max(skill_code),0)+1 from code_skill), 'Delphi' );
insert into code_religion(religion_code,religion_name) values( (select nvl(max(religion_code),0)+1 from code_religion), '기독교' );
insert into code_religion(religion_code,religion_name) values( (select nvl(max(religion_code),0)+1 from code_religion), '천주교' );
insert into code_religion(religion_code,religion_name) values( (select nvl(max(religion_code),0)+1 from code_religion), '불교' );
insert into code_religion(religion_code,religion_name) values( (select nvl(max(religion_code),0)+1 from code_religion), '이슬람' );
insert into code_religion(religion_code,religion_name) values( (select nvl(max(religion_code),0)+1 from code_religion), '무교' );
insert into code_school(school_code,school_name) values( (select nvl(max(school_code),0)+1 from code_school), '고졸' );
insert into code_school(school_code,school_name) values( (select nvl(max(school_code),0)+1 from code_school), '전문대졸' );
insert into code_school(school_code,school_name) values( (select nvl(max(school_code),0)+1 from code_school), '일반대졸' );