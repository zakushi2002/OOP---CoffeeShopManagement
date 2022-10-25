package CoffeeShopManagement;
import java.util.Scanner;
public abstract class Menu {
	//Fields
	protected String sProductID;
	protected String sProductName;
	protected int iQuantity;
	protected String sSize;
	protected String sType;
	protected double dPrice;
	//Properties
    public String getProductID() {
    	return sProductID;
    }
    public void setProductID(String ProductID) {
    	this.sProductID = ProductID;
    }
    public String getProductName() {
    	return sProductName;
    }
    public void setProductName(String ProductName) {
    	this.sProductName = ProductName;
    }
    public int getQuantity() {
    	return iQuantity;
    }
    public void setQuantity(int Quantity) {
    	this.iQuantity = Quantity;
    }
    public String getSize() {
    	return sSize;
    }
    public void setSize(String Size) {
    	this.sSize = Size;
    }
    public String getType() {
    	return sType;
    }
    public void setType(String Type) {
    	this.sType = Type;
    }
    public double getPrice() {
    	return dPrice;
    }
    public void setPrice(double Price) {
    	this.dPrice = Price;
    }
    //Constructors
    public Menu() {
    	super();
    }
    public Menu(String productid, String productname, int quantity, String size, String type, double price) {
    	super();
    	this.sProductID = productid;
        this.sProductName = productname;
        this.iQuantity = quantity;
        this.sSize = size;
        this.sType = type;
        this.dPrice = price;
    }
    public Menu(String productid, String productname, int quantity, String type, double price) {
    	super();
    	this.sProductID = productid;
        this.sProductName = productname;
        this.iQuantity = quantity;
        this.sType = type;
        this.dPrice = price;
    }
    //Methods
    public void ShowInformation() {
       System.out.printf("         |%8s| %25s|    %6d|  %4s|    %9.0f|", sProductID, sProductName, iQuantity, sSize, dPrice);
       System.out.println();
    }
    public void FindMenu()
    {
    	System.out.printf("    |    %8s| %25s|    %6d|  %4s|    %9.0f|", sProductID, sProductName, iQuantity, sSize, dPrice);
    	System.out.println();   
    }
    public void Update()
    {
    	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
    	System.out.print("NEW QUANTITY OF PRODUCTS IS: ");
    	this.iQuantity = scan.nextInt();
    	System.out.println("");
    }
    
}
