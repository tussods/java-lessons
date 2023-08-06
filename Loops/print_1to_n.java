import java.util.Scanner;

public class print_1to_n {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper bound value: ");
        int counter_val = sc.nextInt();

        int counter = 1;

        while(counter<=counter_val){
            System.out.println(counter);
            counter++;
        }
    }
    
}