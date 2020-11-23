INSERT INTO role_table (id , name) VALUES (1 , 'ROLE_ADMIN');
INSERT INTO user_table (id , login , password , role_id) VALUES (1 , 'admin' , '$2a$10$nSeRhbMZnpTeueJrxY7sZeYnOkLcLAA.hbWKEmb8TUgrNj2qeqBJS' , 1);


INSERT INTO role_table (id , name) VALUES (2 , 'ROLE_USER');
INSERT INTO user_table (id , login , password , role_id) VALUES (2 , 'simpleuser' , '$2a$10$nSeRhbMZnpTeueJrxY7sZeYnOkLcLAA.hbWKEmb8TUgrNj2qeqBJS' , 2);

-- password id "passwd"