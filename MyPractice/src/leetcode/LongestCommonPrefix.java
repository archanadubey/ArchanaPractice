package leetcode;

import java.util.Arrays;

// Find the longest commom prefix in the given String Array

public class LongestCommonPrefix {

	public static void main(String[] args) {
		
		//String [] strs = {"flower","flow","flight"};
		
		 String s[] = {"flaower", "flaight", "flaow"};
		
		System.out.println(findLongestCommonPrefix(s));
		
		
		
	}

	public static String findLongestCommonPrefix(String str[]) {
		
		
		
		Arrays.sort(str);
		
		String start = str[0];
		System.out.println(str[0]);
		String end = str[str.length-1];
		//System.out.println(str[1]);
		
		int index = 0;
		while(index < start.length()) {
			
			if(start.charAt(index) == end.charAt(index)) {
				
				index++;
				
			}else
				
				break;
		}
		
		System.out.println(index == 0 ? " ": start.substring(0, index));
		
		return index == 0 ? " ":start.substring(0, index);
		//return start.substring(0, index);
	}
	/*
	 * 
	 * var longestCommonPrefix = function(strs) {
    let prefix = strs[0];  // flower
    for(let i = 1; i <strs.length; i++) {
        while(strs[i].indexOf(prefix)!== 0) {
            prefix = prefix.substring(0, prefix.length-1);
        }
    }
return prefix;
};*/

}
