CREATE SCHEMA `fitnessTracker`;

CREATE TABLE users(username VARCHAR(50) NOT NULL PRIMARY KEY,
    password VARCHAR(50) NOT NULL,
    enabled BOOLEAN NOT NULL);

CREATE TABLE authorities (
  username VARCHAR(50) NOT NULL,
  authority VARCHAR(50) NOT NULL,
  CONSTRAINT fk_authority_users
  FOREIGN KEY(username) REFERENCES users(username));
CREATE UNIQUE INDEX ix_auth_username ON
  authorities (username, authority);

INSERT INTO users (username, password, enabled) VALUES
  ("jesus", "secret", true);

INSERT INTO authorities(username, authority) VALUES
  ("jesus", "ROLE_USER");

INSERT INTO users (username, password, enabled) VALUES
  ("alex", "secret", true);

INSERT INTO authorities(username, authority) VALUES
  ("alex", "ROLE_ADMIN");

UPDATE users SET password = "5ebe2294ecd0e0f08eab7690d2a6ee69"
WHERE username = "jesus";

ALTER TABLE users MODIFY password VARCHAR(60);

UPDATE users SET password = "$2a$10$oqlpBvZjWuMghaTM87V56OcmajUFl9NKe6iedr97RoXwcE/HP9PM2"
WHERE username = "jesus";

INSERT INTO users (username, password, enabled) VALUES ("mark", "$2a$10$oqlpBvZjWuMghaTM87V56OcmajUFl9NKe6iedr97RoXwcE/HP9PM2", 1);

INSERT INTO authorities (username, authority) VALUES ("mark", "ROLE_BAD");

UPDATE users SET password = "$2a$10$oqlpBvZjWuMghaTM87V56OcmajUFl9NKe6iedr97RoXwcE/HP9PM2"
WHERE username = "alex";

CREATE TABLE permissions (
  username   VARCHAR(50) NOT NULL,
  target     VARCHAR(50) NOT NULL,
  permission VARCHAR(50) NOT NULL,
  CONSTRAINT fk_permissions_users FOREIGN KEY (username) REFERENCES users (username)
);

CREATE UNIQUE INDEX ix_perm_username on permissions (username, target, permission);

INSERT INTO permissions(username, target, permission)
  VALUES("alex", "com.pluralsight.model.Goal", "createGoal");

DELETE FROM permissions WHERE username = "alex";