import java.util.Scanner;

/**
 * Created by Edwin on 11/11/2014.
 */
public class Main {
    static public void main(String argumentsAndNotArguments[]){
        Scanner scanner = new Scanner(System.in);
        String input = new String();
        String[] toPrint = new String[1000];
        int stackTop = 0;
        final String[][] abvs = {
                {
                    "CU", ":-)", ":-(", ";-)", ":-P", "(~.~)", "TA", "CCC", "CUZ", "TY", "YW", "TTYL"
                },
                {
                    "see you", "I'm happy", "I'm unhappy", "wink", "stick out my tongue", "sleepy", "totally awesome",
                        "Canadian Computing Competition", "because", "thank-you", "you're welcome", "talk to you later"
                }
        };
        while(!input.equals("TTYL")){
            input = scanner.nextLine();
            boolean found = false;
            for(int i = 0; i < 12; i++){
                if(input.equals(abvs[0][i])){
                    toPrint[stackTop] = abvs[1][i];
                    stackTop++;
                    found = true;
                }
                if(i == 11 && !found){
                    toPrint[stackTop] = input;
                    stackTop++;
                    found = false;
                }
            }
        }
        for(int i = 0; i < stackTop; i++){
            System.out.println(toPrint[i]);
        }
    }
}
