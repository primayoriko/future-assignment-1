package future.practice.wordcap;

import java.util.*;
import future.practice.wordcap.features.WordCapitalize;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println("Output Function 1:");
        WordCapitalize.printCapOne(input);
        System.out.println("Output Function 2:");
        System.out.println(WordCapitalize.capitalizeTwo(input));

        System.out.printf("\"%s\"\n", WordCapitalize.capitalizeTwo(input));
    }
}
