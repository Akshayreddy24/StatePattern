
public class PhotographySchedulingContext {
	private PhotographySchedulingState state = new OrderedState();
	
	public void nextOrderState() {
		state.nextOrder(this);
	}
	
	public void prevtOrderState() {
		state.prevOrder(this);
	}
	
	public void currentOrderStatusState() {
		state.currentOrderStatus();
	}
	
	public void setState(PhotographySchedulingState state) {
		this.state = state;
	}
	
	public PhotographySchedulingState getState() {
		return state;
	}
}
