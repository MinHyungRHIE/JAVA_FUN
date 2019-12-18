package series.fun.java.chap04.lec05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

//Comparable : 기본 정렬기준을 구현하는데 사용
class BBB implements Comparable<BBB>{
	String username;
	int age;
	String address;

	BBB(String username, int age, String address){
		this.username = username;
		this.age = age;
		this.address = address;
	}

	public void printInfo() {
		System.out.println("username : " + username + "\nage : " +age + "\naddress : " + address);
	}

	@Override
	public int compareTo(BBB o) {
		if(this.age > o.age) {
			return -1;
		}else if(this.age < o.age) {
			return 1;
		}else{
			return 0;
		}
	}

}

public class _05_Class_Sorting {
	
	public static void main(String[] args) {
		BBB b1 = new BBB("Dana", 26,"Busan");
		BBB b2 = new BBB("Isabel", 15,"Seoul");
		BBB b3 = new BBB("Lucy", 32,"Daejeon");
		BBB b4 = new BBB("Alice", 21,"Gyeonggido");

		ArrayList<BBB> bVolume = new ArrayList<BBB>();
		bVolume.add(b1);
		bVolume.add(b2);
		bVolume.add(b3);
		bVolume.add(b4);


		Iterator<BBB> bitr = bVolume.iterator();
		while(bitr.hasNext()) {
			bitr.next().printInfo();
			System.out.println("==========");
		}

		Collections.sort(bVolume);
		System.out.println("\n\n\n@@@@@@@@@@\n\n\n");

		bitr = bVolume.iterator();
		while(bitr.hasNext()) {
			bitr.next().printInfo();
			System.out.println("==========");
		}
	}
}
