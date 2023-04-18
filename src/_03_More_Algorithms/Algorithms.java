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

	public static String findLongestWord(List<String> words) {
		String answer="";
		for (int i = 0; i < words.size(); i++) {
			if(words.get(i).length() > answer.length()) {
				answer = words.get(i);
			}
			
		}
		return answer;
	}
	
	public static boolean containsSOS(List<String> words) {
	boolean answer = false;
	for (int i = 0; i < words.size(); i++) {
		if(words.get(i).contains("... --- ...")) {
			answer=true;
		}
	}
		return answer;
	}
	public static List<Double> sortScores (List<Double> words) {
		List<Double> results=words;	
		for (int i = 0; i < results.size(); i++) {
/*			for (int j = 0; j < results.size()-1; j++) {
				if(results.get(j)>results.get(j+1)) {
					Double temp = results.get(j);
					results.get(j)=results.get(j+1);
					results.get(j+1)=temp;
				}
			}
*/		}
			return results;
		}
	public static List<String> sortDNA (List<String> unsorted) {
		List<String> sort = unsorted;
		for (int i = 0; i < sort.size(); i++) {
			for (int j = 0; j < sort.size()-1; j++) {
				if(unsorted.get(j).length()>unsorted.get(j+1).length()) {
					 int temp = sort.get(j);
	                    arr[k] = arr[ k+1 ];
	                    arr[ k+1 ] = temp;
				}
			}
		}
		return null;
		
	}
}
