import java.util.Scanner;

/**
 * Created by Edwin on 11/11/2014.
 */
public class Main {
    static public void main(String argumentsAndNotArguments[]){
        Scanner scanner = new Scanner(System.in);
        int amountOfStuff = scanner.nextInt();
        int[] numbers = new int[amountOfStuff*2];
        for(int i = 0; i < amountOfStuff; i++){
            numbers[i] = scanner.nextInt();
        }
        int cap = 1000, j, foundAt = 0;
        for(int i = 0; i < amountOfStuff; i++){
            for (j = 0; j < amountOfStuff; j++) {
                if (numbers[j] < cap) {
                    cap = numbers[j];
                    foundAt = j;
                }
            }
            numbers[foundAt] = 1001;
            System.out.println(cap);
            cap = 1000;
        }
    }
}
