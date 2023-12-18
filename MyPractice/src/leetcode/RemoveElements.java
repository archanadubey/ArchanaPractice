package leetcode;


/* Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. 
 * The order of the elements may be changed. 
 * Then return the number of elements in nums which are not equal to val.
 */
public class RemoveElements {

	public static void main(String[] args) {
		
		int nums [] = {3,1,2,3,0,4,3,5};
		int val = 3;
		
		System.out.println(removeElementsAndCount(nums,val));
		
		
		
	}

	private static int removeElementsAndCount(int[] nums, int val) {
		
        int c =0;
       // int a [] = new int[];
       for (int i =0; i< nums.length;i++){
           if (nums[i] != val){
        	   nums[c] = nums[i];
              
               c++;

           }
          
       }
		return c;
		
		
	}

}
