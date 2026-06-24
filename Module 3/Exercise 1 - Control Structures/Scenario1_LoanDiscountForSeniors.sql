DECLARE
    CURSOR c_customers IS
        SELECT c.CustomerID, c.DOB, l.LoanID, l.InterestRate
        FROM Customers c
        JOIN Loans l ON c.CustomerID = l.CustomerID;

    v_customerID   Customers.CustomerID%TYPE;
    v_dob          Customers.DOB%TYPE;
    v_loanID       Loans.LoanID%TYPE;
    v_interestRate Loans.InterestRate%TYPE;
    v_age          NUMBER;
BEGIN
    OPEN c_customers;
    LOOP
        FETCH c_customers INTO v_customerID, v_dob, v_loanID, v_interestRate;
        EXIT WHEN c_customers%NOTFOUND;

        v_age := TRUNC(MONTHS_BETWEEN(SYSDATE, v_dob) / 12);

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = v_loanID;
        END IF;
    END LOOP;
    CLOSE c_customers;
    COMMIT;
END;
/
