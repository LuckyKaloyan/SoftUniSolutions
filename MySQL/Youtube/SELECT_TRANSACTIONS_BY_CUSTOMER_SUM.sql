SELECT SUM(amount), customer_id
FROM transactions
GROUP BY customer_id;