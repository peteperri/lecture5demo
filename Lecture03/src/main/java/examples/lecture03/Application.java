package examples.lecture03;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if (number % 2 == 0)
        {
            System.out.print("Number is even");
        }
        else
        {
            System.out.print("Number is odd");
        }

    }
}
