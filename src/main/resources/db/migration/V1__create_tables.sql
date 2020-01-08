DROP DATABASE IF EXISTS trip;
DROP DATABASE IF EXISTS continents;
DROP DATABASE IF EXISTS user;

create table trip
(
    id                   bigint           not null auto_increment,
    title                varchar(500),
    description          varchar(5000),
    adult_price          double precision not null,
    adults_quantity      integer,
    child_price          double precision not null,
    children_quantity    integer,
    days_quantity        integer,
    end_date             date,
    is_promoted          integer          not null,
    start_date           date,
    type                 varchar(255),
    arrival_airport_id   bigint,
    arrival_city_id      bigint,
    departure_airport_id bigint,
    departure_city_id    bigint,
    hotel_id             bigint,
    created_on           datetime(6),
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

create table city
(
    id         bigint not null auto_increment,
    name       varchar(255),
    country_id bigint,
    primary key (id)
);
create table airport
(
    id      bigint not null auto_increment,
    name    varchar(255),
    city_id bigint,
    primary key (id)
);

create table continent
(
    id       bigint   not null auto_increment,
    name varchar(255) not null unique,
    primary key (id)
);

create table country
(
    id           bigint not null auto_increment,
    name         varchar(255),
    continent_id bigint,
    primary key (id)
);

create table hotel
(
    id          bigint not null auto_increment,
    description varchar(255),
    name        varchar(255),
    standard    varchar(255),
    city_id     bigint,
    primary key (id)
);

alter table trip
    add constraint arrival_airport_fk foreign key (arrival_airport_id) references airport (id);

alter table trip
    add constraint departure_airport_fk foreign key (departure_airport_id) references airport (id);

alter table trip
    add constraint arrival_city_fk foreign key (arrival_city_id) references city (id);

alter table trip
    add constraint departure_city_fk foreign key (departure_city_id) references city (id);

alter table trip
    add constraint hotel_fk foreign key (hotel_id) references hotel (id);

alter table city
    add constraint country_fk foreign key (country_id) references country (id);

alter table airport
    add constraint city_fk foreign key (city_id) references city (id);

alter table country
    add constraint continent_fk2 foreign key (continent_id) references continent (id);

alter table hotel
    add constraint city_fk2 foreign key (city_id) references city (id);