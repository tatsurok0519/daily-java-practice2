import java.util.Scanner;

public class MyApp85 {
  public static void main(String[] args) {
    System.out.print("Signal? ");
    String signal = new Scanner(System.in).next();
    if (signal.equals("red") == true) {
      System.out.println("Stop");
    } else {
      System.out.println("Not red");
    }
  }
}