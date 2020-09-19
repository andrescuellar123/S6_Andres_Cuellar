package model1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;

public class Main1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader(new File("C:\\Users\\USUARIO\\Desktop\\PilasYColas\\src\\HashTableLibrary\\arboles.txt"))); // si lo vas a cambiar a system.in ponle doble espacio
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String s = br.readLine();
		int cases= Integer.parseInt(s);
		br.readLine();
		br.readLine();
		for (int i = 0; i < cases; i++) {
			boolean bandera = true;
			Hashtable<String,Integer> ht = new  Hashtable<String, Integer>();
			ArrayList<String> arr = new ArrayList<>();
			
			int total=0;
			
			while(bandera==true) {
				String s2 = br.readLine();
				
				if(!ht.containsKey(s2)) {
					arr.add(s2);
					
				}
				if(s2.isEmpty()) {
					bandera = false;
				}
				ht.put(s2,ht.getOrDefault(s2, 0)+1);
				total++;
			}
			Collections.sort(arr);
			ArrayList<Float> arr2 = new ArrayList<>();
			arr.remove(0);
			
			for (int j = 0; j < arr.size(); j++) {
				
				float porcentaje =   ((float)(ht.get(arr.get(j))*100)/total);
				
				arr2.add(porcentaje);
				
			}
		
			for (int j = 0; j < arr.size(); j++) {
				DecimalFormat df = new DecimalFormat("#.0000");
				bw.write(arr.get(j)+" "+df.format(arr2.get(j))+"\n");
			}
			
		}
		
		
		
		br.close();
		bw.close();

	}

}
