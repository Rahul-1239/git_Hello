import java.util.Scanner;
class SolutionA { 
    // Returns index of x if it is present in arr[], 
    // else return -1 
    
    public static int upgradBookSearch(int arr[], int x) 
    { 
        int start = 0, end = arr.length; 
        while (start <= end) { 
            int m = start + (end - start) / 2; 
  
            // Check if x is present at mid 
            if (arr[m] == x) 
                return m; 
  
            // If x greater, ignore left half 
            if (arr[m] < x) 
                start = m + 1; 
  
            // If x is smaller, ignore right half 
            else
                end = m - 1; 
        } 
  
        // if we reach here, then element was 
        // not present 
        return -1; 
    } 
  
    // Driver method to test above 
    public static void main(String args[]) 
    { 
        SolutionA ob = new SolutionA(); 
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
      int x=scanner.nextInt();
        int arr[] = new int[size + 1];

        for (int i = 1; i <= size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int result = ob.upgradBookSearch(arr, x); 
        if (result == -1) 
            System.out.println("NOT_FOUND"); 
        else
            System.out.println(result); 
    } 
}