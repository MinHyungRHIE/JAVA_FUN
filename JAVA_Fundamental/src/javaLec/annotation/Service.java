import java.lang.reflect.Method;

public class Service {
	
	@ PrintAnnotation //value="-", number=15
	public void method1() {
		System.out.println("실행 내용1");
	}
	@ PrintAnnotation("*") //value="*", number=15
	public void method2() {
		System.out.println("실행 내용2");
	}
	@ PrintAnnotation(value="#",number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}
	
	public static void main(String[] args) {
		Method[] dMethods = Service.class.getDeclaredMethods();
		//메서드에 어노테이션 적용되어 있니?
		for(Method method : dMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				//PrintAnnotation 객체 얻기
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);
				
				//정보출력
				//해당 메서드 이름 출력
				System.out.println("["+method.getName()+"]");
				//구분선 출력
				for(int i = 0; i < printAnnotation.number();i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				//메서드 호출
				try {
					method.invoke(new Service());
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
