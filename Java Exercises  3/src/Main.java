public class Main {
    public static void main(String[] args) {
        // 1: Dizi Toplamı: Bir tamsayı dizisinin tüm elemanlarının toplamını bulan bir Java metodunu yazın.
        
        int[] dizi = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i=0;i<dizi.length;i++){
            sum+=dizi[i];
        }
        System.out.println("Dizinin elemanları toplamı: "+sum);

        // 2: Dizi Ortalaması: Bir double dizisinin değerlerinin ortalamasını hesaplayan bir Java programı yazın.

        double[] doubleDizi = {5.2,7.5,9.1,10.8,6.4,12.4};
        double summ = 0;
        for (int i=0;i<doubleDizi.length;i++){
            summ+=doubleDizi[i];
        }
        System.out.println("Double dizisinin ortalaması: "+summ/(doubleDizi.length));

        // 3: Dizi Ters Çevirme: Bir dizinin elemanlarını yerinde ters çeviren bir metod yazın.

        int[] ikinciDizi = {21,43,56,15,17,87,91};
        int[] yeniDizi = new int[7];
        for (int i=0;i<ikinciDizi.length;i++){
            int eleman = ikinciDizi[i];
            int tersEleman = ((eleman%10)*10)+(eleman/10);
            yeniDizi[i] = tersEleman;
            System.out.print(yeniDizi[i]+" ");
        }

        // 4: Dizi Arama: Bir dizide belirli bir elemanı arayan ve indeksini döndüren bir Java fonksiyonu yazın.
        // Eğer eleman bulunamazsa, -1 dönmelidir.
        int istenenEleman = 56;
        for (int i=0;i<ikinciDizi.length;i++){
            if (ikinciDizi[i]==istenenEleman){
                System.out.println("\n"+istenenEleman+" dizinin "+i+". indexinde tutulmaktadır.");
                break;
            }
            if (i==ikinciDizi.length-1){
                System.out.println(istenenEleman+" dizide bulunmuyor!");
            }
        }

        // 5: String Uzunluğu: Verilen bir string'in uzunluğunu, length() metodunu kullanmadan hesaplayan bir metod geliştirin.
        String isim = "Ahmet";
        char[] chr = isim.toCharArray();
        int uzunluk = 0;
        for (int x: chr){
            uzunluk++;
        }
        System.out.printf("%s kelimesinin uzunluğu: %d\n",isim,uzunluk);

        // 6: String Ters Çevirme: Bir string'i StringBuilder veya StringBuffer sınıflarını kullanmadan ters çeviren
        // bir Java fonksiyonu yazın.
        System.out.printf("%s kelimesinin tersi: ",isim);
        for (int i= chr.length-1;i>=0;i--){
            System.out.print(chr[i]);
        }

        // 7: Dizi Kesişimi: İki dizinin kesişimini bulan ve sonucu yeni bir dizi olarak döndüren bir metod yazın.
        int[] birKesisim = {12, 14, 16, 18, 20, 31};
        int[] ikiKesisim = {14, 19, 31, 16, 25, 56};
        int[] ayniEleman = new int[birKesisim.length];
        int sayac = 0;

        for (int i = 0; i < birKesisim.length; i++) {
            for (int j = 0; j < ikiKesisim.length; j++) {
                if (birKesisim[i] == ikiKesisim[j]) {
                    ayniEleman[sayac++] = birKesisim[i];
                    break;
                }
            }
        }

        System.out.println("\nKesişim:");
        for (int s : ayniEleman) {
            if (s!=0){ // eleman sayısı fazla olduğu için sıfırları yazdırmadım
                System.out.print(s + " ");
            }
        }

        // 8: Dizi Birleşimi: İki dizinin birleşimini bulan ve sonucu yeni bir dizi olarak döndüren bir program yazın.
        int[] tumEleman = new int[birKesisim.length + ikiKesisim.length];
        int yeniSayac = 0;

        for (int i = 0; i < birKesisim.length; i++) {
            tumEleman[yeniSayac++] = birKesisim[i];
        }

        for (int i = 0; i < ikiKesisim.length; i++) {
            boolean varMi = false;
            for (int j = 0; j < birKesisim.length; j++) {
                if (ikiKesisim[i] == birKesisim[j]) {
                    varMi = true;
                    break;
                }
            }
            if (!varMi) {
                tumEleman[yeniSayac++] = ikiKesisim[i];
            }
        }
        System.out.println("\nBirleşim:");
        for (int s : tumEleman) {
            if (s!=0){
                System.out.print(s + " ");
            }
        }

        // 9: Dizi Döndürme: Bir dizinin elemanlarını sağa belirli bir sayıda pozisyon kaydıran bir metod yazın.
        int belirliMiktar = 2; // ne kadar kaydırılacaüı burda belirtilecek
        int[] kaydirilanDizi = new int[birKesisim.length+belirliMiktar];

        int a = 0;
        for (int i=belirliMiktar;i< kaydirilanDizi.length;i++){
            kaydirilanDizi[i]=birKesisim[a++];
        }
        System.out.println("\nYeni kaydırılan dizi: ");
        for (int x:kaydirilanDizi){
            System.out.print(x+" ");
        }

        // 10: Dizi Maksimumu: Bir tamsayı dizisinin maksimum değerini bulan bir Java fonksiyonu yazın.

        int buyuk = birKesisim[0];
        for (int i = 0;i<birKesisim.length;i++)
        {
            if (buyuk < birKesisim[i])
            { buyuk = birKesisim[i]; }
        }
        System.out.println("\nDizinin maksimum değeri: "+buyuk);
    }
}