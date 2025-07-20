package inflearn.problems_to_retry;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

    public class String_retry_7Day {
        static int n;
        static boolean[] arr;
        public static void main(String[] args) throws FileNotFoundException {
            System.setIn(new FileInputStream("src/input.txt"));
            Scanner sc = new Scanner(System.in);
            String str = sc.next();
            str += " ";
            int cnt = 1;
            for(int i = 0 ; i < str.length()-1; i ++){
                if (str.charAt(i) == str.charAt(i+1)){
                    cnt ++;
                }else{
                    System.out.print(str.charAt(i));
                    if (cnt > 1){
                        System.out.print(cnt);
                        cnt = 1;
                    }
                }
            }
        }
    }