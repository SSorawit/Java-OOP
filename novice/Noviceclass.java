package novice;
public class Noviceclass {
    int Hp,Atk,Exp,Level,Walkcount=0;
    String Status,Job;  
    public Noviceclass(int Hp,int Atk,int Exp,int Level,String Status,String Job){
        this.Hp = Hp;
        this.Atk = Atk;
        this.Exp = Exp;
        this.Level = Level;
        this.Status = Status;     
    }
    void walk(){
        if(Status == "sit"){
            System.out.println("can't walk");
        }
        else if(Status == "dead"){
            System.out.println("you are dead");    
        }
        else{
            Walkcount += 1;
            System.out.println(Walkcount); 
        }
    }
    void sit(){
        if(Status == "dead"){
            System.out.println("you are dead");  
        }
        else{
            Status = "sit";
            System.out.println(Status);
        }
    }
    void attack(){
       if(Status == "sit"){
            System.out.println("can't attack");
       }
       else if(Status == "dead"){
           System.out.println("you are dead");
       }
       else{
            System.out.println("Ya Ya");
            System.out.println("damage is "+Atk);
        }
    }
    void dead(){
     Status = "dead";
     Walkcount = 0;
     Hp = 0;
     System.out.println(Status+"!!!");   
    }
    void situp(){
      if(Status == "dead"){
        System.out.println("you are dead");  
      }
      else{
        Status = "stand";
        System.out.println(Status);  
      }
    }
    void alive(){
        Status = "alive";
        System.out.println(Status+"!!!");   
    }
    void changejobS(){
        if(Job == "Acolyte"){
            System.out.println("You can't change job");
        }
        else if(Status == "dead"){ 
            System.out.println("you are dead");  
        }
        else{
            Job = "Swordman";
            System.out.println("You are "+Job+"!!!"); 
        }
    }
    void changejobA(){
        if(Job == "Swordman"){
            System.out.println("You can't change job");
        }
        else if(Status == "dead"){ 
            System.out.println("you are dead");  
        }
        else{
            Job = "Acolyte";
            System.out.println("You are "+Job+"!!!");
        }
    }
}
