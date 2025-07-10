package inflearn.String;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class String_4 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        char[] str = sc.next().toCharArray();
        Set<Character> set = new LinkedHashSet<>();
        for (char c : str) {
            set.add(c);
        }
        for (Character c : set) {
            System.out.print(c);
        }
    }
}