import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by edwinfinch on 14-11-12.
 */
public class Main {
    static public void main(String wussup[]){
        Scanner scanner = new Scanner(System.in);
        final int[][] calories = {
                {
                    0, 461, 431, 420, 0
                },
                {
                    0, 100, 57, 70, 0
                },
                {
                    0, 130, 160, 118, 0
                },
                {
                    0, 167, 266, 75, 0
                }
        };
        int[] inputs = new int[4];
        int caloriesTotal = 0;
        for(int i = 0; i < 4; i++){
            inputs[i] = scanner.nextInt();
        }
        for(int i = 0; i < 4; i++){
            caloriesTotal += calories[i][inputs[i]];
        }
        System.out.println("Your total Calorie count is " + caloriesTotal + ".");
    }
}
