package Baekjoon;
import java.io.*;
import java.util.*;

public class StarPrinting8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i=1;i<=N;i++){
            for(int j=1;j<=i;j++){
                sb.append("*");
            }
            for(int k=(N-1)*2;(k+1)/2>=i;k--){
                sb.append(" ");
            }
            for(int m=1;m<=i;m++){
                sb.append("*");
            }
            sb.append("\n");
        }
        for(int i=1;i<N;i++){
            for(int k=(N-1);k>=i;k--){
                sb.append("*");
            }
            for(int j=1;j<=i*2;j++){
                sb.append(" ");
            }
            for(int k=(N-1);k>=i;k--){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
