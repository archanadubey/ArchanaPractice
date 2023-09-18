package recursionstring;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		
		FnDeclaration prime = new FnDeclaration();
		
		// function call of all numbers 
		int pint = 5;
		int i =pint/2;
		prime.isPrime(pint, i) ;
		
		
		System.out.println((prime.isPrime(pint, i)?"yes ":"no " +pint)) ;
 
// call to program sum of digit of a positive given number
		 
		int number = -123;
		System.out.println("Sum of digit of a given number: "+FnDeclaration.sumDigit(number));
		
		
	// calculate the reverse of a given number
		
		System.out.println("Enter the number to reverse: ");
		Scanner sc = new Scanner(System.in);
		String revNumber = sc.nextLine();
		int len = revNumber.length();
		int revNum = Integer.parseInt(revNumber);
		
		FnDeclaration revP = new FnDeclaration();
		
		System.out.println("reversed Number: "+revP.reverseNumber(revNum,len));
		
		
	// calculate the count of the given number 
		 countDigit(number);
			
		
		
		
		String str = "123456789";
		
		//char [] charArray = str.toCharArray();
		
		//String output = StringReverseRecursion(str);
		
		//System.out.println(output);
		
		
		
		// PROGRAMME TO PRINT ALL NATURAL NUMBER USING RECURSSION
		
		System.out.println("Enter any Natural Number");
		
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();

		print(num);
	//	System.out.println("Given Natural Number: " + naturalNumber);
		
		int n =15;
		loopPrint(n);
	}

	
	
	
	
	 static String StringReverseRecursion(String str) {
		
		 
		 if(str.isEmpty()) 
			 
			 return str;
			
		 
		 
		return StringReverseRecursion(str.substring(1));//+ str.charAt(0);
	
		
	}
	 
	 // method to print sum of n natural number using recursion 
	 
	 static void print(int number) {
		 
		 if (number>=1) {
			 
			 print(number-1);
			 
			 System.out.print(number+ " ");
		
			
			
		
		 } 
	 }
	 
	 
	 //  method to print sum of n natural number using Iteration
	 
	 static void loopPrint(int n) {
		 int sum =0;
		
		 for (int i= 1; i<=n;i++) {
			
			 
			 
			 sum = sum +i;
			 System.out.print(i +" "); 
		 }
		 
		 System.out.println(" Sum of N natural number "+sum);
		 
	 }

}
