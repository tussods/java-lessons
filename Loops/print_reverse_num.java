import java.util.*;

public class print_reverse_num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.print("The reverse of the entered number is: ");

        while(number>1){
            // last digit = number%10;
            System.out.print(number%10);
            number /= 10;
            // number = number/10;
        }
    }    
}