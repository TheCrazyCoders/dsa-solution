package interviewground.com;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharInString {
    public static void main(String[] args) {
        String str = "abcdd";
        printOccurrence(str);
        printOccurrenceInJava8(str);
    }
    private static void printOccurrence(String str){
        Map<Character,Integer> storeMap = new HashMap<>();
        for (char c : str.toCharArray()){
            storeMap.put(c, storeMap.getOrDefault(c,0)+1);
        }
        System.out.println(storeMap);
    }

    private static void printOccurrenceInJava8(String str){
        Map<Character, Long> map = str.chars()
                .mapToObj(c ->(char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        // Iterate over the map and print the occurrence of each character
                map.forEach((character, count) ->
                System.out.println("Character: " + character + ", Occurrence: " + count));


    }

}
