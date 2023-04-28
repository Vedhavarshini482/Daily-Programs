
public class Program17 {

	public static void main(String[] args) {
		System.out.println(new Program17().findDelayedArrivalTime(15, 5));
	}

	public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
//		int arrivalAtStation = arrivalTime+delayedTime;
//		if(arrivalAtStation>=24)
//			arrivalAtStation=arrivalAtStation-24;
//		return arrivalAtStation;
		
		return (arrivalTime+delayedTime)%24;
	}
}