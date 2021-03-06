package 策略模式;

public class Context {
	private IStrategy strategy;
	
	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void operate() {
		this.strategy.operate();
	}
}
