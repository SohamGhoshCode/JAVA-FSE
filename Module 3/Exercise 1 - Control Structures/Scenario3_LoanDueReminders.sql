DECLARE
    CURSOR c_loans IS
        SELECT l.LoanID, l.EndDate, c.Name
        FROM Loans l
        JOIN Customers c ON l.CustomerID = c.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30;

    v_loanID  Loans.LoanID%TYPE;
    v_endDate Loans.EndDate%TYPE;
    v_name    Customers.Name%TYPE;
BEGIN
    OPEN c_loans;
    LOOP
        FETCH c_loans INTO v_loanID, v_endDate, v_name;
        EXIT WHEN c_loans%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || v_name || ', your loan (ID: ' || v_loanID || ') is due on ' || TO_CHAR(v_endDate, 'DD-MON-YYYY') || '. Please make the payment on time.');
    END LOOP;
    CLOSE c_loans;
END;
/
