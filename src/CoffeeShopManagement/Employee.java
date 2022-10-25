package CoffeeShopManagement;


public abstract class Employee {
	//Fields
	protected String sEmployeeID;
    protected String sFullName;
    protected int iYearOfBirth;
    protected String sPhoneNumber;
    protected String sAddress;
    protected String sIDCard;
    protected String sEmployeeType;
    protected String sSex;
    protected static int iNumberOfWorkingDays;
    protected static int iOverTime;
    protected static final double Prize = 700000;
    //Properties
    public String getEmployeeID() {
    	return sEmployeeID;
    }
    public void setEmployeeID(String EmployeeID) {
    	this.sEmployeeID = EmployeeID;
    }
    public String getFullName() {
    	return sFullName;
    }
    public void setFullName(String Name) {
    	this.sFullName = Name;
    }
    public int getYearOfBirth() {
    	return iYearOfBirth;
    }
    public void setYearOfBirth(int YearOfBirth) {
    	this.iYearOfBirth = YearOfBirth;
    }
    public String getPhoneNumber() {
    	return sPhoneNumber;
    }
    public void setPhoneNumber(String PhoneNumber) {
    	this.sPhoneNumber = PhoneNumber;
    }
    public String getAddress() {
    	return sAddress;
    }
    public void setAddress(String Address) {
    	this.sAddress = Address;
    }
    public String getIDCard() {
    	return sIDCard;
    }
    public void setIDCard(String IDCard) {
    	this.sIDCard= IDCard;
    }
    public String getEmployeeType() {
    	return sEmployeeType;
    }
    public void setEmployeeType(String EmployeeType) {
    	this.sEmployeeType= EmployeeType;
    }
    public String getSex() {
    	return sSex;
    }
    public void setSex(String Sex) {
    	this.sSex = Sex;
    }
    public int getNumberOfWorkingDays() {
    	return iNumberOfWorkingDays;
    }
    public void setNumberOfWorkingDays(int NumberOfWorkingDays) {
    	Employee.iNumberOfWorkingDays = NumberOfWorkingDays;
    }
    public static int getOverTime() {
    	return iOverTime;
    }
    public void setOverTime(int OverTime) {
    	Employee.iOverTime = OverTime;
    }
    //Constructors
    public Employee(String employeeid, String name, int yearofbirth, String phonenumber, String address, String idcard, String employeetype, String sex, int numberofworkingdays, int overtime) {
    	super();
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
    public Employee(String employeeid, String name, int yearofbirth, String phonenumber, String address, String idcard, String employeetype, String sex) {
    	super();
    	this.sEmployeeID = employeeid;
        this.sFullName = name;
        this.iYearOfBirth = yearofbirth;
        this.sPhoneNumber = phonenumber;
        this.sAddress = address;
        this.sIDCard = idcard;
        this.sEmployeeType = employeetype;
        this.sSex = sex;
    }
    public Employee() {
    	super();
    }
    //Methods
    public static double EmployeePrizeSalary() {
    	if (iNumberOfWorkingDays > 26)
    		return Prize;
    	int numberOfDaysOffWork = 30 - iNumberOfWorkingDays;
        if (numberOfDaysOffWork >= 5 && numberOfDaysOffWork <= 7)
            return (Prize - numberOfDaysOffWork * 100000);
        else
            return 0;
    }
    public void ShowInformaton() {
    	System.out.printf("%4s    | %25s |  %7s| %13s|     %10d| %29s|  %12s|", sEmployeeID, sFullName, sSex, sIDCard, iYearOfBirth, sAddress, sPhoneNumber);
    	System.out.println();
    }
}