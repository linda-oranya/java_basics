import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args){
        System.out.println("What is your string? ");
        Scanner reader = new Scanner(System.in);
        String myString = reader.next();
        System.out.print("The length of your string is: " + myString.length());
    }
}
