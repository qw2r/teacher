package api2;

public class System1 {
	public static void main(String[] args) {
		int tot = 0, i;
		
		System.out.println("System.exit(0) 연습");
		for(i=1; i<=100; i++) {
			tot += i;
			if(i == 5) {
				//break;
				//return;
				//System.exit(0);
			}
		}
		System.out.println("1부터" + i + "까지의 합은? " + tot);
	}
}
