DECLARE
    CURSOR GenerateMonthlyStatements IS
        SELECT t.TransactionID, t.AccountID, t.TransactionDate, t.Amount, t.TransactionType, c.Name
        FROM Transactions t
        JOIN Accounts a ON t.AccountID = a.AccountID
        JOIN Customers c ON a.CustomerID = c.CustomerID
        WHERE EXTRACT(MONTH FROM t.TransactionDate) = EXTRACT(MONTH FROM SYSDATE)
        AND EXTRACT(YEAR FROM t.TransactionDate) = EXTRACT(YEAR FROM SYSDATE);

    v_transactionID   Transactions.TransactionID%TYPE;
    v_accountID       Transactions.AccountID%TYPE;
    v_transactionDate Transactions.TransactionDate%TYPE;
    v_amount          Transactions.Amount%TYPE;
    v_transactionType Transactions.TransactionType%TYPE;
    v_name            Customers.Name%TYPE;
BEGIN
    OPEN GenerateMonthlyStatements;
    LOOP
        FETCH GenerateMonthlyStatements INTO v_transactionID, v_accountID, v_transactionDate, v_amount, v_transactionType, v_name;
        EXIT WHEN GenerateMonthlyStatements%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE('Customer: ' || v_name || ' | Account: ' || v_accountID || ' | Transaction ID: ' || v_transactionID || ' | Date: ' || TO_CHAR(v_transactionDate, 'DD-MON-YYYY') || ' | Type: ' || v_transactionType || ' | Amount: ' || v_amount);
    END LOOP;
    CLOSE GenerateMonthlyStatements;
END;
/
