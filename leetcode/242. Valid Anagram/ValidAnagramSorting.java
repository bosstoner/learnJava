/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
*/
// Solution complexity: O(n log n)

import java.util.Arrays;

class ValidAnagramSorting {
    public static void main (String[] args) {
        String s = "anagram";
        String t = "nagaram";
        
        ValidAnagramSorting instance = new ValidAnagramSorting();
        boolean fina = instance.isAnagram(s, t);
        System.out.println(fina);
    }

    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        
        Arrays.sort(sChars);
        Arrays.sort(tChars);
        
        return Arrays.equals(sChars, tChars);
    }
}