package Baekjoon;
import java.io.*;
import java.util.*;

public class DNAPassword {
    static int myArr[];
    static int checkArr[];
    static int checkSecret;

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int Result=0;
        char A[] = new char[S];
        checkArr = new int[4];
        myArr = new int[4];
        checkSecret = 0;

        A = br.readLine().toCharArray();
        st= new StringTokenizer(br.readLine());

        for(int i=0;i<checkArr.length;i++){
            checkArr[i]=Integer.parseInt(st.nextToken());
            if(checkArr[i]==0){
                checkSecret++;
            }
        }

        for(int i=0;i<P;i++){ //부분문자열 처음 받을 때 세팅
            Add(A[i]);
        }
        if(checkSecret == 4) Result++;

        //슬라이딩 윈도우
        //초기 상태는 클리어한 상태라 한칸 이동한 상태부터 시작 따라서 i=P
        for(int i=P;i<S;i++){
            int j = i-P;
            Add(A[i]);
            Remove(A[j]);
            if(checkSecret == 4) Result++;
        }
        sb.append(Result);
        System.out.println(sb);
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if(myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if(myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }
}
