/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_Rectangle
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 8. 12.
 * </pre>
 *
 * @author     : Admin
 * @version    : 1.0
 */
public class Rectangle extends Figure {
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int centerX, int centerY, int width, int height){
		super(centerX, centerY);
		this.height = height;
		this.width = width;
	}
	
	protected double calcArea() {
		return width * height;
	}
	
	protected void printCenter() {
		System.out.print("사각형");
		super.printCenter();
	}
}
