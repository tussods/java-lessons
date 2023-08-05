import java.util.*;

public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        double a = sc.nextDouble();

        System.out.print("Input the operator : ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter another number: ");
        double b = sc.nextDouble();

        switch(operator){
            
            case '+' : System.out.print(a + " + " + b + " = " + (a+b));
            break;

            case '-' : System.out.print(a + " - " + b + " = " + (a-b));
            break;

            case '*' : System.out.print(a + " * " + b + " = " + (a*b));
            break;

            case '/' : System.out.print(a + " / " + b + " = " + (a/b));
            break;

            case '%' : System.out.print(a + " % " + b + " = " + (a%b));
            break;

            default : System.out.print("Please enter the following operators only. \"( + - * / % )\"");
            break;
        }
    }
}
