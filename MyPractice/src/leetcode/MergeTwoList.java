package leetcode;

import java.util.ArrayList;
import java.util.List;

/* You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]




 * */

public class MergeTwoList {

	public static void main(String[] args) {
		
		int [] list1 = {1,2,4};
		int m = list1.length;
		
		int[] list2 = {1,3,4};
		int n = list2.length;
		
		//		Output: [1,1,2,3,4,4]
		
		System.out.println(solution(list1,m,list2,n));
		
		
		

	}
	
	public static int[] solution(int[] list1,int m, int [] list2, int n) {
		
		int[] arr = new int[m+n];
		int index = 0;
		if(list1 != null && list2 != null) {
			
			for (int i = 0; i < m; i++) {
				
				for (int j = 0; j<n; j++) {
					
					if (list1[i] <= list2[j]) {
						
						
						arr[index] = list1[i];
							
							
							
						
					}else
						arr[index] = list2[j];
							
							
							
						
						
				}
				
				
			}
			
			//System.out.println(arr.toString());
			
			
			
		}
		System.out.println(arr[index]);
		return arr;
		
	}

}
