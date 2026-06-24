CREATE OR REPLACE PROCEDURE UpdateSalary(
    p_employeeID IN NUMBER,
    p_percentage IN NUMBER
) AS
    v_count NUMBER;
BEGIN
    SELECT COUNT(*) INTO v_count FROM Employees WHERE EmployeeID = p_employeeID;

    IF v_count = 0 THEN
        RAISE_APPLICATION_ERROR(-20002, 'Employee ID ' || p_employeeID || ' does not exist.');
    END IF;

    UPDATE Employees
    SET Salary = Salary + (Salary * p_percentage / 100)
    WHERE EmployeeID = p_employeeID;

    COMMIT;
EXCEPTION
    WHEN OTHERS THEN
        DBMS_OUTPUT.PUT_LINE('Error updating salary: ' || SQLERRM);
END;
/
