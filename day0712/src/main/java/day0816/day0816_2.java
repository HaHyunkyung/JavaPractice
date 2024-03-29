package day0816;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class day0816_2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<String,Integer> map = new HashMap<>();
		int cnt =0;
		for(int i=0; i<N; i++) {
			map.put(br.readLine(), 1);
		}
		for(int i=0; i<M; i++) {
			String str = br.readLine();
			if(map.get(str)!= null) {
				cnt++;
			}
		}
		bw.write(cnt + "\n");
		
		br.close();
		bw.flush();
		bw.close();
	}
}
