package future.practice.wordcap.features;

import java.util.ArrayList;
//import StringUtils;
import org.apache.commons.lang3.StringUtils;

public class WordCapitalize {
    public static String[] capitalizeOne(String word){
        String[] res = StringUtils.split(word, " ");
        for(int i = 0; i < res.length; i++){
            res[i] = StringUtils.capitalize(res[i]);
        }

        return res;
    }

    public static void printCapOne(String word){
        String[] arr = capitalizeOne(word);
        System.out.print("[");
        for(int i = 0; i < arr.length; i++){
            System.out.printf("\"%s\"", arr[i]);
            if(i != arr.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
