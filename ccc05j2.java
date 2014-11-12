import java.util.Scanner;

/**
 * Created by edwinfinch on 14-11-12.
 */
public class Main {
    static public void main(String wussup[]){
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int amount = 0, total = 0;
        for(int i = firstNum; i < secondNum+1; i++){
            for(int j = 1; j < i+1; j++){
                if(i % j == 0){
                    amount++;
                }
            }
            if(amount == 4){
                total++;
            }
            amount = 0;
        }
        System.out.println("The number of RSA numbers between " + firstNum + " and " + secondNum + " is " + total);
    }
}
