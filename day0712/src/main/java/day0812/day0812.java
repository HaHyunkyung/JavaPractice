package day0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class day0812 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int [] input = new int[N];
		int [] array = new int[N];
		HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<N; i++) {
			input[i] = array[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(array);
		
		int rank = 0;
		for(int j: array) {
			
			if(!rankingMap.containsKey(j)) {
				rankingMap.put(j, rank);
				rank++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for(int key :input) {
			int ranking = rankingMap.get(key);
			sb.append(ranking).append(' ');
		}
		System.out.println(sb);
		
	}
}
