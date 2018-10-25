public class MinMax {
    int[] mylist;
    static  class  Inner{
        public void my_method(){
            System.out.println("This is inner class");
        }
    }

    static int[] minmax(int[] values){
        int min = values[0];
        int max = values[0];
        for(int i =1 ;i< values.length;i++){
            max = Math.max(max,values[i]);
            min=Math.min(min,values[i]);
        }
        return new int[] {max,min};
    }
}
