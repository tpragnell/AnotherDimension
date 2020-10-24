import java.util.Arrays;
import java.lang.Math;

public class Tester{


  public static void main(String[] args) {
    // Test Method "sum"
    int len = args.length;
    int[] array = new int[len];
    for(int i=0; i<len; i++){
      array[i] = Integer.parseInt(args[i]);
    }
    System.out.println( "The sum is " + ArrayOps.sum(array));
  }
}
