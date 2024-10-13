public class Perkalianku {
    public int a,b,c;
    
    void perkalian(int a, int b){
        this.a=a;
        this.b=b;
        System.out.println("Hasil perkalian dari " + a + " dan " + b + " adalah: " + (a * b));
    }    
    void perkalian(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
        System.out.println("Hasil perkalian dari " + a + ", " + b + " dan " + c + " adalah: " + (a * b * c));
    }
    
    public static void main(String args []){
        Perkalianku objek = new Perkalianku();
        objek.perkalian(25, 43);
        objek.perkalian(34, 23, 56);
    }
    
}
