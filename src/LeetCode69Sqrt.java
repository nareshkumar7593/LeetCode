public class LeetCode69Sqrt {
  public int mySqrt(int x) {
    long i = 0;
    if(x == 1)
      return 1;
    else{
      for(i= (long)(Math.log(x)/Math.log(2)); i<=x/2; i++){
        if((i * i) > x)
          break;
      }
      return (int)i-1;
    }
  }
}
