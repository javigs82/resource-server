package es.javier.services.resource.dto;

/**
 * Dto class for beers
 * 
 * @author javigs82
 *
 */
public class BeerDto {

	private String name;

	private float abv;

	private String breweryId;

	private String description;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the abv
	 */
	public float getAbv() {
		return abv;
	}

	/**
	 * @param abv the abv to set
	 */
	public void setAbv(float abv) {
		this.abv = abv;
	}

	/**
	 * @return the breweryId
	 */
	public String getBreweryId() {
		return breweryId;
	}

	/**
	 * @param breweryId the breweryId to set
	 */
	public void setBreweryId(String breweryId) {
		this.breweryId = breweryId;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
