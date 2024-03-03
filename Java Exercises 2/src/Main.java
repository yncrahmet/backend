import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //
        // 1) Verilen bir cümlede kaç adet boşluk karakteri bulunduğunu bulan bir Java programı
        //


        System.out.print("Bir cümle girin: ");
        String sentence = scanner.nextLine();

        int sentenceLength = sentence.length();

        int counter = 0;
        for(int i=0;i<sentenceLength;i++){
            if( sentence.charAt(i) == ' ' ){
                counter++;
            }
        }
        System.out.printf("-%s- cümlesinde %d adet boşluk vardır!",sentence,counter);


        //
        // 2) Bir kullanıcıdan alınan bir kelimenin palindrom olup olmadığını kontrol eden bir Java programı yazın.
        // (Örneğin, "kayak" kelimesi bir palindromdur.)
        //


        System.out.print("Bir kelime girin: ");
        String isPalindrom = scanner.nextLine();
        String reverseWord = "";
        for(int i=isPalindrom.length()-1; i>=0; i--){
            reverseWord+=isPalindrom.charAt(i);
        }
        if (word.equals(reverseWord)){
            System.out.printf("%s kelimesi bir palindromdur!",isPalindrom);
        }else{
            System.out.printf("%s kelimesi bir palindrom değildir!",isPalindrom);
        }

        //
        // 3) Kullanıcıdan alınan bir cümlede belirli bir kelimenin kaç kez geçtiğini sayan bir Java programı yazın.
        //


//        System.out.print("Bir cümle yazın: ");
//        String sentence = scanner.nextLine();
//        System.out.print("Cümle içindeki hangi kelimeyi kontrol edeceksiniz? ");
//        String word = scanner.nextLine();
//        String[] array = sentence.split(" ");
//
//        int counter = 0;
//        for(int i = 0;i<array.length;i++){
//            if(array[i].equalsIgnoreCase(word)) {
//                counter++;
//            }
//        }
//        System.out.printf("-%s- cümlesinde -%s- kelimesi %d kez geçmektedir!",sentence,word,counter);


        //
        // 4) Bir cümledeki kelimeleri tersten sıralayarak ekrana yazdıran bir Java programı yazın.
        //


//        String sentence = "Bir cümledeki kelimeleri tersten sıralayarak ekrana yazdıran bir Java programı yazın.";
//        String[] array = sentence.split(" ");
//
//        for(int i = array.length-1;i>=0;i--){
//            System.out.print(array[i]+" ");
//        }


        //
        // 5) Bir kelimenin içindeki tekrar eden harfleri kaldıran bir Java programı yazın.
        // (Örneğin, "programming" kelimesi için "progamin" sonucu alınmalıdır.)
        //

//        System.out.print("Bir kelime girin: ");
//        String word = scanner.nextLine();
//
//        StringBuilder newWord = new StringBuilder();
//
//        for (int i = 0;i<word.length();i++){
//            char c = word.charAt(i);
//            if (newWord.indexOf(String.valueOf(c)) == -1){
//                newWord.append(c);
//            }
//        }
//        System.out.printf("Yeni kelime %s",newWord);

        //
        // 6) Kullanıcıdan alınan iki kelimenin anagram olup olmadığını kontrol eden bir Java programı yazın.
        // (Anagramlar, aynı harfleri içeren fakat sıralamaları farklı olan kelimelerdir.)
        //

//        System.out.print("Kelime girin: ");
//        String firstWord = scanner.nextLine();
//        System.out.print("2. kelimeyi girin: ");
//        String secondWord = scanner.nextLine();
//
//        StringBuilder sb = new StringBuilder();
//
//        if (firstWord.length() != secondWord.length()) {
//            System.out.println("Kelimeler anagram değildir!");
//        }else{
//            char[] charArray1 = firstWord.toCharArray();
//            char[] charArray2 = secondWord.toCharArray();
//
//            Arrays.sort(charArray1);
//            Arrays.sort(charArray2);
//
//            if(Arrays.equals(charArray1, charArray2)){
//                System.out.printf("%s ve %s anagramdır!",firstWord,secondWord);
//            }else{
//                System.out.printf("%s ve %s anagram değildir!",firstWord,secondWord);
//            }
//        }

        //
        // 7) Bir cümledeki tüm kelimelerin ilk harfini büyük harfe dönüştüren bir Java programı yazın.
        //

//        System.out.print("Bir cümle girin: ");
//        String sentence = scanner.nextLine();
//
//        String[] array = sentence.split(" ");
//
//        for(int i = 0;i<array.length;i++){
//            String output = array[i].substring(0, 1).toUpperCase() + array[i].substring(1).toLowerCase();
//            System.out.print(output+" ");
//        }

        //
        // 8) Bir cümledeki en uzun kelimeyi bulan bir Java programı yazın.
        //

//        System.out.print("Bir cümle girin");
//        String sentence = scanner.nextLine();
//
//        String[] array = sentence.split(" ");
//
//        String longestWord = "";
//        for (String word : array) {
//            if (word.length() > longestWord.length()) {
//                longestWord = word;
//            }
//        }
//        System.out.printf("%s cümlesindeki en uzun kelime %s",sentence,longestWord);

        //
        // 9)Bir cümlede geçen her kelimenin uzunluğunu hesaplayarak bu uzunlukları ekrana yazdıran bir Java programı yazın.
        //

//        System.out.print("Bir cümle girin");
//        String sentence = scanner.nextLine();
//
//        String[] array = sentence.split(" ");
//
//        for (int i=0;i<array.length;i++){
//            System.out.println(array[i] + " kelimesinin uzunluğu " + array[i].length());
//        }

        // 10) Bir kelimenin içindeki sesli harfleri ve sessiz harfleri sayan bir Java programı yazın.
        // (Örneğin, "Merhaba" kelimesi için 3 sesli, 4 sessiz harf sonucu alınmalıdır.)

//        System.out.print("Kelime girin: ");
//        String word = scanner.nextLine();
//
//        char[] newChar = {'a', 'e', 'i', 'ı', 'o', 'ö', 'u', 'ü'};
//
//        int sesliHarf = 0;
//        for (int i = 0; i < word.length(); i++) {
//            char currentChar = Character.toLowerCase(word.charAt(i));
//            for (char sesli : newChar) {
//                if (currentChar == sesli) {
//                    sesliHarf++;
//                    break;
//                }
//            }
//        }
//        System.out.printf("%s içindeki sesli harf sayısı %d",word,sesliHarf);
//        int sessizHarf = word.length() - sesliHarf;
//        System.out.printf("%s içindeki sesli harf sayısı %d",sessizHarf,sesliHarf);

    }
}
