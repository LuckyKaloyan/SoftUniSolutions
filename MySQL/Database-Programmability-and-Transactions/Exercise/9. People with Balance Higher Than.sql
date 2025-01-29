DELIMITER $$
CREATE PROCEDURE usp_get_holders_with_balance_higher_than(treshhold DECIMAL(19,4))
BEGIN
SELECT first_name,last_name FROM account_holders JOIN accounts ON accounts.account_holder_id = account_holders.id 
GROUP BY account_holders.id HAVING SUM(balance) > treshhold  ORDER  BY account_holders.id;
END $$