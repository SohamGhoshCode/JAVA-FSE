public class ProxyTest {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.png");

        System.out.println("First display request for image1:");
        image1.display();

        System.out.println("\nSecond display request for image1 (should be cached):");
        image1.display();

        System.out.println("\nFirst display request for image2:");
        image2.display();
    }
}
