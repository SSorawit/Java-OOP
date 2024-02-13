package pre.chess;
public class Pieces {
    String name;
    int position;
    public Pieces(String name){
        this.name = name;
    }
    String getName(){ 
       System.out.println("=============== name ================"); 
       System.out.println("Pieces name : "+name);
       return name;
    }
    int getPosition(){
        System.out.println("=========== getPosition ============");
        System.out.println("Pieces position "+name+" : "+position);
        return position;
    }
}
