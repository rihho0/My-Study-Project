public class AccountApp {
    public static void main(String[] args) throws Exception{
        Account myAccount = new Account("09022005", 0, "saipp","saipp@gmail.com",
        "08673872563");

        System.out.println("Account :"+myAccount.accountNumber);
        System.out.println("Balance :"+myAccount.balance);
        System.out.println("Name :"+myAccount.customerName);
        System.out.println("Email :"+myAccount.email);
        System.out.println("PhoneNumber :"+myAccount.phoneNumber);


        myAccount.deposit(1000.000);
        System.out.println(" You balance :"+myAccount.getBalance());
        myAccount.Withdraw(200.000);
        myAccount.Withdraw(300.000);
        myAccount.Withdraw(1000.000);
        myAccount.Withdraw(500.000);
        System.out.println(" Your balance :"+myAccount.getBalance());

    }
    
}
