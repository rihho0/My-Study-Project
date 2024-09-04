public class CustomerApp extends Customer {
    public static void main(String[] args) throws Exception{
    
    Customer customer = new Customer("fidaa",3000,"marahrofidah7@gmail.com");

    System.out.println("Name : "+customer.getName());
    System.out.println("Credit Limit : "+customer.getCreditLimit());
    System.out.println("Email : "+customer.getEmail());

    Customer customer2 = new Customer("fidaa","marahrofidah7@gmail.com");

    System.out.println("Name : "+customer2.getName());
    System.out.println("Credit Limit : "+customer2.getCreditLimit());
    System.out.println("Email : "+customer2.getEmail());

    System.out.println((customer2.creditLimit==1000?"Correct Constructor default CreditLimit":"Wrong Constructor default CreditLimit"));


    Customer customer3 = new Customer();
    System.out.println("Name :"+customer3.getName());
    System.out.println("Credit Limit : "+customer3.getCreditLimit());
    System.out.println("Email : "+customer3.getEmail());

    System.out.println((customer3.getName()=="default_name"?"Correct Constructor default Name":"Worng Constructor default Name"));

    System.out.println((customer3.getEmail()=="default@gmail.com"?"Correct Constructor default Email":"Worng Constructor default Email"));

}

}
