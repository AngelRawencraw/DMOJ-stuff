import java.util.Scanner;

/**
 * Created by Edwin on 11/11/2014.
 */
public class Main {
    static public void main(String argumentsAndNotArguments[]){
        Scanner scanner = new Scanner(System.in);
        double result = scanner.nextDouble();
        result = Math.sqrt(result);
        result = Math.floor(result);
        System.out.println("The largest square has side length " + (int)result + ".");
    }
}
