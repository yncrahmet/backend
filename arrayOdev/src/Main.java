public class Main {
    public static void main(String[] args) {
        // Dizi Başlatma: Java kodu yazın ve içeriğini {2, 4, 6, 8, 10} değerlerine sahip bir tamsayı dizisi
        // ile başlatın ve içeriğini görüntüleyin.

        int[] tamSayi = {2,4,6,8,10};

        for (int i=0;i<tamSayi.length;i++){
            System.out.print(tamSayi[i]+" ");
        }

        // Dizi Toplamı: Tüm tamsayılar dizisindeki tüm öğelerin toplamını hesaplayan ve
        // görüntüleyen bir program oluşturun.

        int sum = 0;
        for (int i=0;i<tamSayi.length;i++){
            sum+=tamSayi[i];
        }
        System.out.println("\n"+sum);

        // En Büyük ve En Küçük Öğe: Bir tamsayı dizisindeki en büyük ve en küçük
        // öğeleri bulan ve bunları görüntüleyen bir Java programı yazın.
        int buyuk = tamSayi[0];
        for (int i = 0;i<tamSayi.length;i++)
        {
            if (buyuk < tamSayi[i])
            { buyuk = tamSayi[i]; }
        }
        int kucuk = tamSayi[0];
        for (int i = 0;i<tamSayi.length;i++)
        {
            if (kucuk > tamSayi[i])
            { kucuk = tamSayi[i]; }
        }
        System.out.printf("Dizinin en büyük elemanı %d , en küçük elemanı %d !\n",buyuk,kucuk);

        // Dizi Sıralama: Bir tamsayı dizisini artan sırayla sıralayan ve
        // sıralanmış diziyi görüntüleyen bir programı uygulayın.

        int[] dizi = {8,16,5,23,7,12,5,9,12,5,6};
        int x; // geçici bir değişken
        System.out.println("Dizinin normal listelenmesi:");
        for (int i=0;i< dizi.length;i++){
            System.out.print(dizi[i]+" ");
        }

        for(int i = 0; i < dizi.length; i++)
        {
            for(int j = i+1; j < dizi.length; j++)
            {
                if(dizi[j] < dizi[i]) {
                    x = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = x;
                }
            }
        }
        System.out.println("\nDizinin artan sırada listelenmesi:");
        for (int i=0;i< dizi.length;i++){
            System.out.print(dizi[i]+" ");
        }

        // Dizide Arama: Bir dizide belirli bir tamsayıyı arayan ve bulunursa dizinin indeksini veya
        // bulunamazsa bir mesajı görüntüleyen bir program oluşturun.

        for (int i=0;i< dizi.length;i++){
            if(dizi[i]==32){
                System.out.printf("\n23 sayısı dizinin %d. indexinde tutulmaktadır!",i);
                break;
            }
            if (i == dizi.length - 1) {
                System.out.println("\nSayı bulunamadı!");
            }
        }

        // Dizi Ters Çevirme: Bir dizideki öğeleri tersine çeviren Java kodu yazın ve
        // ters çevrilen diziyi görüntüleyin.

        System.out.println("\nDizinin tersten yazılışı:");
        for (int i=dizi.length-1;i>=0;i--){
            System.out.print(dizi[i]+" ");
        }

        // Dizi Çoğaltma: Bir diziden yinelenen öğeleri kaldıran ve değiştirilmiş diziyi görüntüleyen bir programı uygulayın.

        int[] tekrarsizDizi = new int[dizi.length];
        int index = 0;

        for (int i = 0; i < dizi.length; i++) {
            boolean tekrarVar = false;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    tekrarVar = true;
                    break;
                }
            }
            if (!tekrarVar) {
                tekrarsizDizi[index++] = dizi[i];
            }
        }
        System.out.println("\nTekrarsız Dizi:");
        for (int i = 0; i < index; i++) {
            System.out.print(tekrarsizDizi[i] + " ");
        }
        System.out.println("\n");

        // İki Boyutlu Diziler: Bir 2D dizi başlatan ve içeriğini tablo biçiminde görüntüleyen bir program oluşturun.

        int[][] ikiBoyutlu = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i=0;i<ikiBoyutlu.length;i++){
            for (int j=0;j<ikiBoyutlu[i].length;j++){
                System.out.print(ikiBoyutlu[i][j]+" ");
            }
            System.out.println();
        }

        // Dizi İşleme: Bir diziden belirli bir öğeyi kaldıran ve yerine yeni bir öğe ekleyen Java programı yazın.
        // Değiştirilmiş diziyi görüntüleyin.

        int indx = 0;
        int arananSayi = 23;
        int yeniSayi = 42;

        for (int i=0;i<dizi.length;i++){
            if (dizi[i]==arananSayi){
                indx = i;
                dizi[i] = yeniSayi;
                System.out.printf("%d. indexteki %d sayısı değiştirildi. Yeni değer %d\n",indx,arananSayi,dizi[i]);
                break;
            }
            if (i == dizi.length - 1) {
                System.out.println("\nSayı bulunamadı!");
            }
        }
        for (int i=0;i<dizi.length;i++){
            System.out.print(dizi[i]+" ");
        }
        System.out.println();

        // Dizi İstatistikleri: Verilen tamsayı dizisinin ortalama, medyan ve modunu hesaplayan ve görüntüleyen bir programı uygulayın.

        // int[] dizii = {5,5,5,6,7,8,9,12,12,16,42,44}; // medyanı çift elemanlı dizilerde hesaplama için
        int toplam = 0;
        for (int i=0;i<dizi.length;i++){
            toplam+=dizi[i];
        }

        System.out.println("\nDizinin ortalaması: "+toplam/(dizi.length+1));

        // medyan hesaplama
        if ((dizi.length)%2==1){
            int medyanSıra = ((dizi.length)/2)+1;
            System.out.println("\nDizinin medyanı: "+dizi[medyanSıra-1]); //dizilerde 0. indexde 1 eleman olur.
        }else{
            int ilkOrta = ((dizi.length)/2);
            int ikinciOrta = ((dizi.length)/2)+1;
            System.out.println("\nDizinin medyanı: "); //dizilerde 0. indexde 1 eleman olur.
            System.out.println((dizi[ilkOrta-1]+dizi[ikinciOrta-1])/2);
        }

        //mod hesaplama

        int enSikTekrarEdenDeger = 0;
        int enSikTekrar = 0;
        int suankiTekrarEdenDeger = 0;
        int suankiTekrar = 0;

        for (int i = 0; i < dizi.length; i++) {
            if (i > 0 && dizi[i] == dizi[i - 1]) {
                suankiTekrar++;
            } else {
                if (suankiTekrar > enSikTekrar) {
                    enSikTekrar = suankiTekrar;
                    enSikTekrarEdenDeger = dizi[i - 1];
                }
                suankiTekrar = 1;
            }
        }

        if (suankiTekrar > enSikTekrar) {
            enSikTekrarEdenDeger = dizi[dizi.length - 1];
        }

        System.out.println("Dizinin modu: " + enSikTekrarEdenDeger);

    }
}