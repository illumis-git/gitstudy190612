
public class Ex03_12 {

  public static void main(String[] args) {
		// TODO Auto-generated method stub
    char a,b,c,d,e;
    
    a='#';
    System.out.printf("%c \t", a);
    System.out.printf("%d \n", (int)a);
    
    b='a';
    System.out.printf("%c\t", b);
    
    
    /**for(int i=0; i<50; i++) {**/
    	c=(char)(b+1);
      System.out.printf("%c\n", c);
      /**}**/
    
    d =0xF90B;
    System.out.printf("%c\n", d);
    
    d='°¡';
    
    System.out.printf("%d\t", (int)d);
    e=(char)(d+2);
    System.out.printf("%c\n", e);
    
    for(int i=0; i<100; i++) {
    	e=(char)(d+i);
        System.out.printf("%c ", e);
  }
    }

}
