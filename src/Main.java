import java.util.Scanner;

public class Main {
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);
         int totWidth = 0;
         int personHeightMeters;
         int numPeople = scanner.nextInt();
         int fenceHeight = scanner.nextInt();

         for (int j = 0; j < numPeople ; j++) {
             personHeightMeters = scanner.nextInt();
             totWidth += (fenceHeight<=personHeightMeters)?1:2;
         }
         System.out.println(totWidth);
         scanner.close();
     }
}