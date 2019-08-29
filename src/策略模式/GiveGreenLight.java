package 策略模式;

public class GiveGreenLight implements IStrategy{
	public void operate() {
		System.out.println("求吴国太开绿灯");
	}
}
