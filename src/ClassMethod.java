class Print1{ //클래스 Print1의 멤버는 delimeter, A, B임 
	public String delimeter = "a"; //class에서 변수를 정의하더라도 사용하는 class(main)에서 새로 정의하면 그게 우선 

	public Print1(String delimeter) { //생성자 통해 instance 생성시 같은 이름의 class보다 해당 method를 우선하게 함
								//생성자에서 delimeter를 입력받게 함으로써 instance 생성시 바로 delimeter를 입력할 수 있게 함(초기작업필요시)
		this.delimeter = delimeter; //this.이란 클래스가 인스턴스화 되었을때 this.delimeter가  
								    //instance의 delimeter(위의 public string delimeter)를 지칭하게 함
									//method의 지역변수 delimeter와 인스턴스변수인 delimeter를 구분하기 위한 방법.
	}								//이 상태에서 this.이 없다면 delimeter는 생성자 내부에서만 돌게됨
									
	
	public void B() {
		System.out.println(this.delimeter); //마찬가지로 생성되는 인스턴스의 delimeter인 위의 public string delimeter을 지칭하게 함
		System.out.println("B");
		System.out.println("B");
	}

	public void A() {
		System.out.println(this.delimeter);
		System.out.println("A");
		System.out.println("A");
	}
	
}
public class ClassMethod {

	public static void main(String[] args) {
		
//		Print1.delimeter = "---"; //다른클래스라도 이와같은 방법으로 입력값을 전할 수 있음 
//		Print1.A();
//		Print1.A();
//		Print1.B();
//		Print1.B();
//
//		Print1.delimeter = "@@@";
//		Print1.A();
//		Print1.A();
//		Print1.B();
//		Print1.B();
		//instance
//		Print1 p1 = new Print1(); //클래스도 method와 마찬가지 방법으로 instance화 가능 
//		p1.delimeter = "$$$$"; //다만, class를 인스턴스화 한다면 이렇게 인스턴스 생성이후 따로 값을 지정해야함
//		p1.A(); 				//instance 생성하면서 지정하게 하기 위해서는 class에서 생성자를 통해 할 수 있음
//		p1.B();
//		
//		Print1 p2 = new Print1(); 
//		p2.delimeter = "----";
//		p2.A();
//	
//		
//		p1.A(); //한번 인스턴스화해서 입력값을 지정하면 이후 중복코드넣을 필요없이 사용가능 
//		p2.B();
//		p2.A();
//		
		//생성자
		Print1 p1 = new Print1("$$$$"); //클래스도 method와 마찬가지 방법으로 instance화 가능 
								//다만, class를 인스턴스화 한다면 이렇게 인스턴스 생성이후 따로 값을 지정해야함
		p1.A(); 				//instance 생성하면서 지정하게 하기 위해서는 class에서 생성자를 통해 할 수 있음
		p1.B();					//생성자는 class이름과 같은 이름의 method를 안에서 정의 
		
	}

	//!!!parameter와 인자를 통해 받아서 쓰는 방법도 있지만 이와같이 main에서 직접 정의한 요소를 받아서 쓰는방법도 있음
//	public static void PrintA() {
//		System.out.println(delimeter);
//		System.out.println(A);
//		System.out.println(A);
//	}
}
