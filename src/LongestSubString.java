import java.util.HashSet;
import java.util.Set;

class LongestSubString {
  public static int lengthOfLongestSubstring(String s) {
    int count = 0;
    for(int i =0;i <s.length();i++){
      for(int j =i+1; j<=s.length(); j++){
        if(checkUnique(s,i,j))
          count = Math.max(count, j - i);

      }
    }
    return count;
  }
  public static boolean checkUnique(String s, int i, int j){
    Set<Character> c = new HashSet<Character>();
    for(int k = i; k<j; k++){
      if(c.contains(s.charAt(k)))
        return false;
      c.add(s.charAt(k));
    }
    return true;
  }

  public static void main(String[] args) {
    int values = lengthOfLongestSubstring("Naresh");
    System.out.println(values);
  }
}