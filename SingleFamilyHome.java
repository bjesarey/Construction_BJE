/**
 * Creates a sublcass of Residence, which details the blueprints of a family home.
 */

/**
 * @author brandonesarey
 * @version 1.3
 * Project 1
 * Semester year Spring 2023
 */
public class SingleFamilyHome extends Residential {
	private boolean garage;

	/**
	 * @param garage
	 */
	public SingleFamilyHome(boolean garage) {
		this.garage = garage;
	}

	/**
	 * 
	 */
	public SingleFamilyHome() {
		// TODO Auto-generated constructor stub
		setGarage(true);
	}

	/**
	 * @return the garage
	 */
	public boolean getGarage() {
		return garage;
	}

	/**
	 * @param garage the garage to set
	 */
	public void setGarage(boolean garage) {
		this.garage = garage;
	}

	public String displayData() {
		return super.displayData() + "\nHas a garage: " + garage;
	}// end displayData

	@Override
	public String toString() {
		return "SingleFamilyHome [garage=" + garage + ", numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms
				+ ", laundryRoom=" + laundryRoom + ", projectName=" + projectName + ", completeAddress="
				+ completeAddress + ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup
				+ ", subgroup=" + subgroup + "]";
	}// end toString

}
