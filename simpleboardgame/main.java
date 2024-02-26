public class main{
    public static void main(String[] args){
        Board brd = new Board();
        brd.boardInitiate();
        brd.display();
        brd.moveFigure("B",1);
        brd.display();
        brd.moveFigure("B",1);
        brd.display();
    }
}