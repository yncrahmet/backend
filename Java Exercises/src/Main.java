import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // hesapMakinesi();
        // ciftTekSorgulama();
        // basitFaizHesaplama();
        // notHesaplama();
        // usAlma();
        // sayiKarsilastirma();
    }

    private static void hesapMakinesi() {
        /*
        İki sayı alın. Toplama, çıkarma, çarpma ve bölme gibi
        temel matematiksel işlemleri gerçekleştiren
        basit bir hesap makinesi programı oluşturun
        */

        Scanner s = new Scanner(System.in);

        System.out.println("-- Basit Hesap Makinesi --");
        System.out.println("__________________________");

        System.out.println("İlk sayıyı girin: ");
        int ilkSayi = s.nextInt();
        System.out.println("İkinci sayıyı girin: ");
        int ikinciSayi = s.nextInt();

        System.out.println("1. Toplama");
        System.out.println("2. Çıkarma");
        System.out.println("3. Çarpma");
        System.out.println("4. Bölme");

        System.out.println("Yapmak İstediğiniz İşlemin Numarasını Giriniz:  ");
        int key = s.nextInt();

        switch (key){
            case 1:
                System.out.println("Toplam: "+ (ilkSayi + ikinciSayi));
                System.out.println("Hesaplama tamamlandı.");
                break;
            case 2:
                System.out.println("Fark: "+ (ilkSayi - ikinciSayi));
                System.out.println("Hesaplama tamamlandı.");
                break;
            case 3:
                System.out.println("Çarpım: "+ (ilkSayi * ikinciSayi));
                System.out.println("Hesaplama tamamlandı.");
                break;
            case 4:
                System.out.println("Bölüm: "+ (ilkSayi - ikinciSayi));
                System.out.println("Hesaplama tamamlandı.");
                break;
            default:
                System.out.println("Hatalı Seçim Yaptınız!");
                break;
        }
    }
    private static void ciftTekSorgulama(){
        // Kullanıcıdan bir sayı alın. Bu sayının çift mi yoksa tek mi olduğunu
        // kontrol edin ve sonucu ekrana yazdırın.

        Scanner s = new Scanner(System.in);

        System.out.println("Bir sayı giriniz!");
        int sayi = s.nextInt();
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
        int anaPara = s.nextInt();
        System.out.println("Faiz oranını girin.. ");
        int faizOrani = s.nextInt();
        System.out.println("Kaç ay faizde kalacak.. ");
        int sure = s.nextInt();

        System.out.println(anaPara + " %" +faizOrani + " faiz oranı ile" + sure + " ay faizde kalırsa :");
        int yeniPara = (anaPara * faizOrani) / 100 * sure;
        System.out.println("Alacağınız miktar: "+yeniPara);
        System.out.println("Toplam paranız "+ (yeniPara + anaPara) + " olacak!");
    }
    private static void notHesaplama(){
        /*
         Kullanıcıdan alınan bir puanı belirli bir
         not skalasına göre değerlendirin ve sonucu ekrana yazdırın.

         80 ve sonrası AA
         70 ve sonrası BB
         60 ve sonrası CC
         60 altı FF

        */

        Scanner s = new Scanner(System.in);

        System.out.println("Not Hesaplama Aracı!");
        System.out.println("____________________");
        System.out.println("Öğrencinin Notunu Girin.. ");
        double ogrenciNotu = s.nextDouble();
        System.out.println("Sonuçlar hesaplanırken bekleyin...");

        if (ogrenciNotu>=80 && ogrenciNotu<=100){
            System.out.println("Sonuç: AA");
            System.out.println("Başarıyla Tamamladı!");
        }else if(ogrenciNotu>=70 && ogrenciNotu<80){
            System.out.println("Sonuç: BB");
            System.out.println("Tamamladı!");
        } else if (ogrenciNotu>=60 && ogrenciNotu<70){
            System.out.println("Sonuç: CC");
            System.out.println("Şartlı Tamamladı!");
        } else if (ogrenciNotu<60 && ogrenciNotu>=0){
            System.out.println("Sonuç: FF");
            System.out.println("Kaldı!");
        }else{
            System.out.println("Geçersiz giriş!");
        }

    }
    private static void usAlma(){
        Scanner s = new Scanner(System.in);

        System.out.println("Sayının Karesini Alan Proje");
        System.out.println("___________________________");

        System.out.println("Sayı giriniz.. ");
        int sayi = s.nextInt();

        System.out.println(sayi+" sayısıın karesi = "+sayi*sayi);
        System.out.println("Hesaplama Yapıldı!");
    }
    private static void sayiKarsilastirma(){
        // Üç sayıyı giriş olarak alan ve bunlardan en büyüğünü yazdıran bir program yazın.

        Scanner s = new Scanner(System.in);

        System.out.println("Sayı Karşılaştırma Aracı");
        System.out.println("________________________");

        System.out.println("3 adet sayı girmeniz gerekmektedir!");
        System.out.println("1. sayı bekleniyor... ");
        int a = s.nextInt();
        System.out.println("2. sayı bekleniyor... ");
        int b = s.nextInt();
        System.out.println("3. sayı bekleniyor... ");
        int c = s.nextInt();

        if (a>b && a>c){
            System.out.println("İlk girilen "+a+" sayısı en büyüktür!");
        }else if(b>a && b>c){
            System.out.println("İkinci girilen "+b+" sayısı en büyüktür!");
        }else if(c>a && c>b){
            System.out.println("Üçüncü girilen "+c+" sayısı en büyüktür!");
        }else{
            System.out.println("Sayılar birbirine eşittir!");
        }

    }
}