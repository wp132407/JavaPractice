/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_FamilyMember
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 6. 15.
 * </pre>
 *
 * @author     : Admit
 * @version    : 1.0
 */
public class FamilyMember {

	private static int memberCnt = 0;
	private String memberName;
	
	public FamilyMember(String memberName) {
		memberCnt++;
		this.memberName = memberName;
	}
	
	public String getMemberName() {
		return memberName;
	}
	
	public void printMemberCnt() {
		System.out.println("가족 총 인원수 : "+memberCnt+"명");
	}

	

}
