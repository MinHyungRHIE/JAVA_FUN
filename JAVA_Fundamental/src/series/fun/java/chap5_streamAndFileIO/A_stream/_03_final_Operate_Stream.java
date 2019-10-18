package series.fun.java.chap5_streamAndFileIO.A_stream;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/* 스트림 최종연산 */
public class _03_final_Operate_Stream {
	public static void main(String[] args) {
		/*** forEach ***/
		//스트림 요소 출력
		
		/*** 조건 검사 : allMatch, anyMatch, noneMatch, findFirst, findAny ***/
		//매개변수 : Predicate, 연산결과 : boolean
		
		/*** 통계 : count(), sum(), average(), max(), min() ***/
		
		/*** 리듀싱 : reduce() ***/
		//스트림 요소를 줄여나가면서 연산을 수행하고 최종결과를 반환
		//매개변수 타입이 BinaryOperator인 것을 보고 알 수 있 듯, 처음 두 요소를 가지고 먼저 연산한 후, 그 다음 요소와 연산한다.
		//초기값도 가질 수 있음 : identity
//		int max = IntStream.rangeClosed(0, 5).reduce(10, (a,b) -> a > b ? a: b); //10
		
		/*** 스트림 요소를 수집하는 방법을 정의 : collect() ***/
		//collect() : 스트림의 최종연산, 매개변수로 Collector를 필요로 한다.
		//Collector : 인터페이스, 컬렉터는 이 인터페이스를 구현해야 한다.
		//Collectors : 클래스, static메서드로 미리 작성된 컬렉터를 제공한다.
		
		//collect를 이용해서 통계, 리듀싱 등 가능
		long count = Stream.of(10,20,30,40).collect(Collectors.counting()); 

		// 문자열 결함 : joining() 
		//CharSequence의 자손인 경우에만 가능하므로 스트림 요소가 문자열이 아니면 map()을 이용해서 변환해야함
		Stream<String> strStrm = Stream.of("안","녕","하","세","요");
		String result = strStrm.collect(Collectors.joining(",","{","}"));
		System.out.println(result);
		
		//collect()를 쓰는 이유 : groupingBy(), partitioningBy()
		//groupingBy()는 Function으로 partitioningBy()는 Predicate로 분류한다. 결론적으론 동일
		//partitioningBy()가 더 빠르다.
		
	}
}
