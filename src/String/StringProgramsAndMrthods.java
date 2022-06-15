package String;

public class StringProgramsAndMrthods {
	
	public static void main (String[]args) {
		String a = "Mahesh Gavade";
		String b = "Ashutosh Kamble";
		String c = "bhai  0123456";
		String d = "i am very lucky I have Very Good Job In IT Industry";
		String e = "SCHOOL";
		String f= "school";
		String g = "     Ekta Loves Mahesh Gavade    ";
		
		   String zzzz="amk998855l@@%&$#*!";
		 
		   String 	ddd = zzzz.replaceAll("[^1-9]", "M");
		   System.out.print(ddd);
			

		   System.out.println("*****IS BLANK Method");
		   boolean check = a.isBlank();
		   System.out.println(check);
		   System.out.println(a.isBlank());
		   System.out.println("");
		System.out.println("*****CONCATI CONCATI Method");  
	 System.out.println(a.concat(c).concat(d));	
	 System.out.println(b.concat(c).concat(d));
	 System.out.println("");
	 System.out.println("******Equals Method"); 
	 System.out.println(a.equals(b));
	 boolean  okokok=  a.equals(b);
	 System.out.print(okokok);
	 System.out.println("");
	 System.out.println("******EqualsIgnoreCase");
	 System.out.println(e.equalsIgnoreCase(f));
	 System.out.println("");
	 System.out.println("******SubStringUSING only one index");
	 System.out.print(c.substring(1));
	 
	 System.out.println("");
	 System.out.println("******SubStringUSING Two Index");
	 System.out.println(c.substring(4,11));
	 
	 System.out.println("");
	 System.out.println("******Length");
	 System.out.println(d.length());
	 
	 System.out.println("");
	 System.out.println("******Replace");
	 System.out.println(d.replace("lucky", "Blessed And"));
	 

	 System.out.println("");
	 System.out.println("******UpperCase");
	 System.out.print(e.toLowerCase());
	 
	 
	 System.out.println("");
	 System.out.println("******UpperCase");
	 System.out.print(f.toUpperCase());
	 
	 System.out.println("");
	 System.out.println("******Trim");
	 System.out.println(g.trim());
	 
	 System.out.println("");
	 System.out.println("******IndexOf");
	 System.out.println(a.indexOf('e'));
	 
	 System.out.println("");
	 System.out.println("******LastIndexOf");
	 System.out.println(a.lastIndexOf('a'));
	 
	 System.out.println("");
	 System.out.println("******Contains");
	 System.out.println(d.contains("Very"));
	 
	 System.out.println("");
	 System.out.println("******StartsWith");
	 System.out.println(d.startsWith("i"));
	 
	 System.out.println("");
	 System.out.println("******endsWith");
	 System.out.println(d.endsWith("Industry"));
	 
	 System.out.println("");
	 System.out.println("******charAt");
	 System.out.print(c.charAt(5));
	 
	 System.out.println("");
	 System.out.println("******IsDidit");
	 
	char chek = c.charAt(5);
	System.out.println(Character.isDigit(chek));
	System.out.println(Character.isAlphabetic(chek));
	System.out.println(Character.isLetter(chek));
	 

	System.out.println("");
	System.out.println("******toCharArray");

	 char [] fff =d.toCharArray();
	 
	 for(char aaa:fff) {
	 	System.out.println(aaa);
	 }
	 
	 for(int z = 0 ; z<fff.length;z++) {
	 	System.out.print(fff[z]+ " ");
	 }
	 
	 
	 System.out.println("");
	 System.out.println("******splitString");
	 
	String [] uuu = c.split(" ");
	for(String ttt :uuu) {
		 System.out.println(ttt);
	}
	 
	 

	  
	 
	 

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		
		
		
	}

	

	
	
}
