import java.util.Scanner;
public class NestedIf {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        
      System.out.print("Masukan Nama : ");
      String nama = input.nextLine();
      int pilihan;
      int pengalaman;
      String pendapatan;

      System.out.println("Departemen tempat bekerja:");
      System.out.println("1.Produksi");
      System.out.println("2.Marketing");
      System.out.println("3.Inventory");
      System.out.print("Pilih departemen 1/2/3 : ");
      pilihan = input.nextInt();

      String departemen;

      if (pilihan == 1) {
        departemen = "Produksi";

        System.out.println("Pengalaman kerja:");
        System.out.println("1. Kurang dari 1 Tahun");
        System.out.println("2. 1-2 Tahun");
        System.out.println("3. Lebih dari 2 Tahun");
        System.out.print("Pilih pengalaman kerja 1/2/3 : ");
        pengalaman = input.nextInt();
        
        if (pengalaman == 1) {
            pendapatan = "Rp,3.000.000";
        } else if (pengalaman == 2) {
            pendapatan = "Rp,4.000.000";
        } else if (pengalaman == 3) {
            pendapatan = "Rp,5.000.000";
        } else {
            pendapatan = "Input yang anda masukan tidak valid!";
        }

        System.out.println("=============================");
        System.out.println("Nama : " + nama);
        System.out.println("Departemen : " + departemen);      
        System.out.println("Pendapatan : " + pendapatan);
        System.out.println("=============================");

      } else if (pilihan == 2) {
        departemen = "Marketing";

        System.out.println("Pengalaman kerja:");
        System.out.println("1. Kurang dari 1 Tahun");
        System.out.println("2. 1-2 Tahun");
        System.out.println("3. Lebih dari 2 Tahun");
        System.out.print("Pilih pengalaman kerja 1/2/3 : ");
        pengalaman = input.nextInt();
        
        if (pengalaman == 1) {
            pendapatan = "Rp,3.000.000";
        } else if (pengalaman == 2) {
            pendapatan = "Rp,4.000.000";
        } else if (pengalaman == 3) {
            pendapatan = "Rp,5.000.000";
        } else {
            pendapatan = "Input yang anda masukan tidak valid!";
        }

        System.out.println("=============================");
        System.out.println("Nama : " + nama);
        System.out.println("Departemen : " + departemen);      
        System.out.println("Pendapatan : " + pendapatan);
        System.out.println("=============================");

      } else if (pilihan == 3) {
        departemen = "Inventory";

        System.out.println("Pengalaman kerja:");
        System.out.println("1. Kurang dari 1 Tahun");
        System.out.println("2. 1-2 Tahun");
        System.out.println("3. Lebih dari 2 Tahun");
        System.out.print("Pilih pengalaman kerja 1/2/3 : ");
        pengalaman = input.nextInt();
        
        if (pengalaman == 1) {
            pendapatan = "Rp,3.000.000";
        } else if (pengalaman == 2) {
            pendapatan = "Rp,4.000.000";
        } else if (pengalaman == 3) {
            pendapatan = "Rp,5.000.000";
        } else {
            pendapatan = "Input yang anda masukan tidak valid!";
        }

        System.out.println("=============================");
        System.out.println("Nama : " + nama);
        System.out.println("Departemen : " + departemen);      
        System.out.println("Pendapatan : " + pendapatan);
        System.out.println("=============================");

      } else {
        System.out.println("Input yang anda masukan tidak valid!");
      }
      
      input.close();

      
    } 
}