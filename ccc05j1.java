import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by edwinfinch on 14-11-12.
 */
public class Main {
    static public void main(String wussup[]){
        Scanner scanner = new Scanner(System.in);
        int[][] minutes = new int[2][3];
        double[] finals = new double[2];
        final double[][] costs = {
                {
                    0.25, 0.15, 0.20
                },
                {
                    0.45, 0.35, 0.25
                }
        };
        for(int i = 0; i < 3; i++){
            minutes[0][i] = scanner.nextInt();
            minutes[1][i] = minutes[0][i];
        }
        minutes[0][0] -= 100;
        minutes[1][0] -= 250;
        if(minutes[0][0] < 0){
            minutes[0][0] = 0;
        }
        if(minutes[1][0] < 0){
            minutes[1][0] = 0;
        }
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                finals[i] += (minutes[i][j]*costs[i][j]);
            }
        }
        DecimalFormat f = new DecimalFormat("##.00");
        System.out.println("Plan A costs " + f.format(finals[0]));
        System.out.println("Plan B costs " + f.format(finals[1]));
        if(f.format(finals[0]).equals(f.format(finals[1]))){
            System.out.println("Plan A and B are the same price.");
        }
        else if(finals[0] < finals[1]){
            System.out.println("Plan A is cheapest.");
        }
        else{
            System.out.println("Plan B is cheapest.");
        }
    }
}
