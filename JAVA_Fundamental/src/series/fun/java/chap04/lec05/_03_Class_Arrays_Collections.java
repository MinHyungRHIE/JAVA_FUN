package series.fun.java.chap04.lec05;

import java.util.ArrayList;
import java.util.Collections;

public class _03_Class_Arrays_Collections {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		String[] arr = new String[] {"b","e","a","d","c"};
		
		for(int i = 0; i < arr.length ; i++) {
			al.add(arr[i]);
		}
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		Collections.sort(al, (o1,o2)->o2.compareTo(o1));
		System.out.println(al);
	}
}
