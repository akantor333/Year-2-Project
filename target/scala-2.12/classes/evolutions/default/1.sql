# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table basket (
  id                            bigint auto_increment not null,
  user_username                 varchar(255),
  constraint uq_basket_user_username unique (user_username),
  constraint pk_basket primary key (id)
);

create table bio (
  id                            bigint auto_increment not null,
  text                          TEXT,
  constraint pk_bio primary key (id)
);

create table comment (
  id                            bigint auto_increment not null,
  text                          TEXT,
  user_username                 varchar(255),
  work_id                       bigint,
  constraint pk_comment primary key (id)
);

create table donation (
  id                            bigint auto_increment not null,
  donation_email                varchar(255),
  constraint pk_donation primary key (id)
);

create table genre (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  constraint pk_genre primary key (id)
);

create table genre_submitted_work (
  genre_id                      bigint not null,
  submitted_work_id             bigint not null,
  constraint pk_genre_submitted_work primary key (genre_id,submitted_work_id)
);

create table order_item (
  id                            bigint auto_increment not null,
  quantity                      integer not null,
  price                         double not null,
  order_id                      bigint,
  basket_id                     bigint,
  physworks_id                  bigint,
  constraint pk_order_item primary key (id)
);

create table phys_works (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  price                         float,
  author                        varchar(255),
  description                   varchar(255),
  stock                         integer not null,
  user_username                 varchar(255),
  constraint pk_phys_works primary key (id)
);

create table shop_order (
  id                            bigint auto_increment not null,
  order_date                    timestamp,
  user_username                 varchar(255),
  constraint pk_shop_order primary key (id)
);

create table submitted_work (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  rating                        bigint,
  text                          TEXT,
  type                          varchar(255),
  date                          timestamp,
  user_username                 varchar(255),
  constraint pk_submitted_work primary key (id)
);

create table work_upvoteuser (
  submitted_work_id             bigint not null,
  user_username                 varchar(255) not null,
  constraint pk_work_upvoteuser primary key (submitted_work_id,user_username)
);

create table work_downvoteuser (
  submitted_work_id             bigint not null,
  user_username                 varchar(255) not null,
  constraint pk_work_downvoteuser primary key (submitted_work_id,user_username)
);

create table user (
  username                      varchar(255) not null,
  role                          varchar(255),
  email                         varchar(255),
  name                          varchar(255),
  password                      varchar(255),
  birthday                      date,
  address                       varchar(255),
  donation_id                   bigint,
  bio_id                        bigint,
  constraint uq_user_donation_id unique (donation_id),
  constraint uq_user_bio_id unique (bio_id),
  constraint pk_user primary key (username)
);

alter table basket add constraint fk_basket_user_username foreign key (user_username) references user (username) on delete restrict on update restrict;

alter table comment add constraint fk_comment_user_username foreign key (user_username) references user (username) on delete restrict on update restrict;
create index ix_comment_user_username on comment (user_username);

alter table comment add constraint fk_comment_work_id foreign key (work_id) references submitted_work (id) on delete restrict on update restrict;
create index ix_comment_work_id on comment (work_id);

alter table genre_submitted_work add constraint fk_genre_submitted_work_genre foreign key (genre_id) references genre (id) on delete restrict on update restrict;
create index ix_genre_submitted_work_genre on genre_submitted_work (genre_id);

alter table genre_submitted_work add constraint fk_genre_submitted_work_submitted_work foreign key (submitted_work_id) references submitted_work (id) on delete restrict on update restrict;
create index ix_genre_submitted_work_submitted_work on genre_submitted_work (submitted_work_id);

alter table order_item add constraint fk_order_item_order_id foreign key (order_id) references shop_order (id) on delete restrict on update restrict;
create index ix_order_item_order_id on order_item (order_id);

alter table order_item add constraint fk_order_item_basket_id foreign key (basket_id) references basket (id) on delete restrict on update restrict;
create index ix_order_item_basket_id on order_item (basket_id);

alter table order_item add constraint fk_order_item_physworks_id foreign key (physworks_id) references phys_works (id) on delete restrict on update restrict;
create index ix_order_item_physworks_id on order_item (physworks_id);

