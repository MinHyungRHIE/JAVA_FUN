package series.fun.java.chap04.lec05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class AAA{
	String username;
	int age;
	String address;

	AAA(String username, int age, String address){
		this.username = username;
		this.age = age;
		this.address = address;
	}

	public void printInfo() {
		System.out.println("username : " + username + "\nage : " +age + "\naddress : " + address);
	}

}

//Comparator : 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용
class MyComparator implements Comparator<AAA>{

	@Override
	public int compare(AAA o1, AAA o2) {
		return o1.username.compareTo(o2.username);
	}

}

public class _04_Class_Sorting {
	public static void main(String[] args) {
		ArrayList<AAA> aVolume = new ArrayList<AAA>();
		aVolume.add(new AAA("Dana", 26,"Busan"));
		aVolume.add(new AAA("Isabel", 15,"Seoul"));
		aVolume.add(new AAA("Lucy", 32,"Daejeon"));
		aVolume.add(new AAA("Alice", 21,"Gyeonggido"));
		
		Iterator<AAA> itr = aVolume.iterator();
		while(itr.hasNext()) {
			itr.next().printInfo();
			System.out.println("==========");
		}
		
//		Collections.sort(aVolume); //Error! 무엇을 기준으로 정렬해야 할지 모름
		Collections.sort(aVolume, new MyComparator());
		System.out.println("\n\n\n@@@@@@@@@@\n\n\n");
		
		itr = aVolume.iterator();
		while(itr.hasNext()) {
			itr.next().printInfo();
			System.out.println("==========");
		}
		
		
	}
}
