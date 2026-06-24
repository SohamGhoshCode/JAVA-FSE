DECLARE
    CURSOR ApplyAnnualFee IS
        SELECT AccountID, Balance
        FROM Accounts;

    v_accountID    Accounts.AccountID%TYPE;
    v_balance      Accounts.Balance%TYPE;
    v_annualFee    CONSTANT NUMBER := 50;
BEGIN
    OPEN ApplyAnnualFee;
    LOOP
        FETCH ApplyAnnualFee INTO v_accountID, v_balance;
        EXIT WHEN ApplyAnnualFee%NOTFOUND;

        UPDATE Accounts
        SET Balance = Balance - v_annualFee,
            LastModified = SYSDATE
        WHERE AccountID = v_accountID;
    END LOOP;
    CLOSE ApplyAnnualFee;
    COMMIT;
END;
/
