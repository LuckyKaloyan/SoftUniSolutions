CREATE TRIGGER before_hourly_pay_update
BEFORE UPDATE ON employees
FOR EACH ROW 
SET NEW.salary = (NEW.hourly_pay*2080);