public class DataTypeandVariables {
    public static void main(String[] args) {
        System.out.println("Veri Tipleri ve Değişkenler");

        // ilkel veri tipleri
        // int short long float double char boolean(iki değer alır) byte
        //                                      true or false

        int yas = 22;
        double maas = 62457.12;
        char cinsiyet = 'E';
        boolean ogrenciMi = false;

        System.out.println("Yaş: "+yas);
        System.out.println("Maaş: "+maas);
        System.out.println("Cinsiyet: "+cinsiyet);
        System.out.println("Öğrenci mi?: "+ogrenciMi);

        System.out.println(10);
        System.out.println(10.25);

        int number = 10;
        String slogan = "ye kodla uyu tekrarla :D";
        System.out.println(slogan);
        System.out.println(number);

        // Değişken bildirimi ve başlatılması
        String isim; // değişken bildirilmesi, bellekte yer hazırlanıyor ama değeri yok
        isim = "Ahmet"; // değer atanması , bellekte hazırlanan yerin değeri Ahmet ile değişiyor

        System.out.println("Kullanıcı: "+isim);

        // Değişken Kapsamı ve Yaşam Süresi
        int x = 10;
        {
            int y = 20;
            System.out.println("X sayısı: "+x); // erişim mümkün
            System.out.println("Y sayısı: "+y); // erişim mümkün
        }
        System.out.println("X sayısı: "+x); // erişim mümkün
        // System.out.println("Y sayısı: "+y); // hata verdi. erişim mümkün değil! kapsam dışında!

        // DEĞİŞKEN küçük HARFLERLE BAŞLIYORSA İLKEL VERİ TİPİ
        // DEĞİŞKEN BÜYÜK HARFLERLE BAŞLIYORSA İLKEL OLMAYAN VERİ TİPİ

        // ÖRNEK: YAŞ HESAPLAMA

        int  dogumYili = 2002;
        int suankiYil = 2024;
        int hesaplananYas = suankiYil - dogumYili;

        System.out.println(isim + " " + suankiYil + " itibariyle "+hesaplananYas+" yaşındadır!");
        // hesaplananYas değişkenini kullanmadan da yapılabilir ama parantez kullanılmazsa hata verir!
        // çünkü matematiksel ifade ile birleştirme işleminin karışmaması gerekiyor!
        System.out.println(isim + " " + suankiYil + " itibariyle "+(suankiYil - dogumYili)+" yaşındadır!");

        System.out.println("1"+"1"); //String (birleştirir)
        System.out.println(1+1); //int (toplar)
    }
}
