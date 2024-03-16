import java.util.Scanner;

public class Main {

    private static final int MAX_ITEMS = 100;
    private String[] itemNames;
    private double[] itemPrices;
    private int itemCount;

    public Main(){
        this.itemCount = 0;
        this.itemNames = new String[MAX_ITEMS];
        this.itemPrices = new double[MAX_ITEMS];

    }
    private void addItemToCart(String itemName,double itemPrice){
        if (itemCount<MAX_ITEMS){
            itemNames[itemCount] = itemName;
            itemPrices[itemCount] = itemPrice;
            itemCount++;
            System.out.println(itemName+" added to the cart.");
        }else{
            System.out.println("Sorry, the cart is full.");
        }
    }
    
    private void removeItemFromCart(String itemName){
        if (itemCount>0){
            for (int i=0;i<itemCount;i++){
                if (itemNames[itemCount].equals(itemName)){
                    itemNames[itemCount]=null;
                    itemPrices[itemCount]=0;
                    System.out.println(itemName+" removed from the cart.");
                    return;
                }
            }
            System.out.println(itemName + " is not found in the cart.");
        }else{
            System.out.println("Cart is already empty");
        }
    }

    private void viewCart(){
        if (itemCount==0){
            System.out.println("Cart is empty.");
        }else{
            System.out.println("Cart content:");
            for (int i=0;i<itemCount;i++){
                System.out.println(itemNames[i]+": $"+itemPrices[i]);
            }
        }
    }

    private void calculateTotal(){
        double total = 0;
        for (int i=0;i<itemCount;i++){
            total+=itemPrices[i];
        }
        System.out.println("Total price of items in the cart : $"+total);
    }

    public static void main(String[] args) {
        Main shoppingcart = new Main();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Shopping Cart!");
        while(true){
            System.out.println("\nChoose an option:");
            System.out.println("1: Add item to cart.");
            System.out.println("2: View cart.");
            System.out.println("3: Calculate total.");
            System.out.println("4: Exit.");

            System.out.println("\nYour Choice: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter item name: ");
                    String itemName = scanner.next();
                    System.out.println("Enter item price: ");
                    double itemPrice = scanner.nextDouble();
                    shoppingcart.addItemToCart(itemName,itemPrice);
                    break;
                case 2:
                    shoppingcart.viewCart();
                    break;
                case 3:
                    shoppingcart.calculateTotal();
                    break;
                case 4:
                    System.out.println("Exiting the shopping cart. Good bye...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice...");
                    break;
            }

        }

    }
}