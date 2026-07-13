CREATE SCHEMA IF NOT EXISTS ormlearn;

USE ormlearn;

CREATE TABLE IF NOT EXISTS country (
    code VARCHAR(2) PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

INSERT INTO country (code, name) VALUES ('IN', 'India');
INSERT INTO country (code, name) VALUES ('US', 'United States');
INSERT INTO country (code, name) VALUES ('AU', 'Australia');
INSERT INTO country (code, name) VALUES ('GB', 'Great Britain');
INSERT INTO country (code, name) VALUES ('CN', 'China');
