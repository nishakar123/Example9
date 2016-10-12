
public class Subtract {

	public static void main(String[] args) {
		int sum=100;
		for (int i = 0; i < 100; i++) {
			sum-=1;
			if(sum==50)
				break;
		}
		System.out.println(sum);
		System.out.println("Main End");
	}

}
