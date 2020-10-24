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

    int[][] c = {{  1,  2,  3,  4 },
                 {  2,  3,  4,  1 },
                 {  3,  4,  1,  2 }};

    int[][] d = {{  1,  1,  1 },
                 {  2,  2,  2 },
                 {  3,  3,  3 }};

    int[][] e = {{  2,  2,  2 },
                 {  2,  2,  2 }};

    int[][] f = {{  2,  4,  2 },
                 {  2,  2,  2 }};

    // Test Method "sum"
    System.out.println( "The sum is " + ArrayOps.sum(b));

    // Test Method "largest"
    System.out.println( "The largest value is " + ArrayOps.largest(b));

    //Test Method "sumRows"
    System.out.println( "The sums of the rows are " + Arrays.toString(ArrayOps.sumRows(a)));

    //Test Method "largestInRows"
    System.out.println( "The largest in the rows is " + Arrays.toString(ArrayOps.largestInRows(a)));

    // Test Method "sum2D"
    System.out.println( "The sum of the 2D array is " + ArrayOps.sum2D(a));

    // Test Method "sumCols"
    System.out.println( "The sums of the cols are " + Arrays.toString(ArrayOps.sumCols(a)));

    // Test Method "isRowMagic"
    System.out.println( "Is this rowMagic? " + ArrayOps.isRowMagic(c));
    System.out.println( "Is this rowMagic? " + ArrayOps.isRowMagic(d));
    System.out.println( "Is this rowMagic? " + ArrayOps.isRowMagic(e));

    // Test Method "isColMagic"
    System.out.println( "Is this colMagic? " + ArrayOps.isColMagic(c));
    System.out.println( "Is this colMagic? " + ArrayOps.isColMagic(d));
    System.out.println( "Is this colMagic? " + ArrayOps.isColMagic(e));

    // Test Method "isLocationMagic"
    System.out.println( "Is this locationMagic? " + ArrayOps.isLocationMagic(f, 0, 1));
    System.out.println( "Is this locationMagic? " + ArrayOps.isLocationMagic(f, 1, 1));

  }
}
