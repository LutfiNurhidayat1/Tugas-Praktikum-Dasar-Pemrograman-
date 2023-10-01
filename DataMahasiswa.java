public class DataMahasiswa {
    public static void main(String[] args) {
        String nama = "Lutfi Nurhidayat";
        int nim = 1237050123;
        double tgs = 92;
        double uts = 90.5;
        double uas = 94;
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
