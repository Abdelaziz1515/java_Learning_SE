 public class Counter {
    private int c=0;
    private  Counter(){}
     static Counter counter=null;
    public static Counter getCounter(){
        if(counter==null){counter= new  Counter();}
        return counter;
    }
    public int addOne(){
        return c++;
    }

}
