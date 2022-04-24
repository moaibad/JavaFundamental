package Ekspedisi;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ekspedisi {

	@SerializedName("status")
	@Expose
	private Status status;
	@SerializedName("servicePackage")
	@Expose
	private ServicePackage servicePackage;
	@SerializedName("city")
	@Expose
	private City city;
	@SerializedName("weight")
	@Expose
	private Integer weight;
	@SerializedName("quantity")
	@Expose
	private Integer quantity;
	@SerializedName("priceItem")
	@Expose
	private Integer priceItem;
	@SerializedName("productName")
	@Expose
	private String productName;

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public ServicePackage getServicePackage() {
		return servicePackage;
	}

	public void setServicePackage(ServicePackage servicePackage) {
		this.servicePackage = servicePackage;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getPriceItem() {
		return priceItem;
	}

	public void setPriceItem(Integer priceItem) {
		this.priceItem = priceItem;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}