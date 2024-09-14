import java.util.Scanner;
public class AnggotaTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Anggota Donny = new Anggota("111333444","Donny",5000000);

        boolean menu = true;
        while (menu) {
            System.out.println("***  Member name : " +Donny.getName()+"   ***");
            System.out.println("***  Loan Limit  : " +Donny.getLoanLimit()+"   ***");
            
            System.out.println("\n---------MENU----------");
            System.out.println(" 1. Borrow money");
            System.out.println("2. Pay installments");
            System.out.println("3. Check loan amount");
            System.out.println("4. Exit");
            System.out.print("\n Choose an option (1-4): ");

            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    // Borrow money
                    System.out.print("Enter the amount to borrow: ");
                    int borrowAmount = scan.nextInt();
                    Donny.borrow(borrowAmount);
                    System.out.println("Current loan amount: " + Donny.getLoanAmount());
                    System.out.println("-------------------------");
                    break;

                case 2:
                    // Pay installments
                    System.out.print("Enter the installment amount to pay: ");
                    int installmentAmount = scan.nextInt();
                    Donny.installments(installmentAmount);
                    System.out.println("Current loan amount: " + Donny.getLoanAmount());
                    System.out.println("-------------------------");
                    break;

                case 3:
                    // Check current loan amount
                    System.out.println("Current loan amount: " + Donny.getLoanAmount());
                    System.out.println("-------------------------");
                    break;

                case 4:
                    menu = false;
                    System.out.println("Exiting... Thank you!");
                    System.out.println("-------------------------");
                    break;

                default:
                    System.out.println("Invalid option. Please choose again.");
                    System.out.println("-------------------------");
                    break;
            }
        }
       
}
}