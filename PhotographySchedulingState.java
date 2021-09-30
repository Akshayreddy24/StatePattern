
public interface PhotographySchedulingState {
	void nextOrder(PhotographySchedulingContext pkg);
	void prevOrder(PhotographySchedulingContext pkg);
	void currentOrderStatus();
	
}
