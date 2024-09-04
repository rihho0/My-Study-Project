public class Account {
    
    String accountNumber;
    double balance;
    String customerName;
    String email;
    String phoneNumber;

    Account(String accountNumber,double balance,String customerName,
    String email,String phoneNumber){

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

        //Method deposit
        //method tanpa return dan tanpa parameter
        public void deposit(double amount){
            balance = amount;

        }

        //Method Withdraw
        public void Withdraw(double amount){
            if(balance - amount >=0){
                balance -= amount;
                System.out.println("Withdraw = Rp."+amount+"Total Balance= Ro."+balance);

            }else{
                System.out.println("Less Balance, You Can't Complete the Withdraw");


            }
        }
    //Method getBalance
    public double getBalance(){
        return balance;
    }

} 

