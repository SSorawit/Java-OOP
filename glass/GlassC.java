package glass;
public class GlassC {
    private int quantitymax,quantitymin,quantitywater;
    public GlassC(int quantityMax,int quantityMIN,int quantityWater){
        quantitymax = quantityMax;
        quantitymin = quantityMIN;
        quantitywater  = quantityWater;
    }
    void fillfullwater(){        
        quantitywater = quantitymax;
        System.out.println("quantity of water is : "+quantitywater);
    }
    void fillwater(int x){
        if(x > quantitymax){
            quantitywater = quantitymax;
            System.out.println("quantity of water is : "+quantitywater);
        }
        else{
            quantitywater = quantitywater+x;
            System.out.println("quantity of water is : "+quantitywater);
        }
    }
    void Pourwater(int x){
        if(x > quantitywater){
            System.out.println("Cannot pour more than the amount of water available!!!");    
        }
        else{
            quantitywater = quantitywater-x; 
            System.out.println("quantity of water is : "+quantitywater);
        }
    }
    void Pourwatertoground(){
        quantitywater = quantitymin; 
        System.out.println("quantity of water is : "+quantitywater);
    }
    void fillwaterto(int x,GlassC a){
        if(x > quantitywater){
          System.out.println("Cannot pour more than the amount of water available!!!");      
        }
        else{
            a.quantitywater = a.quantitywater+x;
            quantitywater = quantitywater - x;
            System.out.println("The amount of water in the poured glass : "+quantitywater);
            System.out.println("Amount of water in another glass : "+a.quantitywater);
        }
    }
    void fillallwaterto(GlassC a){
        a.quantitywater = quantitywater+a.quantitywater;
        quantitywater = quantitymin;
        System.out.println("The amount of water in the poured glass : "+quantitywater);
        System.out.println("Amount of water in another glass : "+a.quantitywater);
    }  
}