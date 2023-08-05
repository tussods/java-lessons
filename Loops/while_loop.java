import java.util.*;

public class while_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a String: ");
        String sentence = sc.nextLine();

        System.out.print("Enter the number of times you want to print the String: ");
        int counter_val = sc.nextInt();

        int counter = 0;
        
        while(counter < counter_val){
            System.out.println(sentence);
            counter++;
        }
        
        
    }
}