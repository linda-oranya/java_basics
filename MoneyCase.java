import java.util.Scanner;

public class MoneyCase {
    public static void main(String[] args){
        System.out.println("Enter amount in account and requested amount");
        Scanner reader = new Scanner(System.in);
        int amount;
        int amountRequest;
        amount = reader.nextInt();
        amountRequest = reader.nextInt();
        switch (amount){
            case 50:
                System.out.println("Sorry, that's my threshold. can't lend you");
                break;
            case 60:
                if (amountRequest<=60 && amount>50){
                    System.out.println("Can only spare 10euros");
                }
                else
                    System.out.printf("sorry, no help");
                    break;
            case 100:
                int halfAmount = amountRequest/2;
                if (amountRequest<=100 && halfAmount <= 30){
                    System.out.println("Sure, I'd give all");
                }
                else if (amountRequest<=100 && halfAmount >30){
                    System.out.println("I can only spare 25euros");
                }
                else
                    System.out.println("let's do a quarter");
                    break;
            default:
                System.out.println("Can't lend you.");
        }
    }
}
