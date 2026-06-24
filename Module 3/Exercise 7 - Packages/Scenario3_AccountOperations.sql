CREATE OR REPLACE PACKAGE AccountOperations AS
    PROCEDURE OpenAccount(p_accountID IN NUMBER, p_customerID IN NUMBER, p_accountType IN VARCHAR2, p_initialBalance IN NUMBER);
    PROCEDURE CloseAccount(p_accountID IN NUMBER);
    FUNCTION GetTotalBalance(p_customerID IN NUMBER) RETURN NUMBER;
END AccountOperations;
/

CREATE OR REPLACE PACKAGE BODY AccountOperations AS
    PROCEDURE OpenAccount(p_accountID IN NUMBER, p_customerID IN NUMBER, p_accountType IN VARCHAR2, p_initialBalance IN NUMBER) AS
    BEGIN
        INSERT INTO Accounts (AccountID, CustomerID, AccountType, Balance, LastModified)
        VALUES (p_accountID, p_customerID, p_accountType, p_initialBalance, SYSDATE);
        COMMIT;
    END OpenAccount;

    PROCEDURE CloseAccount(p_accountID IN NUMBER) AS
    BEGIN
        DELETE FROM Accounts WHERE AccountID = p_accountID;
        COMMIT;
    END CloseAccount;

    FUNCTION GetTotalBalance(p_customerID IN NUMBER) RETURN NUMBER AS
        v_totalBalance NUMBER;
    BEGIN
        SELECT SUM(Balance) INTO v_totalBalance FROM Accounts WHERE CustomerID = p_customerID;
        RETURN NVL(v_totalBalance, 0);
    END GetTotalBalance;
END AccountOperations;
/
