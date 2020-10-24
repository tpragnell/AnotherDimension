import java.util.Arrays;
import java.lang.Math;

public class Tester{


  public static void main(String[] args) {
    int len = args.length;
    int[] array = new int[len];
    for(int i=0; i<len; i++){
      array[i] = Integer.parseInt(args[i]);
    }

    // Test Method "sum"
    System.out.println( "The sum is " + ArrayOps.sum(array));

    // Test Method "largest"
    System.out.println( "The largest value is " + ArrayOps.largest(array));
  }
}
