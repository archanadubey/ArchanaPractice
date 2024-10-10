package StringPractice;

import java.util.List;


public class StringCompair {

	public static void main(String[] args) {
		
		String s = "I love myself";
		String s1 = "I  myself";
		String s2 = "Love YourSelf";
		// "==" is used for reference equality, 
		//which means that it checks whether two objects refer to the same memory location. 
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		System.out.println(s2==s1);
		
		
		
		String hs = new String("name");
		String scp = hs.toString();
		
		System.out.println(scp);
		
		// concat
		String str = "Arch";
		str.concat("ana");
		
		System.out.println(str);
		
	

	}

}
