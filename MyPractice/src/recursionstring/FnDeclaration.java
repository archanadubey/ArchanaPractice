package recursionstring;

public class FnDeclaration {
	
	
	// Write a program to get the prime number of given number using recursion
	
	 boolean isPrime(int n , int i) {
		 
		 if (n == 1)
			 
			 return false;
		 else	 
			 if (n%i == 0) {
				 
				 return false;
			 } 
				 return isPrime(n ,--i);
				 
}
	 
	// write a program to find the sum of the digit of a given number
	 
	static int sumDigit(int num) {
		 if(num>=1 && num <=9)
			 return num;
		 else 
			 if(num <=0)
			 
			return num%10-sumDigit(- num/10);
			 else 
				 return num%10 + sumDigit(num/10);
		 
		 
	 }
	 
	
	
	
	

}
