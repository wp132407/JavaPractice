/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

/**
 * <pre>
 * org.dimigo.collection
 *   |_MelonGenreChart
 *
 * 1. 개요 :
 * 2. 작성일 : 2015. 9. 24.
 * </pre>
 *
 * @author     : 김지원
 * @version    : 1.0
 */
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, List<Music>> map = new LinkedHashMap<>();
		List<Music> ballad = new ArrayList<Music>();
		List<Music> dance = new ArrayList<Music>();
		
		//발라드 list
		ballad.add(new Music("내 첫사랑", "베리굿"));
		ballad.add(new Music("또 다시 사랑", "임창정"));
		ballad.add(new Music("부산에 가면", "박진영"));
		
		map.put("발라드", ballad);
		
		//댄스 list
		dance.add(new Music("커피", "유재환,김예림"));
		dance.add(new Music("다 잘될거야", "쿨"));
	
		map.put("댄스", dance);
		
		// 멜론 장르별 차트
		System.out.println("-------- << 멜론 장르별 차트 >> --------");
		printMap(map);
		
		// 발라드 3위 곡 변경
		System.out.println("-------- << 발라드 3위 곡 변경 >> --------");
		ballad.set(2, new Music("지우고 지워도", "차수경"));
		map.put("발라드", ballad);
		
		printMap(map);
		
		// 발라드 1위 곡 삭제
		System.out.println("-------- << 발라드 1위 곡 삭제 >> --------");
		ballad.remove(0);
		map.put("발라드", ballad);
		
		printMap(map);
		
		// 전체 리스트 삭제
		System.out.println("-------- << 전체 리스트 삭제 >> --------");
		map.clear();
		
		printMap(map);
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()){
            System.out.println("[" + key + "]");

            for(Music list : map.get(key)) {
                System.out.println(String.format("%d. %s", map.get(key).indexOf(list) + 1, list.toString()));
            }
        }

        System.out.println();
	}


}
