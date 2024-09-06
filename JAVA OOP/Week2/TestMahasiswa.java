public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa();
        Mahasiswa mhs3 = new Mahasiswa();


        mhs1.nim=101;
        mhs1.nama="Lestari";
        mhs1.alamat="Jl.Vinolia NO 1A";
        mhs1.kelas="1A";
        mhs1.tampilBiodata();

        mhs2.nim=998;
        mhs2.nama="majid";
        mhs2.alamat="Jl.Letjen sutoyo";
        mhs2.kelas="1B";
        mhs2.tampilBiodata();

        mhs3.nim=123;
        mhs3.nama="piu";
        mhs3.alamat="Jl tatasurya";
        mhs3.kelas="1C";
        mhs3.tampilBiodata();




    }
}
