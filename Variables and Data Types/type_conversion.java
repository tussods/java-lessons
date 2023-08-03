import java.util.*;

public class type_conversion{
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        float number = sc.nextInt();                //"int number = sc.nextFloat();" will throw a lossy conversion error.
        System.out.println(number);
    }
}
