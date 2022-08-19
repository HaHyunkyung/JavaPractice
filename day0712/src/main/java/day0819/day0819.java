package day0819;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class day0819 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> no_hear = new HashSet<String>();
        List<String> list = new ArrayList<String>();
        for(int i=0; i<N; i++) {
        	no_hear.add(br.readLine());
        }
        
        for(int i=0; i<M; i++) {
        	String no_look = br.readLine();
        	
        	if(no_hear.contains(no_look)) {
        		list.add(no_look);
        	}
        }
        Collections.sort(list);
        System.out.println(list.size());
        
        for(int i=0; i<list.size(); i++) {
        	System.out.println(list.get(i));
        }
        br.close();
	}
}
