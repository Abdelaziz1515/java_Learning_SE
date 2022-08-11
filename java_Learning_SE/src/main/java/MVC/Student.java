package MVC;

public class Student {
    private int roolnum;
    private String name;

    public Student(int roolnum, String name) {
        this.roolnum = roolnum;
        this.name = name;
    }

    public int getRoolnum() {
        return roolnum;
    }

    public void setRoolnum(int roolnum) {
        this.roolnum = roolnum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
