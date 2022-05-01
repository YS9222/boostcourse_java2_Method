class Foo{
	public static String classVar = "i class var";
	public String instanceVar = "i instance var";
	
	public static void classMethod(){
		System.out.println(classVar);
//		System.out.println(instanceVar); //Error!! 클래스 메서드에서는 인스턴스변수에는 접근불가
	}
	public void instanceMethod() {
		System.out.println(classVar);  // 인스턴스 메서드에서는 클래스 변수에 접근가능 
		System.out.println(instanceVar);
	}

}
public class StaticMethod2 {

	public static void main(String[] args) {
		System.out.println(Foo.classVar);
//		System.out.println(Foo.instanceVar); //Error 
		
		Foo.classMethod();
//		Foo.instanceMethod(); /Error 인스턴스 메서드는 클래스를 통해 접근 불가 
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar); //i class var
		System.out.println(f1.instanceVar);// i instance var
		
		f1.classVar = "changed by f1";
		System.out.println(Foo.classVar); // changed by f1
		System.out.println(f2.classVar); //changed by f1
		//클래스 변수(static)는 클래스와 인스턴스간 상호 연결되어있기 때문에 인스턴스나 클래스중 한 군데에서 변경시킨다면 모든 곳에서 변경됨(even 원래class)
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar); //changed by f1
		System.out.println(f2.instanceVar); //i instance var
		//인스턴스변수는 클래스로부터 인스턴스로 복제되어 별개로 작동하기 때문에 한곳에서 변경시킨다고 다른곳에서 변경이 안됨
	}

}
