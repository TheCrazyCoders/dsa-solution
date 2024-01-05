package DSAPractice.com.Strings;

import java.util.Scanner;

public class ReverseEachWord {
    static String reverseStringWordWise(String input) {
        String revStr = "";
        for(int i=input.length();i>0;i--){
            revStr += (input.charAt(i - 1));
        }
        return revStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }

}
