DROP function ufn_calculate_future_value;
DROP PROCEDURE usp_calculate_future_value_for_account;

DELIMITER $$
CREATE FUNCTION ufn_calculate_future_value(sum DECIMAL(19,4),interest DOUBLE, years INT)
RETURNS DECIMAL(19,4)
DETERMINISTIC
BEGIN
 RETURN(sum*(POW(( 1+interest),years)));
END $$


CREATE PROCEDURE usp_calculate_future_value_for_account(account_id INT, interest_rate DECIMAL(19,4))
BEGIN
SELECT accounts.id,first_name,last_name, balance AS 'current_balance', ufn_calculate_future_value(balance,interest_rate,5) AS 'balance_in_5_years' 
FROM account_holders 
JOIN accounts ON accounts.account_holder_id = account_holders.id 
WHERE account_id = accounts.id;
END $$
DELIMITER ;


