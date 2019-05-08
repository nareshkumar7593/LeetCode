public class LeetCode53MaximumSubArray {


  public int maxSubArray(int[] nums) {
    int sum = 0, res = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      sum = sum + nums[i];
      res = Math.max(sum, res);
      if (sum < 0) {
        sum = 0;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    LeetCode53MaximumSubArray lc = new LeetCode53MaximumSubArray();
     int[] input = {-2,1,-3,4,-1,2,1,-5,4};
     int output = lc.maxSubArray(input);
     System.out.println(output);
  }
}
