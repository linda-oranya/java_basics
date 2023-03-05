import java.util.Scanner;
public class NumberCalculator {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your 2 numbers: ");
        firstNumber = reader.nextInt();
        secondNumber = reader.nextInt();
        int result = firstNumber + secondNumber;
        String value = "The answer is: ";
        System.out.println(value + result);
    }
}
