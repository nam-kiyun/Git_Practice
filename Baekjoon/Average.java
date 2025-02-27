package Baekjoon;
import java.io.*;
import java.util.*;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] point = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i<point.length; i++){
            point[i]=Integer.parseInt(st.nextToken());
        }
        int sum=0;
        int max=0;
        for(int i =0; i<point.length;i++){
            sum += point[i];
            max=Integer.max(max,point[i]);
        }
        sb.append(sum*100.0/max/N);
        System.out.println(sb);
    }
}
