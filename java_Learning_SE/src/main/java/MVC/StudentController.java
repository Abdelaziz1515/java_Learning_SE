package MVC;

public class StudentController {
    private Student model;
    private StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void setStudentName(String name) {
         model.setName(name);
    }
    public  void gerStudentName(String name) {
        model.getName();
    }
    public void setStudentRollNo(int num) {
        model.setRoolnum(num);
    }
    public  void gerStudentRollNo(int name) {
        model.getRoolnum();
    }


    public void updateView(){
        view.print(model.getRoolnum(), model.getName());
    }
}
