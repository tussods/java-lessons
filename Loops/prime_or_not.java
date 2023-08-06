import java.util.*;

public class prime_or_not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        boolean isprime = true;

        for(int i=2; i<=Math.sqrt(number); i++){

            if(number==2){
                // it's not necessary to write the below line because the value of isprime is already initialized to true.
                isprime=true;
            }

            else{

                if(number%i == 0){
                    isprime=false;
                    break;
                }

            }

        }

        if(isprime==true){
            System.out.print("The entered number is a prime number.");
        }

        else{
            System.out.println("The entered number is not a prime number.");
        }
    }
    
}