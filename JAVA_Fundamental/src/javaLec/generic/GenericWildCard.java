package javaLec.generic;

/* 와일드카드 : 어떤 타입도 될 수 있다.
 * <? extends T> 와일드 카드의 상한 제한. T와 그 자손들만 가능
 * <? super T> 와일드 카드의 하한 제한, T와 그 조상들만 가능
 <? super Apple> Apple, Fruit, Object
 <? super Grape> Grape, Fruit, Object
 * <?> 제한 없음, 모든 타입이 가능 <? extends Object>와 동일
 */
public class GenericWildCard {
	
	//Fruit도 되고 Apple도 되고 Banana도 됨
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = "";
		for(Fruit f : box.getList()) {
			tmp += f;
		}
		return new Juice(tmp);
	}
}

/*
 * public static <T extends Comparable<T>> void sort(List<T> list)
 * List<T>의 요소가 Comparable 인터페이스를 구현한 것이어야 한다.
 * 
 * 
 * public static <T extends Comparable<? super T>> void sort(List<T> list)
 * 1.타입 T를 요소로 하는 List를 매개변수로 허용한다.
 * 2. T는 Comparable을 구현한 클래스어야 하며 (<T extends Comparable>), 
 *     'T'또는 그 조상의 타입을 비교하는 Comparable이어야한다는 것(Comparable<? super T>)을 의미한다.
 *		만일 T가 Student이고, Person의 자손이라면, <? super T>는 Student, Person, Object가 모두 가능하다. 
 */
