package CoffeeShopManagement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import CoffeeShopManagement.ISalary.Shop;

public class InvoiceManagement {
	//Fields
	private static List<Bill> lBill;
	public List<Bill> getListBill(){
		return lBill;
	}
	public void setListBill(List<Bill> ListBill) {
		InvoiceManagement.lBill = ListBill;
	}
	//Methods
	public static int CheckBill(String billid) {
		int i = 0;
		for (Bill bi : Shop.lBill) {
			if (bi.getBillID().equals(billid)) {
    		i++;
			}
		}
		return i;
	}
	public static int CheckEmployee(String employeeid) {
		int i = 0;
		for (Employee em : Shop.lEmployee) {
			if (em.getEmployeeID().equals(employeeid)) {
    		i++;
			}
		}
		return i;
	}
	public static void AddBill()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);

        Bill bill = new Bill();
        bill.eEmployee = new Cashier();
        bill.liOrder = new ArrayList<Menu>();
        bill.iTotalQuantity = new int[100];
        bill.dMoney = 0;
        System.out.print("     Bill ID: ");
        boolean check = false;
        while(!check) {
        	String id = scan.nextLine();
        	int b = CheckBill(id);
        	if (b>0) {
        		System.out.print("     WARNING: ID invoice already exists. Please enter another ID");
        		System.out.print("     Bill ID: ");
        	}
        	else {
                bill.sBillID = id;
                check = true;
        	}
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    	Calendar cal = Calendar.getInstance();
    	Date date = cal.getTime();
    	String ok = sdf.format(date);
        bill.sDateOfInvoice = ok;

        System.out.print("     Employee ID: ");
        boolean pass = false;
        while(!pass) {
        	String id = scan.nextLine();
        	int b = CheckEmployee(id);
        	if (b<=0) {
        		System.out.print("  WARNING: Employee ID already exists. Please enter another ID ");
        		System.out.print("     Employee ID: ");
        	}
        	else {
                
                for (Employee em : Shop.lEmployee) {
                	if(em.getEmployeeID().equals(id) == true) {
                		Shop.lEmployee.add(bill.eEmployee);
                		bill.getEmployee().sEmployeeID = id;
                		break;
                	}
                }
                pass = true;
        	}
        }
        System.out.println("         ENTER LIST OF PRODUCTS TO BUY ");

        int flag = 1;

        while (flag != 0)
        {
            System.out.print("     IMPORT PRODUCT ID: ");
            String productid = scan.nextLine();
            
            int count = 0;
            for (Menu product: Shop.lMenu) {
            	if(product.getProductID().equals(productid) == true) {
            		count++;
            	}
            }
            if (count > 0)
            {
                for (Menu pro: Shop.lMenu) {
                	if(pro.getProductID().equals(productid) == true) {
                		bill.getListOrder().add(pro);
                		System.out.print("         ENTER QUANTITY: ");
                        int qua = Integer.parseInt(scan.nextLine());
                        System.out.println();
                        bill.iTotalQuantity[bill.getListOrder().indexOf(pro)] = qua;
                        bill.dMoney = bill.getMoney() + pro.getPrice() * qua;
                        
                	}
                }
                
            }
            else
            {
                System.out.print("  PRODUCT ID DOESN'T EXIST. PLEASE ENTER:  ");
                break;
            }
            System.out.print("     ENTER 0 TO END TRADE, ENTER ANY OTHER NUMBER TO CONTINUE: ");
            flag = Integer.parseInt(scan.nextLine());
        }
        Shop.lBill.add(bill);
    }
	public void ExportInvoice()
    {
        System.out.print("                               COFFEE'S SHOP INVOICE");

        for (int i = 0; i < Shop.lBill.size(); i++)
        {
            System.out.print("____________________________________________________________________________________________________________");
            System.out.printf("         ID BILL: {0} ", Shop.lBill.get(i).sBillID);
            System.out.printf("         TIME: {1}", Shop.lBill.get(i).sDateOfInvoice);

            System.out.printf("         EMPLOYEE'S NAME: {2}", Shop.lBill.get(i).eEmployee.sFullName);

            System.out.print("                     LIST OF PRODUCTS TO BUY");
            for (int j = 0; j < lBill.get(i).liOrder.size(); j++)
            {
                System.out.printf("     - PRODUCT'S NAME: {3}", Shop.lBill.get(i).liOrder.get(j).sProductName);
                System.out.printf("         QUANTITY: {4}", Shop.lBill.get(i).iTotalQuantity[j]);
                System.out.printf("         PRICE: {5}", Shop.lBill.get(i).liOrder.get(j).dPrice);
            }

            System.out.printf("                                        => TOTAL MONEY: {6}", Shop.lBill.get(i).dMoney);
        }
    }
	 public void RevenueCal()
     {
		 double total = 0;
         for(Bill bill : Shop.lBill)
         {
             total = total + bill.getMoney();
         }
         System.out.println("                         ====REVENUE====");
         System.out.println("         Total Revenue: " + total + "VND");
         System.out.println("_____________________________________________________________________\n");
     }
     public void SearchBill()
     {
    	 @SuppressWarnings("resource")
    	 Scanner scan = new Scanner(System.in);
         while (true) {
        	 System.out.println("                   ====FIND Invoice====");
        	 System.out.print("     Enter the Bill ID you want to find: ");
        	 String m = scan.nextLine();
        	 try {
        		 for (Bill a : Shop.lBill) {
        			 if (a.sBillID.equals(m)) {
        				 if(a != null) {
        					 System.out.println("\n                                        COFFEE'S SHOP INVOICE");
        	                 System.out.println("    ___________________________________________________________________________________________\n");
        	                 System.out.print("     ID Bill: " + a.sBillID);
        	                 System.out.print("     Time: " + a.sDateOfInvoice);
        	                 System.out.println("     Employee's name: " + a.eEmployee.sFullName);
        	                 System.out.println("\n                                           LIST OF PRODUCTS TO BUY\n");

        	                 for (int j = 0; j < a.liOrder.size(); j++)
        	                 {
        	                	 System.out.println("\t- Product's name: " + a.liOrder.get(j).sProductName);
        	                     System.out.println("\t\tQuantity: " + a.iTotalQuantity[j]);
        	                     System.out.println("\t\tPrice: " + a.liOrder.get(j).dPrice + "VNÐ");
        	                 }
        	                 System.out.println("                      => TOTAL: " + a.dMoney + "VNÐ");
        				 if (ContinueFind()== false) return;
        				 }
        			 }
        		 }
        	 }
        	 catch(Exception e) {
        		 System.out.println(" This Invoice ID does not exist");
                 if (ContinueFind() == false) return;
        	 }
         }
     }
     private static boolean ContinueFind()
     {
     	@SuppressWarnings("resource")
 		Scanner scan = new Scanner(System.in);
         System.out.println("     Enter any number to continue, enter 0 to exit!");
         int value = scan.nextInt();
         System.out.println();
         if (value != 0)
         {
         	System.out.println("__________________________________________________________\n");
             return true;
         }
         return false;
     }
}
