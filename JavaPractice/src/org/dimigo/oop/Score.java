/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Score
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 12.
 * </pre>
 *
 * @author     : Admin
 * @version    : 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int kor, mat, eng;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 => ");
		kor = scanner.nextInt();
		
		System.out.println("수학 점수 입력 => ");
		mat = scanner.nextInt();
		
		System.out.println("영어 점수 입력 => ");
		eng = scanner.nextInt();
		
		System.out.println("<< 점수 출력 >>");
		StringBuilder sb = new StringBuilder();
		sb.append("국어점수 : ")
		  .append(kor + "점\n")
		  .append("수학점수 : ")
		  .append(mat + "점\n")
		  .append("영어점수 : ")
		  .append(eng + "점\n");
		
		System.out.println(sb);

	}

}
