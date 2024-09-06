public class AssignmentBarang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        return hargaDasar - ((int) (diskon/100 * hargaDasar));
    }

    public void tampilData() {
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Barang: Rp" + hargaDasar);
        System.out.println("Diskon      : " + diskon + "%");
        System.out.println("Harga Jual  : Rp" + hitungHargaJual());

        
    }
    public static void main(String[] args) {
        AssignmentBarang barang1 = new AssignmentBarang();
        barang1.kode = "B001";
        barang1.namaBarang = "Mouse";
        barang1.hargaDasar = 100000;  
        barang1.diskon = 10;  

        barang1.tampilData();
    }
}

