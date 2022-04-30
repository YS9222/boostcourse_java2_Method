
public class firstMethod {
	//method의 입력
	public static void printstringnum(String text, int num) {
		System.out.println(text + num);   //입력값을 parameter(매개변수) 라고 하며 여러개를 받을 수 있음 
	} 										 //method 안쪽으로 흘려보내느 값
	
	//method의 출력
	public static String a() {
		//... 여러 코드가 있은뒤
		return "a";  //return은 method의 결과 어떤 값을 내뱉는다는 것을 뜻하면서
	}  				//method의 종료 역할을 함(뒤에 코드를 작성해도 실행되지 않음)
			//정수를 반환하기 때문에 int
	public static int one() {
		//..
		return 1; 
	}
	
	public static String stringnum(String text, int num) {
		String out = "";
		out = out + text; 
		out = out +num;
		return out;
	}
	//위 메서드 printstringnum과 다르게 자체적으로 print기능없이 return으로 값을 반환하게 했기 때문에
	//활용도가 더 뛰어남 (파일저장, 메일전송, 데이터활용 등등등)
	
	
	
	
	public static void main(String[] args) {
					//main 이라는 이름의 method
				
		System.out.println("Hello Method");
		System.out.println(Math.floor(1.1));
						//Math class의 floor이라는 이름의 method 

						//인자(argument)  - parameter 에 대입하는 실제 값
		printstringnum("Hello", 123); //1줄짜리 코드라도 method화 하면 method 이름이 별도로 만들어지면서
		printstringnum("How are you",1564);//코드의 목적과 의미를 명확하게 할 수 있음 
		printstringnum("good", 3);   //refactorying 기능 (refactor)기능 이용해 쉽게 method 생성 가능 
		
		System.out.println(stringnum("Hello", 123));
		
		
		System.out.println(a()); //method a 의 반환값인 a를 출력함 
		System.out.println(one());
		
		
	}

	

}
