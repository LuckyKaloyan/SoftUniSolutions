ALTER TABLE users 
CHANGE COLUMN last_login_date last_login_time DATETIME DEFAULT NOW();