alter table phys_works add constraint fk_phys_works_user_username foreign key (user_username) references user (username) on delete restrict on update restrict;
create index ix_phys_works_user_username on phys_works (user_username);

alter table shop_order add constraint fk_shop_order_user_username foreign key (user_username) references user (username) on delete restrict on update restrict;
create index ix_shop_order_user_username on shop_order (user_username);

alter table submitted_work add constraint fk_submitted_work_user_username foreign key (user_username) references user (username) on delete restrict on update restrict;
create index ix_submitted_work_user_username on submitted_work (user_username);

alter table work_upvoteuser add constraint fk_work_upvoteuser_submitted_work foreign key (submitted_work_id) references submitted_work (id) on delete restrict on update restrict;
create index ix_work_upvoteuser_submitted_work on work_upvoteuser (submitted_work_id);

alter table work_upvoteuser add constraint fk_work_upvoteuser_user foreign key (user_username) references user (username) on delete restrict on update restrict;
create index ix_work_upvoteuser_user on work_upvoteuser (user_username);

alter table work_downvoteuser add constraint fk_work_downvoteuser_submitted_work foreign key (submitted_work_id) references submitted_work (id) on delete restrict on update restrict;
create index ix_work_downvoteuser_submitted_work on work_downvoteuser (submitted_work_id);

alter table work_downvoteuser add constraint fk_work_downvoteuser_user foreign key (user_username) references user (username) on delete restrict on update restrict;
create index ix_work_downvoteuser_user on work_downvoteuser (user_username);

alter table user add constraint fk_user_donation_id foreign key (donation_id) references donation (id) on delete restrict on update restrict;

alter table user add constraint fk_user_bio_id foreign key (bio_id) references bio (id) on delete restrict on update restrict;


# --- !Downs

alter table basket drop constraint if exists fk_basket_user_username;

alter table comment drop constraint if exists fk_comment_user_username;
drop index if exists ix_comment_user_username;

alter table comment drop constraint if exists fk_comment_work_id;
drop index if exists ix_comment_work_id;

alter table genre_submitted_work drop constraint if exists fk_genre_submitted_work_genre;
drop index if exists ix_genre_submitted_work_genre;

alter table genre_submitted_work drop constraint if exists fk_genre_submitted_work_submitted_work;
drop index if exists ix_genre_submitted_work_submitted_work;

alter table order_item drop constraint if exists fk_order_item_order_id;
drop index if exists ix_order_item_order_id;

alter table order_item drop constraint if exists fk_order_item_basket_id;
drop index if exists ix_order_item_basket_id;

alter table order_item drop constraint if exists fk_order_item_physworks_id;
drop index if exists ix_order_item_physworks_id;

alter table phys_works drop constraint if exists fk_phys_works_user_username;
drop index if exists ix_phys_works_user_username;

alter table shop_order drop constraint if exists fk_shop_order_user_username;
drop index if exists ix_shop_order_user_username;

alter table submitted_work drop constraint if exists fk_submitted_work_user_username;
drop index if exists ix_submitted_work_user_username;

alter table work_upvoteuser drop constraint if exists fk_work_upvoteuser_submitted_work;
drop index if exists ix_work_upvoteuser_submitted_work;

alter table work_upvoteuser drop constraint if exists fk_work_upvoteuser_user;
drop index if exists ix_work_upvoteuser_user;

alter table work_downvoteuser drop constraint if exists fk_work_downvoteuser_submitted_work;
drop index if exists ix_work_downvoteuser_submitted_work;

alter table work_downvoteuser drop constraint if exists fk_work_downvoteuser_user;
drop index if exists ix_work_downvoteuser_user;

alter table user drop constraint if exists fk_user_donation_id;

alter table user drop constraint if exists fk_user_bio_id;

drop table if exists basket;

drop table if exists bio;

drop table if exists comment;

drop table if exists donation;

drop table if exists genre;

drop table if exists genre_submitted_work;

drop table if exists order_item;

drop table if exists phys_works;

drop table if exists shop_order;

drop table if exists submitted_work;

drop table if exists work_upvoteuser;

drop table if exists work_downvoteuser;

drop table if exists user;

