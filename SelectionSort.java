public class SelectionSort { 
   
   private static int[] arr = {10, 7, 89, 72, 18, 93, 37, 15, 9, 99};
    public static void main (String args[]) {
   
      printArray();
      sort();
      printArray()
        
    }
   
    public static void sort() {
    
      int N = arr.length; 
      for (int i=0; i < N -1; i++ ){ 
        int min_idx = i;
        for (int j= i+1; j < N; j++) {
          if (arr[j] < arr[min_idx])
            min_idx = j;
        }
        if (min_idx != i)
            swap (i, min_idx);
    }

  public static void swap (int curr_idx, int min_idx) {
    int temp = arr[min_idx];
    arr[min_idx] = arr[curr_idx];
    arr[curr_idx] = temp;
  }
  
  public static void printArray() {
    System.out.println("Sorted Array:" + Arrays.toString(arr)); 
  }
}
