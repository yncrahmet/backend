import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Sınav Notu Hesaplayıcı: Kullanıcıdan bir sınav notu girmesini isteyen ve bu notun hangi aralığa düştüğünü
        // belirten bir Java programı yazın. Programın koşullu ifadeler (if-else) kullanarak sınav notunu "Başarılı"
        // veya "Başarısız" olarak değerlendirmesini sağlayın.

        System.out.print("Öğrencinin notunu(0 - 100) girin: ");
        int not = sc.nextInt();

        if (not >= 0 && not <= 100) {
            if (not >= 50){
                System.out.println("Başarılı!");
            } else {
                System.out.println("Başarısız");
            }
        }else{
            System.out.println("Geçersiz not girişi!");
        }

        // 2. Dört İşlem Hesaplayıcı: Kullanıcıdan iki sayı ve bir işlem türü girmesini isteyen bir Java programı yazın.
        // Program, kullanıcının girdiği işlem türüne göre toplama, çıkarma, çarpma veya bölme işlemlerini gerçekleştirerek
        // sonucu ekrana yazdırsın. Bu işlemi switch durumları kullanarak yapın.

        System.out.print("İlk sayı girin: ");
        int ilkSayi = sc.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int ikinciSayi = sc.nextInt();
        System.out.print("Ne tür işlem yapmak istiyorsunuz? (+, -, *, /): ");
        char islem = sc.next().charAt(0);

        switch (islem){
            case '+':
                int toplam = ilkSayi + ikinciSayi;
                System.out.println("Toplama işleminin sonucu: "+toplam);
                break;
            case '-':
                if (ilkSayi>ikinciSayi){
                    int fark = ilkSayi - ikinciSayi;
                    System.out.println("Çıkarma işleminin sonucu: "+fark);
                }else{
                    int fark = ikinciSayi - ilkSayi;
                    System.out.println("Çıkarma işleminin sonucu: "+fark);
                }
                break;
            case '*':
                int carpim = ilkSayi*ikinciSayi;
                System.out.println("Çarpma işleminin sonucu: "+carpim);
                break;
            case '/':
                double bolum = (double) ilkSayi /ikinciSayi;
                System.out.println("Bölme işleminin sonucu: "+bolum);
                break;
            default:
                System.out.println("Yanlış seçim!");
                break;
        }

        // 3. Haftanın Günleri: Kullanıcıdan 1 ile 7 arasında bir sayı girmesini isteyen bir Java programı yazın. Bu sayıya
        // karşılık gelen günü (1 Pazartesi, 2 Salı, vs.) ekrana yazdıran bir program yapın. Bu işlemi switch durumları
        // kullanarak gerçekleştirin.

        System.out.println("1 ile 7 arasında bir sayı girin: ");
        int gun = sc.nextInt();

        switch (gun){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Hatalı Giriş!");
                break;
        }

        // 4. Ürün İndirim Hesaplayıcı: Kullanıcıdan bir ürün fiyatı ve indirim yüzdesi girmesini isteyen bir Java programı yazın.
        // Program, koşullu ifadeler kullanarak indirimli fiyatı hesaplasın ve sonucu ekrana yazdırsın.

        System.out.println("Ürünün fiyatını girin: ");
        int fiyat = sc.nextInt();
        System.out.println("İndirim yüzdesini girin: ");
        int yuzde = sc.nextInt();

        int indirimliFiyat = fiyat - ((fiyat*yuzde)/100);

        System.out.println("Ürünün indirimli fiyatı: "+ indirimliFiyat);
    }
}
