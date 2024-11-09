public class findMax {
    void maxOfArray(){
        int[] arr = {5, 3, 6, 2, 8, 4}; //ans = 8

        int ans = 0;

        for(int i = 0; i< arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        System.out.println("Max"+ ans);
    }




    public static void main(String[] args) {

     findMax obj = new findMax();
     obj.maxOfArray();
        
    }
    
}
