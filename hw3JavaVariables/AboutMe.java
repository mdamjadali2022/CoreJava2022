package hw3JavaVariables;

public class AboutMe {
	// variables declared and initialized
	public String name = "Md Ali";
	public byte age = 35;
	public short myApartmentRent = 1600;
	public int myYearlySalary = 65000;
	public long myBankBalance = 25500;
	public float myHeight = 5.8f;
	public double myGrade = 4.69876;
	public char sex = 'M';
	public boolean usCitizen = true;

	public static void main(String[] args) {
		// AboutMe is a class, - aboutme is an object or reference variables, - object always start with lowercase.
		// An object (aboutme) is created from class (AboutMe).
		// When a object created from a class its call instantiation.
		AboutMe aboutme = new AboutMe();
		System.out.println("My Name is: " + aboutme.name + "\nMy Age: " + aboutme.age + "\nMy HouseRent: "
				+ aboutme.myApartmentRent + "\nYearly Salary: " + aboutme.myYearlySalary + "\nMy Bank Balance: "
				+ aboutme.myBankBalance + "\nSex: " + aboutme.sex + "\nMy Height: " + aboutme.myHeight + "\nMy Grade: "
				+ aboutme.myGrade + "\nAm I US Citizen? Ans: " + aboutme.usCitizen);

	}

}
