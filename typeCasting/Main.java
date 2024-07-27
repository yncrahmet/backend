import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        short shortSayi = 25;
        int intSayi = shortSayi; // (Widening)

        System.out.println(intSayi); // 25

        float floatSayi = 34.12f;
        byte byteSayi = (byte) floatSayi; // Narrowing

        System.out.println(byteSayi); // 34

        // Wrapper sınıfları ile dönüşüm

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin: ");
        String girilenSayi = scanner.nextLine();

        int yeniSayi = Integer.parseInt(girilenSayi);

        System.out.println(yeniSayi);

        scanner.close();
    }
}
