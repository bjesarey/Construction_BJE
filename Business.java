/**
 * Creates a subclass of building, which details the blueprints of a generic business.
 */

/**
 * @author brandonesarey
 * @version 1.3
 * Project 1
 * Semester year Spring 2023
 */
public class Business extends Building{
	protected int numRentableUnits;
	/**
	 * @param numRentableUnits
	 */

	public Business(int numRentableUnits, String occupancyGroup, String subgroup) {
		this.numRentableUnits = numRentableUnits;
		this.occupancyGroup = occupancyGroup;
		this.subgroup=subgroup;
	}//end preferred constructor
	/**
	 * 
	 */
	public Business() {
	setNumRentableUnits(26);
	setOccupancyGroup("Business");
	setSubgroup("B");
	}//end empty argument constructor
	/**
	 * @return the numRentableUnits
	 */
	public int getNumRentableUnits() {
		return numRentableUnits;
	}
	/**
	 * @param numRentableUnits the numRentableUnits to set
	 */
	public void setNumRentableUnits(int numRentableUnits) {
		this.numRentableUnits = numRentableUnits;
	}

	public String displayData() {
		return super.displayData() + "\nNumber of rentable units: " + numRentableUnits;
	}// end displayData
	@Override
	public String toString() {
		return "Business [numRentableUnits=" + numRentableUnits + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}//end toString
	
}//end Business
