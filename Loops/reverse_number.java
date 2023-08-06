import java.util.*;

public class reverse_number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int reverse_number = 0;

        System.out.print("The reverse of the entered number is: ");

        while(number>1){
            // last_digit = number%10;
            reverse_number = reverse_number*10 + (number%10);

            number /= 10;
            // number = number/10;
        }

        System.out.print("The reverse number is stored in a variable and is: " + reverse_number);
    }    
}