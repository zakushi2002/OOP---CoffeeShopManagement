package CoffeeShopManagement;


public class Staff extends Employee implements ISalary {
	public Staff (String employeeid, String name, int yearofbirth, String phonenumber, String address, String idcard, String employeetype, String sex, int numberofworkingdays, int overtime) {
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
	public static double StaffBasicSalary()
    {
        return 3200000;
    }
    public static double StaffOverTimeSalary()
    {
        return iOverTime * 35000;
    }
    public static double StaffSalary()
    {
        double TotalSalary = (StaffBasicSalary() + StaffOverTimeSalary() + EmployeePrizeSalary());
        return TotalSalary;
    }
	@Override
	public double BasicSalary()
    {
        return StaffBasicSalary();
    }
	@Override
    public double OverTimeSalary()
    {
        return StaffOverTimeSalary();
    }
	@Override
    public double PrizeSalary()
    {
        return EmployeePrizeSalary();
    }
	@Override
    public double TotalSalary()
    {
        return StaffSalary();
    }
}
