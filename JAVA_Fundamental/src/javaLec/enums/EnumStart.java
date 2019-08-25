package javaLec.enums;

//JAVA 1.5?�� 추�?

enum Number{
	ONE, TWO, THREE, FOUR
}

enum Starcraft{
	MARINE, GHOST, SCV
}

public class EnumStart {
	public static void main(String[] args) {
		System.out.println(Number.ONE==Number.ONE);
		System.out.println(Number.ONE==Number.TWO);
		
		//System.out.println(Number.ONE == Starcraft.MARINE);
		
		Number[] nArr = Number.values(); //enum Number ?��?�� ?��?�� ?��?�� ?���?
		
		for(Number n : nArr) {
			System.out.println(n.name() + " : " +n.ordinal());
		}
		
		Starcraft[] sArr = Starcraft.values();
		
		for(Starcraft s : sArr) {
			System.out.println(s.name() + " : " +s.ordinal());
		}
	}
}
