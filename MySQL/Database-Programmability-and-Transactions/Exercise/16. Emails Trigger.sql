DROP TABLE notification_emails;
DROP TRIGGER notification_email_trig;

CREATE TABLE notification_emails(
id INT AUTO_INCREMENT PRIMARY KEY,
recipient INT NOT NULL, 
subject TEXT, 
body TEXT);

CREATE TRIGGER notification_email_trig
BEFORE UPDATE ON accounts
FOR EACH ROW
INSERT INTO notification_emails(recipient, subject, body)
VALUES(NEW.id, 
CONCAT('Balance change for account: ',NEW.id), 
CONCAT('On ',DATE_FORMAT(CURDATE(), '%b %d %Y'),' at ',DATE_FORMAT(NOW(), '%r'),' your balance was changed from ',OLD.balance,' to ',NEW.balance,'.'));