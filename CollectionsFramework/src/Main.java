import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // a. Örnek: Bir otel rezervasyon sistemi için, her oda numarası ile rezervasyon durumunu eşleştirmek için bir
        // HashMap kullanabilirsiniz. Anahtar olarak oda numarasını ve değer olarak rezervasyon durumunu kullanabilirsiniz.

        HashMap<Integer, String> rooms = new HashMap<>();

        rooms.put(305, "Dolu");
        rooms.put(306, "Boş");
        rooms.put(307, "Dolu");
        rooms.put(308, "Dolu");
        rooms.put(309, "Boş");

        // b. Örnek: Bir sözlük uygulamasında, kelime-çeviri çiftlerini bir HashMap içinde saklayabilirsiniz.
        // Anahtar olarak kelimeyi ve değer olarak çevirisini kullanabilirsiniz.

        //       en       tr
        HashMap<String, String> dictionary = new HashMap<>();

        dictionary.put("hello", "merhaba");
        dictionary.put("welcome", "hoşgeldin");
        dictionary.put("buy", "satın almak");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Which word will you translate into Turkish?");
        String world = scanner.nextLine();

        if (dictionary.containsKey(world)) {
            String translated = dictionary.get(world);
            System.out.println(world + " world in Turkish: "+translated);
        } else {
            System.out.println("The word does not exist in our system.");
        }

    }

}
