package MVC;

public class Main {
    public static void main(String[] args) {
        Student model =new Student(1,"zizo");
        StudentView view=new
                StudentView();
        StudentController controller=new StudentController(model,view);
        controller.updateView();
        controller.setStudentName("Vikram Sharma");
        controller.updateView();
    }
}
