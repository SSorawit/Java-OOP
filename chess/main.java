public class main {
    public static void main(String[] args) {
        Board brd = new Board();
        brd.boardInitiate();
        brd.display();
        brd.move("p",5,7);
        brd.display();
        brd.move("x",6,8);
        brd.display();
        // brd.move("x",6,8);
        // brd.display();
        // brd.move("x",1,3);
        // brd.display();
        // brd.move("x",3,1);
        // brd.display();
        //brd.check();
    }
}
