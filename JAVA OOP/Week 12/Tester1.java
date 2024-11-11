public class Tester1 {
    public static void main(String[] args) {
        Employee e;
        Payable p;

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");

        e = pEmp;
        System.out.println(e.getEmployeeInfo());

        e = iEmp;
        System.out.println(e.getEmployeeInfo());

    }
}
