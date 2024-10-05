import java.util.HashMap;

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

    }

}
