public class main {
    public static void main(String[] args) {
        Board brd = new Board();
        brd.boardInitiate();
        brd.display();
        brd.moveFree("p", 8, 8);
        brd.display();
        brd.moveFree("x", 8, 7);
        brd.display();
        brd.move("x", 7, 8);
        brd.display();
        brd.move("x", 1, 2);
        brd.display();
        // brd.move("x",3,1);
        // brd.display();
        // brd.move("p",3,6);
        // brd.display();
        // brd.move("x",6,8);
        // brd.display();
        // brd.move("x",1,3);
        // brd.display();
        // brd.move("x",3,1);
        // brd.display();
        //brd.check();
    }
}
