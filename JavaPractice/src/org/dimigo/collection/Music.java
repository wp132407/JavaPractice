/**
 * <pre>
 * org.dimigo.collection
 *   |_Music
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 24.
 * </pre>
 *
 * @author     : 김지원
 * @version    : 1.0
 */

package org.dimigo.collection;

public class Music {
	private String title;
	private String singer;
	
	public Music() {
		// TODO Auto-generated constructor stub
	}
	
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return "Music [title="+title+", singer="+singer+"]";
	}
	
}