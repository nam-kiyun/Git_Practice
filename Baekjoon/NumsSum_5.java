package Baekjoon;
import java.io.*;

public class NumsSum_5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int count = 1;//N 본인인 경우도 가능해 1로 선언
        int start=1;
        int end=1;
        int sum=1;

        while (end != N){
            if(sum==N){
                count++;
                end++;
                sum=sum+end;
            } else if (sum>N){
                sum=sum-start;
                start++;
            } else if (sum<N) {
                end++;
                sum=sum+end;
            }
        }
        sb.append(count);
        System.out.println(count);
    }
}
