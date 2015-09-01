/**
 * 
 */
package org.dimigo.abstractClass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhone
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 25.
 * </pre>
 *
 * @author     : Admin
 * @version    : 1.0
 */
public abstract class SmartPhone {
	
	private String model;
	private String company;
	private int price;
	
	public SmartPhone(){
		
	}
	
	public abstract void pay();
	
	public SmartPhone(String model, String company, int price) {
		this.model = model;
		this.company = company;
		this.price = price;
	}
	
	public void turnOn() {
		System.out.println(model + "의 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println(model + "의 전원을 끕니다.");
	}
	
	public void useSpecialFuction() {
		if(this==null) return;
		
		if(this instanceof IPhone) {
			((IPhone) this).useAirDrop();
		} else if(this instanceof Galaxy) {
			((Galaxy) this).useWirelessCharging();
		}
	}
	
	public String toString() {
		return "모델명 : "+model+", 제조사 : "+company+", 가격 : "+String.format("%,d", price);
	}
}