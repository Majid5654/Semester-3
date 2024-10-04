package Assignment;

public class Main {
    public static void main(String[] args) {
       
        Dosen dosen1 = new Dosen("1233", "MAJID", "Jl Malang");
        dosen1.setSKS(17); 

        Dosen dosen2 = new Dosen("9984", "Erwan", "JL.Jawa timur");
        dosen2.setSKS(16); 

        
        DaftarGaji daftarGaji = new DaftarGaji(2);
        daftarGaji.addPegawai(dosen1);
        daftarGaji.addPegawai(dosen2);

        
        daftarGaji.printSemuaGaji();
    }
}

