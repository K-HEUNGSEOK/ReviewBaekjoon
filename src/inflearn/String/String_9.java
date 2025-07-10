package inflearn.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class String_9 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str += " ";
        int cnt = 1;
        StringBuilder s = new StringBuilder();
        for(int i = 0 ; i < str.length()-1; i ++){
            if (str.charAt(i) == str.charAt(i + 1)){
                cnt ++;
            }else{
                s.append(str.charAt(i));
                if (cnt > 1){
                    s.append(cnt);
                    cnt =1;
                }
            }
        }
        System.out.println(s.toString());
    }
}