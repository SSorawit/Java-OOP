package lab2.sandwatch;
public class Lab2Sandwatch {
   public static void main(String[] args) {
       Sandwatch W1 = new Sandwatch(10000,0,2);
       W1.rotate90();
       System.out.println("------------------------------------------------------------------------");
       W1.rotate90();
       System.out.println("------------------------------------------------------------------------");
       W1.rotate90();
       System.out.println("------------------------------------------------------------------------");
       W1.rotate90();
       System.out.println("------------------------------------------------------------------------");
       W1.rotate180();
       System.out.println("------------------------------------------------------------------------");
       W1.rotate180();
       System.out.println("------------------------------------------------------------------------");
       System.out.print("Sand In A and B : ");
       W1.sand();
       System.out.print("Sandtotal : ");
       W1.sandtotal();
    } 
    
}
