package inflearn.problems_to_retry._7day;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class String {
    public static void main(java.lang.String[] args) throws IOException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        java.lang.String str = sc.next();
        str += " ";
        char[] arr = str.toCharArray();

        //1.다음이 또 있다면 cnt ++을 해주자
        int cnt = 1;
        for(int i = 0; i < arr.length-1; i ++){
            if (arr[i] == arr[i+1]){
                cnt++;
            }else{
                if (cnt > 1){
                    System.out.print(arr[i]);
                    System.out.print(cnt);
                    cnt = 1;
                }else{
                    System.out.print(arr[i]);
                }
            }
        }
    }
}