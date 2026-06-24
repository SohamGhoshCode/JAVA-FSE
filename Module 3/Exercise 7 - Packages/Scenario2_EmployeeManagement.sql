CREATE OR REPLACE PACKAGE EmployeeManagement AS
    PROCEDURE HireEmployee(p_employeeID IN NUMBER, p_name IN VARCHAR2, p_position IN VARCHAR2, p_salary IN NUMBER, p_department IN VARCHAR2, p_hireDate IN DATE);
    PROCEDURE UpdateEmployeeDetails(p_employeeID IN NUMBER, p_position IN VARCHAR2, p_salary IN NUMBER, p_department IN VARCHAR2);
    FUNCTION CalculateAnnualSalary(p_employeeID IN NUMBER) RETURN NUMBER;
END EmployeeManagement;
/

CREATE OR REPLACE PACKAGE BODY EmployeeManagement AS
    PROCEDURE HireEmployee(p_employeeID IN NUMBER, p_name IN VARCHAR2, p_position IN VARCHAR2, p_salary IN NUMBER, p_department IN VARCHAR2, p_hireDate IN DATE) AS
    BEGIN
        INSERT INTO Employees (EmployeeID, Name, Position, Salary, Department, HireDate)
        VALUES (p_employeeID, p_name, p_position, p_salary, p_department, p_hireDate);
        COMMIT;
    END HireEmployee;

    PROCEDURE UpdateEmployeeDetails(p_employeeID IN NUMBER, p_position IN VARCHAR2, p_salary IN NUMBER, p_department IN VARCHAR2) AS
    BEGIN
        UPDATE Employees
        SET Position = p_position, Salary = p_salary, Department = p_department
        WHERE EmployeeID = p_employeeID;
        COMMIT;
    END UpdateEmployeeDetails;

    FUNCTION CalculateAnnualSalary(p_employeeID IN NUMBER) RETURN NUMBER AS
        v_salary NUMBER;
    BEGIN
        SELECT Salary * 12 INTO v_salary FROM Employees WHERE EmployeeID = p_employeeID;
        RETURN v_salary;
    END CalculateAnnualSalary;
END EmployeeManagement;
/
