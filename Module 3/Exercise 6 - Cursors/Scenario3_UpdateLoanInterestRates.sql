DECLARE
    CURSOR UpdateLoanInterestRates IS
        SELECT LoanID, InterestRate
        FROM Loans;

    v_loanID       Loans.LoanID%TYPE;
    v_interestRate Loans.InterestRate%TYPE;
BEGIN
    OPEN UpdateLoanInterestRates;
    LOOP
        FETCH UpdateLoanInterestRates INTO v_loanID, v_interestRate;
        EXIT WHEN UpdateLoanInterestRates%NOTFOUND;

        UPDATE Loans
        SET InterestRate = v_interestRate + 0.5
        WHERE LoanID = v_loanID;
    END LOOP;
    CLOSE UpdateLoanInterestRates;
    COMMIT;
END;
/
