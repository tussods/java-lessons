import java.util.*;

public class leap_year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0 && year % 400 == 0)){
            System.out.println("It's a leap year.");
        }

        else{
            System.out.println("It's not a leap year.");
        }
    }
}
