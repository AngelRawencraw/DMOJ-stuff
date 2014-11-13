import java.util.Scanner;

public class Main {
    static public void main(String wussup[]){
        Scanner scanner = new Scanner(System.in);
        int total = 91;
        total += scanner.nextInt();
        total += scanner.nextInt()*3;
        total += scanner.nextInt();
        System.out.println("The 1-3-sum is " + total);
    }
}
