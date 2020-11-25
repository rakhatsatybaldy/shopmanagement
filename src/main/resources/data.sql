INSERT INTO roles (role_id , role_description , role_name) VALUES (nextval('roles_role_id_seq') , 'DEFAULT ROLE FOR ADMIN' , 'ROLE_ADMIN');
INSERT INTO users (user_id , user_email , user_password , balance , user_address , blocked , user_full_name , city_city_id ) VALUES (nextval('users_user_id_seq') ,
'admin' ,
'$2a$10$nSeRhbMZnpTeueJrxY7sZeYnOkLcLAA.hbWKEmb8TUgrNj2qeqBJS' , 0  , null  , false  , 'Satybaldy Rakhat'  , null );


INSERT INTO users_roles (users_user_id , roles_role_id) VALUES (2 , 2);
-- password id "passwd"