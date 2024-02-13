package lab1;
import java.util.Scanner;
public class mynabird {
    String name,gender,babybird;
    int age;
    int weight;
    int foodinstomach;
    boolean special;
    static Scanner Keybord = new Scanner(System.in);
    public mynabird (String name,String gender,int age,int weight,int foodinatomach,boolean special){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.foodinstomach = foodinatomach;
        this.special = special;
        this.gender = gender;
    }
    void speak(){
      System.out.println("พูดสิ ");
      String speak = Keybord.nextLine().toLowerCase();
      if(speak.startsWith("speak")){
          System.out.print("นกพูด : ");
          System.out.println(speak.substring(5));
      }
      else{
          System.out.print("อายุนก : ");
          System.out.println(age);
      }
    }
    void eat(int eat){
       System.out.print("กินอาหารเท่า(g) : ");
       foodinstomach += eat;
       if(foodinstomach > weight){
           System.out.print("ท้องเสีย : ");
           System.out.println(foodinstomach=0);
       }
       else
           System.out.println(weight+=foodinstomach);
    }
    void reject(){
        if(foodinstomach > 0){
        System.out.print("ปวดท้องมั้ย(Yes/No) : ");
        String reject = Keybord.nextLine().toLowerCase();
        if(reject.startsWith("yes")){
        if(special==true){
           System.out.print("นกวิเศษกินอะไรไป : ");
           String food = Keybord.nextLine();
           System.out.print("นกวิเศษถ่ายออกมาเป็น : ");
           System.out.println(food);
        }
        else{
            System.out.print("ปวดแค่ไหน : ");
            int Reject = Keybord.nextInt();
            weight -= Reject;
            foodinstomach -= Reject;
            System.out.print("น้ำหนักเหลือ : ");
            System.out.println(weight);
        }
        }
        else{
            System.out.print("ไม่ปวดท้อง : ");
            System.out.println(weight);
        }
        }
    }
    void birddata(){
        System.out.println("Bird name is : "+name);
        System.out.println("Bird gender is : "+gender);
        System.out.println("Bird age is : "+age);
    }
    public mynabird breed(mynabird a){
       char firstchar = name.charAt(0);
       char firstchar2 = a.name.charAt(0);
       babybird = firstchar +""+firstchar2;
       if(gender == a.gender){
        System.out.println("can't breeding");
       }
       else{
        System.out.println("bird breeding>>>>>");
        System.out.println("bird 1 name is : "+name+" >>><<< "+" bird 2 name is : "+a.name);
        System.out.println("--------------babybird-DATA--------------");
        mynabird baby = new mynabird(name,gender,age,weight,foodinstomach,special);
        baby.name = firstchar+""+firstchar2;
        baby.gender = gender;
        baby.age = 0;
        baby.weight = 10;
        baby.foodinstomach = 0;
        baby.special = special;
        System.out.println("Babybird name is "+babybird);
        System.out.println("Babybird age is "+"0");
        System.out.println("Babybird gender is "+gender);
        System.out.println("Babybird is special : "+special);
        return baby;
       }
       return null;
    }
}



