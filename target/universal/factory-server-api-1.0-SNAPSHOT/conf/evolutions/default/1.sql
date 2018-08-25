# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table piece (
  id                            bigint auto_increment not null,
  name                          varchar(255),
  weight                        integer,
  material                      varchar(255),
  prize                         integer,
  lifetime                      varchar(255),
  description                   varchar(255),
  def                           boolean default false not null,
  constraint pk_piece primary key (id)
);

create table piece_tag (
  piece_id                      bigint not null,
  tag_id                        bigint not null,
  constraint pk_piece_tag primary key (piece_id,tag_id)
);

create table tag (
  id                            bigint auto_increment not null,
  name                          varchar(255) not null,
  constraint pk_tag primary key (id)
);

alter table piece_tag add constraint fk_piece_tag_piece foreign key (piece_id) references piece (id) on delete restrict on update restrict;
create index ix_piece_tag_piece on piece_tag (piece_id);

alter table piece_tag add constraint fk_piece_tag_tag foreign key (tag_id) references tag (id) on delete restrict on update restrict;
create index ix_piece_tag_tag on piece_tag (tag_id);


# --- !Downs

alter table piece_tag drop constraint if exists fk_piece_tag_piece;
drop index if exists ix_piece_tag_piece;

alter table piece_tag drop constraint if exists fk_piece_tag_tag;
drop index if exists ix_piece_tag_tag;

drop table if exists piece;

drop table if exists piece_tag;

drop table if exists tag;

