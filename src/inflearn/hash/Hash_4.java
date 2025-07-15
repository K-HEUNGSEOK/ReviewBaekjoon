package inflearn.hash;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hash_4 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int k = t.length();
        Map<Character, Integer> target = new HashMap<>();

        //1.먼저 넣어둔다 이걸로 계속 체크를 해야하기 때문
        for (int i = 0; i < k; i++) {
            target.put(t.charAt(i), target.getOrDefault(t.charAt(i), 0) + 1);
        }

        //2. 슬라이딩 윈도우 준비
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        //3. 슬라이딩 윈도우 시작
        int ans = 0;
        int lt = 0;
        for (int i = k - 1; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            if (isCheck(target, map)) {
                ans++;
            }

            map.put(s.charAt(lt), map.get(s.charAt(lt)) -1);

            if (map.get(s.charAt(lt)) == 0){
                map.remove(s.charAt(lt));
            }
            lt ++;
        }
        System.out.println(ans);
    }
    static boolean isCheck(Map<Character,Integer> target, Map<Character,Integer> map){
        for (Character key : map.keySet()) {
            if (map.get(key) != target.get(key)){
                return false;
            }
        }
        return true;
    }
}