import java.util.Scanner;

public class LastOccurence {

    static int LastOccurence(int[] arr, int x){
        int lastIndex = -1;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] == x){
                lastIndex = i;
            }
            //priya
        }
        return lastIndex;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter" + n + "elements");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter x");
        int x = sc.nextInt();

        System.out.println("LAST OCCURENCE OF X: " + LastOccurence(arr, x));
        
    }
    
}
