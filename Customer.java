import java.util.ArrayList;

public class Customer{
    private int customer_id;
    private String customer_name;
    private int purchased_qty;
    private int item_no;
    private double bill;

    public void AddCustomerDetails(Customer c){
        this.customer_name=c.customer_name;
        this.item_no=c.item_no;
        this.purchased_qty=c.purchased_qty;
    }
    public void displayCustomerBill(ArrayList<Customer> arr, String cust_name,ArrayList<WareHouse> list) throws MyExceptions{
        bill=0;
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Item Number \t \t \t Customer Name \t \t \t Quantity \t \t Before discount \t \t  Total after discount");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------");

        for (Customer c : arr){System.out.println();
            
            // WareHouse whList;
            for (WareHouse whlist : list){
                if(whlist.getNo()==c.item_no){
                    bill+=(c.purchased_qty * whlist.getPrice());
                }
                // System.out.println(c.item_no+" \t \t \t \t "+c.customer_name+" \t \t \t \t "+c.purchased_qty+" \t \t "+bill+" \t \t "+Discount(bill));
                // System.out.println("----------------------------------------------------------------------------------------------------------------------------");
            }
    
            System.out.println(c.item_no+" \t \t \t \t "+c.customer_name+" \t \t \t \t "+c.purchased_qty+" \t \t \t "+bill+" \t \t \t "+Discount(bill));
            System.out.println("--------------------------------------------------------------------------------------------------------------------------------");
            

            
        }
        
    }

    public double Discount(double t){
        double discount = 0;
        // if bill is less than 7000 discount of 15 %
        if(t < 7000){
            discount = t*0.15;
        }
        else{
            //if bill is between 7000 and 15000 discount of 25 %
            if(t>=7000 && t<15000){
                discount = t*0.25;
            }
            else{
                //if bill more than 15000 discount of 43 %
                discount = t*0.43;
            }
        }
       return t-discount;
    }


    public double getBill(){
        return bill;
    }
    public void setBill(double bill){

        this.bill=bill;
    }
    public int getCustomer_id(){
        return customer_id;
    }
    public void setCustomer_id(int cid){
        this.customer_id=cid;
    }
    public String getCustomer_name(){
        return customer_name;
    }
    public void setCustomer_name(String cname){
        this.customer_name=cname;
    } 
    public void setPurchased_qty(int pq){
        this.purchased_qty=pq;
    } 
    public int getPurchased_qty(){
        return purchased_qty;
    }
    public void setItem_no(int no) {
        this.item_no=no;
    }
    public int getItem_no(int no){
        return this.item_no;
    }
}
