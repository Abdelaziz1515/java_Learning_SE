public class Mainfilnal {
    Size pizaaorder;
    public static void getorder(Size pizaaorder){
        switch (pizaaorder){
            case SMALL:
                System.out.println("i order small pizza");
                break;
            case MEDIUM:
                System.out.println("i order medium pizza");
                break;

            case LARGE:
                System.out.println("i order large pizza");
                break;
        }
    }

    public static void main(String[] args) {
        getorder(Size.SMALL);



    }

}
