ALTER TABLE transactions
MODIFY COLUMN transaction_id INT AUTO_INCREMENT;

ALTER TABLE transactions
AUTO_INCREMENT = 1000;

INSERT INTO transactions(amount,customer_id)
VALUES(3.00,1),(2.00,2),(4.00,1);

SELECT * FROM transactions;