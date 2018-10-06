import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int dx = sc.nextInt();
            int dy = sc.nextInt();
            if (s.equals("pawn")) {
                Piece pawn = new Pawn(x, y);
                if (pawn.isLegalMove(dx, dy))
                    System.out.println("yes");
                else
                    System.out.println("no");
            } else if (s.equals("king")) {
                Piece king = new King(x, y);
                if (king.isLegalMove(dx, dy))
                    System.out.println("yes");
                else System.out.println("no");
            } else if (s.equals("queen")) {
                Piece quen = new queen(x, y);
                if (quen.isLegalMove(dx, dy))
                    System.out.println("yes");
                else System.out.println("no");
            } else if (s.equals("rook")) {
                Piece rook = new Rooks(x, y);
                if (rook.isLegalMove(dx, dy))
                    System.out.println("yes");
                else System.out.println("no");
            } else if (s.equals("bitshop")) {
                Piece btsh = new Bishops(x, y);
                if (btsh.isLegalMove(dx, dy))
                    System.out.println("yes");
                else System.out.println("no");
            } else if (s.equals("knight")) {
                Piece knt = new Knights(x, y);
                if (knt.isLegalMove(dx, dy))
                    System.out.println("yes");
                else System.out.println("no");
            } else System.out.println("There is no any word!");

        }

    }
    }




