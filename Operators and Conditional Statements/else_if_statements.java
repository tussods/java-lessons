import java.util.*;

public class else_if_statements {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You are an adult.");
        }

        else{
            System.out.println("You are a minor.");
        }

        if(age>=13 && age<=19){
            System.out.println("You are a teenager.");
        }

        else if(age<13){
            System.out.println("You are a kid.");
        }
    }
}