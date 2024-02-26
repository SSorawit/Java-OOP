public class main {
    public static void main(String[] args) {
        Board brd = new Board();
        brd.boardInitiate();
        brd.display();
        brd.moveFree("A",1,8);
        brd.display();
        brd.moveFree("B",1,7);
        brd.display();
        brd.move("x",6,8);
        brd.display();
        //brd.check();
    }
}
