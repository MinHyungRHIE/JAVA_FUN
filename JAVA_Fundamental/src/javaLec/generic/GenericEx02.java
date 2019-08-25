package javaLec.generic;

/* T, E, K, V에 대해서
 * 사실 어떤 이름을 넣어도 상관이 없음 ex) ddd, A ...
 * 그러나 관행적으로 요소이름은 저 이름들을 사용한다.
 * T : class type을 정할때 
 * E : 배열 등
 * K, V : key-value로 이루어 질 때
 */

//class Zoo<T>{
//	T animal;
//	
//	void setAnimal(T animal) {
//		this.animal = animal;
//	}
//	
//	T getAnimal() {
//		return this.animal;
//	}
//}

class Zoo<T extends Animal>{
	T animal;
	
	void setAnimal(T animal) {
		this.animal = animal;
	}
	
	T getAnimal() {
		return this.animal;
	}
}

class Lion extends Animal implements Act{

	@Override
	public void sound() {
		System.out.println("어흥");
	}
	
}

public class GenericEx02 {
	public static void main(String[] args) {
		//T 요소에 제한이 없음
		Box<Animal> animalBox = new Box<Animal>();
		Box<Fruit> fruitBox = new Box<Fruit>();
		
		Zoo<Animal> zoo = new Zoo<Animal>();
//		Zoo<Fruit> fruitZoo = new Zoo<Fruit>(); 이상함
		
		//그래서 나온게 <? extends T>  ... 여기서 ?는 '와일드 카드'임
		//Zoo<T extends Animal>로 선언한 이후
//		Zoo<Fruit> zoo = new Zoo<Fruit>(); 에러
		Zoo<Lion> zoo_lion = new Zoo<Lion>();
		zoo_lion.setAnimal(new Lion());
		zoo_lion.getAnimal().sound();
		
	}
}
