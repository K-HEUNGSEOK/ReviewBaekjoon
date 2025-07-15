package inflearn.hash;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash_3 {

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i ++)arr[i] = sc.nextInt();

        Map<Integer,Integer> map = new HashMap<>();
        //map의 size 가 몇인질 봐야겟네

        for(int i = 0 ; i < k - 1; i ++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        for(int i = k - 1; i < n ; i ++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            System.out.print(map.size() + " ");
            map.put(arr[i-k+1], map.getOrDefault(arr[i-k+1],0)-1);
            if (map.get(arr[i-k+1]) == 0){
                map.remove(arr[i-k+1]);
            }
        }

    }
}