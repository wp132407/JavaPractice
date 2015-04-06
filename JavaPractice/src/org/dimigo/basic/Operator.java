package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		
		int a = 9;
		int b = 10;
		double h = 5.8;
		double h2 = 5.4;
		double auswjr = (a+b)*h*0.5;
		double auswjr2 = a*h2;
		double ckdl = auswjr-auswjr2;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : " + auswjr);
		System.out.println("평행사변형 넓이 : " + auswjr2);
		System.out.println("\n사다리꼴이 평행사변형 "+ckdl+" 보다 더 큽니다.");
		
		


	}

}
