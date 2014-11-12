import java.util.Scanner;

/**
 * Created by Edwin on 11/11/2014.
 */
public class Main {
    static public void main(String argumentsAndNotArguments[]){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int count = 0;
        for(int j = 1; j < y+1; j++) {
            for (int i = 1; i < x+1; i++) {
                if (i + j == 10) {
                    count++;
                }
            }
        }
        if(count == 1) {
            System.out.println("There is 1 way to get the sum 10.");
        }
        else{
            System.out.println("There are " + count + " ways to get the sum 10.");
        }
    }
}
