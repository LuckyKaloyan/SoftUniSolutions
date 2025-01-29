DELIMITER $$
CREATE FUNCTION ufn_calculate_future_value(sum DECIMAL(19,4),interest DOUBLE, years INT)
RETURNS DECIMAL(19,4)
DETERMINISTIC
BEGIN
 RETURN(sum*(POW(( 1+interest),years)));
END $$