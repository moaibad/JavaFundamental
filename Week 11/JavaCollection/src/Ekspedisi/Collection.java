package Ekspedisi;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Collection {

	@SerializedName("ekspedisi")
	@Expose
	private List<Ekspedisi> ekspedisi = new ArrayList<Ekspedisi>();

	public List<Ekspedisi> getEkspedisi() {
		return ekspedisi;
	}

	public void setEkspedisi(List<Ekspedisi> ekspedisi) {
		this.ekspedisi = ekspedisi;
	}

}
