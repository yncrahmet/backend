import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        // Bir müşteri veritabanınızı yönetmek için ArrayList kullanın. Her bir müşteri nesnesi, müşteri adı,
        // e-posta adresi ve telefon numarası gibi bilgileri içeren bir sınıfın örneği olabilir. ArrayList,
        // müşteri nesnelerini saklamak için kullanılabilir.

        ArrayList<Customer> customers = new ArrayList<>();

        Customer customerOne = new Customer();

        customerOne.setName("Ahmet");
        customerOne.setEmail("ahmet@mail.com");
        customerOne.setPhone("5555555555");

        Customer customerTwo = new Customer();

        customerTwo.setName("Mehmet");
        customerTwo.setEmail("mehmet@mail.com");
        customerTwo.setPhone("4444444444");

        customers.add(customerOne);
        customers.add(customerTwo);

        System.out.println("------------------Customers------------------");
        System.out.println();
        System.out.println(customers.get(0).getName()+" "+customers.get(0).getEmail()+" "+customers.get(0).getPhone());
        System.out.println(customers.get(1).getName()+" "+customers.get(1).getEmail()+" "+customers.get(1).getPhone());
        System.out.println();
        System.out.println("------------------Customers------------------");

    }

}
