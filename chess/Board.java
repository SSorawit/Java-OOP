public class Board {
    Figure brd[][] = new Figure[8][8];

    public Board() {
    }

    void boardInitiate() {
        brd[0][0] = new Figure("A",true,1,1);
        brd[0][1] = new Figure("B",false,1,2);
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

    void moveFigure(String name, int targetRow, int targetColumn) {
        System.out.printf("Command: move figure \"%s\" to row %d and column %d\n", name, targetRow, targetColumn);
        boolean found = false;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (brd[i][j] == null)
                    continue;
                if (brd[i][j].name == name) {
                    found = true;
                    brd[i][j].move(this,targetRow,targetColumn);
                    break;
                }
            }
        }
        if (found == false)
            System.out.printf("There is no figure named as \"%s\" in the board!! " + "Command abort\n\n", name);
    }
    void check(){
        System.out.println(brd[7][7]);
    }
}
