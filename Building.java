/**
 * Creates a class which acts as the superclass for every class in the package.
 */

/**
 * @author brandonesarey
 * @version 1.3
 * Project 1
 * Semester year Spring 2023
 */
public class Building {
	protected String projectName;
	protected String completeAddress;
	protected double totalSquareFeet;
	protected String occupancyGroup;
	protected String subgroup;

	/**
	 * 
	 */
	public Building() {
		// TODO Auto-generated constructor stub
		setProjectName("Gaines Home");
		setCompleteAddress("123 Main Street | Louisville, Kentucky 40201");
		setTotalSquareFeet(2450);
		setOccupancyGroup("Residential");
		setSubgroup("R1");
	}// end empty argument constructor

	public Building(String projectName, String completeAddress, double totalSquareFeet, String occupancyGroup,
			String subgroup) {
		this.projectName = projectName;
		this.completeAddress = completeAddress;
		this.totalSquareFeet = totalSquareFeet;
		this.occupancyGroup = occupancyGroup;
		this.subgroup = subgroup;
	}// end preferred constructor

	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}

	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	/**
	 * @return the completeAddress
	 */
	public String getCompleteAddress() {
		return completeAddress;
	}

	/**
	 * @param completeAddress the completeAddress to set
	 */
	public void setCompleteAddress(String completeAddress) {
		this.completeAddress = completeAddress;
	}

	/**
	 * @return the totalSquareFeet
	 */
	public double getTotalSquareFeet() {
		return totalSquareFeet;
	}

	/**
	 * @param totalSquareFeet the totalSquareFeet to set
	 */
	public void setTotalSquareFeet(double totalSquareFeet) {
		this.totalSquareFeet = totalSquareFeet;
	}

	/**
	 * @return the occupancyGroup
	 */
	public String getOccupancyGroup() {
		return occupancyGroup;
	}

	/**
	 * @param occupancyGroup the occupancyGroup to set
	 */
	public void setOccupancyGroup(String occupancyGroup) {
		this.occupancyGroup = occupancyGroup;
	}

	/**
	 * @return the subgroup
	 */
	public String getSubgroup() {
		return subgroup;
	}

	/**
	 * @param subgroup the subgroup to set
	 */
	public void setSubgroup(String subgroup) {
		this.subgroup = subgroup;
	}

	public void draw() {
		System.out.println("This is a prototype.");
	}// end draw()

	public String displayData() {
		return "Project name: " + projectName + "\nComplete address: " + completeAddress + "\nTotal square feet: "
				+ totalSquareFeet + "\nOccupancy group: " + occupancyGroup + "\nSubgroup: " + subgroup;
	}// end displayData()

	@Override
	public String toString() {
		return "Building [projectName=" + projectName + ", completeAddress=" + completeAddress + ", totalSquareFeet="
				+ totalSquareFeet + ", occupancyGroup=" + occupancyGroup + ", subgroup=" + subgroup + "]";
	}// end toString
}// end Building
