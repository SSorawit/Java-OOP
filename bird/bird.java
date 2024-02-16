package lab1;
public class Lab1 {

    public static void main(String[] args) {
      mynabird P = new mynabird("David","male",10,30,0,true);
      mynabird P2 = new mynabird("Makoto","female",10,80,0,false);
      mynabird baby1 = P.breed(P2);
      mynabird baby2 = P2.breed(P);
      System.out.println("-------------------------------------");
      P.birddata();
      System.out.println("-------------------------------------");
      P2.birddata();
      System.out.println("-------------------------------------");
      P.breed(P2);
      System.out.println("-------------------------------------");
      baby2.breed(baby1);
      baby1.speak();
      baby1.eat(10);
      System.out.println(baby1.foodinstomach);
    }
}
