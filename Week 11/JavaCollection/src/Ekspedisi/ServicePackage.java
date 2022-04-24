package Ekspedisi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ServicePackage {

	@SerializedName("service")
	@Expose
	private String service;
	@SerializedName("value")
	@Expose
	private Integer value;

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

}