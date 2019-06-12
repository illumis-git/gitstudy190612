package Chapter11;

public class ex29_30_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pet myPet1 = new Pet("강아지", "움직", 8);
		Pet myPet2 = new Pet("고양이", "움직", 13);
		
		System.out.println(myPet1.getName()+"가"+myPet1.getAction()+"입니다.");
		System.out.println(myPet2.getName()+"가"+myPet2.getAction()+"입니다.");
		System.out.println(myPet1.getName()+"는"+myPet1.getAge()+"개월입니다.");
		System.out.println(myPet2.getName()+"는"+myPet2.getAge()+"개월입니다.");
		System.out.println("현재 우리집 애완동물 수는 "+Pet.getCount()+"마리입니다.");
	}

}

class Pet{
	
	private String name;
	private String action;
	private int age;
	private static int count = 0;
	
	Pet(String name, String action, int age){
		this.name = name;
		this.action = action;
		this.age = age;
		count++;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	public String getAction() {
		return this.action;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public static int getCount() {
		return count;
	}
	
}
