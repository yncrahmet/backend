public class Main {
    public static void main(String[] args) {
        // Sıralama Algoritmaları: Java'da farklı sıralama algoritmalarını uygulayarak dizileri sıralamak için bir program
        // oluşturun. Örneğin, kabarcık sıralama, birleştirme sıralama veya hızlı sıralama gibi.
        int[] dizi = {12,6,23,16,32,27};
        // bubble sort ile iki elemanı karşılaştırıp küçük olanı sola atacağız her durumda
        for (int i=1;i< dizi.length;i++){
            for (int j=0;j< dizi.length-1;j++){
                int eleman = 0;
                if (dizi[j]>dizi[j+1]){
                    eleman=dizi[j];
                    dizi[j]=dizi[j+1];
                    dizi[j+1]=eleman;
                }
            }
        }
        for (int x: dizi){
            System.out.print(x+" ");
        }

        // Faktöriyel Hesaplama: Bir sayının faktöriyelini hesaplayan bir Java programı yazın. Hem döngü (iteratif) hem de
        // özyinelemeli (recursive) yaklaşımları kullanarak faktöriyeli hesaplayın.
        int sayi = 10;
        int sum = 0;
        for (int i=1;i<=sayi;i++){
            sum+=i;
        }
        System.out.printf("\n%d sayısının faktöriyeli %d!",sayi,sum);
        //recursive
        int sonuc = faktoriyel(sayi);
        System.out.println("\n"+sonuc);

        // Dinamik Programlama ile Kesirli Sırt Çantası Problemi: Bir sırt çantasına ağırlık ve değer verilirken, en fazla
        // değeri elde etmek için kesirli sırt çantası problemi çözen bir program yazın.

        


        // Matriks Çarpımı (Matrix Multiplication): İki matrisi çarpan ve sonucu hesaplayan bir Java programı yazın.
        // Matriks çarpımı için etkili bir algoritma uygulayın.
//          [ 1 2 ] [ 5 6 ]
//          [ 3 4 ] [ 7 8 ]
        int[][] ilkBoyutlu = {{1,2},{3,4}};
        int[][] ikinciBoyutlu = {{5,6},{7,8}};

        int satir1 = ilkBoyutlu.length;
        int sutun1 = ilkBoyutlu[0].length;
        int sutun2 = ikinciBoyutlu[0].length;

        int[][] carpim = new int[satir1][sutun2];

        for (int i = 0; i < satir1; i++) {
            for (int j = 0; j < sutun2; j++) {
                for (int k = 0; k < sutun1; k++) {
                    carpim[i][j] += ilkBoyutlu[i][k] * ikinciBoyutlu[k][j];
                }
            }
        }
        for (int i = 0; i < satir1; i++) {
            for (int j = 0; j < sutun2; j++) {
                System.out.print(carpim[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int faktoriyel(int sayi) {
        if (sayi==1){
            return 1;
        }else{
            return sayi+faktoriyel(sayi-1);
        }
    }
}