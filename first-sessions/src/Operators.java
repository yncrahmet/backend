public class Operators {
    public static void main(String[] args) {
        System.out.println("Operatörler");

        // Aritmetik Operatörler
        int num1 = 10; // camel case -> userName, myName : bir değişken oluştururken kullanılan isimlendirme yöntemi
        int num2 = 5;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2; // matematikteki mod işlemi yani bölme işlemindeki kalanı verir

        System.out.println("Toplam: "+sum);
        System.out.println("Fark: "+difference);
        System.out.println("Çarpım: "+product);
        System.out.println("Bölüm: "+quotient);
        System.out.println("Kalan: "+remainder);

        // Karşılaştırma Operatörleri

        boolean isEqual = num1 == num2; // = -> atama operatörü == -> eşittir operatoru
        // eşit olup olmadığını kontrol ediyor ve eşitse true değilse false döndürecek
        boolean isGreater = num1 > num2;
        // num1'in büyük olup olmadığını kontrol ediyor ve eğer ikinci sayıdan büyükse true değilse false döndürecek
        boolean isLessorEqual = num1 <= num2;
        // num1'in num2'den küçük veya eşit olup olmadığını kontrol ediyor ve eğer ikinci sayıdan küçükse veya eşitse true değilse false döndürecek

        System.out.println("Eşit mi? "+isEqual);
        System.out.println("Büyük mü? "+isGreater);
        System.out.println("Küçük ya da Eşit mi? "+isLessorEqual);

        // Mantıksal Operatörler
        boolean isTrue = true;
        boolean isFalse = false;

        boolean andResult = isTrue && isFalse; // Mantıksal "ve" operatörü
        // ve olduğunda iki tarafta true dönecek. herhangi bir tarafta false olursa sonuç false olur.
        boolean orResult = isTrue || isFalse; // Mantıksal "veya" operatörü
        // veya olduğunda bir durum true olması yeterli. iki durumda false olursa false olur.
        boolean notResult = !isTrue; // Mantıksal "değil" operatörü
        // değil operatörü ise durumun tersini döndürür

        System.out.println("Mantıksal 've' sonucu: "+andResult); // false
        System.out.println("Mantıksal 'veya' sonucu: "+orResult); // true
        System.out.println("Mantıksal 'değil' sonucu: "+notResult); // false
    }
}
