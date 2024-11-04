package interfacetraining;

public class Undergraduated extends Student implements ICumlaude {
    
    private String gpa;

    public Undergraduated(String name, String gpa) {
        super(name);
        this.gpa = gpa;
    }

    @Override
    public void graduate() {
        System.out.println("I have finished the thesis for Undergraduated");
    }

    @Override
    public void getHighGPA() {
        System.out.println("My GPA is " + this.gpa);
    }
}
