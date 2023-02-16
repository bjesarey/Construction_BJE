/**
 * Tests the classes in the Construction package
 */

/**
 * @author brandonesarey
 * @version 1.3
 * Project 1
 * Semester year Spring 2023
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building omni = new Building();
		Residential house = new Residential();
		Apartment loft = new Apartment();
		SingleFamilyHome cole = new SingleFamilyHome();
		Business store = new Business();
		Mall oxmoor = new Mall();
		System.out.println("Building");
		System.out.println(omni.displayData() + "\n");
		System.out.println(omni.toString() + "\n");
		System.out.println("Residence");
		System.out.println(house.displayData() + "\n");
		System.out.println(house.toString() + "\n");
		System.out.println("Apartment");
		System.out.println(loft.displayData() + "\n");
		System.out.println(loft.toString() + "\n");
		System.out.println("SingleFamilyHome");
		System.out.println(cole.displayData() + "\n");
		System.out.println(cole.toString() + "\n");
		System.out.println("Business");
		System.out.println(store.displayData() + "\n");
		System.out.println(store.toString() + "\n");
		System.out.println("Mall");
		System.out.println(oxmoor.displayData() + "\n");
		System.out.println(oxmoor.toString() + "\n");
	}// end main

}// end Application
