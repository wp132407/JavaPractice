package org.dimigo.basic;

/**
 * 디미베네 연간 인건비 계산하기
 * 
 * @author wp130407
 *
 */

public class Promotion {

	public static void main(String[] args) {
		
		int salary = 1700000 ;
		int employee = 3;
		int shop = 1500;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", 1700000) + "원");
		System.out.println("점포 내 직원 수 : 3명");
		System.out.println("월 평균 급여 : " + String.format("%,d", 1500) + "개");
		
		System.out.println("연간 인건비 : " + String.format("%,d", (long)salary * 12 * employee * shop) + "원");

	}

}
