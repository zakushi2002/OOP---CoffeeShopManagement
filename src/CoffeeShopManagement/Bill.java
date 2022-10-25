package CoffeeShopManagement;

import java.util.List;
import java.util.ArrayList;
public class Bill {
	//Fields
	protected String sBillID;
    protected String sDateOfInvoice;
    protected Employee eEmployee;
    protected double dMoney;
    protected List<Menu> liOrder;
    protected int[] iTotalQuantity;
    //Properties
    public String getBillID() {
    	return sBillID;
    }
    public void setBillID(String BillID) {
    	this.sBillID = BillID;
    }
    public String getDateOfInvoice() {
    	return sDateOfInvoice;
    }
    public void setDateOfInvoice(String DateOfInvoice) {
    	this.sDateOfInvoice = DateOfInvoice;
    }
    public Employee getEmployee() {
    	return eEmployee;
    }
    public void setEmployee(Employee Employee) {
    	this.eEmployee = Employee;
    }
    public double getMoney() {
    	return dMoney;
    }
    public void setMoney(double Money) {
    	this.dMoney = Money;
    }
    public List<Menu> getListOrder() {
    	return liOrder;
    }
    public void setListOrder(List <Menu> Orders) {
    	this.liOrder = Orders;
    }
    //Constructors
    public Bill()
    {
    	super();
        this.liOrder = new ArrayList<Menu>();
        this.iTotalQuantity = new int[100];
    }
    public Bill(String billid, String dateofinvoice)
    {
    	super();
    	this.liOrder = new ArrayList<Menu>();
        this.iTotalQuantity = new int[100];
        this.sBillID = billid;
        this.sDateOfInvoice = dateofinvoice;
        this.dMoney = 0;
    }
    
}
