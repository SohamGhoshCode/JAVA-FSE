public class Main {
    public static void main(String[] args) {
        double presentValue = 1000.00;
        double growthRate = 0.05;
        int periods = 10;

        double futureValue = FinancialForecast.calculateFutureValue(presentValue, growthRate, periods);
        System.out.println("Present Value: " + presentValue);
        System.out.println("Growth Rate: " + (growthRate * 100) + "%");
        System.out.println("Periods: " + periods);
        System.out.printf("Future Value: %.2f%n", futureValue);
    }
}
