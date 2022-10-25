package CoffeeShopManagement;


public class Cashier extends Employee implements ISalary {
	public Cashier (String employeeid, String name, int yearofbirth, String phonenumber, String address, String idcard, String employeetype, String sex, int numberofworkingdays, int overtime) {
		super(employeeid,name,yearofbirth,phonenumber,address,idcard,employeetype,sex,numberofworkingdays,overtime);
		this.sEmployeeID = employeeid;
        this.sFullName = name;
        this.iYearOfBirth = yearofbirth;
        this.sPhoneNumber = phonenumber;
        this.sAddress = address;
        this.sIDCard = idcard;
        this.sEmployeeType = employeetype;
        this.sSex = sex;
        Employee.iNumberOfWorkingDays = numberofworkingdays;
        Employee.iOverTime = overtime;
	}
	public Cashier() {
		super();
	}
	public static double CashierBasicSalary()
    {
        return 3000000;
    }
    public static double CashierOverTimeSalary()
    {
        return iOverTime * 30000;
    }
    public static double CashierSalary()
    {
        double TotalSalary = (CashierBasicSalary() + CashierOverTimeSalary() + EmployeePrizeSalary());
        return TotalSalary;
    }
	@Override
	public double BasicSalary()
    {
        return CashierBasicSalary();
    }
	@Override
    public double OverTimeSalary()
    {
        return CashierOverTimeSalary();
    }
	@Override
    public double PrizeSalary()
    {
        return EmployeePrizeSalary();
    }
	@Override
    public double TotalSalary()
    {
        return CashierSalary();
    }
}
