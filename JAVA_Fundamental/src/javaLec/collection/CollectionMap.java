package javaLec.collection;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionMap {
	
	public static void main(String[] args) {
		//Map의 대표적인 컬렉션 = HashMap, HashTable
		//HashMap과 HashTable의 차이점
		//기능은 똑같음
		//HashMap(비동기) : unsynchronized -> 싱글 Thread에 적합
		//Hashtable(동기) : synchronized -> 멀티 Thread에 적합
		//속도 비교상 당연 unsynchronized한 HashMap이 빠르다.
		
		Map<String, Animal> animalMap = new Hashtable<String, Animal>();
		Lion lion = new Lion("사자"); 
		Monkey monkey = new Monkey("원숭이");
		Eagle eagle = new Eagle("독수리");
		
		animalMap.put("L", lion);
		animalMap.put("M", monkey);
		animalMap.put("E", eagle);
		
		Set<Entry<String, Animal>> entries = animalMap.entrySet();
		for(Entry<String, Animal> entry : entries) {
			System.out.println(entry.getKey() + " : " + entry.getValue().getAnimalName());
		}
	}

}
