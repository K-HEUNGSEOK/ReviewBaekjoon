package inflearn.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class String_3 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = str.toCharArray();
        int lt = 0;
        int rt = arr.length-1;

        while (rt > lt){
            if (!Character.isAlphabetic(arr[lt])){
                lt ++;
            }else{
                if (!Character.isAlphabetic(arr[rt])){
                    rt --;
                }else{
                    char temp = arr[lt];
                    arr[lt] = arr[rt];
                    arr[rt] = temp;
                    lt ++;
                    rt --;
                }
            }
        }
        System.out.println(arr);
    }
}