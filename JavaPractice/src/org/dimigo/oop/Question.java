/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Question
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 5. 11.
 * </pre>
 *
 * @author     : Admin
 * @version    : 1.0
 */
public class Question {
	
	public static void main(String[] args) {
		
		String singer = "박효신";
		String actor = "김수현";
		String model = "남주혁";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("가장 좋아하는 가수는?");
		String answer = scanner.nextLine();
		if("박효신".equals(answer)) {
			System.out.println("정답입니다!!^^");
		} else {
			System.out.println("틀렸습니다!!ㅜㅜ");
		}
		
		System.out.println("가장 좋아하는 배우는?");
		String answer2 = scanner.nextLine();
		if("김수현".equals(answer2)) {
			System.out.println("정답입니다!!^^");
		} else {
			System.out.println("틀렸습니다!!ㅜㅜ");
		}
		
		System.out.println("가장 좋아하는 모델은?");
		String answer3 = scanner.nextLine();
		if("남주혁".equals(answer3)) {
			System.out.println("정답입니다!!^^");
		} else {
			System.out.println("틀렸습니다!!ㅜㅜ");
		}
	}

}
