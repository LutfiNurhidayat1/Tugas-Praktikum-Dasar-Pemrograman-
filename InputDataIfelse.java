import java.util.Scanner;

public class InputDataIfelse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("NAMA : ");
        String nama = input.nextLine();
        
        System.out.println("NIM : ");
        int nim = input.nextInt();
        
        System.out.println("NILAI TUGAS : ");
        double tgs = input.nextDouble();
        char gTgs;

        System.out.println("NILAI UTS : ");
        double uts = input.nextDouble();
        char gUts;

        System.out.println("NILAI UAS : ");
        double uas = input.nextDouble();
        char gUas;

        input.close();

        double nilaiAkhir = tgs * 30/100 + uts * 30/100 + uas *40/100;

        if (tgs >= 80) { gTgs = 'A'; } 
        else if (tgs >= 70) { gTgs = 'B'; }
        else if (tgs >= 60) { gTgs = 'C'; } 
        else if (tgs >= 50) { gTgs = 'D'; }
        else { gTgs = 'E'; }

        if (uts >= 80) { gUts = 'A'; } 
        else if (uts >= 70) { gUts = 'B'; }
        else if (uts >= 60) { gUts = 'C'; } 
        else if (uts >= 50) { gUts = 'D'; }
        else { gUts = 'E'; }

        if (uas >= 80) { gUas = 'A'; } 
        else if (uas >= 70) { gUas = 'B'; }
        else if (uas >= 60) { gUas = 'C'; } 
        else if (uas >= 50) { gUas = 'D'; }
        else { gUas = 'E'; }

        System.out.println("===== DATA MAHASISWA =====");
        System.out.println("Nama : " + nama);
        System.out.println("Nim : " + nim);
        System.out.println("Nilai Tugas : " + tgs + " '" + gTgs + "'");
        System.out.println("Nilai UTS : " + uts + " '" + gUts + "'");
        System.out.println("Nilai UAS : " + uas + " '" + gUas + "'");
        System.out.println("Nilai Akhir : " + nilaiAkhir);

        if (nilaiAkhir >= 60) {
            System.out.println("KETERANGAN : LULUS");
        } else {
            System.out.println("KETERANGAN : TIDAK LULUS");
        }
        System.out.println("=========================");
    }
}
