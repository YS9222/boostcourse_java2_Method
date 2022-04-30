//method 정의시 static이 포함된다면 해당method는 클래스의 소속
//static이 포함되지 않다면 해당 method는 그 method를 복사한 instance의 소속임  



class print{
	public String delimeter;
	public void a() {
		System.out.println(this.delimeter);
		System.out.println("a");
		System.out.println("a");
	}
	
	
	public static void b(String delimeter) {
		System.out.println(delimeter);
		System.out.println("b");
		System.out.println("b");
	}
}

public class StaticMethod {
	
	public static void main(String[] args) {
		//print.a("-"); 
		//print.b("@"); //delimeter가 class의 소속으로 실행
		//다양하고 많은 인자값을 집어넣어야하는 상황이라면 instance를 쓰게 될 것
		
		print t1 = new print();
		t1.delimeter = "-"; //t1이라는 인스턴스 내부에서의 delimeter는 "-"로 공유됨
		t1.a(); //a라는 method가 instance소속일때는 원클래스에서 static을 제외해야 
	 //이제	
     //print.a("-") //일 경우 실행이 안됨 (static이 없어진 a라는 method가 class가 아니라 instance 소속이기때문)
		
		
		print.b("@"); //b라는 method가 class소속일때는 원클래스에서 static이 있어야
	}
}

//하나의 클래스로부터 여러개의 instance를 생성하여 사용할 때, 각 instance에서 공통적으로 같은 것을 공유할 때는 static 매소드가 필요할 것 같다.
//
//
//
//차(car)를 예로 든다면 각각의 차 instance는 모델명, 색상, 브랜드가 다르겠지만 '시동걸기', '전진', '후진'은 공통적으로 갖는 행동이므로 이것들은 static 매소드로 활용할 수 있다.
//맞나?

