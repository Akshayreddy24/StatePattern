
public class OrderCompletedState implements PhotographySchedulingState {

	@Override
	public void nextOrder(PhotographySchedulingContext pkg) {
		// TODO Auto-generated method stub
		pkg.setState(new OrderReceivedStatus());
	}

	@Override
	public void prevOrder(PhotographySchedulingContext pkg) {
		// TODO Auto-generated method stub
		pkg.setState(new OrderedState());
	}

	@Override
	public void currentOrderStatus() {
		// TODO Auto-generated method stub
		System.out.println("Order confirmed! Not completed yet.");
	}
	
}
