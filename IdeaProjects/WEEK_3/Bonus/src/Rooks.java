public class Rooks extends Piece {

    private int x,y;
    public  Rooks(int x,int y){
        this.x=x;
        this.y=y;
    }
    boolean ok;
    @Override
    public boolean isLegalMove(int dx, int dy) {
        if(dx>=1 && dy<=8 && x>=1 && y<=8 ) {
            if (dx == x && dy != y) ok = true;
            else if (dx != x && dy == y) ok = true;
        }
        else ok=false;
        return  ok;
    }
}
