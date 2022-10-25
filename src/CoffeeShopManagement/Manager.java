package CoffeeShopManagement;


public class Manager extends Employee implements ISalary {
	public Manager(String employeeid, String name, int yearofbirth, String phonenumber, String address, String idcard, String employeetype, String sex) {
		super(employeeid,name,yearofbirth,phonenumber,address,idcard,employeetype,sex);
		this.sEmployeeID = employeeid;
        this.sFullName = name;
        this.iYearOfBirth = yearofbirth;
        this.sPhoneNumber = phonenumber;
        this.sAddress = address;
        this.sIDCard = idcard;
        this.sEmployeeType = employeetype;
        this.sSex = sex;
	}
	public static double ManagerBasicSalary() {
		return 7000000;
	}
	public static double ManagerOverTimeSalary()
    {
        return 1800000;
    }
	public static double ManagerSalary()
    {
        double TotalSalary = ManagerBasicSalary() + ManagerOverTimeSalary() + EmployeePrizeSalary();
        return TotalSalary;
    }
	@Override
	public double BasicSalary() {
        return ManagerBasicSalary();
    }
	@Override
    public double OverTimeSalary() {
        return ManagerOverTimeSalary();
    }
	@Override
    public double PrizeSalary() {
        return EmployeePrizeSalary();
    }
	@Override
    public double TotalSalary() {
        return ManagerSalary();
    }
}
