package intro;

public class RecapDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] myList = {7.5,3.9,3.7,2.1};
		double sub = 0;
		double max = 0;
		
		for(double i : myList) {
			System.out.println(i);
			sub+=i;
			if(max < i) {
				max = i;
			}
			
		}
		System.out.println(sub + "   " + max);
	}

}
