package CoffeeShopManagement;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public interface ISalary {
	public static class Shop {
		public static List<Employee> lEmployee = new ArrayList<Employee>();
        public static List<Menu> lMenu = new ArrayList<Menu>();
        public static List<Bill> lBill = new ArrayList<Bill>();
        public static void Add()
        {
        	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            //Bill 1
        	Calendar cal = Calendar.getInstance();
        	Date date = cal.getTime();
        	String ok = sdf.format(date);
            Bill b1 = new Bill("B001",ok);
            b1.liOrder = new ArrayList<Menu>();
            b1.iTotalQuantity = new int[100];

            Coffee me1 = new Coffee("CF002", "Black coffee", 15, "L", "CF", 25000);
            b1.liOrder.add(me1);
            Coffee me2 = new Coffee("CF003", "Milk coffee", 15, "M", "CF", 25000);
            b1.liOrder.add(me2);
            Coffee me3 = new Coffee("CF005", "Coffee with fresh milk", 10, "M", "CF", 28000);
            b1.liOrder.add(me3);

            b1.eEmployee = new Cashier("TN02", "Ngo Thien Nhan", 2000, "0984567673", "Binh Thanh District, HCM City", "085390900704", "Cashier", "Male", 26, 2);
            b1.iTotalQuantity[0] = 3;
            b1.iTotalQuantity[1] = 4;
            b1.iTotalQuantity[2] = 2;
            b1.dMoney = 0;
            for (int i = 0; i < b1.liOrder.size(); i++)
            {
            	b1.dMoney= b1.getMoney()+ b1.liOrder.get(i).dPrice * b1.iTotalQuantity[i];
            }
            lBill.add(b1);
            // Bill 2
            cal.set(2021, Calendar.DECEMBER, 12, 10, 25, 34);
            String pass = sdf.format(date);
            Bill b2 = new Bill("B002", pass);
            b2.liOrder = new ArrayList<Menu>();
            b2.iTotalQuantity = new int[100];

            Coffee me4 = new Coffee("CF007", "Coconut coffee", 14, "M", "CF", 30000);
            b2.liOrder.add(me4);
            Cake me5 = new Cake("CA004", "Tart egg", 10, "Ca", 20000);
            b2.liOrder.add(me5);
            GrindingIce me6 = new GrindingIce("GI005", "Cacao", 3, "S", "GI", 30000);
            b2.liOrder.add(me6);

            b2.eEmployee = new Cashier("TN01", "Nguyen Huynh Thanh Toan", 2002, "0703679239", "Thu Duc District , HCM City", "074202008034", "Cashier", "Male", 26, 4);
            b2.iTotalQuantity[0] = 2;
            b2.iTotalQuantity[1] = 5;
            b2.iTotalQuantity[2] = 1;
            b2.dMoney = 0;
            for (int i = 0; i < b2.liOrder.size(); i++)
            {
                b2.dMoney = b2.getMoney()+ b2.liOrder.get(i).dPrice * b2.iTotalQuantity[i];
            }
            lBill.add(b2);
            //Coffee
            Coffee cf1 = new Coffee("CF001", "Black coffee", 15, "M", "CF", 20000);
            lMenu.add(cf1);
            Coffee cf2 = new Coffee("CF002", "Black coffee", 15, "L", "CF", 25000);
            lMenu.add(cf2);
            Coffee cf3 = new Coffee("CF003", "Milk coffee", 15, "M", "CF", 25000);
            lMenu.add(cf3);
            Coffee cf4 = new Coffee("CF004", "Milk coffee", 15, "L", "CF", 30000);
            lMenu.add(cf4);
            Coffee cf5 = new Coffee("CF005", "Coffee with fresh milk", 10, "M", "CF", 28000);
            lMenu.add(cf5);
            Coffee cf6 = new Coffee("CF006", "Coffee with fresh milk", 10, "L", "CF", 33000);
            lMenu.add(cf6);
            Coffee cf7 = new Coffee("CF007", "Coconut coffee", 14, "M", "CF", 30000);
            lMenu.add(cf7);
            Coffee cf8 = new Coffee("CF008", "Coconut coffee", 12, "L", "CF", 35000);
            lMenu.add(cf8);
            Coffee cf9 = new Coffee("CF009", "Capuchino", 8, "M", "CF", 35000);
            lMenu.add(cf9);
            Coffee cf10 = new Coffee("CF010", "Capuchino", 14, "L", "CF", 40000);
            lMenu.add(cf10);
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
            //Manager
            Manager ql1 = new Manager("QL01", "Ta Hoai Nam", 2002, "0988188449", "District 9, HCM City", "045632587912", "Manager", "Male");
            lEmployee.add(ql1);
            Manager ql2 = new Manager("QL02", "Ly Hong Khanh", 2001, "0988188733", "District 8, HCM City", "059854364148", "Manager", "Female");
            lEmployee.add(ql2);
            //Cashier
            Cashier tn1 = new Cashier("TN01", "Nguyen Huynh Thanh Toan", 2002, "0703679239", "Thu Duc District, HCM City", "074202008034", "Cashier", "Male", 26, 4);
            lEmployee.add(tn1);
            Cashier tn2 = new Cashier("TN02", "Ngo Thien Nhan", 2000, "0984567673", "Binh Thanh District, HCM City", "085390900704", "Cashier", "Male", 26, 2);
            lEmployee.add(tn2);
            //Staff
            Staff st1 = new Staff("PV01", "Le Y Thien", 2002, "0399813435", "District 7, HCM City", "085478493620", "Staff", "Male", 26, 4);
            lEmployee.add(st1);
            Staff st2 = new Staff("PV02", "Vu Nguyen Thuy Linh", 1999, "0974894567", "District 9, HCM City", "065260021652", "Staff", "Female", 25, 3);
            lEmployee.add(st2);
            Staff st3 = new Staff("PV03", "Pham Nguyen Nhat Huy", 2003, "0288257742", "Thu Duc District, HCM City", "076588465492", "Staff", "Male", 26, 2);
            lEmployee.add(st3);
            Staff st4 = new Staff("PV04", "Tran Ngoc Dat", 2002, "0784954841", "District 9, HCM City", "085478493620", "Staff", "Male", 26, 4);
            lEmployee.add(st4);
        }
	}
	
	public double BasicSalary();

    public double OverTimeSalary();

    public double PrizeSalary();

    public double TotalSalary();
}
