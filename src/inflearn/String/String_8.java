package inflearn.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class String_8 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char target = sc.next().charAt(0);
        String ans = solution(str, target);
        System.out.println(ans);
    }

    static String solution(String str, char target) {
        StringBuilder sb = new StringBuilder();

        //1.앞에서 부터
        for (int i = 0; i < str.length(); i++) {
            int ans = str.length();
            if (str.charAt(i) == target) {
                sb.append("0 ");
            } else {
                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(j) == target) {
                        ans = Math.min(ans, Math.abs(j - i));
                    }
                }
                sb.append(ans).append(" ");
            }
        }
        return sb.toString();
    }
}