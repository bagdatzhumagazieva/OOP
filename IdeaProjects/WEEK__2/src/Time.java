public class Time {
    public  int hour;
    public  int minute;
    public  int seconds;

    public  String hr;
    public  String mn;
    public  String sc;
    public  Time(int h,int m,int s){
        hour=h;
        minute=m;
        seconds=s;
    }
    public  void check(){
        if(seconds>59){
            seconds=seconds%60;
            minute++;
        }
        if(minute>59){
            minute%=60;
            hour++;
        }
        if(hour>23){
            hour%=24;
        }
    }
    public  void addzero(){
        if(hour<10)
            hr="0"+hour;
        else hr=""+hour;
        if(minute<10) mn="0"+minute;
        else mn=""+minute;
        if(seconds<10) sc="0"+seconds;
        else sc=""+seconds;
    }
    public  String toUni(){
        check();
        addzero();
        return  "'"+hr+":"+mn+":"+sc+"'";
    }
    public  int hour_st;
    public  String toStandard(){
        check();
        String res=null;
        hour_st=hour;
        if(hour_st>12){
            hour_st%=12;
            addzero();
            if(hour_st<10) hr="0"+hour_st;
            else hr=""+hour_st;
            res="'"+hr+":"+mn+":"+sc+"PM'";

        }
        else if(hour_st==12){
            addzero();
            if(hour_st<10) hr="0"+hour_st;
            else hr=""+hour_st;
            res="'"+hr+":"+mn+":"+sc+"PM'";

        }
        else  {
            addzero();
            if(hour_st<10) hr="0"+hour_st;
            else hr=""+hour_st;
            res="'"+hr+":"+mn+":"+sc+"AM'";

        }
        return  res;
    }
    public  void add(Time t2){
        this.seconds += t2.seconds;
        this.minute += t2.minute;
        this.hour += t2.hour;

        check();
        /*this.seconds += t2.seconds;
        this.minute += t2.minute + (this.seconds / 60);
        this.hour += t2.hour+(this.minute/60);
        this.seconds%=60;
        this.minute%=60;
        this.hour%=24;
*/

    }
    public  static  void main(String[] args){
        Time t=new Time(13,9,12);
        System.out.println(t.toUni());
        System.out.println(t.toStandard());
        Time t2=new Time(17,61,80);
        t.add(t2);
        System.out.println(t.toUni());
        System.out.println(t.toStandard());
    }

}
