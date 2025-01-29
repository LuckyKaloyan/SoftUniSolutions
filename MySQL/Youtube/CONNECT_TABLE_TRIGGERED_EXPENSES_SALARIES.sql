UPDATE expenses
SET expense_total  = (SELECT SUM(salary) FROM employees)
WHERE expense_name = "salaries";
SELECT * FROM expenses;