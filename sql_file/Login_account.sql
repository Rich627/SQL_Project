use Project;

create table userid (username nvarchar(50) not null, password nvarchar(50) not null);

insert into userid(username , password) values('teacher_account', 'password');
insert into userid(username , password) values('project_account', 'helloworld');