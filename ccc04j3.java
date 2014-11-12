import java.util.Scanner;

/**
 * Created by edwinfinch on 14-11-12.
 */
public class Main {
    static public void main(String wussup[]){
        Scanner scanner = new Scanner(System.in);
        int amountOfAdj = scanner.nextInt();
        int amountOfNoun = scanner.nextInt();
        String[] adjs = new String[amountOfAdj];
        String[] nouns = new String[amountOfNoun];
        for(int i = 0; i < amountOfAdj; i++){
            adjs[i] = scanner.next();
        }
        for(int i = 0; i < amountOfNoun; i++){
            nouns[i] = scanner.next();
        }
        for(int i = 0; i < amountOfAdj; i++){
            for(int j = 0; j < amountOfNoun; j++){
                System.out.println(adjs[i] + " as " + nouns[j]);
            }
        }
    }
}
