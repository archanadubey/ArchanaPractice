package recursion;
//Count the Character in the given String using recursion

import java.util.Scanner;

public class countCharString {
	
	
	public static String replace(String s , int index) {
		
		if(index<1)
		return "s";
		
		if(s.substring(index-1, index+1).equals("pi")) {
			return s.replace("pi", "3.147") + replace(s,index-1);
			
		}else 
			
			return replace(s,index-1);
	}
	
	
	public static int countChar(String s, char ch, int index) {
		
		if(index<0) 
			return 0;
			
		
			if(s.charAt(index) == ch) {
				
			
			return	1+countChar( s,  ch,  index-1);
			}
			else 
				
				return	countChar( s, ch, index-1);
		
		
	}
	
	
	// count all the character in the given String
	
	
	public static int countAllChar(String s, int index) {
		if (index<0)
			return 0;
		if (s.charAt(index)!=0) {
			
			return 1+countAllChar(s,index-1);
		}
		
		return countAllChar(s,index-1);
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		//int len = s.length()-1;
		
		// countChar(s, (s.length()-1), 'x');
	
		
	int count =	countChar(s, 'a',s.length()-1);
	System.out.println("There are "+count+ " a character in the given String");
	
	
	//call function for countAllCharacter
	
	int allCountOfChar = countAllChar(s,s.length()-1);
	System.out.println("There are "+allCountOfChar+" total character in the given String ");

	
	/* Replace the String by given String;
	ex:- string s = aqpixr;
		 string rp =  pi by 3.147*/
	
	
	System.out.println("Enter string to replace: ");
	
	String str = sc.nextLine();
	
	String S = replace(str, str.length()-1);
	
	System.out.println(S);
	}

}
