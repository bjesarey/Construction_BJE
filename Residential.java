/**
 Creates a subclass of Building, which details the blueprints of a generic residence.
 */

/**
 * @author brandonesarey
 * @version 1.3
 * Project 1
 * Semester year Spring 2023
 */
public class Residential extends Building {
	protected int numBedrooms;
	protected int numBathrooms;
	protected boolean laundryRoom;

	/**
	 * 
	 */
	public Residential() {
		super();
		setNumBedrooms(4);
		setNumBathrooms(3);
		setLaundryRoom(true);

		// TODO Auto-generated constructor stub
	}// end empty argument constructor

	public Residential(int numBedrooms, int numBathrooms, boolean laundryRoom) {
		this.numBedrooms = numBedrooms;
		this.numBathrooms = numBathrooms;
		this.laundryRoom = laundryRoom;
	}// end preferred constructor

	/**
	 * @return the numBedrooms
	 */
	public int getNumBedrooms() {
		return numBedrooms;
	}

	/**
	 * @param numBedrooms the numBedrooms to set
	 */
	public void setNumBedrooms(int numBedrooms) {
		this.numBedrooms = numBedrooms;
	}

	/**
	 * @return the numBathrooms
	 */
	public int getNumBathrooms() {
		return numBathrooms;
	}

	/**
	 * @param numBathrooms the numBathrooms to set
	 */
	public void setNumBathrooms(int numBathrooms) {
		this.numBathrooms = numBathrooms;
	}

	/**
	 * @return the laundryRoom
	 */
	public boolean isLaundryRoom() {
		return laundryRoom;
	}

	/**
	 * @param laundryRoom the laundryRoom to set
	 */
	public void setLaundryRoom(boolean laundryRoom) {
		this.laundryRoom = laundryRoom;
	}

	public String displayData() {
		return super.displayData() + "\nNumber of bedrooms: " + numBedrooms + "\nNumber of bathrooms: " + numBathrooms
				+ "\nLaundry room: " + laundryRoom;
	}

	@Override
	public String toString() {
		return "Residential [numBedrooms=" + numBedrooms + ", numBathrooms=" + numBathrooms + ", laundryRoom="
				+ laundryRoom + ", projectName=" + projectName + ", completeAddress=" + completeAddress
				+ ", totalSquareFeet=" + totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup="
				+ subgroup + "]";
	}// end toString

}// end Residential
