package NareshIT.array;

import java.util.Scanner;

public class FindMax {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the Array: ");
		
		int len = sc.nextInt();
		
		System.out.println("Enter the Elements of the Array:  ");
		int i;
		int a[] = new int[len]; 
		
		for (i = 0; i<a.length; i++) {
		
			a[i] = sc.nextInt();
			
			
		}
		
		System.out.println("Given Array  length: "+ len);
		System.out.println();
		
		
		for (i=0; i<a.length;i++) {
			
			System.out.print(a[i]+" ");
		}
		
		// find the max Element of the Array
		
		int max =a[0];
		
		for (i=0; i<a.length;i++) {
			
			if(max<a[i]) {
				
				max= a[i];
				
				
			}
			
		}
		
		System.out.println("max element in the array "+max);
		
		
		// find the Min Element of the Array
		
		int min = a[0];
		for (i =0;i<a.length;i++) {
			
			if(min>a[i] ){
				min= a[i];
				
			}
		}		
		System.out.println("min element in the array "+min);	
			
			
		}
		
	}


