/*
 * 1.3 Design an algorithm and write code to remove the duplicate characters
 * in a string without using any additional buffer.
 * NOTE: One or two additional variables are fine. An extra copy of the array is not.
 * FOLLOW UP
 * Write the test cases for this method.
 */
package com.crackcode.arrayAndstring;

public class DuplicateCharacter {
  public static void main(String[] args){
    String str1 = "aaaabbbb";
    String str2 = "abcd";
    String str3 = null;
    String str4 = "ababcacd";
    String str5 = "aaaa";

    char[] c1 = str1.toCharArray();
    char[] c2 = str2.toCharArray();
//    char[] c3 = str3.toCharArray();
    char[] c4 = str4.toCharArray();
    char[] c5 = str5.toCharArray();

    DuplicateCharacter.duplicateCharacterRemoveEff(c1);
    DuplicateCharacter.duplicateCharacterRemoveEff(c2);
//    DuplicateCharacter.duplicateCharacterRemove(c3);
    DuplicateCharacter.duplicateCharacterRemoveEff(c4);
    DuplicateCharacter.duplicateCharacterRemoveEff(c5);

    System.out.println(c1);
    System.out.println(c2);
//    System.out.println(c3);
    System.out.println(c4);
    System.out.println(c5);
  }
/*
 * First method: three steps
 *  1. For each character, check if it is a duplicate of already found characters
 *  2. Skip duplicate characters and update the non duplicate characters.
 *  3. Set duplicated char as 0
 *  Time: O(n^2)
 */
  public static void duplicateCharacterRemove(char[] str){
    if (str==null) return;
    if (str.length < 2) return;


    int tail = 1;
    for(int i=1; i<str.length; i++){
      int j;
      for(j=0; j<tail; j++){
        if(str[i] == str[j]) break;
      }
      if(j == tail){
        str[tail] = str[i];
        ++tail;
      }
//      str[tail] = 0;
    }
    for(int i=tail; i<str.length; i++) str[i] = 0;
  }


  /*
   * Second method: Algorithm—With Additional Memory of Constant Size
   *
   */
  public static void duplicateCharacterRemoveEff(char[] str){
    if (str==null) return;
    if (str.length < 2) return;

    int tail = 1;
    boolean[] Char_set = new boolean[256];
      Char_set[str[0]] = true;
    for(int i=1; i<str.length; i++){
      if(!Char_set[str[i]]){
        str[tail] = str[i];
        ++tail;
        Char_set[str[i]] = true;
      }
    }
    for(int i=tail; i<str.length; i++) str[i] = 0;
  }
}


