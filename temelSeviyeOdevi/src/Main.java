import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1) Basit Hesaplamalar: İki değişkenin toplamını, farkını, çarpımını ve bölümünü hesaplayan bir Java programı yazın.
        // Kullanıcıdan girdileri alarak bu hesaplamaları gerçekleştirin ve sonuçları ekrana yazdırın.

        System.out.println("İlk sayıyı girin: ");
        int firstNumber = scanner.nextInt();
        System.out.println("İkinci sayıyı girin: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int minus = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int division = firstNumber / secondNumber;

        System.out.println("Toplam: "+sum);
        System.out.println("Fark: "+minus);
        System.out.println("Çarpım: "+product);
        System.out.println("Bölüm: "+division);

        // 2) Üçgenin Alanı: Kullanıcıdan üçgenin taban ve yüksekliği bilgilerini girdi olarak alan ve üçgenin alanını
        // hesaplayan bir program yazın. Alan hesaplama formülünü kullanarak sonucu ekrana yazdırın.

        System.out.println("Üçgenin taban uzunluğunu girin: ");
        int base = scanner.nextInt();
        System.out.println("Üçgenin yüksekliğini girin: ");
        int height = scanner.nextInt();

        System.out.println("Üçgenin alanı: "+((base*height)/2));

        // Mantıksal İfadeler: Kullanıcıdan bir sayı girmesini isteyen ve bu sayının pozitif, negatif veya sıfır olduğunu
        // kontrol eden bir Java programı yazın. Sonucu ekrana yazdırarak kullanıcıya bilgi verin.

        System.out.println("Bir sayı girin: ");
        int enteredNumber = scanner.nextInt();

        boolean isPositive = enteredNumber>0;
        boolean isNegative = enteredNumber<0;
        boolean isZero = enteredNumber==0;

        // sonuç true çıkıyorsa sayı için doğru kavramdır.
        System.out.println("Sayı pozitif mi? "+isPositive);
        System.out.println("Sayı negatif mi? "+isNegative);
        System.out.println("Sayı sıfır mı? "+isZero);

        // Kullanıcı Girişi ve Doğrulama: Kullanıcıdan bir kullanıcı adı ve şifre isteyen bir program yazın.
        // Eğer kullanıcı adı ve şifre doğru ise, "Giriş Başarılı" mesajı verin. Aksi halde, "Hatalı Giriş" mesajı verin.

        String user = "ahmet";
        String pass = "123";

        System.out.println("Kullanıcı adı: ");
        String userName = scanner.nextLine();
        System.out.println("Şifre: ");
        String passWord = scanner.nextLine();

        boolean loginSucces = userName.equals(user) && passWord.equals(pass);
        if (loginSucces){
            System.out.println("Giriş Başarılı");
        }else{
            System.out.println("Hatalı Giriş");
        }
    }
}
