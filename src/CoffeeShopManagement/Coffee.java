package CoffeeShopManagement;


public class Coffee extends Menu {
	public Coffee() {
		super();
    }
    public Coffee(String productid, String productname, int quantity, String size, String type, double price) {
    	super();
        this.sProductID = productid;
        this.sProductName = productname;
        this.iQuantity = quantity;
        this.sSize = size;
        this.sType = type;
        this.dPrice = price;
    }
    @Override
    public void ShowInformation() {
        System.out.printf("   %8s| %25s|    %6d|  %4s|    %9.0f|", sProductID, sProductName, iQuantity, sSize, dPrice);
        System.out.println();
    }
}
