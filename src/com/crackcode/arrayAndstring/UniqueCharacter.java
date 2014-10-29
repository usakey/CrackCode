/*
 * 1.1 Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?
 */

package com.crackcode.arrayAndstring;

public class UniqueCharacter {
  public static void main(String[] args){
    String s1 = "abcd";
    String s2 = "abca";

    System.out.println("s1 is unique?" + UniqueCharacter.isUnique(s1));
    System.out.println("s2 is unique?" + UniqueCharacter.isUnique(s2));

    System.out.println("s1 is unique?" + UniqueCharacter.isUniqueChars(s1));
    System.out.println("s2 is unique?" + UniqueCharacter.isUniqueChars(s2));

  }
  /* time O(n), space O(n)
   * assume char set is ASCII
   */
  public static boolean isUnique(String str){
    boolean[] Char_set = new boolean[256];
    for(int i=0; i<str.length(); i++){
      int index = str.charAt(i);
      if(Char_set[index])return false;
      Char_set[index] = true;
    }
    return true;
  }

  /*
   * reduce a little space by bit vector
   * TO BE INVESTIGATED
   */
  public static boolean isUniqueChars(String str) {
    int checker = 0;
    for (int i = 0; i < str.length(); ++i) {
      int val = str.charAt(i) - 'a';
      if ((checker & (1 << val)) > 0) return false;
        checker |= (1 << val);
        System.out.println(checker);
      }
      return true;
    }
}
