-- CREATE DATABASE card_db_nexos;
USE card_db_nexos;

CREATE TABLE customer (
    id INT AUTO_INCREMENT PRIMARY KEY,
    firstname VARCHAR(50) NOT NULL,
    lastname VARCHAR(50) NOT NULL
);

CREATE TABLE card (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT NOT NULL,
    card_number VARCHAR(20) UNIQUE NOT NULL,
    owner_id INT NOT NULL,
    expiration_date DATE NOT NULL,
    card_type ENUM('Credit', 'Debit') NOT NULL,
    currency VARCHAR(3) NOT NULL DEFAULT 'USD',
    card_balance DECIMAL(15,2) NOT NULL DEFAULT 0.00,
    FOREIGN KEY (owner_id) REFERENCES customer(id) ON DELETE CASCADE
);
