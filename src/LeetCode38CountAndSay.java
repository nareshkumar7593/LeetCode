public class LeetCode38CountAndSay {

    public static String countAndSay(int n) {
      if(n == 1)
        return "1";
      String num = "11";
      while(n > 2){
        StringBuilder newStr = new StringBuilder();
        for(int i =0; i <num.length();i++){
          for(int j =i+1; j<num.length();j++){
            if(num.charAt(i) == num.charAt(j) && j == num.length() - 1){
              newStr.append(j-i + 1);
              newStr.append(num.charAt(i));
              i = j+1;
              num = newStr.toString();
            }
            else if(num.charAt(i) != num.charAt(j)){
              newStr.append(j-i);
              newStr.append(num.charAt(i));
              i = j;
            }
          }
          if(i == num.length()-1){
            newStr.append(1);
            newStr.append(num.charAt(i));
            num = newStr.toString();
          }

        }
        n--;
      }
      return num;
    }


  public static void main(String[] args) {
    String output = countAndSay(4);
    System.out.println(output);
  }
}
