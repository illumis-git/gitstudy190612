package Chapter12;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sedan sedan1 = new Sedan("여기요~~");
	}

}

class Car {
	Car(){
		System.out.println("슈퍼 클래스 생성자 호출(파라메터 없음)");
	}
	
	Car(String str){
		System.out.println("슈퍼 클래스 생성자 호출 ==> " + str);
	}
}

class Sedan extends Car{
	Sedan(String str){
		super(str);
		System.out.println("서브 클래스 생성자 호출 ==> " + str);
	}
}