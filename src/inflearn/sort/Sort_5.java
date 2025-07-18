package inflearn.sort;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Sort_5 {
    static int[] arr;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        Map<Integer,Integer> map = new HashMap<>();
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int num = sc.nextInt();
            map.put(num, map.getOrDefault(num,0) +1);
        }
        boolean check = true;
        for (Integer i : map.keySet()) {
            if (map.get(i) > 1){
                check = false;
                break;
            }
        }
        if (check){
            System.out.println("U");
        }else{
            System.out.println("D");
        }
    }
}