package tmp;

import java.text.ChoiceFormat;
import java.text.MessageFormat;

public class ChoiceMessageFormat {
	public static void main(String[] args) {
		/* ChoiceFormat ?��?��?���?
		 * ChoiceFormat?? ?��?�� 범위?�� ?��?��?�� 값을 문자?���? �??��?���??��.
		 * if문이?�� switch문보?�� 간단?���? 직�??��?���? 만들 ?�� ?��?��.
		 */
		double[] limits = new double[] {60,70,80,90}; //반드?�� ?��름차?��?��?��?�� ?��?��.
		String[] grades = new String[] {"D","C","B","A"}; //limits, grades간의 ?��?��?? 개수�? 맞추?��?�� ?��?��.
		int[] scores = {100, 95, 88, 70, 52, 60, 72, 62};
		
		ChoiceFormat form = new ChoiceFormat(limits,grades);
		
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i] + " : " + form.format(scores[i]));
		}
		
		System.out.println("-------------------------------------------");
		
		//String?���? ?��?��?�� 만들 ?��?�� ?��?��?�� 구분?���? '#'?? '<' ?�� �?�?�? ?��공한?��. (limit#value), #?? ?��?��, <?? 미포?��
		String pattern = "60#D|70#C|80<B|90#A";
		int[] numbers = { 91, 90, 80 ,88, 70, 52 ,60, 62};
		
		ChoiceFormat formWithPattern = new ChoiceFormat(pattern);
		
		for(int i = 0; i < numbers.length ; i++) {
			System.out.println(numbers[i] + " : " + formWithPattern.format(numbers[i]));
		}
		
		System.out.println("-------------------------------------------");
		
		/* MessageFormat ?��?��?���?
		 * ?��?��?���? ?��?���? ?��리�?? 마련?�� ?��?? ?��?��?�� 미리 ?��?��?���?
		 * ?��?��?�� ?��?��?���? 같�? ?��?��?���? 출력?�� ?�� 좋다.
		 */
		String msg = "Name : {0} \nTel : {1} \nAge : {2}";
		
		Object[] arguments = { "RHIE", "02-1234-5678","27"};
		
		String result = MessageFormat.format(msg, arguments);
		System.out.println(result);
	}
}
