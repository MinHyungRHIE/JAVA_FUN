package series.fun.java.chap5_streamAndFileIO.A_stream;

import java.util.Arrays;
import java.util.function.ToIntFunction;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _01_StreamFunction {
	/*
	 * 여태까지 여러 많은 데이터를 for문과 iterator 등을 통해서 처리하였는데,
	 * 이렇게 되면 코드가 길어지고 재사용성이 낮아진다.
	 * Java의 Stream을 사용하면 복잡한 작업들과 긴 소스들을 간단하게 하고 재사용성을 높일 수 있다. 
	 */
	public static void main(String[] args) {
		/*** 스트림 연산(중간연산 + 최종연산) ***/
		//최종 연산이 수행되기 전까지는 중간연산이 수행되지 않는다.
		//최종 연산이 수행되어야 비로소 스트림의 요소들이 중간 연산을 거쳐 최종 연산에서 소모된다.
		//모든 스트림은 기본적으로 sequential()을 호출한다. 즉, 병렬이 아니다.
		//병렬로 처리하고 싶으면 parallel()을 추가한다.
		
		/*** 오토박싱&언박싱의 비효율 ***/
		//스트림은 기본적으로 Stream<T> 그러나 오토박싱&언박싱으로 인한 비효율성과 지연 증가
		//그래서 기본형으로 다룰 수 있게 IntStream 등으로 long, double들을 다룰 수 있게 만들었다.
		//더군다나 이런 클래스들에 각 기본형에 따라 유용한 메서드도 추가되어 있다.
		
		/*** 컬렉션 ***/
		//Stream<T> Collection.stream() : 스트림 반환 
		//intStream.forEash(System.out::println) : 스트림의 요소를 소모하며 요소를 출력
		
		/*** 배열 ***/
		//Stream.of(배열)
		//Arrays.stream(배열)
		//Arrays.stream(배열, startIndex, endIndex)
		//위에 메서드들은 모두 Stream<T>을 반환한다.
		
		/*** 특정 범위 정수 ***/
		//IntStream.range(int begin, int end) : end 미포함
		//IntStream.rangeClosed(int begin, int end) : end 포함
		
		/*** 임의의 수 ***/
		//IntStream ints() : 해당 타입의 난수들로 이루어진 스트림을 반환
//		IntStream intStream = new Random().ints();
//		intStream.limit(5).forEach(System.out::println);
		//or : IntStream intStream = new Random().ints(5);
		//ints(int begin, int end) : end 미포함
		
		/*** iterate(), generate() ***/
		//static <T> Stream<T> iterate(T seed, UnaryOperator<T> f)
//		Stream<Integer> evenStream = Stream.iterate(0, n->n+2); 
		//seed=0 >>> return n+2 >>> seed=2(리턴값) >>> return n+2 >>> seed=4(리턴값) >>>... 
//		evenStream.limit(10).forEach(System.out::println);
		//static <T> Stream<T> generate(Supplier<T> s)
		
		/*** Stream<Integer> <---> IntStream ***/
		/*IntStream --> Stream<Integer>*/
//		Stream<Integer> stream = evenStream.boxed();
		/*Stream<Integer> --> IntStream*/
//		IntStream evenStream = Stream.iterate(0,n->n+2).mapToInt(Integer::valueOf);
		
		/*** 카운트 ***/
//		long count = stream.count();
		/*** 두 스트림의 연결 ***/
//		String[] strArr1 = {"1","2","3"};
//		String[] strArr2 = {"a","b","c"};
//		Stream<String> streamA = Stream.of(strArr1);
//		Stream<String> streamB = Arrays.stream(strArr2);
//		Stream<String> combine = Stream.concat(streamA, streamB);
		
	}
}
