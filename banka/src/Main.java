public class Main {

    static String[] accounts = new String[20]; // sifirinci indexinde accountNumber
    static double[] balances = new double[20];
    static int accountQuantity = 0;

    public void getBalance(String accountNumber) {
        if(accountNumber!=null){
            int accountIndex = getAccountIndexNumberWithAccountNumber(accountNumber);
            if(accountIndex!=-1){
                System.out.println("Your account balance: "+balances[accountIndex]);
            }
        }else{
            System.out.println("There is no account with this AN:  "+accountNumber);
        }
    }

    //hesap silme metodu
    public static void deleteAccount(String accountNumber){
        int accountIndex = getAccountIndexNumberWithAccountNumber(accountNumber);

        if (accountIndex!=-1){
            balances[accountIndex] = 0;
            accounts[accountIndex] = null;
            System.out.println("Your account has been successfully deleted!");
        }else{
            System.out.println("There is no account with this account number!");
        }
    }

    //para çekme metodu
    public static void withdrawBalance(double amount, String accountNumber){
        if (amount>0 && amount<=1000){
            int accountIndex = getAccountIndexNumberWithAccountNumber(accountNumber);
            if (accountIndex!=-1){
                if(balances[accountIndex]>amount) {
                    balances[accountIndex] -= amount; // miktarı bakiye dizesinden çıkar
                    System.out.println("Withdraw successfully done!");
                    System.out.println("Your new balance: " + balances[accountIndex]);
                }else System.out.println("You cannot withdraw more than your balance!");
            }else{
                System.out.println("There is no account with this account number!");
            }
        }else{
            System.out.println("You have exceeded the withdrawal limit!");
        }
    }

    // para cekme vb methodlari yaziniz.
    public static void addBalance(double amount,String accountNumber){
        if(amount>0){
            int accountIndex = getAccountIndexNumberWithAccountNumber(accountNumber);
            if(accountIndex!=-1){
                balances[accountIndex] += amount;
                System.out.println("Deposit has been approved successfully");
                System.out.println("Your new balance is: "+balances[accountIndex]);
            }else{
                System.out.println("There is no account with this account number!");
            }
        }
    }

    public static int getAccountIndexNumberWithAccountNumber(String accountNumber){
        int response = -1;
        for(int i=0;i<accounts.length;i++){
            if(accounts[i].equals(accountNumber)){
                response = i;
                break;
            }
        }
        return response;
    }

    public static void createAccount(String accountNumber) {
        if (accountNumber != null) {
            accounts[accountQuantity] = accountNumber;
            accountQuantity++;
            System.out.println("Account created successfully with account-number: "+accountNumber);
        } else {
            System.out.println("please make sure to send the account number");
        }
    }

    public static void main(String[] args) {
        createAccount("12345");
        addBalance(800,"12345");
        withdrawBalance(1000, "12345");
        //deleteAccount("12345");
    }
}