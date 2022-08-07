package _02_Intro_To_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _03_SearchTest {

    /*
     *  A minimum of 3 tests are required for each method
     */

    @Test
    public void testLinearSearch() {
        // 1. Use the assertEquals() method to test your linear search method
        String[] stringArray = new String[] {"a", "bc", "def", "gehi", "jklmn"};
    	
    	assertEquals(1, _01_LinearSearch.linearSearch(stringArray, "bc"));
    	assertEquals(4, _01_LinearSearch.linearSearch(stringArray, "jklmn"));
    	assertEquals(-1, _01_LinearSearch.linearSearch(stringArray, "sda"));
    
    }

    @Test
    public void testBinarySearch() {
        // 2. Use the assertEquals() method to test your binary search method
        //    remember that the array must be sorted
       int[] intArray = new int[] {1, 2, 63, 35, 100};
    	
       assertEquals(0, _02_BinarySearch.binarySearch(intArray, 0, 5, 1));
       assertEquals(4, _02_BinarySearch.binarySearch(intArray, 0, 5, 100));
       assertEquals(-1, _02_BinarySearch.binarySearch(intArray, 0, 5, 53));
    }
}
