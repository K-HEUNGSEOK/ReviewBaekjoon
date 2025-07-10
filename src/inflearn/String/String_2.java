package inflearn.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class String_2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr =  str.split(" ");
        int max = 0;
        String ans = "";
        for(int i = 0 ; i < arr.length; i ++){
            if (arr[i].length() > max){
                max = arr[i].length();
                ans = arr[i];
            }
        }
        System.out.println(ans);
    }
}