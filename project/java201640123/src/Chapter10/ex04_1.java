package Chapter10;

public class ex04_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b= 100;
		int result;
		try {
			if(b==0) {
				throw new Exception("0���� ���������? �ȵ˴ϴ�.");
			}
			if(a==0) {
				throw  new Exception("0�� ������ 0�Դϴ�.");
			}
			result = a/b;
		}catch(Exception e) {
			System.out.print("�߻� ���� ==> ");;
			System.out.println(e.getMessage());
		}
	}

}
