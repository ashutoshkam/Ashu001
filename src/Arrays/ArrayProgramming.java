package Arrays;

import java.util.Arrays;

public class ArrayProgramming {
	 static float bhai ;
	
	public static void main (String[]args) {
		
		float [] ashu = {55.5f,66.6f,77.7f,99.9f,66.6f,44.4f,11.1f,22.2f,100.10f,33.3f};
		
		System.out.println("Sipmle Aray Print By Simple For Loop " );
		for(int a=0;a<ashu.length;a++) {
			System.out.print(ashu[a] + " ");
		}
		System.out.println("");
		System.out.println("Siple array print by for Each Loops");
		for(float mh:ashu) {
			System.out.print(mh + " ");
		}
		System.out.println("");
		System.out.println("Simple Array Reverse");
		for(int a= ashu.length-1;a>=0;a--) {
			System.out.print(ashu[a] + " ");
			
		}
		System.out.println("");
		System.out.println("Array In Assending in  By Sort Method");
		Arrays.sort(ashu);
		for(float as:ashu) {
			System.out.print(as + " ");
		}
		
	
	System.out.println("");
	System.out.println("Array In Desending in  By Sort Method");
	for(int a= ashu.length-1;a>=0;a--) {
		System.out.print(ashu[a]+" ");
	}
	
	System.out.println("");
	System.out.println("Array Printing in Assending Order By Using Logic");
	for(int o = 0 ; o<ashu.length;o++) {
		for (int p=o+1;p<ashu.length;p++) {
			if(ashu[o]>ashu[p]) {
				bhai=ashu[o];
				ashu[o]=ashu[p];
				ashu[p]=bhai ;	
				}
			
			
		}
	}
	for(int a= 0 ; a<ashu.length;a++) {
		System.out.print(ashu[a] + " ");
	}
		
	
	System.out.println("");
	System.out.println("Array Printing in Desending Order By Using Logic");
	for(int o = 0 ; o<ashu.length;o++) {
		for (int p=o+1;p<ashu.length;p++) {
			if(ashu[o]<ashu[p]) {
				bhai=ashu[o];
				ashu[o]=ashu[p];
				ashu[p]=bhai ;	
				}
			
			
		}
	}
	for(int a= 0 ; a<ashu.length;a++) {
		System.out.print(ashu[a] + " ");
	}
		
	
	
	
	
		
	}
	

}
