package CoffeeShopManagement;

import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;
public class MenuManagement {
	private List<Menu> lMenu;
	public List<Menu> getListMenu(){
		return lMenu;
	}
	public void setListMenu(List<Menu> ListMenu) {
		this.lMenu = ListMenu;
	}
	private int CheckMenu(String menuid)
    {
		int i = 0;
		for (Menu me : lMenu) {
			if(me.getProductID().equals(menuid)) {
				i++;
			}
		}
        return i;
    }
	private Cake AddCake()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.print("Menu ID: ");
        String menuid = scan.nextLine();
        int check = CheckMenu(menuid);
        while (check > 0)
        {
        	System.out.println("WARNING: The menu ID already exists. Please re-enter another ID");
        	System.out.print("Menu ID: ");
        	menuid = scan.nextLine();
            check = CheckMenu(menuid);
        }
        System.out.print("Product's name: ");
        String productname = scan.nextLine();
        
        System.out.print("Quantity: ");
        int quantity = scan.nextInt();
                
        System.out.print("Price: ");
        double price = scan.nextDouble();
        Cake cake = new Cake(menuid, productname, quantity, "Ca", price);
        return cake;
    }
	private Coffee AddCoffee()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.print("Menu ID: ");
        String menuid = scan.nextLine();
        int check = CheckMenu(menuid);
        while (check > 0)
        {
        	System.out.println("WARNING: The menu ID already exists. Please re-enter another ID");
        	System.out.print("Menu ID: ");
        	menuid = scan.nextLine();
            check = CheckMenu(menuid);
        }
        System.out.print("Product's name: ");
        String productname = scan.nextLine();
        
        System.out.print("Quantity: ");
        int quantity = scan.nextInt();
        
        System.out.print("Size: ");
        String size = scan.nextLine();
        size = scan.nextLine();
        System.out.print("");
        
        System.out.print("Price: ");
        double price = scan.nextDouble();
        Coffee cf = new Coffee(menuid, productname, quantity, size, "CF", price);
        return cf;
    }
	private GrindingIce AddGrindingIce()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.print("Menu ID: ");
        String menuid = scan.nextLine();
        int check = CheckMenu(menuid);
        while (check > 0)
        {
        	System.out.println("WARNING: The menu ID already exists. Please re-enter another ID");
        	System.out.print("Menu ID: ");
        	menuid = scan.nextLine();
            check = CheckMenu(menuid);
        }
        System.out.print("Product's name: ");
        String productname = scan.nextLine();
        
        System.out.print("Quantity: ");
        int quantity = scan.nextInt();
        
        System.out.print("Size: ");
        String size = scan.nextLine();
        size = scan.nextLine();
        System.out.print("");
        
        System.out.print("Price: ");
        double price = scan.nextDouble();
        GrindingIce gi = new GrindingIce(menuid, productname, quantity, size, "GI", price);
        return gi;
    }
	public void AddProduct()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("NEW PRODUCT INFORMATION");
        int choose;
        do
        {
        	System.out.println("PLEASE SELECT PRODUCT TYPE");
            System.out.println("The coffee: 1");
            System.out.println("Cake: 2");
            System.out.println("Grinding ice: 3");
            System.out.println("YOUR CHOICE IS: ");
            choose = scan.nextInt();
            System.out.println();
            if (choose < 0 || choose > 3)
            {
                System.out.println("Invalid product type. Please re-enter.");
            }
        }
        while (choose < 0 || choose > 3);
        switch (choose)
        {
            case 1:
                Coffee cf = AddCoffee();
                lMenu.add(cf);
                break;
            case 2:
                Cake cake = AddCake();
                lMenu.add(cake);
                break;
            case 3:
                GrindingIce gi = AddGrindingIce();
                lMenu.add(gi);
                break;
            default:
                break;
        }
    }
	public MenuManagement()
    {
        lMenu = new ArrayList<Menu>();
        //Coffee
        lMenu.add(new Coffee("CF001", "Black coffee", 15, "M", "CF", 20000));
        lMenu.add(new Coffee("CF002", "Black coffee", 15, "L", "CF", 25000));
        lMenu.add(new Coffee("CF003", "Milk coffee", 15, "M", "CF", 25000));
        lMenu.add(new Coffee("CF004", "Milk coffee", 15, "L", "CF", 30000));
        lMenu.add(new Coffee("CF005", "Coffee with fresh milk", 10, "M", "CF", 28000));
        lMenu.add(new Coffee("CF006", "Coffee with fresh milk", 10, "L", "CF", 33000));
        lMenu.add(new Coffee("CF007", "Coconut coffee", 14, "M", "CF", 30000));
        lMenu.add(new Coffee("CF008", "Coconut coffee", 12, "L", "CF", 35000));
        lMenu.add(new Coffee("CF009", "Capuchino", 8, "M", "CF", 35000));
        lMenu.add(new Coffee("CF010", "Capuchino", 14, "L", "CF", 40000));
        //Cake
        lMenu.add(new Cake("CA001", "Passion fruit cheesecake", 8, "Ca", 30000));
        lMenu.add(new Cake("CA002", "Donut", 14, "Ca", 18000));
        lMenu.add(new Cake("CA003", "Tiramisu", 12, "Ca", 30000));
        lMenu.add(new Cake("CA004", "Tart egg", 10, "Ca", 20000));
        lMenu.add(new Cake("CA005", "Cupcake", 15, "Ca", 25000));
        //Grinding Ice
        lMenu.add(new GrindingIce("GI001", "Matcha grind ice", 4, "S", "GI", 25000));
        lMenu.add(new GrindingIce("GI002", "Matcha grind ice", 3, "M", "GI", 30000));
        lMenu.add(new GrindingIce("GI003", "Cookie grind ice", 7, "S", "GI", 30000));
        lMenu.add(new GrindingIce("GI004", "Cookie grind ice", 6, "M", "GI", 35000));
        lMenu.add(new GrindingIce("GI005", "Cacao", 3, "S", "GI", 30000));
        lMenu.add(new GrindingIce("GI006", "Cacao", 4, "M", "GI", 35000));
        lMenu.add(new GrindingIce("GI007", "Mint Cookies", 5, "S", "GI", 30000));
        lMenu.add(new GrindingIce("GI008", "Mint Cookies", 3, "M", "GI", 35000));
        lMenu.add(new GrindingIce("GI009", "Blueberry grind ice", 3, "M", "GI", 30000));
        lMenu.add(new GrindingIce("GI010", "Blueberry grind ice", 2, "L", "GI", 35000));
    }
	public void ShowMenu()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("Select the list: ");
        System.out.println("0. Show All Menu");
        System.out.println("1. The coffee");
        System.out.println("2. Cake");
        System.out.println("3. Grinding ice");
        System.out.println("YOUR CHOICE IS: ");
        int choice = Integer.parseInt(scan.next());
        System.out.println();
        switch (choice)
        {
            case 0:
                ShowAllMenu();
                break;
            case 1:
                ShowCoffee();
                break;
            case 2:
                ShowCake();
                break;
            case 3:
                ShowGrindingIce();
                break;
            default:
                break;
        }
    }
	public void ShowAllMenu()
    {
		System.out.println("                                  LIST OF ALL COFFEE'S SHOP PRODUCTS");
        System.out.println("     ________________________________________________________________________________________");
        System.out.println("    | Ordinal Number | Product ID |       Product Name       | Quantity | Size | Price (VND) |");
        System.out.println("    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        int i = 1;
        for (Menu me : lMenu)
        {
        	System.out.printf("    |        %8d| ", i++);
            me.ShowInformation();
        }
        System.out.println("    |________________________________________________________________________________________|\n");
    }
    public void ShowCoffee()
    {
    	System.out.println("                                         LIST OF COFFEE");
        System.out.println("     ________________________________________________________________________________________");
        System.out.println("    | Ordinal Number | Product ID |       Product Name       | Quantity | Size | Price (VND) |");
        System.out.println("    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        int i = 1;
        for (Menu me :  lMenu) {
            if (me.sType.equals("CF")) {
            	System.out.printf("    |        %8d| ", i++);
            	Coffee cf = (Coffee) me;
            	cf.ShowInformation();
            }
        }
        System.out.println("    |________________________________________________________________________________________|\n");    
    }
    public void ShowCake()
    {
    	System.out.println("                                          LIST OF CAKE");
        System.out.println("     _________________________________________________________________________________");
        System.out.println("    | Ordinal Number | Product ID |       Product Name       | Quantity | Price (VND) |");
        System.out.println("    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        int i = 1;
        for (Menu me : lMenu)
            if (me.sType.equals("Ca"))
            {
            	System.out.printf("    |        %8d| ", i++);
                Cake ca = (Cake) me;
                ca.ShowCake();
            }
        System.out.println("    |_________________________________________________________________________________|\n");   
    }
    public void ShowGrindingIce()
    {
    	System.out.println("                                        LIST OF GRINDING ICE");
        System.out.println("     ________________________________________________________________________________________");
        System.out.println("    | Ordinal Number | Product ID |       Product Name       | Quantity | Size | Price (VND) |");
        System.out.println("    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        int i = 1;
        for (Menu me : lMenu) {
        	if (me.sType.equals("GI"))
            {
                System.out.printf("    |        %8d| ", i++);
                GrindingIce gi = (GrindingIce) me;
            	gi.ShowInformation();
            }
        }
        System.out.println("    |________________________________________________________________________________________|\n");
    }
    public void Search()
    {
    	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        while (true)
        {
        	System.out.println("              *** FIND PRODUCT ***");
        	System.out.println("     Enter the Product ID of the product you want to find: ");
            String sProductID = scan.nextLine();
            try
            {
            	for(Menu product :lMenu) {
            		if(product.getProductID().equals(sProductID)) {
            			if (product != null) {

            				System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("    | Product ID |       Product Name       | Quantity | Size | Price (VND) |");
                            System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                    		product.FindMenu();
                    		System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                        if (ContinueFind() == false) return;
                    	}
            		}
            	}
            }
            catch(Exception e)
            {
            	System.out.println(" This Product ID does not exist");
                if (ContinueFind() == false) return;
            }
        }
    }
	public void Update()
    {
    	@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        while (true)
        {
        	System.out.println("                 ***UPDATE PRODUCT ***");
        	System.out.print("Enter the Product ID of the product you want to update: ");
            String sProductID = scan.nextLine();
            try
            {
                for(Menu product :lMenu) {
            		if(product.getProductID().equals(sProductID)) {
            			if (product != null) {
                            product.Update();
                            System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("    | Product ID |       Product Name       | Quantity | Size | Price (VND) |");
                            System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

                            product.FindMenu();
                            System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
                            if (ContinueFind() == false) return;
                        }
            		}
                }
            
            }
            catch(Exception e)
            {
            	System.out.println("     This Product ID does not exist");
                if (ContinueFind() == false) return;
            }
        }
    }
	public void DelProduct()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.print("     Enter the Product ID of the Menu you want to delete:");
        String d = scan.nextLine();
        int count = 0;
        for (Menu pro: lMenu) {
        	if (pro.getProductID().equals(d) == true) {
        		count++;
        	}
        }
        if(count == 0) {
        	System.out.println("     This Product ID does not exist, you type 3 to continue!");
            System.out.println("__________________________________________________________");
        }
        else if (count > 0) {
        	for (Menu pro: lMenu) {
        		if (pro.getProductID().equals(d)) {
        		lMenu.remove(pro);
                System.out.println("     Product " + d + " deleted !");
                System.out.println("__________________________________________________________");
                break;
        		}
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

