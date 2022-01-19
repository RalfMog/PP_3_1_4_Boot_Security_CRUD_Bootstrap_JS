INSERT INTO my_jdbc.users (department, user_name, password, salary, surname)
VALUES ('IT', 'John', '$2a$10$0gndzNo90oSw52Y.S4b.xeAjTEVhY2bZbTnDq9GrglWtQr2zh3AeC', 4500, 'Davis');

INSERT INTO my_jdbc.users (department, user_name, password, salary, surname)
VALUES ('HR', 'Fred', '$2a$10$Ulb/2zulwgJ81aRZdVNf4ejRHtiOLvVNkCT5ywxHtbPs/4hooX6Hi', 2000, 'Miller');

INSERT INTO my_jdbc.users (department, user_name, password, salary, surname)
VALUES ('Sales', 'Samuel', '$2a$10$543D8qBDAQXD1CM3Ccd2MeBU0XCJkLk2w8uVCK.xGqtT6WY8PTzxe', 3000,
        'Walker');

INSERT INTO my_jdbc.users (department, user_name, password, salary, surname)
VALUES ('Accounting department', 'Harry',
        '$2a$10$CgOYaM2HKEpwE4pNem2l3ux4yZKezEw/YTsP/Ljf5tmhLdUglkplS', 1600, 'Jackson');


INSERT INTO my_jdbc.roles (id, name)
VALUES (1, 'ROLE_ADMIN');

INSERT INTO my_jdbc.roles (id, name)
VALUES (2, 'ROLE_USER');

INSERT INTO my_jdbc.users_roles (users_id, roles_id)
VALUES (1, 1);

INSERT INTO my_jdbc.users_roles (users_id, roles_id)
VALUES (2, 1);

INSERT INTO my_jdbc.users_roles (users_id, roles_id)
VALUES (3, 2);

INSERT INTO my_jdbc.users_roles (users_id, roles_id)
VALUES (4, 2);
