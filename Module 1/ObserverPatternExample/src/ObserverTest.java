public class ObserverTest {
    public static void main(String[] args) {
        StockMarket googleStock = new StockMarket("GOOGL", 175.50);

        Observer mobileApp = new MobileApp("Google Finance Mobile App");
        Observer webApp = new WebApp("Google Finance Web Dashboard");

        googleStock.registerObserver(mobileApp);
        googleStock.registerObserver(webApp);

        System.out.println("Updating stock price to $180.00:");
        googleStock.setPrice(180.00);

        System.out.println("\nDeregistering web app observer and updating stock price to $182.50:");
        googleStock.deregisterObserver(webApp);
        googleStock.setPrice(182.50);
    }
}
