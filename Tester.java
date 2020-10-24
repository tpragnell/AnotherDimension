import java.util.Arrays;
import java.lang.Math;

public class Tester{


  public static void main(String[] args) {
    // int len = args.length;
    // int[] b = new int[len];
    // for(int i=0; i<len; i++){
    //   b[i] = Integer.parseInt(args[i]);
    // }
    int[][] a = {{  1,  0, 12, -1 },
                 {  7, -2,  2,  1 },
                 { -5, -2,  2, -9 }};
    int[] b = { 1, 3 ,5 };

    // Test Method "sum"
    System.out.println( "The sum is " + ArrayOps.sum(b));

    // Test Method "largest"
    System.out.println( "The largest value is " + ArrayOps.largest(b));

    //Test Method "sumRows"
    System.out.println( "The sum of the rows is " + Arrays.toString(ArrayOps.sumRows(a)));

  }
}
