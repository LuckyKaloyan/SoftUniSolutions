USE soft_uni;
DROP PROCEDURE usp_withdraw_money;
DELIMITER $$
CREATE PROCEDURE usp_withdraw_money(account_id INT, money_amount DECIMAL(19,4))
BEGIN
START TRANSACTION;
IF (SELECT balance FROM accounts WHERE accounts.id = account_id) - money_amount >= 0  AND (SELECT count(id) FROM accounts WHERE id=account_id)=1 
AND money_amount > 0 THEN
UPDATE accounts SET balance = balance - money_amount WHERE accounts.id = account_id;
COMMIT;
ELSE ROLLBACK; END IF;

END $$
DELIMITER ;
