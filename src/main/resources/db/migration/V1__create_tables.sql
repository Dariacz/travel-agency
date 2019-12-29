
create table trip
(
    id         bigint        not null auto_increment,
    description    varchar(5000) not null,
    created_on datetime(6),
    title      varchar(500)  not null,
    user_id    bigint        not null,
    continent_id bigint     not null,
    primary key (id)
);

create table user
(
    id       bigint       not null auto_increment,
    active   bit          not null,
    email    varchar(255) not null unique ,
    name     varchar(255) not null unique,
    password varchar(255) not null,
    role     varchar(255) not null,
    primary key (id)
);

create table continents
(
    id       bigint          not null auto_increment,
    continent varchar(255) not null unique,
    primary key (id)
);

alter table trip
    add constraint trip_user_fk foreign key (user_id) references user (id);

alter table trip
    add constraint trip_continent_fk foreign key (continent_id) references continents (id);

