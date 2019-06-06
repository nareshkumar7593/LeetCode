public class LeetCode665NonDecreasingArray {

    public static boolean checkPossibility(int[] nums) {
      int count = 0;
      for(int i = 0; i<nums.length - 1; i++){
        if(nums[i] > nums[i+1]){
          if(i>0)
          {
            if(nums[i-1]<=nums[i+1])
              nums[i]=nums[i-1];
            else
              nums[i+1]=nums[i];
          }
          count++;
        }
        if(count > 1)
          return false;
      }
      return true;
    }

  public static void main(String[] args) {
      int[] num = {-1,4,2,3};
      boolean flag = checkPossibility(num);
      System.out.println(flag);
  }
  }

