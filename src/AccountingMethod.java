class Accounting {
	public double valueOfSupply;
	public  double vatRate; //컴퓨터 자원절약 위해 공통사용되는 경우 class소속으로 둔다
	
	public Accounting(double valueOfSupply, double vatRate) {
		this.valueOfSupply = valueOfSupply;
		this.vatRate = vatRate;
	}
	//직접지정하거나 위처럼 main method에서 지역변수로 지정된 것을 전역으로 선언함으로써 가져올 수 있음
	//public static double valueOfSupply = 10000.0; //직접지정하기
	
	public double getVat() {
		return this.valueOfSupply * vatRate;
	}
	public double getTotal() {
		return valueOfSupply + getVat(); //vat
	}
	
}
public class AccountingMethod {
	
	

	public static void main(String[] args) {
		
		Accounting A1 = new Accounting(25485.5, 0.1);
		System.out.println(A1.getVat()); //vatRate 0.1
		System.out.println(A1.getTotal()); 
		
		
		Accounting A2 = new Accounting(156586.8, 0.2);
		
		System.out.println(A2.getVat()); 
		System.out.println(A2.getTotal()); 
		
		A2.vatRate = 0.3;  //이 아래 코드부터는 A2의 vatRate는 0.3 
		System.out.println(A2.getVat()); //vatRate 0.3
		
		
//		Accounting.valueOfSupply = 10000.0;
//
//		System.out.println("Value of supply : " + Accounting.valueOfSupply);
//		System.out.println("VAT : " + Accounting.getVat());
//		System.out.println("Total : " + Accounting.getTotal());
//		
		//가독성, 재사용, 유지보수, 변경 (method의 장점 )
	}

}
