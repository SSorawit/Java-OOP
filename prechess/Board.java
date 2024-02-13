package pre.chess;
public class Board {
   int boardsize = 10;
   int positions[] = new int[boardsize];
   public Board(Pieces a,Pieces b){ 
   }
   void getPositionPieces(Pieces a,Pieces b){
       System.out.println("========= getPositionPieces =========");
       System.out.println("positionPieces "+a.name+" : "+a.position);
       System.out.println("positionPieces "+b.name+" : "+b.position);
   }
   void setBoard(Pieces a,int p1,Pieces b,int p2){
       System.out.println("============= setBoard ==============");
       if(p1 == p2){
         System.out.println("can't place pieces in the same spot."); 
         System.exit(0);
       }
       positions[p1-1] = 1;
       a.position = p1;
       positions[p2-1] = 1;
       b.position = p2;
   }
   void move(Pieces a,int destination){
       int p = a.position;
       if(positions[destination-1] == 1){
          System.out.println("============= moveError1 ============");
          System.out.println("can't place pieces in the same spot."); 
       }
       else if(destination > boardsize){
           System.out.println("============= moveError2 ============");
            System.out.println("can't move to destination");
       }else if(destination < 1){
           System.out.println("============= moveError3 ============");
            System.out.println("can't move to destination");   
       }else{
           System.out.println("================ move ===============");
            positions[destination-1] = 1;
            positions[p-1] = 0;
            a.position = destination;
            System.out.println("move position "+a.name+" : "+a.position);
       }
   }
   void showBoard(Pieces a,Pieces b){
       System.out.println("============= showBoard =============");
       for(int i = 1 ; i <= 10 ; i++ ){
        System.out.print("[");
        if(i == a.position){
            System.out.print(a.name);
        }else if(i == b.position){
            System.out.print(b.name);
        }else{
            System.out.print(" ");
        }
        System.out.println("]"); 
       }
   }
   void print(){ //check
      System.out.println("============= print =============");
      System.out.println(positions[1]); 
   }
}
