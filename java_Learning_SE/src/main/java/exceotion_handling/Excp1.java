package exceotion_handling;



import java.util.Scanner;


public class Excp1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        try{
        int d=scanner.nextInt();
        System.out.println(d);
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
