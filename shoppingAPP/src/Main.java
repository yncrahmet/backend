import java.util.Scanner;

public class Main {
    private static final int MAX_ITEMS = 10; // 10 ürün var
    private static final int MAX_CART_ITEMS = 5;
    private static String[][] itemInfo;
    private static String[] cartInfo;
    private static String[][] discountItems;
    private static int itemCount; // mağazaya eklerken sayacak
    private static int cartCount; // sepete eklerken sayacak
    private static int discountItemCount; // indirimli ürün eklerken sayacak

    public Main() {
        itemInfo = new String[MAX_ITEMS][3];
        cartInfo = new String[MAX_CART_ITEMS]; // sepete max 5 eklenecek!
        discountItems = new String[MAX_ITEMS][2]; // itemname , indirimOranı,
        itemCount = 0;
        cartCount = 0;
        discountItemCount = 0;
    }
    public static void addItemToShop(String itemName, double itemPrice, int stockQuantity) {
        if (itemCount >= MAX_ITEMS) {
            System.out.println("Mağazaya daha fazla ürün ekleyemezsiniz!");
        } else {
            itemInfo[itemCount][0] = itemName;
            itemInfo[itemCount][1] = String.valueOf(itemPrice);
            itemInfo[itemCount][2] = String.valueOf(stockQuantity);

            System.out.println("Başarıyla yeni bir ürün eklediniz!");
            itemCount++;
        }
    }
    public static void addDiscountItem(String itemName, double discountRate) {
        if (discountItemCount > MAX_ITEMS) {
            System.out.println("Maksimum item sayısından fazla indirimli ürün giremezsiniz!");
        } else {
            discountItems[discountItemCount][0] = itemName;
            discountItems[discountItemCount][1] = String.valueOf(discountRate);

            System.out.println("Başarıyla indirimli ürün eklediniz!");
            discountItemCount++;
        }
    }
    public static void addItemToCart(String itemName) {
        if (cartCount >= MAX_CART_ITEMS) {
            System.out.println("Sepetinize daha fazla eşya ekleyemezsiniz. Lütfen önce sepetinizdekileri ödeyin veya sepetten kaldırın!");
        } else {
            for (int i = 0; i < itemCount; i++) {
                if (itemInfo[i][0].equals(itemName)) {
                    int stock = Integer.parseInt(itemInfo[i][2]);
                    if (stock <= 0) {
                        System.out.println("Bu ürün stokta yoktur!");
                        return;
                    } else {
                        cartInfo[cartCount] = itemName;
                        System.out.println("Ürünü sepete eklediniz!");
                        cartCount++;
                        boolean isAddedToCart = true;//item sepete eklendi
                        checkStock(itemName, isAddedToCart);
                        return;
                    }
                }
            }
        }
    }
    public static void removeItemFromCart(String itemName) {
        for (int i = 0; i < cartCount; i++) {
            if (cartInfo[i].equals(itemName)) {
                cartInfo[i] = null;
                System.out.println(itemName + " ürününü sepetten kaldırdınız!");
                boolean isAddedToCart = false;
                checkStock(itemName, isAddedToCart);
                cartCount--;
                return;
            }
        }
    }
    public static void clearCart() {
        boolean isAddedToCart = false; // Tüm ürünler kaldırılacak o yüzden her defasında yazmaya gerek yok
        for (int i = 0; i < cartCount; i++) {
            for (int j = 0; j < itemCount; j++) {
                if (cartInfo[i].equals(itemInfo[j][0])) {
                    checkStock(itemInfo[j][0], isAddedToCart);
                }
            }
            cartInfo[i] = null;
        }
        cartCount = 0;
    }
    public static void checkStock(String itemName, boolean isAddedToCart) {
        for (int i = 0; i < itemCount; i++) {
            if (itemName.equals(itemInfo[i][0])) {
                int stock = Integer.parseInt(itemInfo[i][2]);
                if (isAddedToCart) {
                    stock--;
                    System.out.println(itemName + " ürünü için stok miktarı azaltıldı!");
                } else {
                    stock++;
                    System.out.println(itemName + " ürünü için stok miktarı artırıldı!");
                }
                itemInfo[i][2] = String.valueOf(stock);
            }
        }
    }
    public static void calculateTotalOfCart() {
        double totalPrice = 0.0;
        String discount = "FIRSAT";

        for (int i = 0; i < cartCount; i++) {
            double itemPrice = 0.0;
            double discountedPrice = 0.0;

            for (int j = 0; j < itemCount; j++) {
                if (cartInfo[i].equals(itemInfo[j][0])) {
                    itemPrice = Double.parseDouble(itemInfo[j][1]);
                    break;
                }
            }

            double discountRate = 0.0;
            for (int x = 0; x < discountItemCount; x++) {
                if (discountItems[x][0].equals(cartInfo[i])) {
                    discountRate = Double.parseDouble(discountItems[x][1]);
                    break;
                }
            }

            if (discountRate > 0.0) {
                discountedPrice = itemPrice - (itemPrice * discountRate);
                totalPrice += discountedPrice;
                System.out.println(cartInfo[i] + " ürünü indirimli fiyatı: " + discountedPrice);
            } else {
                totalPrice += itemPrice;
                System.out.println(cartInfo[i] + " ürünü fiyatı: " + itemPrice);
            }
        }

        System.out.println("Sepetinizin toplam tutarı: " + totalPrice + "$");
        System.out.println("İndirim kodunuz var ise aşağıya kodu giriniz: ");
        Scanner s = new Scanner(System.in);
        String answer = s.next();
        if (answer.equals(discount)) {
            double discountAmount = (totalPrice * 0.20);
            double newPrice = totalPrice - discountAmount;
            System.out.println("İndirimli fiyat: " + newPrice + "$");
        } else {
            System.out.println("Geçersiz indirim kodu! Ödemeniz gereken tutar: " + totalPrice + "$");
        }
    }
    public static void getReport() {
        double totalPrice = 0.0;
        double maxPrice = Double.MIN_VALUE;
        double minPrice = Double.MAX_VALUE;
        int totalItemCount = 0;

        for (int i = 0; i < cartCount; i++) {
            for (int j = 0; j < itemCount; j++) {
                if (cartInfo[i].equals(itemInfo[j][0])) {
                    double itemPrice = Double.parseDouble(itemInfo[j][1]);
                    totalPrice += itemPrice;
                    totalItemCount++;
                    // En pahalı ürün
                    if (itemPrice > maxPrice) {
                        maxPrice = itemPrice;
                    }
                    // En ucuz ürün
                    if (itemPrice < minPrice) {
                        minPrice = itemPrice;
                    }
                    break;
                }
            }
        }
        double averagePrice = totalPrice / totalItemCount;

        System.out.println("Genel Stok Durumu");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(itemInfo[i][0] + " stok miktarı: " + itemInfo[i][2]);
        }
        System.out.println("Ortalama Ürün Fiyatı: " + averagePrice);
        System.out.println("En Pahalı Ürün: " + maxPrice);
        System.out.println("En Ucuz Ürün: " + minPrice);
        System.out.println("Sepetteki Toplam Ürün Sayısı: " + totalItemCount);
    }
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Ürün ekle");
            System.out.println("2. İndirimli ürün ekle");
            System.out.println("3. Sepete ürün ekle");
            System.out.println("4. Sepetten ürün çıkar");
            System.out.println("5. Sepeti temizle");
            System.out.println("6. Sepet toplamını hesapla");
            System.out.println("7. Genel stok raporunu görüntüle");
            System.out.println("0. Çıkış");
            System.out.print("Lütfen bir seçenek seçin: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Ürün adı: ");
                    String itemName = scanner.next();
                    System.out.print("Ürün fiyatı: ");
                    double itemPrice = scanner.nextDouble();
                    System.out.print("Stok miktarı: ");
                    int stockQuantity = scanner.nextInt();
                    addItemToShop(itemName, itemPrice, stockQuantity);
                    break;
                case 2:
                    System.out.print("İndirimli ürün adı: ");
                    String discountedItemName = scanner.next();
                    System.out.print("İndirim oranı (%): ");
                    double discountRate = scanner.nextDouble() / 100; // yüzde cinsinden al
                    addDiscountItem(discountedItemName, discountRate);
                    break;
                case 3:
                    System.out.print("Sepete eklemek istediğiniz ürün adı: ");
                    String cartItemName = scanner.next();
                    addItemToCart(cartItemName);
                    break;
                case 4:
                    System.out.print("Sepetten çıkarmak istediğiniz ürün adı: ");
                    String removedItemName = scanner.next();
                    removeItemFromCart(removedItemName);
                    break;
                case 5:
                    clearCart();
                    System.out.println("Sepetiniz temizlendi.");
                    break;
                case 6:
                    calculateTotalOfCart();
                    break;
                case 7:
                    getReport();
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçenek seçtiniz. Lütfen tekrar deneyin.");
                    break;
            }
        } while (choice != 0);
    }
}