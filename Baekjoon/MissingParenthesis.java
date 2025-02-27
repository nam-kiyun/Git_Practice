package Baekjoon;
import java.io.*;
import java.util.*;

public class MissingParenthesis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] strarr = br.readLine().split("-");
        int result = 0;
        for(int i=0; i<strarr.length; i++){
            int temp=0;
            String[] addition = strarr[i].split("\\+");
            for(int j=0;j<addition.length;j++){
                temp+=Integer.parseInt(addition[j]);
            }

            if(i==0){
                result=temp;
            } else {
                result-=temp;
            }
        }
        sb.append(result);
        System.out.println(sb);
    }
}
