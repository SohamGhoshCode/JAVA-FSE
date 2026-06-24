CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_loanAmount    IN NUMBER,
    p_interestRate  IN NUMBER,
    p_durationYears IN NUMBER
) RETURN NUMBER AS
    v_monthlyRate   NUMBER;
    v_months        NUMBER;
    v_installment   NUMBER;
BEGIN
    v_monthlyRate := p_interestRate / (12 * 100);
    v_months := p_durationYears * 12;
    v_installment := p_loanAmount * v_monthlyRate * POWER(1 + v_monthlyRate, v_months) / (POWER(1 + v_monthlyRate, v_months) - 1);
    RETURN ROUND(v_installment, 2);
END;
/
