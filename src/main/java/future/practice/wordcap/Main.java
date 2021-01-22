package future.practice.wordcap;

import java.util.*;
import future.practice.wordcap.features.WordCapitalize;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        WordCapitalize.printCapOne(input);
    }
}
