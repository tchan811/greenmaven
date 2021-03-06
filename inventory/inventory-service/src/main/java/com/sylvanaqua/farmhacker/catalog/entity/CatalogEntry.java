package com.sylvanaqua.farmhacker.catalog.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.jooq.tools.json.JSONObject;

@XmlRootElement
public class CatalogEntry {

	@XmlElement(name="category")
	private String category;
	
	@XmlElement(name="name")
	private String name;
	
	@XmlElement(name="retailPrice")
	private double retailPrice;
	
	@XmlElement(name="wholesalePrice")
	private double wholesalePrice;
	
	@Override
	public String toString(){
		try{
			JSONObject entryAsJSON = new JSONObject();
			entryAsJSON.put("category", category);
			entryAsJSON.put("name", name);;
			entryAsJSON.put("retailPrice", retailPrice);
			entryAsJSON.put("wholesalePrice", wholesalePrice);
			
			return entryAsJSON.toString();
		}
		catch(Exception e){
			return null;
		}
	}
	
	public CatalogEntry(String category, String name, 
			            double retailPrice, double wholesalePrice){
		this.category = category;
		this.name = name;
		this.retailPrice = retailPrice;
		this.wholesalePrice = wholesalePrice;
	}
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public double getWholesalePrice() {
		return wholesalePrice;
	}

	public void setWholesalePrice(double wholesalePrice) {
		this.wholesalePrice = wholesalePrice;
	}
	
	
}
