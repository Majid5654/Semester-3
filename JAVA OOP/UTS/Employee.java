public class Employee {
    private String name;
    private String task;

public Employee (String name,String task){
    this.name=name;
    this.task=task;
}

public String getName(){
    return name;
}

public String getTask(){
    return task;
}

public void DoTask(){
    System.out.println( name+ "is doing task "+task);
}
}
