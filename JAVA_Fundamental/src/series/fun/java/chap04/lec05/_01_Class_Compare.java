package series.fun.java.chap04.lec05;

//클래스를 비교를 할 때는 무엇을 기준으로 비교할 것인지 난감하다.
//이 때 Object 클래스의 equals()를 오버라이딩해서 비교 기준을 만든다.
class A{
	int age;
	int grade;
	
	A(int age, int grade){
		this.age = age;
		this.grade = grade;
	}

	@Override
	public boolean equals(Object obj) {
		A tmp = (A)obj;
		return this.age == tmp.age;
	}
}

public class _01_Class_Compare {
	public static void main(String[] args) {
		A a1 = new A(10,20);
		A a2 = new A(10,30);
		System.out.println(a1.equals(a2));
	}
}
