import java.util.*;

public class ternary_operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        System.out.print("Enter another number: ");
        int b = sc.nextInt();

        int number = (a>b)? a:b;
        System.out.println("Greater number is: "+ number);

        System.out.print("Enter a number: ");
        int c = sc.nextInt();
        
        String eo = (c%2 == 0)? "even.":"odd.";
        System.out.println("The entered number is "+ eo);
    }
}
