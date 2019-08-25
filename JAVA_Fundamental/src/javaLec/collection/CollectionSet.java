package javaLec.collection;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
	
	public static void main(String[] args) {
		//Set의 대표적인 컬렉션 = HashSet
		Lion lion = new Lion("사자"); 
		Monkey monkey = new Monkey("원숭이");
		Eagle eagle = new Eagle("독수리");
		
		Set<Animal> animalSet = new HashSet<Animal>();
		animalSet.add(lion);
		animalSet.add(monkey);
		animalSet.add(eagle);
		
		for(Animal lookingAnimal : animalSet) {
			System.out.println(lookingAnimal.getAnimalName());
		}
		//저장된 순서대로 출력되지 않은 것을 볼 수 있다.
		//ArrayList는 저장한 순서대로 인덱스(0,1,2,3...)로 저장하지만
		//HashSet은 해쉬값으로 저장하기 때문에 저장한 순서대로 나오지 않는다.
		//정렬을 하고 싶을 때는 ArrayList가 낫다
	}
}
