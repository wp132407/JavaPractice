/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Car
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 4. 13.
 * </pre>
 *
 * @author     : Admin
 * @version    : 1.0
 */
public class Car {
	
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public String getCompany() {
		return company;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setCompany(String newcompany) {
		company = newcompany;
	}
	
	public void setModel(String newmodel) {
		model = newmodel;
	}
	
	public void setColor(String newcolor) {
		color = newcolor;
	}
	
	public void setMaxSpeed(int newMaxSpeed) {
		maxSpeed = newMaxSpeed;
	}
	
	public void setPrice(int newprice) {
		price = newprice;
	}

}
