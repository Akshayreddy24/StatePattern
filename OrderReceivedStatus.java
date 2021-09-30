
public class OrderReceivedStatus implements PhotographySchedulingState{

	@Override
	public void nextOrder(PhotographySchedulingContext pkg) {
		// TODO Auto-generated method stub
		pkg.setState(new OrderReceivedStatus());
	}

	@Override
	public void prevOrder(PhotographySchedulingContext pkg) {
		// TODO Auto-generated method stub
		pkg.setState(new OrderCompletedState());
	}

	@Override
	public void currentOrderStatus() {
		// TODO Auto-generated method stub
		System.out.println("This photograph is already received by a client.");
	}
	
}
