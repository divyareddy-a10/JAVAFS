package DAY2;

public class Person {
	protected String fname;
	protected String lname;
	protected char gender;
	protected int age;
	protected double weight;
	
	
	
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
	public char getGender(String string) {
		return gender;
	}
	public void setGender(char gender) {
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
	public Person() {}
	
	public Person(String fname, String lname, char gender, int age, double weight) 
	{
		this.fname = fname;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
		this.weight = weight;
	}

	void display()
	{
		System.out.println("Person Details:");
		System.out.println("---------------");
		System.out.println("First Name:"+fname);
		System.out.println("Last Name:"+lname);
		System.out.println("Gender:"+gender);
		System.out.println("Age:"+age);
		System.out.println("Weight:"+weight);
	}
}
