public class LeetCode6ZigZagConversion {

    public String convert(String s, int numRows) {
      int rows = numRows;
      int oddValue = 3;
      for(int j = 3; j<numRows; j++){
        oddValue += 2;
      }
      System.out.println(oddValue);
      int k = 0;
      int otherValue = 1;
      StringBuilder sb=new StringBuilder();

      for(int i = 0; i< numRows; i++){
        sb.append(s.charAt(i));

        while(k < s.length() - 1){

          k += oddValue + 1;
          if ((i == 0 || i == numRows - 1) && k < s.length() - 1)
            sb.append(s.charAt(k));


          if(i >= 1 && i< numRows - 1) {
            sb.append(s.charAt(k));
            k += otherValue;
            if(k < s.length() - 1)
              sb.append(s.charAt(k));
          }

        }
        k = i+1;
        oddValue -= 2;
        otherValue += 2;
      }

      return sb.toString();
    }

  public static void main(String[] args) {
    LeetCode6ZigZagConversion soln = new LeetCode6ZigZagConversion();
    String output = soln.convert("PAYPALISHIRING",4);
    System.out.println(output);


  }

}
