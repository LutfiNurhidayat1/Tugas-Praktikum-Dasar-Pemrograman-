import java.util.Scanner;

public class SgtgPhytagoras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Masukan panjang sisi pertama : ");
    double a = scanner.nextDouble();

    System.out.println("Masukan panjang sisi kedua : ");
    double b = scanner.nextDouble();

    System.out.println("Masukan panjang sisi hipotenusa : ");
    double c = scanner.nextDouble();

    if (isSgtgPhytagoras(a, b, c)) {
        System.out.println("Sisi-sisi yang diberikan membentuk segitiga Pythagoras.");
    } else {
        System.out.println("Sisi-sisi yang diberikan tidak membentuk segitiga Pythagoras.");
        }
    }


public static boolean isSgtgPhytagoras(double a, double b, double c) {
    return (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) ||
            (Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2)) ||
            (Math.pow(c, 2) + Math.pow(a, 2) == Math.pow(b, 2));
    }
}