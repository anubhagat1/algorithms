public class BubbleSort {

  private static int[] arr = {10, 45, 7, 20, 56, 94, 67, 6, 18, 91, 83, 12, 4}; 
  
  public static void main (String args[]) {
  
    printArray ();
    sort ();
    printArray ();
  
  }
  
  private static void printArray() {
    
    System.out.println(" Unsorted Array: " + Arrays.toString(arr));
  
  }
  
  private static void sort() {
    
    int N = arr.length; 
    for (int i=0; i < N - 1; i++) {
      for (int j=0; j < N - i - 1; j++) {
        
        if(arr[j] > arr[j+1]) 
          swap (j, j+1);
        
      }  
    }
  }
}

private static void swap (int curr_idx, int swapwith_idx) {
  
  int temp = arr[curr_idx];
  arr[curr_idx] = arr[swapwith_idx];
  arr[swapwith_idx] = temp;
}
