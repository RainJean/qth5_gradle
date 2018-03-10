CREATE TABLE user
(id INT PRIMARY KEY AUTO_INCREMENT
,email VARCHAR(30)
,password VARCHAR(16)
,last_login_time TIMESTAMP
,login_count INT
);

CREATE TABLE log
(id INT PRIMARY KEY AUTO_INCREMENT
,login_time TIMESTAMP
,user_id INT
);

ALTER TABLE log ADD CONSTRAINT fk_user_id
FOREIGN KEY (user_id) REFERENCES user(id);

INSERT INTO user(email, password, last_login_time, login_count)
    VALUES('tom@google.com', '123456', null, 0);