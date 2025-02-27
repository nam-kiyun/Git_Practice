package Baekjoon;
import java.io.*;
import java.util.*;

public class Strfry {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());
        for (int i=0;i<N;i++){
            int[] arr = new int[26];
            StringTokenizer st = new StringTokenizer(br.readLine());
            char[] words1=st.nextToken().toCharArray();
            char[] words2=st.nextToken().toCharArray();

            for(char ch : words1) arr[ch-97]++;
            for(char ch : words2) arr[ch-97]--;
            boolean check = true;
            for(int j:arr){
                if(j!=0) check=false;
            }
            sb.append(check ? "Possible\n":"Impossible\n");
        }
        System.out.println(sb);
    }
}
