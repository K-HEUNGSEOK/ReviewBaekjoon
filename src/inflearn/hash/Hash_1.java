package inflearn.hash;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Hash_1 {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < n ; i ++){
            char key = arr[i];
            map.put(key, map.getOrDefault(key,0) +1);
        }
        int max = 0;
        char ans = '1';
        for (Character key : map.keySet()) {
            if (map.get(key) > max){
                max = map.get(key);
                ans = key;
            }
        }
        System.out.println(ans);
    }
}