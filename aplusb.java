import java.util.Scanner;

public class AplusB{
  static public void main(String argumentsAndNotArguments[]){
        Scanner scanner = new Scanner(System.in);
        int amountOfStuff = scanner.nextInt();
        int[] numbers = new int[amountOfStuff*2];
        int[] results = new int[amountOfStuff];
        for(int i = 0; i < amountOfStuff; i++){
            numbers[i*2] = scanner.nextInt();
            numbers[i*2+1] = scanner.nextInt();
        }
        for(int i = 0; i < amountOfStuff; i++) {
            results[i] = numbers[i*2] + numbers[i*2+1];
            System.out.println(results[i]);
        }
    }
}
