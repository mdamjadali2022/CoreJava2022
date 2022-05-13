package lec03_java_variables;

public class Amjad {
	public String name = "Md Ali";
	public byte age = 35;
	public short myApartmentRent = 32333;
	public int myYearlySalary = 67890;
	public long myBankBalance = 15670;
	public float myHeight = 5.7678f;
	public double myGrade = 4.69876;
	public char sex = 'M';
	public boolean usCitizen = true;

	public static void main(String[] args) {
		Amjad amjad = new Amjad(); // When we create an object, Constructor is Initialized
		System.out.println("My Name is: " + amjad.name + "\nMy Age: " + amjad.age + "\nMy HouseRent: "
				+ amjad.myApartmentRent + "\nYearly Salary: " + amjad.myYearlySalary + "\nMy Bank Balance: "
				+ amjad.myBankBalance + "\nSex: " + amjad.sex + "\nMy Height: " + amjad.myHeight + "\nMy Grade: "
				+ amjad.myGrade + "\nAm I US Citizen? Ans: " + amjad.usCitizen);

	}

}
