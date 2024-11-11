public class Tester2 {
    public static void main(String[] args) {
        Employee e = new PermanentEmployee("Dedik", 500);
        System.out.println(e.getEmployeeInfo());

        System.out.println("-------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        System.out.println(pEmp.getEmployeeInfo());
    }
}
