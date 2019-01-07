package LeedCode;

import java.util.TreeSet;

class Solution804 {
    public int uniqueMorseRepresentations(String[] words) {
    	String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    	TreeSet<String> set = new TreeSet<>();
    	for(String word:words) {
    		StringBuilder res = new StringBuilder();
    		for(int i=0;i<word.length();i++) {
    			res.append(codes[word.charAt(i)-'a']);
    		}
    		set.add(res.toString());
    	}
    	return set.size(); 	
    }
}
public class LeedCode804 {
	public static void main(String[] args) {
		Solution804 solution = new Solution804();
		String[] words = {"gin", "zen", "gig", "msg"};
		System.out.println(solution.uniqueMorseRepresentations(words));
	}
}
