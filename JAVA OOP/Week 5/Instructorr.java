public class Instructorr extends Person {
    private int id_instruktur;
    private String nameLesson;

    public Instructorr(int id_instruktur, String nickName, String fullName, String nameLesson) {
        super(nickName,fullName);
        this.id_instruktur = id_instruktur;
        this.nameLesson = nameLesson;
    }

    // Getter and Setter for Encapsulation
    public int getId_instruktur() {
        return id_instruktur;
    }

    public void setId_instruktur(int id_instruktur) {
        this.id_instruktur = id_instruktur;
    }

    public String getnameLesson() {
        return nameLesson;
    }

    public void setnameLesson (String nameLesson) {
        this.nameLesson = nameLesson;
    }

    //Polymorphism
    public void introduceSelf() {
        System.out.println("Hello, I am Instructor " + getfullName() + " You can call me "+getnickName() + ", and I specialize in: " +nameLesson);
    }

    public void infoinstructor(){
        System.out.println("Name instructor: " +getnickName() );
        System.out.println("teacher " +nameLesson);
    }
    
        }

