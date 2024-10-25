import java.util.*;

public class Restaurant {
    private List<Makanan> menu;
    private Queue<Customer> customerQueue;
    private List<Employee> employees;
    private double finance;
    private List<String> ingredientInventory;
    private List<Integer> totalStock;
    private int reputation;
    private Random random;

    public Restaurant() {
        menu = new ArrayList<>();
        customerQueue = new LinkedList<>();
        employees = new ArrayList<>();
        finance = 1000.0;
        ingredientInventory = new ArrayList<>();
        totalStock = new ArrayList<>();
        reputation = 5;
        random = new Random();
    }

    // Menambahkan makanan ke menu dengan bahan-bahan yang digunakan
    public void tambahMakananMenu(String namaMakanan, double harga, List<String> bahanMakanan) {
        Makanan makananBaru = new Makanan(namaMakanan, harga, 5, bahanMakanan);
        menu.add(makananBaru);
        System.out.println("Makanan baru ditambahkan ke menu: " + namaMakanan);
    }

    // Menambahkan bahan baru ke inventory bahan dengan jumlah stok tertentu
    public void tambahBahanMakanan(String bahan, int jumlah) {
        if (!ingredientInventory.contains(bahan)) {
            ingredientInventory.add(bahan);
            totalStock.add(jumlah);
            System.out.println("Bahan baru ditambahkan ke stok: " + bahan + " dengan jumlah: " + jumlah);
        } else {
            int index = ingredientInventory.indexOf(bahan);
            totalStock.set(index, totalStock.get(index) + jumlah);
            System.out.println("Stok " + bahan + " ditambah menjadi: " + totalStock.get(index));
        }
    }

    public void tambahMakanan(Makanan makanan) {
        menu.add(makanan);
    }

    public double getFinance() {
        return finance;
    }

    public void tambahKaryawan(Employee employee) {
        this.employees.add(employee);
    }

    public void customerCome(Customer customer) {
        customerQueue.add(customer);
        System.out.println(customer.getName() + " datang ke restoran.");
    }

    // Cek stok bahan untuk makanan tertentu
    public boolean cekStok(Makanan makanan) {
        List<String> bahanMakanan = makanan.getIngredient();
        for (String bahan : bahanMakanan) {
            int index = ingredientInventory.indexOf(bahan);
            if (index == -1 || totalStock.get(index) <= 0) {
                return false; // Stok tidak cukup
            }
        }
        return true; // Semua bahan tersedia
    }

    // Kurangi stok bahan sesuai dengan bahan makanan yang dipesan
    public void kurangiStok(Makanan makanan) {
        List<String> bahanMakanan = makanan.getIngredient();
        for (String bahan : bahanMakanan) {
            int index = ingredientInventory.indexOf(bahan);
            if (index != -1) {
                totalStock.set(index, totalStock.get(index) - 1);
            }
        }
    }

    // Melayani pelanggan
    public boolean serveCustomers() {
        if (!customerQueue.isEmpty()) {
            Customer customer = customerQueue.poll();
            System.out.println("Melayani pelanggan: " + customer.getName());
    
            List<String> preferredFoods = customer.getFoodPreferences();
            String selectedFood = preferredFoods.get(random.nextInt(preferredFoods.size()));
    
            boolean foodFound = false;
            for (Makanan makanan : menu) {
                if (makanan.getName().equals(selectedFood)) {
                    foodFound = true;
    
                    // Simulasi waktu memasak acak antara 1 hingga 10 menit
                    int cookingTime = random.nextInt(10) + 1;
                    System.out.println("Waktu memasak " + makanan.getName() + ": " + cookingTime + " menit.");
    
                    // Jika waktu memasak melebihi 5 menit, reputasi berkurang, pelanggan pergi
                    if (cookingTime > 5) {
                        System.out.println("Pelanggan " + customer.getName() + " menunggu terlalu lama dan pergi.");
                        customer.setSatisfaction(-5);
                        reputation--; // Kurangi reputasi
                        System.out.println("Reputasi sekarang: " + reputation); // Menampilkan reputasi saat pelanggan pergi
                        return false; // Pelanggan pergi
                    } 
    
                    if (cekStok(makanan)) {
                        kurangiStok(makanan);
                        finance += makanan.getPrice();
                        customer.setSatisfaction(10);
                        System.out.println("Pesanan " + makanan.getName() + " selesai untuk " + customer.getName() + ". Total keuangan: " + finance);
                        reputation = 9; // Naikkan reputasi
                        return true; // Pelanggan berhasil dilayani
                    } else {
                        customer.setSatisfaction(-5);
                        System.out.println("Stok untuk " + makanan.getName() + " tidak cukup!");
                        reputation--;
                        return true; // Makanan tidak cukup tetapi masih melayani pelanggan
                    }
                }
            }
    
            if (!foodFound) {
                customer.setSatisfaction(-5);
                System.out.println("Pelanggan " + customer.getName() + " tidak menemukan makanan yang diinginkan dan pergi.");
                reputation--;
            }
    
            return true;
        }
        return false;
    }
    
    
    

    public void tambahStok(String bahan, int jumlah) {
        int index = ingredientInventory.indexOf(bahan);
        if (index == -1) {
            ingredientInventory.add(bahan);
            totalStock.add(jumlah);
        } else {
            totalStock.set(index, totalStock.get(index) + jumlah);
        }
    }

    public void ShowInfoRestaurant(int waktu) {
        System.out.println("Waktu: " + waktu);
        System.out.println("Keuangan: " + finance);
        System.out.println("Reputasi: " + reputation);
        System.out.println("Stok:");
        for (int i = 0; i < ingredientInventory.size(); i++) {
            System.out.println(ingredientInventory.get(i) + ": " + totalStock.get(i));
        }
    }

    public boolean customerComeRandomly() {
        return random.nextInt(100) < 30;
    }

    public boolean hasEnoughIngredients() {
        for (Makanan makanan : menu) {
            if (cekStok(makanan)) {
                return true;
            }
        }
        return false;
    }

    public List<Makanan> getMenu() {
        return menu;
    }
}
