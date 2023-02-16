/**
 * Creates a sublcass of Residence, which details the blueprints of an apartment building.
 */

/**
 * @author brandonesarey
 * @version 1.3
 * Project 1
 * Semester year Spring 2023
 */
public class Apartment extends Residential {
	private int numRentableUnits;
	private double avgUnitSize;
	private boolean parkingAvailable;

	/**
	 * @param numRentableUnits
	 * @param avgUnitSize
	 * @param parkingAvailable
	 */
	public Apartment() {
		setNumRentableUnits(12);
		setAvgUnitSize(1500);
		setParkingAvailable(true);
	}// end empty argument constructor

	public Apartment(int numRentableUnits, double avgUnitSize, boolean parkingAvailable) {
		this.numRentableUnits = numRentableUnits;
		this.avgUnitSize = avgUnitSize;
		this.parkingAvailable = parkingAvailable;
	}

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

	/**
	 * @return the avgUnitSize
	 */
	public double getAvgUnitSize() {
		return avgUnitSize;
	}

	/**
	 * @param avgUnitSize the avgUnitSize to set
	 */
	public void setAvgUnitSize(double avgUnitSize) {
		this.avgUnitSize = avgUnitSize;
	}

	/**
	 * @return the parkingAvailable
	 */
	public boolean isParkingAvailable() {
		return parkingAvailable;
	}

	/**
	 * @param parkingAvailable the parkingAvailable to set
	 */
	public void setParkingAvailable(boolean parkingAvailable) {
		this.parkingAvailable = parkingAvailable;
	}

	public String displayData() {
		return super.displayData() + "\nNumber of rentable units: " + numRentableUnits + "\nAverage unit size: "
				+ avgUnitSize + "\nParking: " + parkingAvailable;
	}

	@Override
	public String toString() {
		return "Apartment [numRentableUnits=" + numRentableUnits + ", avgUnitSize=" + avgUnitSize
				+ ", parkingAvailable=" + parkingAvailable + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}// end toString

}// end Apartment
