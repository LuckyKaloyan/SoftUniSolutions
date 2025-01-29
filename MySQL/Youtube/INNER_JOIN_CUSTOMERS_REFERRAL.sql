SELECT a.first_name, a.last_name, a.customer_id, a.amount, a.referral_id, CONCAT(b.first_name, " ",b.last_name) AS "referred_by"
FROM customers AS a
INNER JOIN customers AS b
ON a.referral_id = b.customer_id;