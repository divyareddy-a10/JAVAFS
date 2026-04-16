package DAY3;
enum Gender{M,F}
public class UsingEnum {

	private String fname;
	private String lname;
	private Gender gender;
	private int age;
	private double weight;
	private long phnno;
	
		
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public long getPhnno() {
		return phnno;
	}
	public void setPhnno(long phnno) {
		this.phnno = phnno;
	}
	
	public UsingEnum() {}
	
	public UsingEnum(String fname, String lname,Gender gender,int age, double weight, long phnno) {
		
		this.fname = fname;
		this.lname = lname;
		this.gender=gender;
		this.age = age;
		this.weight = weight;
		this.phnno = phnno;
	}
	
	void display()
	{
		System.out.println("Person Details:");
		System.out.println("---------------");
		System.out.println("First Name:"+fname);
		System.out.println("Last Name:"+lname);
		System.out.println("Age:"+age);
		System.out.println("Weight:"+weight);
		System.out.println("Phone Number:"+phnno);
	
	

	
	switch(gender) {
	case M:
		System.out.println("Gender:M");
		break;
	case F:
		System.out.println("Gender:F");	
		break;
		
	}
	
	}
}

