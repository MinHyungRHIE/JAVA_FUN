package javaLec.generic;

class Juice{
	
	String status;
	
	Juice(String status){
		this.status = status;
	}

	private String getStatus() {
		return status;
	}

	private void setStatus(String status) {
		this.status = status;
	}
	
}

class Apple extends Fruit{
	
}

class Banana extends Fruit{
	
}

public class GenericClassEx04 {
	
	static Juice makeJuice(FruitBox<Fruit> box) { 
		String tmp = "";
		for(Fruit f : box.getList()) {
			tmp += f+" ";
		}
		return new Juice(tmp);
	}
	
	//오버로딩이 아니라 메서드 중복임
	//지네릭 타입은 컴파일러가 컴파일할 때만 사용하고 제거해 버린다.
	//이러한 문제를 해결하기위해 와일드 카드가 등장함
/*	static Juice makeJuice(FruitBox<Apple> box) { 
		String tmp = "";
		for(Fruit f : box.getList()) {
			tmp += f+" ";
		}
		return new Juice(tmp);
	}*/
}
