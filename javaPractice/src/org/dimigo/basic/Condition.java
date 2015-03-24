package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance =50;
		String car = "고속버스";
		int tax = 0;
		
		switch (car) {
		case "고속버스" :
			if(distance <=10){
				tax = 850;
			}
			else if(distance <=20){
				tax = 1150;
			}
			else if(distance <=30){
				tax = 1450;
			}
			else {
				tax = 850 + ((distance-10)/10) * 300;
			}
			break;
		case "경차" :
			if(distance <=10){
				tax = 300;
			}
			else if(distance <=20){
				tax = 500;
			}
			else{
				tax = 700;
			}
			break;
		}
			
			System.out.println("<< 고속도로 통행료 계산 >>");
			System.out.println("거리 :" + distance + "km");
			System.out.println("차량 :" + car);
			System.out.println("통행료 :" + tax + "원");
		
		}

	}

