import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurant restaurant = new Restaurant();

        // Menu untuk menambah bahan makanan, menambah menu, atau mulai simulasi
        boolean restoranSiap = false;
        while (!restoranSiap) {
            System.out.println("\n=== Menu Utama ===");
            System.out.println("1. Tambah Bahan Makanan");
            System.out.println("2. Tambah Menu Makanan");
            System.out.println("3. Mulai Buka Restoran");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); // konsumsi newline

            switch (opsi) {
                case 1:
                    System.out.print("Nama bahan: ");
                    String namaBahan = scanner.nextLine();
                    System.out.print("Jumlah stok untuk " + namaBahan + ": ");
                    int stok = scanner.nextInt();
                    scanner.nextLine();
                    restaurant.tambahBahanMakanan(namaBahan, stok);
                    System.out.println("Bahan " + namaBahan + " berhasil ditambahkan ke stok.");
                    break;

                case 2:
                    System.out.print("Nama makanan: ");
                    String namaMakanan = scanner.nextLine();
                    System.out.print("Harga " + namaMakanan + ": ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Jumlah bahan untuk " + namaMakanan + ": ");
                    int jumlahBahan = scanner.nextInt();
                    scanner.nextLine();

                    List<String> bahanMakanan = new ArrayList<>();
                    for (int i = 0; i < jumlahBahan; i++) {
                        System.out.print("Nama bahan ke-" + (i + 1) + " untuk " + namaMakanan + ": ");
                        String bahan = scanner.nextLine();
                        bahanMakanan.add(bahan);
                    }
                    restaurant.tambahMakananMenu(namaMakanan, harga, bahanMakanan);
                    System.out.println("Menu " + namaMakanan + " berhasil ditambahkan.");
                    break;

                case 3:
                    restoranSiap = true;
                    break;

                default:
                    System.out.println("Opsi tidak valid. Silakan pilih lagi.");
            }
        }

        System.out.println("\nMenu yang ada:");
        for (int i = 0; i < restaurant.getMenu().size(); i++) {
            System.out.println((i + 1) + ". " + restaurant.getMenu().get(i).getName() + " - Rp." + restaurant.getMenu().get(i).getPrice());
        }

        System.out.println("\nStok bahan:");
        restaurant.ShowInfoRestaurant(0);

        Chef chef = new Chef("Chef Andi", "Cooking");
        Cashier cashier = new Cashier("Cashier Budi", "Handling payments");
        restaurant.tambahKaryawan(chef);
        restaurant.tambahKaryawan(cashier);

        // Daftar pelanggan yang acak pesanan mereka
        Random random = new Random();
        List<String> menuItems = new ArrayList<>();
        for (Makanan makanan : restaurant.getMenu()) {
            menuItems.add(makanan.getName());
        }
        

        // Batas waktu maksimum untuk simulasi
        final int MAX_WAKTU = 50;
        int waktu = 0;

        while (restaurant.hasEnoughIngredients() && waktu < MAX_WAKTU) {
            System.out.println("\n=== Waktu: " + waktu + " ===");

            // Cek jika ada pelanggan baru yang datang secara acak
            if (restaurant.customerComeRandomly()) {
                // Pelanggan baru dengan pesanan acak
                List<String> pesanan = new ArrayList<>();
                int jumlahPesanan = random.nextInt(3) + 1; // Pelanggan bisa memesan antara 1 sampai 3 item
                for (int i = 0; i < jumlahPesanan; i++) {
                    String pesananItem = menuItems.get(random.nextInt(menuItems.size()));
                    pesanan.add(pesananItem);
                }

                // Tambah pelanggan ke restoran
                Customer newCustomer = new Customer("Pelanggan " + waktu, pesanan);
                restaurant.customerCome(newCustomer);
            }

            // Proses melayani pelanggan dan memasak
            boolean customerServed = restaurant.serveCustomers();

            // Tampilkan status restoran jika ada interaksi pelanggan
            if (customerServed) {
                restaurant.ShowInfoRestaurant(waktu);
            }

            waktu++;
        }

        System.out.println("Simulasi selesai. Stok bahan makanan habis atau waktu maksimum tercapai.");
    }
}
