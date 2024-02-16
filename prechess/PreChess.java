package pre.chess;
public class PreChess {
    public static void main(String[] args) {
        Pieces P1 = new Pieces("W");
        Pieces P2 = new Pieces("B");
        Board B = new Board(P1,P2);
        P1.getName();
        P2.getName();
        B.setBoard(P1, 1, P2, 2);
        B.getPositionPieces(P1, P2);
        B.move(P1, 2);
        B.move(P1, 3);
        B.showBoard(P1,P2);
        B.move(P1, 1);
        B.move(P2, 6);
        B.showBoard(P1,P2);
        B.move(P1, 7);
        B.move(P2, 9);
        B.showBoard(P1,P2);
        B.move(P1, 5);
        B.move(P2, 1);
        B.showBoard(P1,P2);
        B.move(P2, 7);
        B.move(P1, 10);
        B.showBoard(P1,P2);
}
}
