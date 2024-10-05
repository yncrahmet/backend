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

        // Bir öğrenci sınıfının notlarını bir ArrayList içinde saklayın. Ardından bu notları hesaplayarak
        // sınıfın ortalama notunu hesaplayabilirsiniz.

        ArrayList<Integer> grades = new ArrayList<>();

        Student studentOne = new Student("Ahmet",22,90);
        Student studentTwo = new Student("Mehmet",21,85);
        Student studentThree = new Student("Ali",22,80);

        grades.add(studentOne.getGrade());
        grades.add(studentTwo.getGrade());
        grades.add(studentThree.getGrade());

        int GPA = ( grades.get(0) + grades.get(1) + grades.get(2) ) / 3;

        System.out.println("GPA for Student's grade: " + GPA);

    }

}
