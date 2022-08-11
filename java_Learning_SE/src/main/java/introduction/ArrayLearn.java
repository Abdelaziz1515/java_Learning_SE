package introduction;


import java.net.IDN;
import java.util.Arrays;

public class ArrayLearn {
    public static void main(String[] args) {
     Integer[] num1={1,2,3,4};
     Double[] num2={1.1,1.1,1.1,1.1};
     Double[]sum=new Double[4] ;
     String []name={"Zizo","Hatem","Ahmed","Yasser"};

     Integer [][]darr=new Integer[2][2];
     darr[0][0]=2;
     darr[0][1]=4;
     darr[1][0]=6;
     darr[1][1]=8;
        System.out.println(Arrays.deepToString(darr));


     for(int i =0;i<4;i++){
         sum[i]=num1[i]+num2[i];
     }
     display(num1);
     display(num2);
     display(sum);
     display(name);
     display(darr);


    }
    public static <T> void display(T[] array){
        System.out.println(Arrays.toString(array));
    }

}
