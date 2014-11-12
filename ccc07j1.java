import java.util.Scanner;

/**
 * Created by edwinfinch on 14-11-12.
 */
public class Main {
    static public void main(String wussup[]){
        Scanner scanner = new Scanner(System.in);
        int[] bowls = new int[3];
        for(int i = 0; i < 3; i++){
            bowls[i] = scanner.nextInt();
        }
        int cap = 1000, j, foundAt = 0, middle = 0;
        for(int i = 0; i < 3; i++){
            for (j = 0; j < 3; j++) {
                if (bowls[j] < cap) {
                    cap = bowls[j];
                    foundAt = j;
                }
            }
            bowls[foundAt] = 1001;
            if(i == 1){
                middle = cap;
            }
            cap = 1000;
        }
        System.out.println(middle);
    }
}
