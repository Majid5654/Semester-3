public class EncapTest {
    public static void main(String[] args) {
        EncapDEmo encap = new EncapDEmo();
        encap.setName("James");
        encap.setAge(35);

        System.out.println("Name : " + encap.getName());
        System.out.println("Age : " + encap.getAge());
        encap.setAge(15); 
        System.out.println("Updated Age : " + encap.getAge());
    }
}
