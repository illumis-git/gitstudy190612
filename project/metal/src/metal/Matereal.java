package metal;

public class Matereal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int WG_g = 5;
		int WG = 100;
		int G_g = 4;
		int G = 12;
		int S_g = 3;
		int S = 5;
		int Zn_g = 10;
		int Zn = 1;
		int bag_g=12;
		int result=0;
		
		result = result + (WG_g*WG);
		bag_g= bag_g-WG_g;
			if(bag_g>G_g) {
				result = result + (G_g*G);
				bag_g= bag_g-G_g;
				if(bag_g>S_g) {
					result = result + (S_g*S);
					bag_g= bag_g-S_g;
				}
				else if(bag_g>0) {
					result = result + (bag_g*S);
					bag_g = 0;
				}
			else if(bag_g>0) {
				result = result + (bag_g*G);
				bag_g = 0;
			}
		}
		System.out.printf("가방에 최대로 담을수있는 금액은 %d 원입니다.", result*1000);
	}

}
