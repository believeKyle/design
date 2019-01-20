package 抽象工厂模式;

public class FemaleFactory implements HumanFactory {
	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}
}
