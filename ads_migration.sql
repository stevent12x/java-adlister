USE adlister_db;

DROP table if exists ads ;
DROP table if exists users;

create table users (
    id int unsigned not null auto_increment,
    username varchar(100) not null,
    email varchar(100) not null,
    password varchar(100) not null,
    primary key (id)
);

create table ads (
    id int unsigned not null auto_increment,
    user_id int unsigned,
    title varchar(50) not null,
    description text not null,
    primary key (id),
    foreign key (user_id) references users (id)
);
