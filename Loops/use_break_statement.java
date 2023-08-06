import java.util.*;

public class use_break_statement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        for(int i = 0; ; i++) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            if(number%10 == 0){
                System.out.println("The entered number is a multiple of 10.");
                System.out.print("Breaking out of the loop.");
                break;
            }
            
            System.out.println("The entered number is: " + number + "\n\n");
        }


    }
    
}
