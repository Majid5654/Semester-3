public class Main {
    public static void main(String[] args) {
        
        Instructorr instructor1 = new Instructorr(1223, "majid", "Erwan Majid", "Basic Program");
        Participant participant1 = new Participant(9990, "Arka", "Febrian Arka", "Basic Program");
        Course course1 = new Course(1873, "Basic Program", "This session to practice basic program in HTML ", 19000);
        Video video1 = new Video(3840, "2 Hours", "Basic HTML 1 ", "Video");
        Payment payment1 = new Payment(84848, 27, 19000, "Transfer");

        System.out.println("Thank you for registering our course " + participant1.getnickName());
        System.out.println("your info : ");
        participant1.infoParticipant();
        System.out.println("Payment details ");
        payment1.detailPembayaran();
        System.out.println();
        System.out.println("Here the detail about our course: \n" +course1.getdescription());
        System.out.println("Instructor : " );
        instructor1.infoinstructor();
        instructor1.introduceSelf();
        System.out.println("info video :");
        video1.infoVideo();


    
    
}
}