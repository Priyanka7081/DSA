class ArraysExample{

    void multiArrays(){
      //  int[][] arr_1 = new int[5][3]; 
        int[][] arr = {{4,5,6},{7,8,9},{10,11,12}};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);

        System.out.println(arr[1][0]);
        System.out.println(arr[1][1]);
        System.out.println(arr[1][2]);

        System.out.println(arr[2][0]);
        System.out.println(arr[2][1]);
        System.out.println(arr[2][2]);
    }
    void demoArrays(){
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] name = {"Sonu", "Uttam","Pihu"};

        ages[0] = 34;
        ages[1] = 12;
        ages[2] = 45;

       // weights[0] = 23.8f;
      //  weights[1] = 87.5f;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);


        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

    }
}

public class Main {
    public static void main(String[] args) {
        ArraysExample obj = new ArraysExample();
       // obj.demoArrays();
       obj.multiArrays();
        
    }
}
