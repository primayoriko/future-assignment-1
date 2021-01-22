package future.practice.wordcap;

import java.util.*;
import future.practice.wordcap.features.WordCapitalize;

public class Main {
    public static void Main(){
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();

        ArrayList<String> output = WordCapitalize.capitalizeOne(input);
        System.out.print("[");
        for(int i = 0; i < output.size(); i++){
            System.out.printf("\"%s\"", output.get(i));
            if(i != output.size() - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
