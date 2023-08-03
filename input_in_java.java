import java.util.*;

public class input_in_java{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        // sc.next() just takes in a word. It will ignore a new line or things after a space.
        // String word = sc.next();
        // System.out.println(word);
        
        // sc.nextLine() takes sentences, paragrphs.
        String sentence = sc.nextLine();
        System.out.println(sentence);
    }
}