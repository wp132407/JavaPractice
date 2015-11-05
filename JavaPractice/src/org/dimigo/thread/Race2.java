/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread
 *   |_Race2
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 11. 5.
 * </pre>
 *
 * @author     : 김지원
 * @version    : 1.0
 */
public class Race2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("main thread start");
		
		Thread r1 = new Thread(new Runner2("이어진"));
		Thread r2 = new Thread(new Runner2("정욱재"));
		
		r1.start();
		r2.start();
		
		System.out.println("main thread end");
	}

}
