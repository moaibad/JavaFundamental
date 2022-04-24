package Ekspedisi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

public class Main {
	public static void main(String[] args) {
		Gson gson = new Gson();
		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader("ekspedisi.json"));
			Collection collection = gson.fromJson(br,Collection.class);
			
			if(collection != null) {
				for(Ekspedisi ekspedisi : collection.getEkspedisi()) {
					System.out.println("=============================");
					//Status
					System.out.println("Status : ");
					System.out.println("\tCode : " +ekspedisi.getStatus().getCode());
					System.out.println("\tDescription : " +ekspedisi.getStatus().getDescription());
					System.out.println("");
					
					//ServicePackage
					System.out.println("Service Package : ");
					System.out.println("\tService : " +ekspedisi.getServicePackage().getService());
					System.out.println("\tValue : " +ekspedisi.getServicePackage().getValue());
					System.out.println("");
					
					//City
					System.out.println("City : ");
					System.out.println("\tOrigin : " +ekspedisi.getCity().getOrigin());
					System.out.println("\tDestination : " +ekspedisi.getCity().getDestination());
					System.out.println("");
					
					System.out.println("Weight : " + ekspedisi.getWeight());
					System.out.println("Quantity : " + ekspedisi.getQuantity());
					System.out.println("Price Item : " + ekspedisi.getPriceItem());
					System.out.println("Product Name : " + ekspedisi.getProductName());
				}
			}
					
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
