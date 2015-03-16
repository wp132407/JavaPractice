package org.dimigo.basic;

/**
 * <<첫번째 수행평가 과제>>
 * 내용 : 아이유 프로필 출력하기
 * 작성일자 : 2015년 3월 13일
 * @author 김지원
 * @version 1.0
 */

public class PrimitiveDataType {

	public static void main(String[] args) {
		
		String name = "아이유";
		boolean gender;
		gender = true;
		int age = 23;
		double height = 161.8;
		float weight = (float) 44.3;
		char bloodType = 'A';
		

		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 :" +name);
		if(gender) {
	           System.out.println("성별 : 여자");
	        } else {
	           System.out.println("성별 : 남자"); 
	        }
		System.out.println("나이 :" +age +"세");
		System.out.println("키 :" +height +"cm");
		System.out.println("몸무게 :" +weight +"kg");
		System.out.println("혈액형 :" +bloodType +"형");
		
		
		
		

	}

}
