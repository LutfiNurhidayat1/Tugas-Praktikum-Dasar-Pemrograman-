import java.util.Scanner;

public class BangunDatar {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int pilihan;

    System.out.println("Pilih bangun datar");
    System.out.println("1.Persegi");
    System.out.println("2.Segitiga");
    System.out.println("3.Lingkaran");

    pilihan = input.nextInt();

    switch (pilihan) {
        case 1:

        System.out.print("Masukan sisi persegi : ");
        double sisiPersegi = input.nextDouble();
        double luasPersegi = sisiPersegi * sisiPersegi;
        System.out.println("Luas persegi : " + luasPersegi);

        break;

        case 2:

        System.out.print("Masukan alas segitiga : ");
        double alasSegitiga = input.nextDouble();
        System.out.print("Masukan tinggi segitiga : ");
        double tinggiSegitiga = input.nextDouble();

        double luasSegitiga = 0.5 * alasSegitiga * tinggiSegitiga;
        System.out.println("Luas segitiga : " + luasSegitiga);
        
        break;

        case 3:

        System.out.print("Masukan jari-jari lingkaran : ");
        double jariJari = input.nextDouble();
        double luasLingkaran = Math.PI * Math.pow(jariJari, 2);
        System.out.println("Luas lingkaran : " + luasLingkaran);

        break;

        default:

        System.out.println("Pilihan tidak sesuai");

        break;

      }
   } 
}
