
public class AccountingMethod {
	
	public static double valueOfSupply;
	public static double vatRate;
	
	
	//직접지정하거나 위처럼 main method에서 지역변수로 지정된 것을 전역으로 선언함으로써 가져올 수 있음
	//public static double valueOfSupply = 10000.0; //직접지정하기
	
	public static double getVat() {
		return valueOfSupply * vatRate;
	}
	public static double getTotal() {
		return valueOfSupply + getVat(); //vat
	}

	public static void main(String[] args) {
		//공급가
		double valueOfSupply = 10000.0;
		//부가세율
		double vatRate = 0.1;
		
//		//부가세
//		double vat = getVat();
//		//합계
//		double total = getTotal();
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + getVat());
		System.out.println("Total : " + getTotal());
		
		//가독성, 재사용, 유지보수, 변경 (method의 장점 )
	}

}
