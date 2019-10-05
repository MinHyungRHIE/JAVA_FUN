package javaFun.chapC.lecture17.usefulClasses;

import java.text.ChoiceFormat;
import java.text.MessageFormat;

public class ChoiceMessageFormat {
	public static void main(String[] args) {
		/* ChoiceFormat 사용하기
		 * ChoiceFormat은 특정 범위에 속하는 값을 문자열로 변환해준다.
		 * if문이나 switch문보다 간단하고 직관적으로 만들 수 있다.
		 */
		double[] limits = new double[] {60,70,80,90}; //반드시 오름차순이어야 한다.
		String[] grades = new String[] {"D","C","B","A"}; //limits, grades간의 순서와 개수를 맞추어야 한다.
		int[] scores = {100, 95, 88, 70, 52, 60, 72, 62};
		
		ChoiceFormat form = new ChoiceFormat(limits,grades);
		
		for(int i=0;i<scores.length;i++) {
			System.out.println(scores[i] + " : " + form.format(scores[i]));
		}
		
		System.out.println("-------------------------------------------");
		
		//String으로 패턴을 만들 수도 있는데 구분자로 '#'와 '<' 두 가지를 제공한다. (limit#value), #은 포함, <은 미포함
		String pattern = "60#D|70#C|80<B|90#A";
		int[] numbers = { 91, 90, 80 ,88, 70, 52 ,60, 62};
		
		ChoiceFormat formWithPattern = new ChoiceFormat(pattern);
		
		for(int i = 0; i < numbers.length ; i++) {
			System.out.println(numbers[i] + " : " + formWithPattern.format(numbers[i]));
		}
		
		System.out.println("-------------------------------------------");
		
		/* MessageFormat 사용하기
		 * 데이터가 들어갈 자리를 마련해 놓은 양식을 미리 작성하기
		 * 다수의 데이터를 같은 양식으로 출력할 때 좋다.
		 */
		String msg = "Name : {0} \nTel : {1} \nAge : {2}";
		
		Object[] arguments = { "RHIE", "02-1234-5678","27"};
		
		String result = MessageFormat.format(msg, arguments);
		System.out.println(result);
	}
}
