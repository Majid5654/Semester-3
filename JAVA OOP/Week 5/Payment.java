public class Payment {
    private int id_pembayaran;
    private int tanggal;
    private int jumlah;
    private String metode;

    public Payment(int id_pembayaran, int tanggal, int jumlah, String metode) {
        this.id_pembayaran = id_pembayaran;
        this.tanggal = tanggal;
        this.jumlah = jumlah;
        this.metode = metode;
    }

    // Getter and Setter for Encapsulation
    public int getId_pembayaran() {
        return id_pembayaran;
    }

    public void setId_pembayaran(int id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public String getMetode() {
        return metode;
    }

    public void setMetode(String metode) {
        this.metode = metode;
    }

    public void detailPembayaran() {
        System.out.println("Pembayaran ID: " + id_pembayaran + ", Jumlah: " + jumlah + ", Metode: " + metode + ", Tanggal: " + tanggal);
    }
}
