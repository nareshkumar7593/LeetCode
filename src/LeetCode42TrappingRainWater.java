import java.util.Stack;

public class LeetCode42TrappingRainWater {

//    public int trap(int[] height) {
//      int difference = 0;
//      for(int i = 0; i<height.length-1; i++){
//        for(int j = i+1; j<height.length;j++){
//          if(height[i] != height[j] && height[i] != 0){
//            if(height[i] > height[j]){
//              difference += Math.abs(height[i] - height[j]);
//            }
//            if(height[i] < height[j]){
//              i = j-1;
//              break;
//            }
//          }
//          else if(height[i] != 0)
//            difference += Math.abs(height[i] - height[j]);
//
//        }
//      }
//      return difference;
//    }


  int trap(int[] height)
  {
    int ans = 0, current = 0;
    Stack st = new Stack();
    while (current < height.length) {
      while (!st.empty() && height[current] > height[(int)st.peek()]) {
        int top = (int)st.peek();
        st.pop();
        if (st.empty())
          break;
        int distance = current - (int)st.peek() - 1;
        int bounded_height = Math.min(height[current], height[(int)st.peek()]) - height[top];
        ans += distance * bounded_height;
      }
      st.push(current++);
    }
    return ans;
  }

  public static void main(String[] args) {
    LeetCode42TrappingRainWater lc = new LeetCode42TrappingRainWater();
    int[] input = {0,1,0,2,1,0,1,3,2,1,2,1};
    int output = lc.trap(input);

    System.out.println(output);

  }
}
