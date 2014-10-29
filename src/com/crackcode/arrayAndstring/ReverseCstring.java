/*
 * 1.2 Write code to reverse a C-Style String. (C-String means that “abcd” is represented as five characters, including the null character.)
 */
package com.crackcode.arrayAndstring;

public class ReverseCstring {
  public static void main(String[] args){
    String s = "abcde";
    /*
     * First approach: reverse function of StringBuffer
     */
    StringBuffer sb = new StringBuffer(s);
    System.out.println("first result: " + s + "-->" + sb.reverse());

    /*
     *
     */
    System.out.println("second result: " + s + "-->" + ReverseCstring.stringReverse(s));

  }
  /*
   * reverse the string NOT using StringBuffer
   */
  public static String stringReverse(String str){
    String reverse = "";
    if(str != null){
      for(int i=str.length()-1; i>=0; --i){
        reverse = reverse + str.charAt(i);
      }
    }else
      System.out.println("String is NULL!");
    return reverse;
  }
}
