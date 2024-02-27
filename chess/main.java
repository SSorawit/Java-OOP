public class main {
    public static void main(String[] args) {
        Board brd = new Board();
        brd.boardInitiate();
        brd.display();
        brd.move("p",5,7);
        brd.display();
        brd.move("x",4,6);
        brd.display();
        brd.move("x",5,7);
        brd.display();
        brd.move("x",8,2);
        brd.display();
    }
}
