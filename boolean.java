import java.util.Scanner;

/**
 * Created by Edwin on 11/11/2014.
 */
public class Main {
    static public void main(String argumentsAndNotArguments[]){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String ending_bool = input.substring(input.length()-5);
        boolean bool;
        if(ending_bool.equals(" True")){
            bool = true;
            for(int i = 0; i < input.length()-4; i += 4){
                bool = !bool;
            }
        }
        else{
            bool = false;
            for(int i = 0; i < input.length()-5; i += 4){
                bool = !bool;
            }
        }
        if(bool){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
