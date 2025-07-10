package inflearn.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class String_6 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        char[] str = sc.nextLine().toLowerCase().toCharArray();
        boolean flag = true;
        int lt = 0;
        int rt = str.length-1;
        while (rt > lt ){
           if (!Character.isAlphabetic(str[lt])){
               lt ++;
           }
           else if (!Character.isAlphabetic(str[rt])){
               rt --;
           }
           else if(str[lt] == str[rt]){
               lt ++;
               rt --;
           }else{
               flag =false;
               break;
           }
        }
        if (flag){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}