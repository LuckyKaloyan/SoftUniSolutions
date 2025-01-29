DROP FUNCTION ufn_is_word_comprised;
DELIMITER $$
CREATE FUNCTION ufn_is_word_comprised (set_of_letters varchar(50), word varchar(50))
RETURNS TINYINT
DETERMINISTIC
BEGIN
RETURN IF(word REGEXP CONCAT('^[',set_of_letters,']+$'),1,0);
END$$
DELIMITER ;
