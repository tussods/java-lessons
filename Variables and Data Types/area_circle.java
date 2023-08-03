import java.util.*;

public class area_circle{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        float r = sc.nextFloat();

        float area = 3.14159f*r*r;
        System.out.println("The area of the circle is: "+area);
    }
}