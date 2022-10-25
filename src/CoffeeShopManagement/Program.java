package CoffeeShopManagement;

import java.util.Scanner;

import CoffeeShopManagement.ISalary.Shop;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Shop.Add();
        boolean exit = false;
        while (true)
        {
            ShowMenu();
            int choose = Integer.parseInt(scan.next());
            System.out.print("\n");
            switch (choose)
            {
                case 0:
                    exit = true;
                    break;
                case 1:
                    EmployeeInteraction();
                    break;
                case 2:
                    MenuInteraction();
                    break;
                case 3:
                    InvoiceInteraction();
                    break;
            }
            if (exit)
            {
                System.out.println("             ===========================================================");
                System.out.println("                       THANK YOU FOR YOUR INTEREST IN COFFEE SHOP");
                System.out.println("                                     SEE YOU NEXT TIME");
                System.out.println("             ===========================================================");
                break;
            }
        }
	}
	public static void ShowMenu()
    {
		System.out.println("==========================================================================");
        System.out.println("|                        WELCOME TO COFFEE'S SHOP                        |");
        System.out.println("==========================================================================");
        System.out.println("|                            0.Exit                                      |");
        System.out.println("|                            1.Employee management                       |");
        System.out.println("|                            2.Menu management                           |");
        System.out.println("|                            3.Bill management                           |");
        System.out.println("---------------------===WHAT DO YOU WANT TO CHOOSE?===--------------------");
        System.out.print("\n YOUR CHOICE IS: ");
    }
    public static void ShowMenuEmployee()
    {
    	System.out.println("\n         ======== EMPLOYEE MANAGEMENT ========");
        System.out.println("	0. Exit.");
        System.out.println("	1. Add new employee");
        System.out.println("	2. Update employee information");
        System.out.println("	3. Delete employee by Employee ID");
        System.out.println("	4. Print a list of employees");
        System.out.println("	5. Search for employees by Employee ID");
        System.out.println("	6. Calculate employee's salary x");
        System.out.print("\n YOUR CHOICE IS: ");
    }
    public static void ShowMenuProduct()
    {
    	System.out.println("\n         ======== PRODUCT MANAGEMENT ========");
        System.out.println("	0. Exit.");
        System.out.println("	1. More new products");
        System.out.println("	2. Update the number of products in stock");
        System.out.println("	3. Delete products by Product ID");
        System.out.println("	4. Print product list");
        System.out.println("	5. Search products by Product ID");
        System.out.print("\n YOUR CHOICE IS: ");
    }
    public static void ShowMenuBill()
    {
    	System.out.println("\n         ======== BILL MANAGEMENT ========");
        System.out.println("	0. Exit.");
        System.out.println("	1. Add New Invoice");
        System.out.println("	2. Print invoice list");
        System.out.println("	3. Invoice search");
        System.out.println("	4. Total revenue");
        System.out.println("\n YOUR CHOICE IS: ");
    }
    public static void InvoiceInteraction()
    {
    	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        int choose = 0;
        boolean exit = false;
        ShowMenuBill();
		@SuppressWarnings("unused")
		InvoiceManagement qlhd = new InvoiceManagement();
        while (true)
        {
            choose = scan.nextInt();
            System.out.print("\n");
            switch (choose)
            {
                case 0:
                    exit = true;
                    break;
                case 1:
                	InvoiceManagement.AddBill();
                    ShowMenuBill();
                    break;
                case 2:
                    System.out.print("\n                                        COFFEE'S SHOP INVOICE");
                    for (int i = 0; i < Shop.lBill.size(); i++)
                    {
                        System.out.println("    ___________________________________________________________________________________________\n");

                        System.out.print("     Bill ID: " + Shop.lBill.get(i).sBillID);
                        System.out.print("     Time: " + Shop.lBill.get(i).sDateOfInvoice);
                        System.out.println("     Employee's name: " + Shop.lBill.get(i).getEmployee().sFullName);
                        System.out.println("\n                                            LIST OF PRODUCTS TO BUY\n");
                        for (int j = 0; j < Shop.lBill.get(i).liOrder.size(); j++)
                        {
                            System.out.print("\t- Product's name: " + Shop.lBill.get(i).liOrder.get(j).sProductName);
                            System.out.print("\t\tQuantity: " + Shop.lBill.get(i).iTotalQuantity[j]);
                            System.out.println("\t\tPrice: " + Shop.lBill.get(i).liOrder.get(j).dPrice + "VNÐ");

                        }

                        System.out.println("                      => TOTAL: " + Shop.lBill.get(i).dMoney + "VNÐ");
                    }
                    ShowMenuBill();
                    break;
                case 3:
                    InvoiceManagement list = new InvoiceManagement();
                    list.SearchBill();
                    ShowMenuBill();
                    break;
                case 4:
                    InvoiceManagement l = new InvoiceManagement();
                    l.RevenueCal();
                    ShowMenuBill();
                    break;
                default:
                    System.out.print("Invalid selection! Please choose another action!");
                    ShowMenuBill();
                    break;
            }
            if (exit)
            {
                break;
            }
        }
    }
    public static void MenuInteraction()
    {
    	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
    	
        boolean exit = false;
        ShowMenuProduct();
        MenuManagement qlsp = new MenuManagement();
        while (true)
        {
            int choose = Integer.parseInt(scan.next());
            System.out.print("\n");
            switch (choose)
            {
                case 0:
                    exit = true;
                    break;
                case 1:
                    qlsp.AddProduct();
                    ShowMenuProduct();
                    break;
                case 2:
                    qlsp.Update();
                    ShowMenuProduct();
                    break;
                case 3:
                    qlsp.DelProduct();
                    ShowMenuProduct();
                    break;
                case 4:
                    qlsp.ShowMenu();
                    ShowMenuProduct();
                    break;
                case 5:
                    qlsp.Search();
                    ShowMenuProduct();
                    break;
                default:
                    System.out.println("Invalid selection! Please choose another action!");
                    ShowMenuProduct();
                    break;
            }
            if (exit)
            {
                break;
            }
        }
    }
    public static void EmployeeInteraction()
    {
    	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        int choose = 0;
        boolean exit = false;

        ShowMenuEmployee();
        EmployeeManagement qlnv = new EmployeeManagement();

        while (true)
        {
            choose = Integer.parseInt(scan.next());
            System.out.print("\n");
            switch (choose)
            {
                case 0:
                    exit = true;
                    break;
                case 1:
                    qlnv.AddEmployee();

                    ShowMenuEmployee();
                    break;
                case 2:
                    qlnv.EditEmployee();
                    ShowMenuEmployee();
                    break;
                case 3:
                    qlnv.DelEmployee();
                    ShowMenuEmployee();
                    break;
                case 4:
                    qlnv.ShowEmployee();
                    ShowMenuEmployee();
                    break;
                case 5:
                    qlnv.SearchEmployee();
                    ShowMenuEmployee();
                    break;
                case 6:
                    qlnv.CalSalary();
                    ShowMenuEmployee();
                    break;
                default:
                    System.out.println("Invalid selection! Please choose another action!");
                    ShowMenuEmployee();
                    break;
            }
            if (exit)
            {
                break;
            }

        }
    }

}

