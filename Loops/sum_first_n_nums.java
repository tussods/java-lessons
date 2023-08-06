import java.util.*;

public class sum_first_n_nums{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int range = sc.nextInt();

        int counter = 1, sum = 0;
        
        while(counter<=range){
            sum += counter;
            counter++;
        }

        System.out.print("Sum of first n natural numbers is: " + sum);
    }
    
}