import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// worst Brute Force solution
public class LeetCodeUberPairsWithEqualSums {

  static int[] inputs = {9,4,3,1,7,12};
  static List<List<Integer>> al = new ArrayList<>();

  public static void main(String[] args) {
    int sum = 0;
    for(int i = 0; i<inputs.length - 1;i++){
      for(int j = i+1; j<inputs.length;j++){
         sum = inputs[i] + inputs[j];
        for(int k = i+1; k<inputs.length - 1;k++){
          List<Integer> smallAl = new ArrayList<>();
          for(int l = k+1; l<inputs.length;l++) {
            if (k != j && l!= j) {
              if (sum == inputs[k] + inputs[l]) {
                smallAl.add(inputs[i]);
                smallAl.add(inputs[j]);
                smallAl.add(inputs[k]);
                smallAl.add(inputs[l]);
              }
            }
          }
          if(smallAl.size() != 0)
            al.add(smallAl);
        }

      }
    }

    System.out.println(al);
  }
}
