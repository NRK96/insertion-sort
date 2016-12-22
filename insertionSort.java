public class insertionSort{
  public static void main(String[] args){
    int length = args.length;
    int[] array = new int[length];
    for(int i = 0; i < length; i++)
      array[i] = Integer.parseInt(args[i]);
    for(int i = 1; i < length; i++){
      for(int j = i; j > 0; j--){
        if(array[j] < array[j-1])
          swap(j, j-1, array);
      }
    }
    print(array);
  }
  public static void swap(int a, int b, int[] arr){
    int temp = arr[a];
    arr[a] = arr[b];
    arr[b] = temp;
  }
  public static void print(int[] arr){
    for(int i = 0; i < arr.length; i++)
      System.out.print(arr[i]+" ");
    System.out.println();
  }
}