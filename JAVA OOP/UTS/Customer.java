import java.util.List;
import java.util.Random;

public class Customer {
    private String name;
    private List<String> foodPreferences;
    private int levelPatience;
    private int satisfaction;

    // Konstruktor untuk menginisialisasi Customer
    public Customer(String name, List<String> foodPreferences) {
        this.name = name;
        this.foodPreferences = foodPreferences;
        this.levelPatience = new Random().nextInt(30) + 30; // Rentang kesabaran antara 30-59
        this.satisfaction = 5; // Inisialisasi kepuasan standar, bisa antara 0-10
    }

    // Mendapatkan nama pelanggan
    public String getName() {
        return name;
    }

    // Mendapatkan daftar preferensi makanan pelanggan
    public List<String> getFoodPreferences() {
        return foodPreferences;
    }

    // Mendapatkan tingkat kesabaran pelanggan
    public int getLevelPatience() {
        return levelPatience;
    }

    // Mendapatkan tingkat kepuasan pelanggan
    public int getSatisfaction() {
        return satisfaction;
    }

    // Mengatur kepuasan pelanggan, nilai bisa berubah
    public void setSatisfaction(int change) {
        this.satisfaction += change;
        if (this.satisfaction > 10) {
            this.satisfaction = 10; // Maksimal kepuasan 10
        } else if (this.satisfaction < 0) {
            this.satisfaction = 0; // Minimal kepuasan 0
        }
    }

    // Mengurangi tingkat kesabaran pelanggan
    public void reducePatience() {
        if (levelPatience > 0) {
            levelPatience--; // Mengurangi kesabaran per waktu
        } else {
            System.out.println(name + " sudah tidak sabar dan marah!");
        }
    }

    // Mengecek apakah pelanggan marah (kesabaran habis)
    public boolean isMad() {
        return levelPatience <= 0;
    }

    // Menampilkan status pelanggan
    public void showStatus() {
        System.out.println("Nama: " + name);
        System.out.println("Kepuasan: " + satisfaction + "/10");
        System.out.println("Kesabaran tersisa: " + levelPatience);
        if (isMad()) {
            System.out.println(name + " sudah sangat marah!");
        }
    }
}
