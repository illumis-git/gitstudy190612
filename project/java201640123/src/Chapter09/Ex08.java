package Chapter09;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str1 = "Java Programming";
	      String str2 = "Java IT CookBook";
	      
	      System.out.println("원 문자열1 ==> [" + str1 + "]");
	      System.out.println("원 문자열2 ==> [" + str2 + "]");
	      
	      System.out.println(str1.compareTo(str2));
	      System.out.println();
	      System.out.println(str1.contains("Java"));//해당문자열에서 Java를찾아 있으면TRUE
	}

}
