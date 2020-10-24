import java.util.Arrays;

public class ArrayOps{

  public static int sum(int[] arr){
    int sum = 0;
    int len = arr.length;
    for(int i=0; i<len; i++){
      sum += arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr){
    int len = arr.length;
    int largest = arr[0];
    for(int i=1; i<len; i++){
      if(arr[i] > largest)
        largest = arr[i];
    }
    return largest;
  }

  public static int[] sumRows(int[][] matrix){
    int rowsLen = matrix.length;
    int[] sums = new int[rowsLen];
    for(int i=0; i<rowsLen; i++){
      int colLen = matrix[i].length;
      for(int k=0; k<colLen; k++){
        sums[i] += matrix[i][k];
      }
    }
    return sums;
  }

  public static int[] largestInRows(int[][] matrix){
    int rowsLen = matrix.length;
    int[] biggest = new int[rowsLen];
    for(int i=0; i<rowsLen; i++){
      biggest[i] = largest(matrix[i]);
    }
    return biggest;
  }

  public static int sum2D(int[][] arr){
    return sum(sumRows(arr));
  }

  public static int[][] transformMatrix(int[][] matrix){
    // Assuming matrix is rectangular
    int rowsLen = matrix.length;
    int colsLen = matrix[0].length;
    int[][] transformed = new int[colsLen][rowsLen];
    for(int i=0; i<rowsLen; i++){
      for(int k=0; k<colsLen; k++){
        transformed[k][i] = matrix[i][k];
      }
    }
    // Debugging
    // for (int i = 0; i<colsLen; i++)
    //   System.out.println(Arrays.toString(transformed[i]));

    return transformed;
  }

  public static int[] sumCols(int[][] matrix){
    return sumRows(transformMatrix(matrix));
  }

  public static boolean isRowMagic(int[][] matrix){
    int[] array = sumRows(matrix);
    for(int i=0; i<array.length-1; i++){
      if(array[i] != array[i+1])
        return false;
    }
    return true;
  }

  public static boolean isColMagic(int[][] matrix){
    return isRowMagic(transformMatrix(matrix));
  }
}
