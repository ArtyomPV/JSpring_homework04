CREATE TABLE tasks(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    status ENUM('NEW', 'PROGRESS', 'DONE', 'FAULED') NOT NULL,
    publication_date date
);