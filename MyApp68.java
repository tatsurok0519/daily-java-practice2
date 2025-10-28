public class MyApp68 {
  public static void main(String[] args) {
    int price = 150;
    final double RATE = 1.1;
    System.out.println(price * 120 * RATE);
    System.out.println(price * 130 * RATE);
    System.out.println(price * 140 * RATE);

    price++;
    // RATE = 0.8;
    System.out.println(price * 120 * RATE);
    System.out.println(price * 130 * RATE);
    System.out.println(price * 140 * RATE);
  }
}