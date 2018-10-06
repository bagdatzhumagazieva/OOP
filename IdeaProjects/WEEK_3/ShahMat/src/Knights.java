import java.lang.Math;
public class Knights extends Piece{

    private int x,y;
    public Knights(int x,int y){
        this.x=x;
        this.y=y;
    }
    boolean ok;
    @Override
    public boolean isLegalMove(int dx, int dy) {
      if(Math.abs(dx-x)==1 && Math.abs(dy-y)==2) ok=true;
      else if(Math.abs(dx-x)==2 && Math.abs(dy-y)==1) ok=true;
      else ok=false;
      return ok;

    }
}
