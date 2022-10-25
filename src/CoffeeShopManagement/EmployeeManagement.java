package CoffeeShopManagement;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class EmployeeManagement {
	public List<Employee> lEmployee;
	public List<Employee> getListEmployee() {
		return lEmployee;
	}
	public void setListEmployee(List<Employee> Employees) {
		this.lEmployee = Employees;
	}
	private int CheckForEmployeeIDExistence(String employeeid)
    {
        int i = 0;
        for (Employee em : lEmployee) {
        	if (em.getEmployeeID().equals(employeeid)) {
        		i++;
        	}
        }
        return i;
    }
	protected Cashier AddCashier()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("     Employee ID: ");
        String EmployeeID = scan.nextLine();
        int Employee = CheckForEmployeeIDExistence(EmployeeID);
        while (Employee > 0)
        {
        	System.out.println("  WARNING: Employee ID already exists. Please enter another ID ");
        	System.out.print("     Employee ID: ");
        	EmployeeID = scan.nextLine();
            Employee = CheckForEmployeeIDExistence(EmployeeID);
        }

        System.out.print("     Employee's name: ");
        String Name = scan.nextLine();
        
        System.out.print("     Sex: ");
        String Sex = scan.nextLine();
        
        System.out.print("     ID Card: ");
        String IDCard = scan.nextLine();
        
        System.out.print("     Year of birth: ");
        int YearOfBirth = scan.nextInt();
        
        System.out.print("     Address: ");
        String Address = scan.nextLine();
        Address = scan.nextLine();
        System.out.print("");
        
        System.out.print("     Phone number: ");
        String Phone = scan.nextLine();
        System.out.print("");
        
        System.out.print("     Number of working days: ");
        int NumberOfWorkingDays = scan.nextInt();
        
        System.out.print("     OverTime: ");
        int OverTime = scan.nextInt();
        
        Cashier cashier = new Cashier(EmployeeID, Name, YearOfBirth, Phone, Address, IDCard, "Cashier", Sex, NumberOfWorkingDays, OverTime);
        return cashier;
    }
	protected Manager AddManager()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.print("     Employee ID: ");
        String EmployeeID = scan.nextLine();
        int Employee = CheckForEmployeeIDExistence(EmployeeID);

        while (Employee > 0)
        {
        	System.out.println("  WARNING: Employee ID already exists. Please enter another ID ");
        	System.out.print("     Employee ID: ");
        	EmployeeID = scan.nextLine();
            
            Employee = CheckForEmployeeIDExistence(EmployeeID);
        }

        System.out.print("     Employee's name: ");
        String Name = scan.nextLine();
        
        System.out.print("     Sex: ");
        String Sex = scan.nextLine();
        
        System.out.print("     ID Card: ");
        String IDCard = scan.nextLine();
        
        System.out.print("     Year of birth: ");
        int YearOfBirth = scan.nextInt();
        
        System.out.print("     Address: ");
        String Address = scan.nextLine();
        Address = scan.nextLine();
        System.out.print("");
        
        System.out.print("     Phone Number: ");
        String Phone = scan.nextLine();
        System.out.print("");
        
        Manager manager = new Manager(EmployeeID, Name, YearOfBirth, Phone, Address, IDCard, "Manager", Sex);
        return manager;
    }
	protected Staff AddStaff()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.print("     Employee ID: ");
        String EmployeeID = scan.nextLine();

        int Employee = CheckForEmployeeIDExistence(EmployeeID);

        while (Employee > 0)
        {
        	System.out.println("  WARNING: Employee ID already exists. Please enter another ID ");
        	System.out.print("     Employee ID: ");
        	EmployeeID = scan.nextLine();
            Employee = CheckForEmployeeIDExistence(EmployeeID);
        }
        System.out.print("     Employee's name: ");
        String Name = scan.nextLine();
        
        System.out.print("     Sex: ");
        String Sex = scan.nextLine();
        
        System.out.print("     ID Card: ");
        String IDCard = scan.nextLine();
        
        System.out.print("     Year of birth: ");
        int YearOfBirth = scan.nextInt();
        
        System.out.print("     Address: ");
        String Address = scan.nextLine();
        Address = scan.nextLine();
        System.out.print("");
        
        System.out.print("     Phone number: ");
        String Phone = scan.nextLine();
        System.out.print("");
        
        System.out.print("     Number of working days: ");
        int NumberOfWorkingDays = scan.nextInt();
        
        System.out.print("     OverTime: ");
        int OverTime = scan.nextInt();
        
        Staff st = new Staff(EmployeeID, Name, YearOfBirth, Phone, Address, IDCard, "Staff", Sex, NumberOfWorkingDays, OverTime);
        return st;
    }
	public void AddEmployee()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("________________________________________________");
        System.out.println("              NEW EMPLOYEE INFORMATION");
        System.out.println("         ---PLEASE CHOOSE EMPLOYEE TYPE--- ");

        String sEmployeeType;
        do
        {
        	System.out.println("     MANAGER       : QL");
        	System.out.println("     CASHIER       : TN");
        	System.out.println("     STAFF         : PV");
        	System.out.print("\n YOUR CHOICE IS: ");
            sEmployeeType = scan.nextLine();
        }
        while (!sEmployeeType.equals("QL") && !sEmployeeType.equals("TN") && !sEmployeeType.equals("PV"));

        switch (sEmployeeType)
        {
            case "QL":
                Manager ql = AddManager();
                lEmployee.add(ql);
                break;

            case "TN":
                Cashier tn = AddCashier();
                lEmployee.add(tn);
                break;
            case "PV":
                Staff pv = AddStaff();
                lEmployee.add(pv);
                break;
            default:
                break;
        }

        System.out.print("     New employee information has been saved !!");
        System.out.print("________________________________________________________");
    }
	public EmployeeManagement()
    {
        lEmployee = new ArrayList<Employee>();

        //Manager
        Manager ql1 = new Manager("QL01", "Ta Hoai Nam", 2002, "0988188449", "District 9, HCM City", "045632587912", "Manager", "Male");
        lEmployee.add(ql1);
        Manager ql2 = new Manager("QL02", "Ly Hong Khanh", 2001, "0988188733", "District 8, HCM City", "059854364148", "Manager", "Female");
        lEmployee.add(ql2); ;

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
	public void ShowEmployee()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        System.out.println("     Choose a list: ");
        System.out.println("     0. All the employees");
        System.out.println("     1. Manager");
        System.out.println("     2. Cashier");
        System.out.println("     3. Staff");
        System.out.print("\n YOUR CHOICE IS:  ");
        int choose = Integer.parseInt(scan.next());

        switch (choose)
        {
            case 0:
                ShowAllEmployee();
                break;
            case 1:
                ShowManager();
                break;
            case 2:
                ShowCashier();
                break;
            case 3:
                ShowStaff();
                break;
            default:
                break;
        }
    }
	public void ShowAllEmployee()
    {
        System.out.println("                                                                 LIST OF ALL EMPLOYEES");
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        System.out.println("    | Ordinal Number | Employee ID |         Full Name         |   Sex   |    ID Card   | Year Of Birth |            Address           | Phone Number |");
        System.out.println("    |_________________________________________________________________________________________________________________________________________________|");
        int i = 1;
        for (Employee em : lEmployee)
        {
        	System.out.printf("    |        %8d|     %4s    | %25s |  %7s| %13s|     %10d| %29s|  %12s|", i, em.getEmployeeID(), em.getFullName(), em.getSex(), em.getIDCard(), em.getYearOfBirth(), em.getAddress(), em.getPhoneNumber());
        	System.out.println();
            i++;
        }
        System.out.println("    ___________________________________________________________________________________________________________________________________________________\n");

    }
	public void ShowManager()
    {
		System.out.println("                                                                       LIST OF MANAGERS");
		System.out.println("     _________________________________________________________________________________________________________________________________________________");
        System.out.println("    | Ordinal Number | Employee ID |         Full Name         |   Sex   |    ID Card   | Year Of Birth |            Address           | Phone Number |");
        System.out.println("    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        int i = 1;
        for (Employee em: lEmployee) {
        	if(em.getEmployeeType() == "Manager") {
        		System.out.printf("    |        %8d|     ", i++);
        		em.ShowInformaton();
        	}
        }

        System.out.println("    ___________________________________________________________________________________________________________________________________________________\n");
    }
	public void ShowCashier()
    {
		System.out.println("                                                                    LIST OF CASHIERS");
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        System.out.println("    | Ordinal Number | Employee ID |         Full Name         |   Sex   |    ID Card   | Year Of Birth |            Address           | Phone Number |");
        System.out.println("    |~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|");
        int i = 1;
        for (Employee em: lEmployee) {
        	if(em.getEmployeeType() == "Cashier") {
        		System.out.printf("    |        %8d|     ", i++);
        		em.ShowInformaton();
        	}
        }

        System.out.println("     _________________________________________________________________________________________________________________________________________________\n");
    }
	public void ShowStaff()
    {
		System.out.println("                                                                    LIST OF STAFFS");
        System.out.println("     _________________________________________________________________________________________________________________________________________________");
        System.out.println("    | Ordinal Number | Employee ID |         Full Name         |   Sex   |    ID Card   | Year Of Birth |            Address           | Phone Number |");
        System.out.println("     ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int i = 1;
        for (Employee em: lEmployee) {
        	if(em.getEmployeeType() == "Staff") {
        		System.out.printf("    |        %8d|     ", i++);
        		em.ShowInformaton();
        	}
        }

        System.out.println("     _________________________________________________________________________________________________________________________________________________\n");
    }
	public void DelEmployee()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("     Enter the Employee ID of the employee you want to delete: ");
			String m = scan.nextLine();
			try {
				for (Employee employee : lEmployee) {
					if (employee.getEmployeeID().equals(m)) {
						if(employee !=null) {
						lEmployee.remove(employee);
		                System.out.println("     Employee " + m + " deleted !");
		                System.out.println("__________________________________________________________");
						if (ContinueFind() == false) return;
						}
					}
				}
			}
			catch(Exception e) {
				System.out.println("     This employee ID does not exist!");
            	System.out.println("__________________________________________________________");
            	if (ContinueFind() == false) return;
			}	
		}
    }
	public void EditEmployee()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        while(true) {
        	System.out.print("     Enter the employee ID of the employee you want to update: ");
            String employeeid = scan.nextLine();
        	try {
            	for (Employee em : lEmployee) {
                	if (em.getEmployeeID().equals(employeeid)) {
                		if(em != null) {
                			System.out.print("     Employee name: ");
                            String name = scan.nextLine();
                            em.sFullName = name;
                            System.out.print("     Sex: ");
                            String sex = scan.nextLine();
                            em.sSex = sex;
                            System.out.print("     ID Card: ");
                            String idcard = scan.nextLine();
                            em.sIDCard = (idcard);
                            System.out.print("     Year of birth: ");
                            int yearofbirth = scan.nextInt();
                            
                            em.iYearOfBirth = (yearofbirth);
                            System.out.print("     Address: ");
                            String address = scan.nextLine();
                            address = scan.nextLine();
                            em.sAddress = (address);
                            
                            System.out.print("     Phone Number: ");
                            String phonenumber = scan.nextLine();
                            System.out.print("");
                            em.sPhoneNumber = (phonenumber);

                            System.out.println("     Employee information " + employeeid + " updated !");
                            System.out.println("__________________________________________________________");
                            if (ContinueFind() == false) return;
                		}
                	}
                	
            	}
            }
            catch(Exception e) {
            		System.out.println("     This employee ID does not exist!");
                	System.out.println("__________________________________________________________");
                	if (ContinueFind() == false) return;
            }
        	
        }
        
    }
	public void SearchEmployee()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        while (true)
        {
        	System.out.println("                   ====FINDING EMLOYEE====");
            System.out.print("     Enter the employee ID of the employee you want to find: ");
            String m = scan.nextLine();
            try
            {
            	for (Employee search : lEmployee) {
            		if(search.getEmployeeID().equals(m)) {
            			if(search != null) {
                		System.out.println("     ________________________________________________________________________________________________________________________________");
                        System.out.println("    | Employee ID |         Full Name         |   Sex   |    ID Card   | Year Of Birth |            Address           | Phone Number |");
                        System.out.println("    |________________________________________________________________________________________________________________________________|");
                    	System.out.printf("    |     %4s    | %25s |  %7s| %13s|     %10d| %29s|  %12s|", search.getEmployeeID(), search.getFullName(), search.getSex(), search.getIDCard(), search.getYearOfBirth(), search.getAddress(), search.getPhoneNumber());
                    	System.out.println();
                    	System.out.println("    |________________________________________________________________________________________________________________________________|\n");
                    	if (ContinueFind() == false) return;
            			}
            		}   
            	}
            }
            catch(Exception e)
            {
            	System.out.println(" This Employee ID does not exist");
                if (ContinueFind() == false) return;
            }
        }
    }
	public void CalSalary()
    {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		double salary = 0;
		int count = 0;
        System.out.print("ENTER THE EMPLOYEE ID YOU NEED TO CALCULATE SALARY: ");
        String id = scan.next();
        for (Employee emid : lEmployee) {
        	if(emid.getEmployeeID().equals(id)) {
        		count++;
        	}
        }
        if(count == 0)
        {
            System.out.println("     This Employee ID does not exist!");
            System.out.println("_____________________________________________________________________\n");
        }
        else
        {
            for (Employee em : lEmployee) {
            	if(em.getEmployeeID().equals(id) == true) {
            		if (em != null) {
            			if(em.getEmployeeType() == "Manager")
                        {
                            salary = Manager.ManagerSalary();
                        }
                        else if(em.getEmployeeType() == "Cashier")
                        {
                            salary = Cashier.CashierSalary();
                        }
                        else if (em.getEmployeeType() == "Staff")
                        {
                            salary = Staff.StaffSalary();
                        }
                        System.out.println("Total Salary of " + id + " is " + salary + " VND");
            		}
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

