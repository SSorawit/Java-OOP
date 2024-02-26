public class main {
    public static void main(String[] args) {
        Board brd = new Board();
        brd.boardInitiate();
        brd.display();
        brd.moveFigure("A",1,8);
        brd.display();
        brd.check();
    }
}
