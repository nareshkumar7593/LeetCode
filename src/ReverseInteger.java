import java.util.Scanner;

public class ReverseInteger {

  public static int reverseInteger(int num){
    int val =0;int a = 1;
    for(a = 1; a<Integer.MAX_VALUE;a=a*10){
      val = num/a;
      if(val >=-9 && val <=9){
        break;
      }
    }
    int j = a * 10;
    int m = j/10;
    int d = 1;
    int sum = 0;
    int digit = 0;

  if(num >= -9 && num <=9){
    return num;
  }
  else{
    for(int i = 10; i<=j ;i=i*10){
      digit = num % i;
      sum += (digit/d) * m;
      d = d * 10;
      m = m/10;
    }
    return sum;
  }
  }

  public static void main(String[] args) {
    Scanner inputReader = new Scanner(System.in);
    int number = inputReader.nextInt();
    int reversedInteger = reverseInteger(number);
    System.out.println(reversedInteger);
  }
}
