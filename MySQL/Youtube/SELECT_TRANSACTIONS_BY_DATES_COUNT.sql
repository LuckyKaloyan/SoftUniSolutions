SELECT COUNT(amount), transaction_date
FROM transactions
GROUP BY transaction_date;