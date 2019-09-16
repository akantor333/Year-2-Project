# --- !Ups
delete from user;
insert into user (username,role,email,name, password,birthday,address) values ('admin', 'admin','dave@admin.com','Dave', 'Admin123','1990-01-01','Tomorrowland');
insert into user (username,role,email,name, password,birthday,address) values ('user', 'user','dave@admin.com','Dave', 'Admin123','1990-01-01','Tomorrowland');