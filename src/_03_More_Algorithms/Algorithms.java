package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
        return null;
    }
    
    public static int findBrokenEgg(List<String> eggs) {
    	for (int i = 0; i < eggs.size(); i++) {
			if(eggs.get(i).equals("cracked")) {
				return i;
			}
		}
        return 0;
    }
    public static int countPearls( List<Boolean> oysters) {
    	int num = 0;
    	for (int i = 0; i < oysters.size(); i++) {
			if(oysters.get(i)) {
				num++;
			}
		}
    	return num;
    	
    }

	public static int findLongestWord(List<String> words) {
		String answer=":)";
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length()>words.get(i-1).length()) {
				
			}
			
		}
		return 0;
	}
}
