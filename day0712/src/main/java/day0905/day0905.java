package day0905;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class day0905 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double N = Double.parseDouble(br.readLine());
		
		System.out.println(N * N * Math.PI);
		System.out.println(2 * N * N);
		
	}
}
