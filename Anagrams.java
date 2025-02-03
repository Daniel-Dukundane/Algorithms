/**
 * This class includes a method to check if two strings are anagrams of each other.
 *
 * @author Daniel Dukundane
 * @version 1.0
 * File: Anagrams.java
 * Created: Feb 2025
 * Tutorial: Structy Course
 *
 * Description: This class includes a method to check if two strings are anagrams of each other.
 * A hashmap is used to track the count of each character in the strings.
 * This is used after to check if the two strings have the same character count and if they do, they are anagrams.
 */

import java.util.HashMap;

public class Anagrams {
    public static HashMap<Character, Integer> charCount(String s){
    HashMap<Character, Integer> count = new HashMap<Character, Integer>();
    for(char c : s.toCharArray()){
      if(count.get(c) == null){
        count.put(c,0);
      }
      count.put(c , count.get(c) + 1 );
    }
    return count;
    
  }
  public static boolean anagrams(String s1, String s2) {
    return charCount(s1).equals(charCount(s2));
  }

    public static void main(String[] args) {
        System.out.println(anagrams("listen", "silent"));
        System.out.println(anagrams("triangle", "integral"));
        System.out.println(anagrams("hello", "world"));
    }
}
