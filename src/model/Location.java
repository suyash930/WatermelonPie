package model;

public class Location {
	
	private int locationID;
	private String name;
	private String city;
	private String district;
	
	public Location(int locationID, String name, String city, String district) {
		super();
		this.locationID = locationID;
		this.name = name;
		this.city = city;
		this.district = district;
	}

	public int getLocationID() {
		return locationID;
	}

	public void setLocationID(int locationID) {
		this.locationID = locationID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}
	
}
