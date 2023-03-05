public class SwitchCase {
    public static void main(String[] args){
        int day = 31;
        switch (day){
            case 0:
                System.out.println("Not valid");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.printf("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday!!! Rest soon");
                break;
            case 6:
                System.out.println("Weekend!!!Happy");
                break;
            case 7:
                System.out.println("Prepare for work");
                break;
            default:
                System.out.println("Work!!! Work!!!");
        }
    }
}
