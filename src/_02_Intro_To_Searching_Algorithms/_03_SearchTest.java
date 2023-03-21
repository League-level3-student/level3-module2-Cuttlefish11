package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import _00_Intro_to_Sorting_Algorithms._02_SwappingDigits;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
    	String[] words = {"red", "orange","yellow","green","blue","purple"};
        String value = "green";
         assertEquals(_01_LinearSearch.linearSearch(words, value), 3);
     
    }
    @Test
    public void testLinearSearch2() {
    	String[] words = {"one", "two","three","four","five","six", "seven"};
        String value = "one";
         assertEquals(_01_LinearSearch.linearSearch(words, value), 0);
     
    }
    @Test
    public void testLinearSearch3() {
    	String[] words = {"dark", "gloomy", "murky", "dim","tenebrous"};
        String value = "tenebrous";
         assertEquals(_01_LinearSearch.linearSearch(words, value), 4);
     
    }
    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
    	int[] array = {4, 9, 16, 25, 36, 49, 64, 81, 100, 121};
        int value = 64;
         assertEquals(_02_BinarySearch.binarySearch(array, 0, array.length, value), 6);
    }
    @Test
    public void testBinarySearch2() {
    	int[] array = {0,1,2,3,4,5};
        int value = 0;
         assertEquals(_02_BinarySearch.binarySearch(array, 0, array.length, value), 0);
    }
    @Test
    public void testBinarySearch3() {
    	int[] array = {2, 4, 8, 16, 32, 64, 128};
        int value = 128;
         assertEquals(_02_BinarySearch.binarySearch(array, 0, array.length, value), 6);
    }
}
