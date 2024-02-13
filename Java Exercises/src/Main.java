import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // hesapMakinesi();
        // ciftTekSorgulama();
        // basitFaizHesaplama();
    }

    private static void hesapMakinesi() {
        //İki sayı alın. Toplama, çıkarma, çarpma ve bölme gibi
        //temel matematiksel işlemleri gerçekleştiren
        //basit bir hesap makinesi programı oluşturun

        Scanner s = new Scanner(System.in);

        System.out.println("Basit Hesap Makinesi");
        System.out.println("______");
        System.out.println("İlk sayıyı girin: ");
        int sayi1 = Integer.parseInt(s.next());
        System.out.println("İkinci sayıyı girin: ");
        int sayi2 = Integer.parseInt(s.next());

        int toplam = sayi1 + sayi2;
        int fark = sayi1 - sayi2;
        int carpim = sayi1 * sayi2;
        int bolum = sayi1/sayi2;


        System.out.println("Toplam: "+ toplam);
        System.out.println("Fark: "+ fark);
        System.out.println("Çarpım: "+ carpim);
        System.out.println("Bölüm: " + bolum);

        System.out.println("Hesaplama tamamlandı.");
    }
    private static void ciftTekSorgulama(){
        // Kullanıcıdan bir sayı alın. Bu sayının çift mi yoksa tek mi olduğunu
        // kontrol edin ve sonucu ekrana yazdırın.

        Scanner s = new Scanner(System.in);

        System.out.println("Bir sayı giriniz!");
        int sayi = Integer.parseInt(s.next());
        System.out.println("Sayının tek mi çift mi olduğu tespit ediliyor...");
        if (sayi % 2 == 0){
            System.out.println(sayi + " sayısı çift sayıdır!");
        }else{
            System.out.println(sayi + " sayısı tektir");
        }


    }
    private static void basitFaizHesaplama(){
        // Kullanıcıdan anapara miktarı, faiz oranı ve süre bilgilerini alın.
        // Basit faiz hesaplamasını yapın ve sonucu ekrana yazdırın.

        Scanner s = new Scanner(System.in);

        System.out.println("Faiz Hesaplama Aracı");
        System.out.println("Ana paranızı girin.. ");
        int anaPara = Integer.parseInt(s.next());
        System.out.println("Faiz oranını girin.. ");
        int faizOrani = Integer.parseInt(s.next());
        System.out.println("Kaç ay faizde kalacak.. ");
        int sure = Integer.parseInt(s.next());

        System.out.println(anaPara + " %" +faizOrani + " faiz oranı ile" + sure + " ay faizde kalırsa :");
        int yeniPara = (anaPara * faizOrani) / 100 * sure;
        System.out.println("Alacağınız miktar: "+yeniPara);
        System.out.println("Toplam paranız "+ (yeniPara + anaPara) + " olacak!");
    }
   
}