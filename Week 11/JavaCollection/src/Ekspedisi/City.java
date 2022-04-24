package Ekspedisi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class City {

	@SerializedName("origin")
	@Expose
	private String origin;
	@SerializedName("destination")
	@Expose
	private String destination;

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

}