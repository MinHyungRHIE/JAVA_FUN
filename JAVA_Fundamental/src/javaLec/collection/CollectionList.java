package javaLec.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionList {
	public static void main(String[] args) {
		
		Animal[] aniArr = new Animal[2];
		aniArr[0] = new Lion("사자");
		aniArr[1] = new Lion("원숭이");
//		aniArr[2] = new Lion("독수리"); 못들어감
		
		//List의 대표적인 컬렉션 = ArrayList, LinkedList
		//List를 쓸 때 거의 대부분 ArrayList를 쓴다.
		Lion lion = new Lion("사자"); 
		Monkey monkey = new Monkey("원숭이");
		Eagle eagle = new Eagle("독수리");
		
		List<Animal> animalList = new ArrayList<Animal>();
		animalList.add(lion);
		animalList.add(monkey);
		animalList.add(eagle);
		
		for(Animal lookingAnimal : animalList) {
			System.out.println(lookingAnimal.getAnimalName());
		}
		System.out.println("================================");
		//Iterator
		Iterator<Animal> itr = animalList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getAnimalName());
		}
		
		/*
		 * ArrayList의 단점
		 * 
		 * 자료를 찾을 때, 첫번째 index부터 모두 뒤져야함
		 */
	}
}
