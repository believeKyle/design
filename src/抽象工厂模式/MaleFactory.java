package 抽象工厂模式;

public class MaleFactory implements HumanFactory {
	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}
}
