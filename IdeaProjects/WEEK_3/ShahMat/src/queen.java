import java.lang.Math;
public class queen extends Piece {

    private int x,y;
   public queen(int x,int y){
   this.x=x;
   this.y=y;
   }
   boolean ok;
    @Override
    public boolean isLegalMove(int dx, int dy) {
        if(Math.abs(dx-x)==Math.abs(dy-y)) ok=true;
        else if(dx==x && dy!=y) ok=true;
        else if(dx!=x && dy==y) ok=true;
        else ok=false;
       return ok;
    }
}
