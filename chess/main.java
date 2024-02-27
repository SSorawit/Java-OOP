public class main {
    public static void main(String[] args) {
        Board brd = new Board();
        brd.boardInitiate();
        brd.display();
        brd.moveFree("B",2,4);
        brd.display();
        brd.move("x",3,5);
        brd.display();
        // brd.move("p",3,6);
        // brd.display();
        brd.check();
    }
}
