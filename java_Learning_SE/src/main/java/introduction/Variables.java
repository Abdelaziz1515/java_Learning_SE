package introduction;

public class Variables {
    static int n=5;
    final  static int n0=7;
    int n1=10;

    public void num(int a){
        n=a;
        System.out.println(n);
        n1=a;
        System.out.println(n1=a);
    }


    public static void main(String[] args) {
        Variables  v=new
                Variables();
        int n2 = Variables.n;
        System.out.println(n2);



        System.out.println(v.n0+"\n"+ v.n1+"\n" );
        v.num(10);
    }


}
