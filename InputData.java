import java.util.Scanner;

public class InputData {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("NAMA : ");
        String nama = input.nextLine();
        
        System.out.println("NIM : ");
        int nim = input.nextInt();
        
        System.out.println("NILAI TUGAS : ");
        double tgs = input.nextDouble();
        
        System.out.println("NILAI UTS : ");
        double uts = input.nextDouble();
        
        System.out.println("NILAI UAS : ");
        double uas = input.nextDouble();

        input.close();

        double nilaiAkhir = tgs * 30/100 + uts * 30/100 + uas *40/100;

        System.out.println("===== DATA MAHASISWA =====");
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Nilai Tugas : " + tgs);
        System.out.println("Nilai UTS : " + uts);
        System.out.println("Nilai UAS : " + uas);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        System.out.println("=========================");
    }
}