import java.lang.Math;
public class Bishops extends Piece {

    private int x,y;
    public Bishops(int x,int y){
        this.x=x;
        this.y=y;
    }
    boolean ok;
    @Override
    public boolean isLegalMove(int dx, int dy) {
        if(dx>=1 && dy<=8 && x>=1 && y<=8 ) {
            if (Math.abs(dx - x) == Math.abs(dy - y)) ok = true;
        }
        else ok=false;
        return ok;

    }
}
