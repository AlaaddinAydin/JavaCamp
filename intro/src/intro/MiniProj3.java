package intro;

public class MiniProj3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nubs = {1,2,3,4,5,6,7,8,31,10};
		int nub = 31;
		boolean exist = false;
		
		for(int search : nubs) {
			if(nub == search) {
				exist = true;
			}
		}
		
		if(exist) {
			System.out.println("var");
		}else {
			System.out.println("yok");
		}
	}

}
