package lab2.sandwatch;
public class Sandwatch {
    int side;
    int sandA, sandB;
    public Sandwatch(int SandA, int SandB, int Side) {
        sandA = SandA;
        sandB = SandB;
        side = Side;
        if ((side == 1 && sandA > 0) || (side == 3 && sandB > 0)) {
            System.out.println("The sand is on the top !!!\n");
            if (side == 1 && sandA > 0) {
                while (sandA > 0) {
                    sandA -= 1000;
                    sandB += 1000;
                    System.out.println(sandA + "," + sandB);
                }
            } else if (side == 3 && sandB > 0) {
                while (sandB > 0) {
                    sandB -= 1000;
                    sandA += 1000;
                    System.out.println(sandA + "," + sandB);
                }
            }
        }
    }

    void rotate90() {
        if (side >= 4) {
            side = 1;
        } else {
            side++;
        }
        System.out.println("Rotate90 : sideA " + side);
        if (side == 1 && sandA > 0) {
            while (sandA > 0) {
                sandA -= 1000;
                sandB += 1000;
                System.out.println(sandA + "," + sandB);
            }
        } else if (side == 3 && sandB > 0) {
            while (sandB > 0) {
                sandB -= 1000;
                sandA += 1000;
                System.out.println(sandA + "," + sandB);
            }
        }
    }

    void rotate180() {
            if (side == 4) {
                side = 1;
                side++;
            }else  {
                side+=2;
            }
            if(side > 4){
                side = 1;
            }
            System.out.println("Rotate180 : sideA " + side);
            if (side == 1 && sandA > 0) {
                while (sandA > 0) {
                    sandA -= 1000;
                    sandB += 1000;
                    System.out.println(sandA + "," + sandB);
                }
            } else if (side == 3 && sandB > 0) {
                while (sandB > 0) {
                    sandB -= 1000;
                    sandA += 1000;
                    System.out.println(sandA + "," + sandB);
                }
            }
        }
    void sand() {
        System.out.println(sandA + "," + sandB);
    }

    void sandtotal() {
        System.out.println(sandA + sandB);
    }
}
