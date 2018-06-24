import java.util.Scanner;

public class DisplayThePentagonalNumber {
    public static void main(String[] args) {
        int n;
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n: ");
        n = scanner.nextInt();
        
        number = getPentagonalNumber(n);
        System.out.println("The Pentagonal Number is: " + number);
    }

   public static int getPentagonalNumber(int n) {
       int number;

       number = n * (3 * n - 1) / 2;
       return number;
   }
}
