//Two sisters, A and B, play the piano every day. During the day, they can play in any order. That is, A might play first and then B, or it could be B first and then A. But each one of them plays the piano exactly once per day. They maintain a common log, in which they write their name whenever they play.
//
//        You are given the entries of the log, but you're not sure if it has been tampered with or not. Your task is to figure out whether these entries could be valid or not.
//
//        Input: The first line of the input contains an integer T denoting the number of test cases. The description of the test cases follows. The first line of each test case contains a string s denoting the entries of the log.
//
//        Output: For each test case, output yes or no according to the answer to the problem.
//
//        Constraints:
//
//        1 ≤ T ≤ 500,
//
//        2 ≤ |s| ≤ 100
//
//        |s| is even
//
//        Each character of s is either 'A' or 'B'
//
//        Example Input:
//
//        3
//
//        AB
//
//        ABBA
//
//        ABAABB
//
//        Example Output:
//
//        yes
//
//        yes
//
//        no
//
//        Explanation:
//
//        Testcase 1: There is only one day, and both A and B have played exactly once. So this is a valid log. Hence 'yes'.
//
//        Testcase 2: On the first day, A has played before B, and on the second day, B has played first. Hence, this is also a valid log.
//
//        Testcase 3: On the first day, A played before B, but on the second day, A seems to have played twice. This cannot happen, and hence this is 'no'.
//

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Codechef
{
  public static void main (String[] args) throws java.lang.Exception
  {
    Scanner inputReader = new Scanner(System.in);
    int noOfTestCases = inputReader.nextInt();
    String sequence = inputReader.nextLine();
    boolean[] validPatternOrNot = new boolean[3];

    for(int i =0;i<noOfTestCases;i++){
      sequence = inputReader.nextLine();
      validPatternOrNot[i] = checkOccurence(sequence);
    }

    for(boolean val : validPatternOrNot){
      if(val == true)
        System.out.println("yes");
      else
        System.out.println("no");
    }

  }

  public static boolean checkOccurence(String chars){
    boolean flag = true;
    if(chars.length() >=3){
      for(int j =2; j<chars.length(); j=j+2){
        if(chars.charAt(0) == chars.charAt(j)){
          flag = false;
          break;
        }
      }
    }
    else{
      if(chars.length() == 2){
        if(chars.charAt(0) == chars.charAt(1))
          flag = false;
        else
          flag = true;
      }
      else{
        flag = true;
      }
    }
    return flag;
  }
}
