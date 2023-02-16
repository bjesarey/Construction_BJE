/**
 * Creates a subclass of Business, which details the blueprints of a shopping mall.
 */

/**
 * @author brandonesarey
 * @version 1.3
 * Project 1
 * Semester year Spring 2023
 */
public class Mall extends Business {
	private int numRentedUnits;
	private double medianUnitSize;
	private int numParkingSpaces;

	/**
	 * @param numRentedUnits
	 * @param medianUnitSize
	 * @param numParkingSpaces
	 */
	public Mall(int numRentedUnits, double medianUnitSize, int numParkingSpaces) {
		this.numRentedUnits = numRentedUnits;
		this.medianUnitSize = medianUnitSize;
		this.numParkingSpaces = numParkingSpaces;
	}// end preferred constructor

	/**
	 * 
	 */
	public Mall() {
		// TODO Auto-generated constructor stub
		setNumRentedUnits(24);
		setMedianUnitSize(800);
		setNumParkingSpaces(1000);
	}// end empty argument constructor

	/**
	 * @return the numRentedUnits
	 */
	public int getNumRentedUnits() {
		return numRentedUnits;
	}

	/**
	 * @param numRentedUnits the numRentedUnits to set
	 */
	public void setNumRentedUnits(int numRentedUnits) {
		this.numRentedUnits = numRentedUnits;
	}

	/**
	 * @return the medianUnitSize
	 */
	public double getMedianUnitSize() {
		return medianUnitSize;
	}

	/**
	 * @param medianUnitSize the medianUnitSize to set
	 */
	public void setMedianUnitSize(double medianUnitSize) {
		this.medianUnitSize = medianUnitSize;
	}

	/**
	 * @return the numParkingSpaces
	 */
	public int getNumParkingSpaces() {
		return numParkingSpaces;
	}

	/**
	 * @param numParkingSpaces the numParkingSpaces to set
	 */
	public void setNumParkingSpaces(int numParkingSpaces) {
		this.numParkingSpaces = numParkingSpaces;
	}

	public String displayData() {
		return super.displayData() + "\nNumber of rented units: " + numRentedUnits + "\nMedian Unit Size: "
				+ medianUnitSize + "\nNumber of parking spaces: " + numParkingSpaces;
	}// end displayData

	@Override
	public String toString() {
		return "Mall [numRentedUnits=" + numRentedUnits + ", medianUnitSize=" + medianUnitSize + ", numParkingSpaces="
				+ numParkingSpaces + ", numRentableUnits=" + numRentableUnits + ", projectName=" + projectName
				+ ", completeAddress=" + completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup="
				+ occupancyGroup + ", subgroup=" + subgroup + "]";
	}// end toString

}// end Mall
