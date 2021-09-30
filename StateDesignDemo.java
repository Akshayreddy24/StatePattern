
public class StateDesignDemo {
	public static void main(String[] args) {
		PhotographySchedulingContext context = new PhotographySchedulingContext();
		context.currentOrderStatusState();
		
		OrderReceivedStatus receivedStatus = new OrderReceivedStatus();
		System.out.println();
		receivedStatus.currentOrderStatus();
		
	}

}
