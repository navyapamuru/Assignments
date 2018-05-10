
public class Employeedata {

	int empNo;
	String empName;
	String address;
	String State;
	int zipCode;
	int phone;
	String designation;
	String manager;
	String lead;
	String analyst;
	int experienceinYears;
	String emailAddress;
	int basic;
	int hra;
	int bonus;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int totalSalary = getTotalSalary( 10000,5500, 10);
		
		System.out.println("Total Salary : " + totalSalary);
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getEmpName() {`
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getManager() {
		return manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getLead() {
		return lead;
	}

	public void setLead(String lead) {
		this.lead = lead;
	}

	public String getAnalyst() {
		return analyst;
	}

	public void setAnalyst(String analyst) {
		this.analyst = analyst;
	}

	public int getExperienceinYears() {
		return experienceinYears;
	}

	public void setExperienceinYears(int experienceinYears) {
		this.experienceinYears = experienceinYears;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public int getBasic() {
		return basic;
	}

	public void setBasic(int basic) {
		this.basic = basic;
	}

	public int getHra() {
		return hra;
	}

	public void setHra(int hra) {
		this.hra = hra;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public Employeedata(int empNo, String empName, String address, String state, int zipCode, int phone,
			String designation, String manager, String lead, String analyst, int experienceinYears, String emailAddress,
			int basic, int hra, int bonus) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.address = address;
		State = state;
		this.zipCode = zipCode;
		this.phone = phone;
		this.designation = designation;
		this.manager = manager;
		this.lead = lead;
		this.analyst = analyst;
		this.experienceinYears = experienceinYears;
		this.emailAddress = emailAddress;
		this.basic = basic;
		this.hra = hra;
		this.bonus = bonus;
	}

	static int getTotalSalary(int basic,int hra, int bonus){
		return basic + hra + (bonus/100)*basic;
	}
		
	}
	

