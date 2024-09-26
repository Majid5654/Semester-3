public class Person {
    private String nickName;
    private String fullName;

    public Person(String nickName, String fullName) {
        this.nickName = nickName;
        this.fullName = fullName;
    }

    // Getter and Setter (Encapsulation)
    public String getnickName() {
        return nickName;
    }

    public void setnickName(String nickName) {
        this.nickName = nickName;
    }

    public String getfullName() {
        return fullName;
    }

    public void setfullName (String fullName) {
        this.fullName = fullName;
    }

    // Polymorphism: A method that will be overridden
    public void introduceSelf() {
        System.out.println("Hello, I am " + fullName + "You can call me " + nickName);
    }
}

