package Chapter10;

public class ex04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b= 100;
		int result;
		try {
			if(b==0) {
				throw new Exception("0으로 나누려고요? 안됩니다.");
			}
			if(a==0) {
				throw  new Exception("0은 나눠도 0입니다.");
			}
			result = a/b;
		}catch(Exception e) {
			System.out.print("발생 오류 ==> ");;
			System.out.println(e.getMessage());
		}
	}

}
