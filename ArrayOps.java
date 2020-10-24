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
    for(int i=0; i<len; i++){
      if(arr[i] > largest)
        largest = arr[i];
    }
    return largest;
  }






}
