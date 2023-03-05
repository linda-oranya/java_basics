import java.util.Date;
public class Main {
    public static void main(String[] args) {
        double cash = 25.50;
        double chips = 10;
        if (cash >= 25 || chips <= 5){
            System.out.println("consider buying");
        }
        else
            System.out.printf("cash not sufficient for chips of %s", chips);
    }
}