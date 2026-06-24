DECLARE
    CURSOR c_customers IS
        SELECT CustomerID, Balance
        FROM Customers;

    v_customerID Customers.CustomerID%TYPE;
    v_balance    Customers.Balance%TYPE;
BEGIN
    OPEN c_customers;
    LOOP
        FETCH c_customers INTO v_customerID, v_balance;
        EXIT WHEN c_customers%NOTFOUND;

        IF v_balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = v_customerID;
        END IF;
    END LOOP;
    CLOSE c_customers;
    COMMIT;
END;
/
