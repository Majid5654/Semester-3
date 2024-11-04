package interfacetraining;

public class Program {
    public static void main(String[] args) {
        Rector MrRector = new Rector();

        Undergraduated undergraduatedCumlaude = new Undergraduated("Joe", "3.51");
        Postgraduated postgraduatedCumlaude = new Postgraduated("Ben");

        MrRector.giveCumlaudeCertificate(undergraduatedCumlaude);
        MrRector.giveCumlaudeCertificate(postgraduatedCumlaude);

        MrRector.giveCertificateOfTopStudent(postgraduatedCumlaude);
        MrRector.giveCertificateOfTopStudent(postgraduatedCumlaude);
    }   
}
