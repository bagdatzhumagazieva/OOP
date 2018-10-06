public class Pawn extends  Piece{
    private int x,y;
    public Pawn(int x,int y){
        this.x=x;
        this.y=y;
    }
    boolean ok;
    @Override

    public boolean isLegalMove(int dx, int dy) {
        if (dx >= 1 && dy <= 8 && x >= 1 && y <= 8 && dy>y) {
            if (x == dx && y < dy) ok = true;
        }
            else ok = false;
            return ok;
        }

}
