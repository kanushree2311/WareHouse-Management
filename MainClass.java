import java.util.Scanner;
import java.util.ArrayList;

class MainClass{
 
    Scanner sc =new Scanner(System.in);
    
    private static ArrayList<WareHouse> whList=new ArrayList<WareHouse>();
    private static ArrayList<Customer> custList=new ArrayList<Customer>();
    
    
    static void intro(){
        System.out.println("");
        System.out.println("                ~~~~~~~~~~~~~~~ /./ <<   WAREHOUSE MANAGEMENT SYSTEM   >> /./ ~~~~~~~~~~~~~~~~~");
        System.out.println("");
        System.out.println("                            ~~~~~~~~~~~~~~~ <<   WELCOME   >> ~~~~~~~~~~~~~~~");
        System.out.println("");
        
    }
   
    static void menu(){
        System.out.println("                                ~~~~~~~~~~~~~~~ (( MENU )) ~~~~~~~~~~~~~~~");
        System.out.println("                                            1 - Add New Item");
        System.out.println("                                           2 - Display All Item");
        System.out.println("                                          3 - New Customer Details");
        System.out.println("                                                 4 - EXIT");
    }

    private static void _sellOutDetails(){
        Scanner sc =new Scanner(System.in);
        Customer c=new Customer();
        System.out.println("--> Enter Customer Name: ");
        c.setCustomer_name(sc.nextLine());
        System.out.println("--> Enter Item Number: ");
        c.setItem_no(sc.nextInt());
        System.out.println("--> Enter Item quantity: ");
        c.setPurchased_qty(sc.nextInt()); 
    
        c.AddCustomerDetails(c);
        custList.add(c);
        try {
            c.displayCustomerBill(custList,c.getCustomer_name(),whList);
        } catch (MyExceptions e) {
            e.printStackTrace();
        }
       
        System.out.println("Do you have more customers to add? -- ( Yes / No ):");
        String choice=sc.next();
        
        if (choice.equalsIgnoreCase("yes")){
            _sellOutDetails();
        }
               
       
    }

    
    public static void main(String[] args) throws MyExceptions{
        int option;
        Scanner sc =new Scanner(System.in);
        intro();

        do {
            WareHouse w=new WareHouse();
        
            menu();
            System.out.println("--> Enter your option");
            option = sc.nextInt();
        
            switch (option){
                case 1:
                    System.out.println("--> Enter Item Number: ");
                    w.setNo(sc.nextInt());
                    System.out.println("--> Enter Item Name: ");
                    sc.nextLine();
                    w.setName(sc.nextLine());
                    
                    System.out.println("--> Enter Item Price: ");
                    w.setPrice(sc.nextDouble());
                    w.addNewItem(w);
                    whList.add(w);
                    break;
                case 2:
                    w.displayItems(whList);
                    break;
                case 3:
                    _sellOutDetails();
                
                break;
                
                default:
                    System.out.print("      ! ! Thank You ! !");
            }
        }
        while (option!=4);
    }
    
}
