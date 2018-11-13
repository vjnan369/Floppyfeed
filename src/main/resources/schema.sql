drop table if exists user;



# create user table

CREATE TABLE user (id int(6) unsigned AUTO_INCREMENT primary key,
    first_name VARCHAR(100) not null,
    last_name VARCHAR(100) not null,
    phone_number VARCHAR(15) not null,
    created_at TIMESTAMP not null DEFAULT NOW(),
    updated_at TIMESTAMP not null DEFAULT NOW() ON UPDATE NOW());


# create mediaType table

create table media_type (id int(6) unsigned auto_increment primary key,
  name varchar(30) not null,
  description varchar(200),
  created_at timestamp not null default now(),
  updated_at timestamp not null default now() on update now()
);



# create content table

Create TABLE content(id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(500) NOT NULL,
    type VARCHAR(100) NOT NULL,
    status VARCHAR(100) NOT NULL,
    description VARCHAR(5000),
    user_id INT(6) unsigned,
    media_type_id INT(6) unsigned,
    created_at TIMESTAMP NOT NULL DEFAULT NOW(),
    updated_at TIMESTAMP NOT NULL DEFAULT NOW() ON UPDATE now(),
    published_at TIMESTAMP,
    FOREIGN KEY (user_id) REFERENCES User(id),
    FOREIGN KEY (mediaT_type_id) REFERENCES Media_type(id));


#create table user_authentication table

create table user_authentication(
  id int(6) unsigned auto_increment primary key,
  user_id int(6) unsigned,
  email varchar(100) not null,
  password varchar(100) not null,
  confirmation_token varchar(200),
  confirmed_at timestamp,
  created_at timestamp not null default now(),
  updated_at timestamp not null default now() on update now(),
  foreign key (user_id) references user(id)
)


#create table user_role table

create table user_role(
    id int(6) unsigned auto_increment primary key,
    user_id int(6) unsigned,
    name varchar(100) not null,
    description varchar(500) not null,
    created_at timestamp not null default now(),
    updated_at timestamp not null default now() on update now(),
    foreign key (user_id) references user(id)
);



