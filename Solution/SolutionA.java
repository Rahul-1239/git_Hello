import java.util.Scanner;

public class SolutionB {
   
    public static int search(int[] userIDs, int size) {
        int value=0;
        int a=1;
        for(int i=0;i<size;i++){
            if(a == userIDs[i]){
                value=userIDs[i];
                break;
            }
            else{
                //System.out.print(userIDs[0]);
                a++;
                //System.out.print(a);
            }
        }
        return value;
    }

    /**
     * The entry point to the program
     *
     * @param args arguments that you want to pass into the program
     *
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        

        // testing the edge case that there are no user ids
        if (size == 0) {
            System.out.print("NOT_FOUND");
            return;
        }

        // initializing the user IDs
        int userIDs[] = new int[size + 1];
        for (int i = 0; i < size; i++) {
            userIDs[i] = scanner.nextInt();
        }

        int index = search(userIDs,size);

        // printing out the index if we find searchValue in the user ids array
        // otherwise print out "NOT FOUND"
        System.out.println(index == -1 ? "NOT FOUND" : index);

    }
}
