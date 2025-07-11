package inflearn.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class String_10 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        for(int i = 0 ; i < n * 7; i +=7){
            solution(str.substring(i,i+7));
        }
        System.out.println(sb);
    }
    static void solution(String str){
        String ans = "";
        for(int i = 0; i < str.length(); i ++){
            if (str.charAt(i) == '#'){
                ans +=1;
            }else{
                ans += 0;
            }
        }
        int binary = Integer.parseInt(ans, 2);
        char result = (char) binary;
        sb.append(result);
    }
}