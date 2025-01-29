ALTER TABLE transactions
ADD CONSTRAINT adding_FK
FOREIGN KEY(customer_id) REFERENCES customers(customer_id);