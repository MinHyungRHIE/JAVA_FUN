package series.fun.java.chap5_streamAndFileIO.A_stream;

import java.util.Arrays;
import java.util.stream.Stream;

/* 스트림 중간연산 */
public class _02_Middle_Operate_Stream {
	public static void main(String[] args) {
		/*** 스트림 자르기 : skip, limit ***/
//		IntStream.rangeClosed(0, 10).skip(3).limit(5).forEach(System.out::println);
		
		/*** 스트림 요소 걸러내기 : filter, distinct***/
//		IntStream.of(1,2,2,3,3,3,4,5,5,6).distinct().forEach(System.out::println);
//		IntStream.rangeClosed(0, 10).filter(i -> i%2==0).filter(i -> i%3==0).forEach(System.out::println);
		
		/*** 스트림 정렬 : sorted, comparing, thenComparing, (comparingInt) ***/
//		studentStream.sorted(Comparator.comparing(Student::getClass)
//																			.thenComparing(Student::getTotalScore)
//																			.thenComparing(Student::getName)).forEach(System.out::println);
		/*** 스트림 조회 : peek ***/
		//연산과 연산 사이에 올바르게 처리되었는지 확인할 수 있음.
		//스트림 요소가 소모되지 않는다.
		
		/*** 스트림 변환 : map, (mapToInt), flatMap***/
		//스트림의 요소에 저장된 값 중에서 원하는 필드만 뽑아내거나 특정 형태로 변환해야 할 때
		//map도 filter처럼 하나의 스트림에서 여러 번 적용 가능하다.
		//flatMap : Stream<T[]> --> Stream<T>
		Stream<String[]> strArrStrm = Stream.of(
				new String[] {"1","2","3"},
				new String[] {"a","b","c"});
		//문제 : 스트림 요소 String[]을 T로 변환해야 하니 map()을 쓰고, 배열은 해결됬으나 스트림 안에 스트림이 또 생겨버림 
		Stream<Stream<String>> strStrStrm = strArrStrm.map(Arrays::stream);
		//해결 : flatMap을 쓰면 된다.
		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		/*** summaryStatistics() ***/
		//sum(), average(), max(), min()과 같은 것은 최종연산이기 때문에 스트림이 닫혀버림
		//스트림을 또 생성해야 한다는 불편함이 생김
//		IntSummaryStatistics stat = IntStream.rangeClosed(0, 10).summaryStatistics();
//		long count = stat.getCount();
//		long sum = stat.getSum();
//		double avg = stat.getAverage();
		
		/*** Optional<T> ***/
		//최종 연산의 결과를 그냥 반환하는 게 아니라 Optional객체에 담아서 반환
		//nullPointerException 방지
		//객체 생성시 null일 가능성이 있으면 of() 대신 ofNullable()을 사용, of()는 매개변수가 null이면 nullPointerException이 발생
		//empty() : 초기화 | get() : 저장된 값 가져오기 | orElse() : get()이 null일 경우를 대비, 변형 형태로는 orElseGet, orElseThrow
		//isPresent() : Optional값이 null이면 false, 아니면 true
		
	}
}
