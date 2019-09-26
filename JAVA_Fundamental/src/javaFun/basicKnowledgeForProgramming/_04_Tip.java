/**
 * [배열]
 * for문 대신 System클래스의 arraycopy()를 사용하면 간단하고 빠르게 배열을 복사할 수 있다.
 * 
 * [문자]
 * char배열 --> String클래스
 * String str = new String(charArr)
 * 
 * String클래스 --> char배열
 * char charArr = str.toCharArray()
 *
 *StringBuffer VS StringBuilder
 *StringBuffer은 thread safe하도록 동기화되어 있음. 그래서 성능을 떨어뜨림
 *StringBuilder은 StringBuffer에서 동기화 기능만 뺀 것
 *그러나 StringBuffer가 충분히 성능이 좋기 때문에 구지 StringBuilder을 추천하지 않는다.
 *
 *[메서드]
 *가변인자는 무조건 마지막에~
 *public PrintStream printf(String format, Object... args){...}
 *가변인자라고 인자가 필요하지 않아도 되는건 아님!
 *
 *[클래스]
 *c instanceof object
 *Vector클래스 : 동적으로 크기가 관리되는 객체배열, 내부적으로 Object타입의 배열을 가지고 있음
 *
 *clone()을 쓰기위해서는 Cloneable을 구현한 클래스어야 한다.
 *clone()은 얕은 복사이다.(원본과 복제본이 같은 객체를 공유) == shallowCopy(내부구조상 단순 clone()호출)
 *깊은 복사 : deepCopy()
 *
 *Class객체를 얻는 방법
 * : 클래스의 정보가 필요할 때, 먼저 Class객체에 대한 참조를 얻어 와야 한다.
 * 	Class cObj = new Card().getClass(); --> 생성된 객체로부터 얻는 방법
 * 	Class cObj = Card.class --> 클래스 리터럴(*.class)로 부터 얻는 방법
 * 	Class cObj = Class.forName("Card"); --> 클래스 이름으로 부터 얻는 방법
 * 
 * 객체 생성 방법
 * 	Card c = new Card(); --> new연산자를 이용해서 객체 생성
 * 	Card c = Card.newInstance(); --> Class객체를 이용해서 객체 생성
 *
 * Math클래스는 최대한의 성능을 얻기 위해 JVM이 설치된 OS의 메서드를 호출해서 사용한다.
 * 즉, OS에 의존적인 계산을 하고 있다.
 * 부동소수점 계산의 경우, 반올림의 처리방법 설정이 OS마다 다를 수 있기 때문에
 * 자바로 작성된 프로그램인데도 불구하고 컴퓨터마다 결과가 다를 수 있다.
 * 
 * 이러한 차이를 없애기 위해 성능은 다소 포기한 대신, 어떤 OS에서 실행되어도 항상 같은 결과를 얻도록
 * Math클래스를 새로 작성한 것이 StrictMath클래스이다.
 * 
 * Wrapper 클래스
 * Boolean , Character, Number(Long, Integer ...)
 * 
 * Random클래스
 * 생성자 Random()은 종자값을 System.currentTimeMillis()로 하기 때문에 실행할 때마다 얻는 난수가 다름
 * 
 *[인터페이스]
 *모든 멤버변수는 public static final 이어야 하며, 이를 생략할 수 있다.
 *모든 메서드는 public abstract 이어야 하며, 이를 생략할 수 있다.
 *그러나 JDK 1.8부터 static 메서드와 디폴트 메서드는 예외
 *
 *[정규표현식]
 *java.util.regex
 *텍스트 데이터 중에서 원하는 조건(Pattern클래스)과 일치하는 문자열을 찾아 내기
 *원래 Unix에서 사용하던 것이고 Perl의 강력한 기능이었는데 요즘은 Java를 비롯해 다양한 언어에서 지원함
 *	사용순서
 *		String str + Pattern p = Pattern.compile(정규표현식) 
 *			--> Matcher m = p.Matcher(str) --> m.matches, return boolean
 *		Matcher의 주요 메서드 : find(), group(), start(), end(), appendReplacement()
 */
/**
 * @author RHIE
 *
 */
package javaFun.basicKnowledgeForProgramming;
