package NareshIT;

import java.util.Scanner;

// Read and write the Array elements

public class ArraysLearning {

	public static void main(String[] args) {
		
		System.out.println("Enter the size of the Arrays");
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int i,a [] = new int[size];
		
		System.out.println("Enter "+size+"array elements");
//		
//		for ( i = 0; i<a.length;i++) {
//			a[i] = sc.nextInt();
//			
//			
//		}
//		
//		System.out.println("Array elements using While loop");
//		int index = 0;
//		
//		while(index<a.length){
//			
//			System.out.println("index = "+index+ " a["+index+"] = "+a[index]);
//			index++;
//			
//		}
			// call to the arraySum function 
			ArrayFunction arrayFunction = new ArrayFunction();
			//arrayFunction.arraySum();
		// call to arrayEvenSum()
			arrayFunction.arrayEvenSum();
		

	}

}

 class ArrayFunction{
//Program to calcualte sum of elements present in an array
	
	 public void arraySum() {
		 
		 System.out.println("Enter the size of the array: ");
		 Scanner sc = new Scanner(System.in);
		 
		 int size = sc.nextInt();
		 
		 System.out.println("Enter the elements of the array: ");
		 //int arr = sc.nextInt();
		 int i,a[] =	new int[size];	 
		 for (i=0;i<a.length;i++) {
			 a[i] = sc.nextInt();
			 
		 }
		 
		int sum =0;
		for (i = 0;i<a.length;i++) {
			 sum = sum+ a[i];
			
			
	}
		System.out.println("Sum of the array: "+ sum);
		 
		 
		 
		 
	 }
	 
	 //Program to calcualte sum of even elements present in an array.
public void arrayEvenSum() {
		 
		 System.out.println("Enter the size of the array: ");
		 Scanner sc = new Scanner(System.in);
		 
		 int size = sc.nextInt();
		 
		 System.out.println("Enter the elements of the array: ");
		 //int arr = sc.nextInt();
		 int i,a[] =	new int[size];	 
		 for (i=0;i<a.length;i++) {
			 
			 a[i] = sc.nextInt();
			 
		 }
		 
		int sum =0;
		for (i = 0;i<a.length;i++) {
			System.out.println(a[i]);
			
			if (i%2==0) { 
			 sum = sum+ a[i];
			}
			
	}
		System.out.println("Sum of the Even array Element: "+ sum);
		 
		 
		 
		 
	 }
	 
	
}
/*Program to read and write array elements.
Program to calcualte sum of elements present in an array.
Program to calcualte sum of even elements present in an array.
Program to calcualte sum of odd elements present in an array.
Program to calcualte sum of +ve elements present in an array.
Program to calcualte sum of -ve elements present in an array.
Program to calcualte sum of elements which are divisible by 2 and 3 present in an array.
Program to calcualte sum of prime elements present in an array.
Program to calcualte sum of all elements factorials present in an array.*/