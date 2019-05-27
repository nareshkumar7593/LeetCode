import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LeetCode49GroupAnagrams {
   public static List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> outerList = new ArrayList<>();


      for(int k = 0; k<strs.length-1;k++) {

        if (strs[k] != null) {
          List<String> innerList = new ArrayList<>();
          Map<Character, Integer> charMap = new HashMap<>();
          String s = strs[k];
          innerList.add(s);
          for (int i = 0; i < s.length(); i++) {
            if (charMap.containsKey(s.charAt(i)))
              charMap.put(s.charAt(i), charMap.get(s.charAt(i)) + 1);
            else
              charMap.put(s.charAt(i), 1);
          }


          for (int j = k + 1; j < strs.length; j++) {
            if(strs[j] != null){
              Map<Character, Integer> charSubMap = new HashMap<>();
            String subS = strs[j];

            for (int l = 0; l < subS.length(); l++) {
              if (charSubMap.containsKey(subS.charAt(l)))
                charSubMap.put(subS.charAt(l), charSubMap.get(subS.charAt(l)) + 1);
              else
                charSubMap.put(subS.charAt(l), 1);
            }


            if (charMap.equals(charSubMap)) {
              innerList.add(subS);
              strs[j] = null;
              strs[k] = null;
            }
          }
        }
        //if(s.length() != 0)
          outerList.add(innerList);
        }
      }
      for(String remaining:strs){
        List<String> newInnerList = new ArrayList<>();
        if(remaining != null){
          newInnerList.add(remaining);
          outerList.add(newInnerList);
        }
      }
      return outerList;
    }

  public static void main(String[] args) {
    List<List<String>> finalList = new ArrayList<>();
    String[] inputs = {"","b"};
    finalList = groupAnagrams(inputs);
    System.out.println(finalList);
  }
}
