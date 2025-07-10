package inflearn.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class String_7 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";
        for(int i = 0 ; i < str.length(); i ++){
            if (Character.isDigit(str.charAt(i))){
                ans += str.charAt(i);
            }
        }
        int answer = Integer.parseInt(ans);
        System.out.println(answer);
    }
}