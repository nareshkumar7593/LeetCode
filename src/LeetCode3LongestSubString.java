import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LeetCode3LongestSubString {
  public static int lengthOfLongestSubstring(String s) {
    Set<Character> characterSet = new HashSet<>();
    int i =0, j=0,ans =0, n= s.length();
    while(i < n && j < n){
      if(!characterSet.contains(s.charAt(j))){
        characterSet.add(s.charAt(j++));
        ans = Math.max(ans,j - i);
      }
      else{
        characterSet.remove(s.charAt(i++));
      }
    }
    return ans;
  }

  public static void main(String[] args) {
//    Scanner inputReader = new Scanner(System.in);
//    String value = inputReader.nextLine();
    int count = lengthOfLongestSubstring("pwwkew");
    System.out.println(count);
  }
}


