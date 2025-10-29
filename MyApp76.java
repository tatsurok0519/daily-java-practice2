public class MyApp76 {
  public static void main(String[] args) {
    int[] scores = {70, 90, 80};
    int[] scoresBackup = {70, 90, 80};
    scores[1] = 100;
    System.out.println(scores[1]);
    System.out.println(scoresBackup[1]);
  }
}