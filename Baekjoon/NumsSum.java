package Baekjoon;
import java.io.*;

public class NumsSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        String sNum = br.readLine();

        char[] cNum = sNum.toCharArray();
        int[] aNum = new int[cNum.length];

        for(int i = 0; i<cNum.length; i++){
            aNum[i]=Integer.parseInt(String.valueOf(cNum[i]));
        }
        int sum=0;

        for(int i = 0; i<aNum.length;i++){
            sum += aNum[i];
        }
//        for(int i=0;i<cNum.length;i++){
//            sum += cNum[i]-'0';
//        }
        sb.append(sum);
        System.out.println(sb);

    }
}
