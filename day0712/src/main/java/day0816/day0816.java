package day0816;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class day0816 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
 
        int N = Integer.parseInt(br.readLine()); 
        int[] card = new int[N];
 
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            card[i] = Integer.parseInt(st.nextToken());
        }
 
        Arrays.sort(card);
        int M = Integer.parseInt(br.readLine()); 
 
        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int compare = Integer.parseInt(st.nextToken());
            sb.append(binarySearch(card, N, compare) + " ");
        }
 
        bw.write(sb.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
 
    public static int binarySearch(int[] card, int N, int compare) {
        int first = 0;
        int last = N - 1;
        int mid = 0;
 
        while (first <= last) {
            mid = (first + last) / 2; 
 
            if (card[mid] == compare) { 
                return 1;
            }
 
            if (card[mid] < compare) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return 0;
	}
}
