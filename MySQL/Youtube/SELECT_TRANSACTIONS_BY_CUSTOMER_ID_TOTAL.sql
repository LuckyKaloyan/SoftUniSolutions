SELECT COUNT(transaction_id),customer_id
FROM transactions
GROUP BY customer_id
WITH ROLLUP ;