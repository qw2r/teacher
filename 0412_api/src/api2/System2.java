package api2;

public class System2 {
	public static void main(String[] args) {
		
		long tot=0;
		
		long time1 = System.nanoTime();
		for(long i=0; i<100000000; i++) {
			tot += i;
		}
		long time2 = System.nanoTime();
		
		System.out.println("1~ 100000000의 합? " + tot);
		
		System.out.println("계산에 소모된 시간은? " + (double)(time2 - time1)/1000000000 + "초");
	}
}
