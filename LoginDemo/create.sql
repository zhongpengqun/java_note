CREATE TABLE words( 
id SERIAL PRIMARY KEY,
spell VARCHAR(200) NOT NULL UNIQUE,
pronunciation VARCHAR(200),
unit VARCHAR(1000),
meaning VARCHAR(500),
speak VARCHAR(200),
created_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


CREATE TABLE users (
id SERIAL PRIMARY KEY,
username  VARCHAR(200) NOT NULL UNIQUE,
password  VARCHAR(200) NOT NULL,
token  VARCHAR(200),
created_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);