/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   |_Race
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 4.
 * </pre>
 *
 * @author     : 김지원
 * @version    : 1.0
 */
public class Race extends Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			System.out.println("main thread start");
			
			Thread r1 = new Runner("이어진");
			Thread r2 = new Runner("정욱재");
			
			r1.start();
			r2.start();
			
			System.out.println("main thread end");

	}

}
