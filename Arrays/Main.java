// Basic.java (no longer public class)
class Basic {

    // You can implement the method logic here
    void demoArrays(){
       int[] age = new int[5];
       float[] weights = new float[3];
       //hey

       age[0] =34;

       System.out.println(age[0]);
    }
 }
 
 // Main.java (public class)
 public class Main {
     public static void main(String[] args) {
         Basic obj = new Basic();
         obj.demoArrays();  // Call method from Basic class

     }
 }
 