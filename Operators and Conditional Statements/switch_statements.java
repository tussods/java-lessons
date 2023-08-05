import java.util.*;

public class switch_statements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        switch(number){
            
            case 1 : System.out.println("Samosa");
            break;

            case 2 : System.out.println("Juice");
            break;

            case 3 : System.out.println("Noodles");
            break;

            default : System.out.println("Is this a dream!");
        }


        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        switch(ch){
            
            case 'a' : System.out.println("Samosa");
            break;

            case 'b' : System.out.println("Juice");
            break;

            case 'c' : System.out.println("Noodles");
            break;

            default : System.out.println("Is this a dream!");
        }
    }
}
