public class Board {
    Figure brd[] = new Figure[10];
    public Board(){
    }
    void boardInitiate(){
        brd[0] = new Figure("A",1);
        brd[1] = new Figure("B",2);
    }
    void display(){
        System.out.println("--1--2--3--4--5--6--7--8--9--10");
        for(int n = 0;n<brd.length;n++){
            if(brd[n] != null){
                System.out.printf("  %s",brd[n].name);
            }
            else{
                System.out.print("   ");
            }
        }
        System.out.println("\n--------------------------------");
    }
    void moveFigure(String name,int targetposition){
        System.out.printf("Command: move figure \"%s\" to %d\n",name,targetposition);
        boolean found = false;
        for(int n=0;n<brd.length;n++){
            if(brd[n] == null) continue;
            if(brd[n].name == name){
                found = true;
                brd[n].move(this,targetposition);
                break;
            }
        }
        if(found == false)
            System.out.printf("There is no figure named as \"%s\" in the board!! "+"Command abort\n\n",name);
    }
}
