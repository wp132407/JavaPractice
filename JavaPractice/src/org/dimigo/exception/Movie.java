/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_Movie
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 22.
 * </pre>
 *
 * @author     : Admit
 * @version    : 1.0
 */

public class Movie {
	private String title;
	private int limitAge;
	
	public Movie() {
	}

	public Movie(String title, int age) {
		this.title = title;
		this.limitAge = age;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLimitAge() {
		return limitAge;
	}

}
	
	

