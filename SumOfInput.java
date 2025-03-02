import java.util.Scanner;

public class SumOfInput {
   public static void main (String[] args) {
     Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a number: ");
     int n = scanner.nextInt();
     
    int sumNumbers(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum = sum + 1;
    }
    return sum;
}
}  

}

