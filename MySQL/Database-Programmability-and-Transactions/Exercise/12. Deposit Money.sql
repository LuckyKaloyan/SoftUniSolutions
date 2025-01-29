USE soft_uni;
DELIMITER $$
CREATE PROCEDURE usp_deposit_money(account_id INT, money_amount DECIMAL(19,4))
BEGIN
START TRANSACTION;
IF money_amount > 0 THEN
UPDATE accounts SET balance = balance + money_amount WHERE accounts.id = account_id;
COMMIT;
ELSE ROLLBACK; END IF;

END $$

DELIMITER ;

CALL usp_deposit_money(1,10);
SELECT * FROM accounts WHERE id = 1;