package inflearn.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class String_5 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        if (solution(str)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    static boolean solution(String str){
        str = str.toUpperCase();
        int lt = 0;
        int rt = str.length()-1;

        while (rt > lt){
            if (str.charAt(lt) == str.charAt(rt)){
                lt ++;
                rt --;
            }else{
                return false;
            }
        }
        return true;
    }
}