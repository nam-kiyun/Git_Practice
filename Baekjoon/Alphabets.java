package Baekjoon;
import java.io.*;
import java.util.*;

public class Alphabets {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        int[] count = new int[26];
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            count[c-97]++;
        }
        for(int i = 0;i<count.length;i++){
            sb.append(count[i]+" ");
        }
        System.out.println(sb);
    }
}
