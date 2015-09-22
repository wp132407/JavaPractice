/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_MovieTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 22.
 * </pre>
 *
 * @author     : Admit
 * @version    : 1.0
 */

public class MovieTest {
	public static void main(String[] args) {
		Movie[] movies = { new Movie("사도", 12), new Movie("베테랑", 15), new Movie("앤트맨", 12) };

		int age = 13;
		for (Movie movie : movies) {
			try {
				buyTicket(movie, age);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void buyTicket(Movie m, int age) throws AgeCheckException {
		if (age < m.getLimitAge())
			throw new AgeCheckException(m);
		else
			System.out.println(m.getTitle() + " 영화 즐감하세용~");
	}
}