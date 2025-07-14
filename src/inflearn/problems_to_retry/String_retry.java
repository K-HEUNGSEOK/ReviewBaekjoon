package inflearn.problems_to_retry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class String_retry {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s += " ";
        char[] arr = s.toCharArray();
        int cnt = 1;
        for(int i = 0 ; i < arr.length-1; i ++){
            if (arr[i] == arr[i +1]){
                cnt ++;
            }else{
                System.out.print(arr[i]);
                if (cnt > 1){
                    System.out.print(cnt);
                    cnt = 1;
                }
            }
        }
    }
}