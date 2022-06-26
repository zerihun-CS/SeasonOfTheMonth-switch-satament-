import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        //seasons
//spring = {mar - may} summer ={june-August}
// fall(autumn)={sep - nov} winter = {dec-feb}


        Scanner scan  = new Scanner(System.in);
        System.out.println("insert month number");
        int monthNumber =  scan.nextInt();

        if(monthNumber==1)
            System.out.println("Jan");
        else if (monthNumber==2)
            System.out.println("Feb");

        switch (monthNumber){
            case 1:
                System.out.println("Jan");
                break;
            case 2:
                System.out.println("Feb");
            default:
                System.out.println("Unknown Number");
        }

        switch (monthNumber){
            case 3: case 4: case 5:
                System.out.println("Spring Season");
                break;
            case 6: case 7: case 8:
                System.out.println("summer Season");
                break;
            case 9: case 10: case 11:
                System.out.println("autumn Season");
            case 12: case 1: case 2:
                System.out.println("winter Season");
            default:
                System.out.println("unknown Season");






        }


    }
}
