import java.util.ArrayList;

public class WareHouse {
    private int item_no;
    private String item_name;
    private double item_price;

    public void setNo(int no) {
        this.item_no=no;
    }
    public void setName(String name) {
        this.item_name=name;
    }
    public void setPrice(double d) {
        this.item_price=d;
    }
    public int getNo(){
        return this.item_no;
    }
    public String getName(){
        return this.item_name;
    }
    public double getPrice(){
        return this.item_price;
    }

    public void addNewItem(WareHouse w){
        this.item_name = w.item_name;
        this.item_no=w.item_no;
        this.item_price=w.item_price;

    }
    public void displayItems(ArrayList<WareHouse> arr){
        System.out.println("--------------------------------------------------------------------------------------------------");
        System.out.println("Item Number \t \t \t Item Name \t \t \t \t Item Price");
        System.out.println("--------------------------------------------------------------------------------------------------");
        for (WareHouse WHList : arr ){
            System.out.println(WHList.item_no+" \t \t \t \t "+WHList.item_name+" \t \t \t \t "+WHList.item_price);
            System.out.println("--------------------------------------------------------------------------------------------------");
        }
    }
   
}
