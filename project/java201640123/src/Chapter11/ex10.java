package Chapter11;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		System.out.println("현재 생산된 자동차 숫자 ==>" + myCar1.count);
		
		Car myCar2 = new Car();
		System.out.println("현재 생산된 자동차 숫자 ==>" + myCar2.count);
		
		Car myCar3 = new Car();
		System.out.println("현재 생산된 자동차 숫자 ==>" + Car.count);
				
	}

}
