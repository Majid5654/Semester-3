package interfacetraining;

public class Student {
    protected String name;

    public Student(String name) {
        this.name = name;
    }

    public String getNama(){
        return name;
    }


    public void studyInCampus() {
        System.out.println("My name is " + name + ". I am studying in the campus.");
    }
}
