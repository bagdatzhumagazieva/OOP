import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] a = new int[10][10];

//        for(int i=1; i<=8; i++){
//            for(int j=1; j<=8; j++ ){
//                char c=( char )(a[i][j]);
//                 System.out.print(c);
//            }
//            System.out.println();
//        }
        while (true) {
            String s = sc.nextLine();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dx = sc.nextInt();
            int dy = sc.nextInt();
            for (int i = 1; i <= 8; i++) {
                for (int j = 1; j <= 8; j++) {
                    a[i][j] = '*';
                }
            }
            a[y][x] = 'B';
            a[dy][dx] = 'R';

            if (s.equals("pawn")) {
                Piece pawn = new Pawn(x, y);
                if (pawn.isLegalMove(dx, dy)) {
                    for (int i = 8; i >= 1; i--) {
                        for (int j = 1; j <= 8; j++) {
                            char c = (char) a[i][j];
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                } else System.out.println("It's wrong way!");
            } else if (s.equals("king")) {
                Piece king = new King(x, y);
                if (king.isLegalMove(dx, dy)) {
                    for (int i = 8; i >= 1; i--) {
                        for (int j = 1; j <= 8; j++) {
                            char c = (char) a[i][j];
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                } else System.out.println("It's wrong way!");
            } else if (s.equals("queen")) {
                Piece quen = new queen(x, y);
                if (quen.isLegalMove(dx, dy)) {
                    for (int i = 8; i >= 1; i--) {
                        for (int j = 1; j <= 8; j++) {
                            char c = (char) a[i][j];
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                } else System.out.println("It's wrong way!");

            } else if (s.equals("rook")) {
                Piece rook = new Rooks(x, y);
                if (rook.isLegalMove(dx, dy)) {
                    for (int i = 8; i >= 1; i--) {
                        for (int j = 1; j <= 8; j++) {
                            char c = (char) a[i][j];
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                } else System.out.println("It's wrong way!");
            } else if (s.equals("bitshop")) {
                Piece btsh = new Bishops(x, y);
                if (btsh.isLegalMove(dx, dy)) {
                    for (int i = 8; i >= 1; i--) {
                        for (int j = 1; j <= 8; j++) {
                            char c = (char) a[i][j];
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                } else System.out.println("It's wrong way!");
            } else if (s.equals("knight")) {
                Piece knt = new Knights(x, y);
                if (knt.isLegalMove(dx, dy)) {
                    for (int i = 8; i >= 1; i--) {
                        for (int j = 1; j <= 8; j++) {
                            char c = (char) a[i][j];
                            System.out.print(c);
                        }
                        System.out.println();
                    }
                } else System.out.println("It's wrong way!");
            } else System.out.println("There is no any word!");

        }
    }

}




