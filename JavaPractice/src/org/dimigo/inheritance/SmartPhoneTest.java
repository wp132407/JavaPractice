/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 26.
 * </pre>
 *
 * @author     : Admin
 * @version    : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone[] sp = {
				new IPhone("아이폰 6", "애플", 700000),
				new Galaxy("갤럭시 6", "삼성", 650000)
		};
		
		for (SmartPhone smartphone : sp) {
			System.out.println(smartphone);
			smartphone.turnOn();
			smartphone.pay();
			smartphone.useSpecialFuction();
			smartphone.turnOff();
		}

	}

}
