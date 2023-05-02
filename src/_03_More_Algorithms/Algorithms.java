package _03_More_Algorithms;

import java.util.List;

/*
 * Write your methods in this class
 */
public class Algorithms {
    
    public static String multiply(int num1, int num2) {
    	int num3 = num1*num2;
    	String answer = num1 + " x "+ num2 +""+" = " + num3;
        return answer;
    }
    public static boolean isPrime(int num1) {
		if(num1%2==0 && !(num1==2)) {
			return false;
		}
		else if(num1%3==0 && !(num1==3)) {
			return false;
		}
		else if(num1%5==0 && !(num1==5)) {
			return false;
		}
		else if(num1%7==0 && !(num1==7)) {
			return false;
		}
		else if(num1%11==0 && !(num1==11)) {
			return false;
		}
		else if(num1%17==0 && !(num1==17)) {
			return false;
		}
		else {
    	return true;
		}
    }
    public static boolean isSquare(int num1) {
		int k = 1;
    	for (int i = 0; i < 110; i++) {
			if(num1==i*i) {
				k=2;
			}
    	}
			if(k==2) {
				return true;
			}
			else {
				return false;
			}
		}
    public static boolean isCube(int num1) {
		int k = 1;
    	for (int i = 0; i < 10; i++) {
			if(num1==i*i*i) {
				k=2;
			}
    	}
			if(k==2) {
				return true;
			}
			else {
				return false;
			}
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
			for (int j = 0; j < results.size()-1; j++) {
				if(results.get(j)>results.get(j+1)) {
					Double temp = results.get(j);
					results.set(j, results.get(j+1));
					results.set(j+1, temp);
				}
			}
		}
			return results;
		}
	public static List<String> sortDNA (List<String> unsorted) {
		List<String> sort = unsorted;
		for (int i = 0; i < sort.size(); i++) {
			for (int j = 0; j < sort.size()-1; j++) {
				if(unsorted.get(j).length()>unsorted.get(j+1).length()) {
					 String temp = sort.get(j);
	                    sort.set(j, sort.get(j+1));
	                    sort.set(j+1,temp);
				}
			}
		}
		return sort;
		
	}
	public static  List<String> sortWords(List<String> words) {
		List<String> answer=words;
		for (int i = 0; i < answer.size(); i++) {
			for (int j = 0; j < answer.size()-1; j++) {
				if (answer.get(j).compareTo(answer.get(j+1)) > 0) {
					String temp = answer.get(j);
                    answer.get(j).equals(answer.get(j+1));
                    answer.get(j+1).equals(temp);
				}
			}
		}
		return answer;
	}
}
