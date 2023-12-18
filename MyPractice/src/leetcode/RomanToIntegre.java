package leetcode;

import java.util.HashMap;


public class RomanToIntegre {

	public static void main(String[] args) {
		
		String s = "IX";
		
		
//		int result = RomanToIntegreConversion(s);
//		System.out.println(result);
		
		int ans=romanToInt(s);
		System.out.println("given roman "+s+" "+"in Integer "+ans);
		
	}

	private static int RomanToIntegreConversion(String s) {
		
		  HashMap<Character, Integer> map = new HashMap();
	       
		  	map.put('I',1);
	        map.put('V',5);
	        map.put('X',10);
	        map.put('L',50);
	        map.put('C',100);
	        map.put('D',500);
	        map.put('M',1000);
	        
	        int res = 0;
	        
	        for (int i = 0; i < s.length()-1;i++) {
	        
	        	if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
	        		
	        		res = res - map.get(s.charAt(i));
	        		
	        	
	        	}else
	        	
	        	
	        	res = res + map.get(s.charAt(i));
	        	//System.out.println(res);
	        	
	        }
	        
	        System.out.println(map.get(s.charAt(s.length()-1)));
	        
	        return res + map.get(s.charAt(s.length()-1));
	        
	        
	        		
	}
	
	 public static int romanToInt(String s) {
         int ans = 0, num = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1; break;
                case 'V': num = 5; break;
                case 'X': num = 10; break;
                case 'L': num = 50; break;
                case 'C': num = 100; break;
                case 'D': num = 500; break;
                case 'M': num = 1000; break;
            }
            System.out.println(4*num);
            if (4 * num < ans) ans -= num;
            else ans += num;
        }
        return ans;
    }

}
