package Chapter09;

public class Ex07 {
  public static void main(String[] args) {
	String str = "   �ѱ�   ABCD  efgh  ";
	String[] strR;
	int i;
	/*
	str = str.trim();
	
	String result = "";

	for (i = 0; i < str.length(); i++) {
	  if (str.charAt(i) != ' ') {
		result += str.charAt(i);
	  }
	}

    System.out.println("�� ���ڿ� ==> [" + str + "]");
	System.out.println("��������  ==> [" + result + "]");
	*/
	strR = str.split(" ");
	for (i=0; i<strR.length; i++) {
	  strR[i].trim();
	  System.out.printf("%s",strR[i]);
	}
  }
}
