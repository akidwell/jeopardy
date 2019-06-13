-- create and select the database
DROP DATABASE IF EXISTS jeopardy;
CREATE DATABASE jeopardy;
USE jeopardy;

-- create the Player table
CREATE TABLE Player (
	ID			INT            PRIMARY KEY  AUTO_INCREMENT,
	PlayerName  VARCHAR(50)    NOT NULL     UNIQUE,
	Score		int
);

-- create Game table
CREATE TABLE Game (
  ID			INT				PRIMARY KEY  AUTO_INCREMENT,
  Round			VARCHAR(255)	NOT NULL,
  Category		VARCHAR(255)	NOT NULL,
  Value			Int,
  Question		VARCHAR(999)	NOT NULL,
  Answer		VARCHAR(999)	NOT NULL
);

-- insert some rows into the Product table
INSERT INTO Player VALUES
(1, 'Amber', '0');

INSERT INTO Game VALUES
(1, 'Jeopardy', 'History', '200', 'This is a test question', 'test');


-- create a user and grant privileges to that usergame
CREATE USER if not exists jeopardy_user@localhost IDENTIFIED BY 'sesame';
GRANT SELECT, INSERT, DELETE, UPDATE ON jeopardy.* TO jeopardy_user@localhost;
