package ie.atu.week4;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<CustomerClass>Customers=new ArrayList<CustomerClass>();
        //print options
        System.out.print("==== Customer Management System ====: ");
        System.out.print("1) Add Customer ");
        System.out.print("2) Update Customer ");
        System.out.print("3) Display All ");
        System.out.print("4) Exit ");
        int opt=input.nextInt();

        switch(opt){
            case 1:
                System.out.print("Enter the number of customers : ");
                int n=input.nextInt();
                int i = 0;

                while(i < n){

                    CustomerClass c =new CustomerClass(n);

                    System.out.print("Enter Customer Id : ");
                    c.setCustomerID(new Scanner(System.in).nextLine());
                    //Customers.add(c);
                    System.out.print("Enter Customer Name : ");
                    c.setName(new Scanner(System.in).nextLine());
                    System.out.print("Enter Customer Email : ");
                    c.setEmail(new Scanner(System.in).nextLine());
                    System.out.print("Enter Customer Phone Number : ");
                    c.setPhoneNumber(new Scanner(System.in).nextLine());
                }
                //add feature to prevent same info
                break;
                case 2:
                    System.out.print("Enter Customer Id to update : ");
                    for(CustomerClass cc : Customers){
                        if(cc.getCustomerID().equals(input.nextLine())){
                            System.out.print("Enter the update field (name, email, phone, id) : ");
                            String update=input.nextLine();
                            //to be continued
                            switch(update){
                                case "name":
                                    System.out.print("Enter New Customer Name : ");
                                    cc.setName(new Scanner(System.in).nextLine());
                                    break;
                                case "email":
                                    System.out.print("Enter New Customer Email : ");
                                    cc.setEmail(new Scanner(System.in).nextLine());
                                    break;
                                case "phone":
                                    System.out.print("Enter New Customer Phone Number : ");
                                    cc.setPhoneNumber((new Scanner(System.in).nextLine()));
                                    break;
                                case "id":
                                    System.out.print("Enter New Customer Id : ");
                                    cc.setCustomerID(new Scanner(System.in).nextLine());
                            }
                        }
                    }
                    break;
            case 3:
                //call function to display all data
                String toString;
                break;
            case 4:
                System.out.print("You have exited the program\n");
                break;
            default:
                System.out.print("Wrong choice");
                break;
        }
        //create class
        //create instances
    }
}