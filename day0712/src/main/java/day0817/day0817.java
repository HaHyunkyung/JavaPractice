package day0817;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class day0817 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		StringBuilder sb = new StringBuilder();
		
		HashMap<Integer, String> HM1 = new HashMap<Integer, String>();
		HashMap<String, Integer> HM2 = new HashMap<String, Integer>();
		
		for(int i=1; i<=N; i++) {
			String S = br.readLine();
			HM1.put(i, S);
			HM2.put(S, i);
		}
		
		for(int i=0; i<M; i++) {
			String S = br.readLine();
			
			if(49 <= S.charAt(0) && S.charAt(0) <= 57) {
				sb.append(HM1.get(Integer.parseInt(S))).append("\n");
			}	else {
				sb.append(HM2.get(S)).append("\n");
			}
		}
		System.out.println(sb);
	}
}