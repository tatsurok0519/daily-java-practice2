import java.util.Scanner;

public class MyApp92 {
  public static void main(String[] args) {
    String password;
    do {
      password = new Scanner(System.in).next();
    } while (password.equals("aaabbbccc") == false);
    System.out.println("OK!");
  }
}