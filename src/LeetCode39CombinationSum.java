import java.util.ArrayList;
import java.util.List;

class LeetCode39CombinationSum {
  static List<List<Integer>> res = new ArrayList<>();
  static List<List<Integer>> outputRes = new ArrayList<>();
  static List<Integer> cur = new ArrayList<Integer>();

  public static List<List<Integer>> combinationSum(int[] candidates, int target) {
    find(candidates, 0, target);
    return res;
  }

  public static void main(String[] args) {
    int[] inputs = {2,3,6,7};
    int target_ = 7;
    outputRes = combinationSum(inputs, target_);
    System.out.println(outputRes);
  }

  static void find(int[] nums, int start, int target) {
    if (target == 0) {
      res.add(new ArrayList<>(cur));
    } else if (target > 0) {
      for (int i = start; i < nums.length; i++) {
        cur.add(nums[i]);
        find(nums, i, target-nums[i]);
        cur.remove(cur.size()-1);
      }
    }
  }
}