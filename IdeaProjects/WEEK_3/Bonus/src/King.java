import java.lang.Math;
public class King extends Piece {
    private int x,y;
    public King(int x,int y){
        this.x=x;
        this.y=y;
    }
    boolean ok;
    @Override
    public boolean isLegalMove(int dx, int dy) {
        if(dx>=1 && dy<=8 && x>=1 && y<=8 ) {
            if (Math.abs(dx - x) == 1 && Math.abs(dy - y) == 1) ok = true;
            else if (Math.abs(dx - x) == 1 && Math.abs(dy - y) == 0) ok = true;
            else if (Math.abs(dx - x) == 0 && Math.abs(dy - y) == 1) ok = true;
        }
        else ok=false;
        return ok;

    }
}
