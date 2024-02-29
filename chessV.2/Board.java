public class Board {
    Figure brd[][] = new Figure[8][8];
    public Board(){
    }
    void boardInitiate() {
    }
    void display() {
        System.out.print("  ");
        for (int i = 1; i < 9; i++) {
            System.out.print("   ");
            System.out.print(i);
        }
        System.out.println();
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + 1);
            System.out.print(" |");
            for (int j = 0; j < 8; j++) {
                if (brd[i][j] != null) {
                    System.out.printf("  %s ", brd[i][j].name);
                } else
                    System.out.print(" -- ");
            }
            System.out.print(" |");
            System.out.println(" ");
        }
        System.out.println("--------------------------------------------------------");
    }
}
