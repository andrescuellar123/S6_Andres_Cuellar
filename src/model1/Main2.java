package model1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;



public class Main2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		HashMap<String,String> ht = new HashMap<String,String>();

		HashTable<String> hp= new HashTable<String>(100);
		
		int s = Integer.parseInt( br.readLine());
		System.out.println(s);
	}
}
