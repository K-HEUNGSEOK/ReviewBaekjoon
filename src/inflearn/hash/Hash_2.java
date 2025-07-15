package inflearn.hash;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash_2 {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();

        Map<Character,Integer> map = new HashMap<>();
        for (char c : a) {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        for (char c : b) {
            map.put(c,map.getOrDefault(c,0)-1);
        }

        boolean check = true;
        for (Character c : map.keySet()) {
            if (map.get(c) != 0){
                check=false;
                break;
            }
        }
        if (check) System.out.println("YES");
        else{
            System.out.println("NO");
        }
    }
}