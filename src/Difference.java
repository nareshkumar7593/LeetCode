/**
 *
 */
package io.test.java_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Muthusankar
 *
 */
public class Difference {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the total number elements");
    int totalNumbers = in.nextInt();
    List<Integer> numberList = new ArrayList<>();
    for(int i=0;i<totalNumbers;i++) {
      int number = in.nextInt();
      numberList.add(number);
    }
    System.out.println("size of list" +numberList.size());
    int difference= 1;
    boolean status=true;
    for(int i=0;i<numberList.size()-1;i++) {
      int current=numberList.get(i);
      System.out.println("current number"+current);
      int next= numberList.get(i+1);
      if(current - next != difference) {
        status= false;
      }
    }
    System.out.println("difference between all numbers is 1"+status);
  }

}