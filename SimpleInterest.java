package javapractice; 
import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest per annum (R): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time in years (T): ");
        double time = scanner.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;
        
        System.out.printf("The simple interest is: %.2f\n", simpleInterest);
        scanner.close();
    }
}
