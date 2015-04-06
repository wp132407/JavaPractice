package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int distance=10;
	      String carType="고속버스";
	      int pay;
	      
	      System.out.println("<<고속도로 통행료 계산>>");
	      
	      switch(carType){
	      case "고속버스":
	         System.out.println("거리: "+ distance+"km");
	         System.out.println("차종: 고속버스");
	         pay=850;
	         {
	            if(distance<=10)
	               System.out.println("통행료: "+pay+"원");
	            else if(distance<=20)
	               System.out.println("통행료: "+(pay+300)+"원");
	            else if(distance<=30)
	               System.out.println("통행료: "+(pay+600)+"원");
	            else 
	               System.out.println("?");
	         }
	         break;
	      
	      case "경차":
	         System.out.println("거리: "+distance+"km");
	         System.out.println("차종: 경차");
	         pay=300;
	         {
	            if(distance<=10)
	               System.out.println("통행료: "+pay+"원");
	            else if(distance<=20)
	               System.out.println("통행료: "+(pay+200)+"원");
	            else if(distance<=30)
	               System.out.println("통행료: "+(pay+400)+"원");
	            else 
	               System.out.println("?");
	         }
	         break;
	         
	      default:
	         System.out.println("거리: "+distance+"km");
	         System.out.println("차종: 그 외");
	         pay=600;
	         {
	            if(distance<=10)
	               System.out.println("통행료: "+pay+"원");
	            else if(distance<=20)
	               System.out.println("통행료: "+(pay+200)+"원");
	            else if(distance<=30)
	               System.out.println("통행료: "+(pay+400)+"원");
	            else 
	               System.out.println("?");
	         }
	      }
	}
}


