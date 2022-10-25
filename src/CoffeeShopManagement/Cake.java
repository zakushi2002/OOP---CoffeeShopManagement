package CoffeeShopManagement;


public class Cake extends Menu {
	public Cake() {
		super();
    }
    public Cake(String productid, String productname, int quantity, String type, double price) {
    	super();
    	this.sProductID = productid;
        this.sProductName = productname;
        this.iQuantity = quantity;
        this.sType = type;
        this.dPrice = price;
    }
    @Override
    public  void ShowInformation() {
        System.out.printf("   %8s| %25s|    %6d|      |    %9.0f|", sProductID, sProductName, iQuantity, dPrice);
        System.out.println();
    }
    public void ShowCake() {
    	System.out.printf("   %8s| %25s|    %6d|    %9.0f|", sProductID, sProductName, iQuantity, dPrice);
    	System.out.println();
    }
}
