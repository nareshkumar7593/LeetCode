public class NumberTank {
  public static int maxArea(int[] height) {
    int max = 0,capacity = 0;
    for(int i = 0; i<height.length; i++){
      for(int j = 0; j<height.length; j++){
        capacity = Math.abs(Math.min(height[i], height[j]) * (j - i));
        if(max < capacity){
          max = capacity;
        }
        capacity = 0;
      }
    }
    return max;
  }

  public static void main(String[] args) {
      int[] heights = {2,3,4,5,18,17,6};
      int maxValue = maxArea(heights);
      System.out.println(maxValue);
  }
}
